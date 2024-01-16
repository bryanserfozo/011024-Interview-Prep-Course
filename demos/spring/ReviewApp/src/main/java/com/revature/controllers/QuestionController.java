package com.revature.controllers;

import com.revature.models.Question;
import com.revature.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
/*
@RestController is a combination of two other annotations
    - @Controller -> Denotes this class should a bean and managed by Spring
    - @ResponseBody -> Class/Method Level annotation that essentially denotes the result will be converted to JSON
        - JSON -> JavaScript Object Notation: Standard for data interchange over RESTful APIs
 */
@RequestMapping("/questions") // -> Implies all of our requests will be under http://localhost:8080/question
// - @RequestMapping -> Class level annotation that allows us to describe details about this http endpoint
public class QuestionController {
    /*
    Controller classes are those that are in charge of handling web traffic.

    They'll receive a specific HTTP request, look for a handler for that specific request and if it has one it
    will attempt to run the logic associated with that handler. This logic being handing the information off to a
    specific service class method which will do additional logic. Then, once the result is passed up to the controller,
    it will format the appropriate response and send that back to the frontend/ end user

    Recall HTTP Requests are built with a couple pieces. They have a URI/URL that they are trying to access, they have
    an HTTP Verb (POST, GET, PUT, DELETE denote the CRUD operations, respectively), they should have headers and
    depending on the request type, it may have a method body.

    Recall HTTP Responses contain the following: headers, status code (numerical representation of the result of a
    http request), and they may include a response body
     */


    // Now that we've gotten our controller tagged, we need to inject the service class dependency
    private final QuestionService qs;

    @Autowired
    public QuestionController(QuestionService qs) {
        this.qs = qs;
    }


    // TODO Create a method for retrieving all questions
    // TODO Update this method to handle topic specific questions
    // To access this method, send a GET request to http://localhost:8080/questions?topic=java
    @GetMapping // This is like RequestMapping, but we're saying this will specifically handle get requests
    public List<Question> getAllQuestionsHandler(@RequestParam(name = "topic", required = false) String topic){
        // We'll update this method to filter the list of questions by topic

        if (topic != null){
            return qs.getAllQuestionsByTopic(topic);
        }

        return qs.getAllQuestions();
    }


    // TODO Create a method for retrieving a specific question by its id
    // Normally when working with RESTful APIs they follow a similar format to describe how to retrieve information
    @GetMapping("{id}") // This accepts GET requests at http://localhost:8080/questions/{id} where the id field changes
    public ResponseEntity<Question> getQuestionByIdHandler(@PathVariable int id){
        // The easiest way to handle this is to just call the service class method and return the result
        // We'll make this more robust in a few
        // return qs.getQuestionById(id);

        // This was a good start, but really we should return a 404 if the question wasn't found
        // We'll update the return type to a ResponseEntity<> which is a representation of the ENTIRE HTTP Response
        Question q = qs.getQuestionById(id);

        if (q == null){
            // This means the question was NOT FOUND so we need to return a Response Entity reflecting that

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            // If you can't remember what your status codes mean we can go to https://http.dog or https://http.cat
        }

        // This means we successfully got a question
        return new ResponseEntity<>(q, HttpStatus.OK);
    }


    // TODO Create a method for creating a new question
    // Creation falls under POST requests.
    // POST requests contain a request body that contains information that should be processed by the handler method

    @PostMapping // -> POST requests to http://localhost:8080/questions
    public ResponseEntity<Question> createNewQuestionHandler(@RequestBody Question q){
        // @RequestBody attempts to format the JSON body into whatever type the parameter is
        // This is where that no-args constructors (and setters) become utilized by Jackson Databind (Which does the
        // translation work between Java Objects and JSON)

        // We should be able to take in this question and return the appropriate response. If the creation was
        // successful, the question should now have an id field where it didn't before

        Question savedQuestion = qs.saveQuestionToDB(q);

        if (savedQuestion == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST); // 400 -> user error
        }

        // If we're here that means we were able to successfully save the question
        return new ResponseEntity<>(savedQuestion, HttpStatus.CREATED); // CREATED -> 201 -> New resource created

    }
}
