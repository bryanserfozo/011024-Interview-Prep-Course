package com.revature.services;

import com.revature.models.Question;
import com.revature.repos.QuestionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Recall our stereotype annotations
public class QuestionService {

    /*
    This class will be in charge of business logic. It'll connect the controller layer to the repo/dao layer meaning
    it will handle taking the information from an HTTP request, attempting the update the db based off that information
    and return the appropriate result from the dao layer to the controller layer.

    To get started we'll need an instance of the QuestionDAO interface. Since this class will be dependent upon the
    QuestionDAO interface, we'll use dependency injection to add this is
     */


    private final QuestionDAO qd; // Why final? Because it guarantees a constructor

    @Autowired
    public QuestionService(QuestionDAO qd) {
        this.qd = qd;

        /*
        Spring wants to "wire" our beans together for us so that way we don't have to worry about creating a new object
        and passing it to this class.

        This is dependency injection at work, specifically CONSTRUCTOR INJECTION.
        This is one of 2 types of dependency injection supported, this is the preferred method and it consists of using
        the constructor to inject the required dependencies

        The other type of dependency injection is called SETTER INJECTION.
        This happens through the use of a setter to set the field that needs be injected. Used for something called a
        partial-dependency (non-critical dependency). Also can be used to solve circular dependencies (i.e. Class A is
        dependent on Class B which is dependent on Class A....). Use by creating a setter and marking it with
        @Autowired

        There is a third option for injection known as field injection (Adding @Autowired on top of the field). We
        normally don't talk too much about this since it's not preferred. The main reason why it's not preferred is
        structure is larger application
         */
    }

    // Now that we have our dependency sorted we can start creating methods that leverage that dependency

    // TODO Create a method for adding a question to the database
    /*
    To create a method for adding something to the DB we'll have to have a little foresight into how we want them to
    send a proposed question. Essentially we expect the controller to receive a question in JSON format, it will convert
    that question to a Java Object (Jackson Databind) and then will passed to the service class.

    Our expectation is to take the Question object and pass it to the DAO layer which will execute the query against the
    db directly. We can verify the process was done correctly by checking to see if the returned object has a valid
    primary key.
     */

    public Question saveQuestionToDB(Question q){
        // Inside this method we'll call the save method from the QuestionDAO to save the question
        Question returnedQuestion = qd.save(q);

        if (returnedQuestion.getId() > 0){
            return returnedQuestion; // This will be passed back to the controller
        } else{
            return null;
        }
    }


    // TODO Create a method for getting a specific question from the db (Based off ID)
    public Question getQuestionById(int id){
        // The pk field on Question is its id so we should be able to retrieve a question from that id.
        Optional<Question> possibleQuestion = qd.findById(id); // This guy is an Optional, which is a special class
        // created to deal with objects that could possibly be null

        return possibleQuestion.orElse(null);
    }

    // TODO Create a method for getting all the questions from one topic
    /*
    The JPARepo is pretty cool in terms of providing basic CRUD methods but they all work mainly based off the primary
    key field so if I want to do any searching based off a different field, it becomes slightly more difficult.

    Now that we've created the method signature in our DAO layer, it will handle creating the method itself (if we
    named it appropriately) so we should be able to call it here and guarantee that it has an implementation already
    built
     */

    public List<Question> getAllQuestionsByTopic(String topic){
        return qd.findAllByTopicIgnoreCase(topic);
    }

    // We need a quick method for getting ALL of the questions so we'll do it like so
    public List<Question> getAllQuestions(){
        return qd.findAll();
    }

}
