package com.revature;

import com.revature.models.Question;
import com.revature.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
// @SpringBootApplication is an important annotation. First, it denotes that this is in-fact a Spring Boot application
// It's a combination of 3 other annotations
// @EnableAutoConfiguration, @ComponentScan, and @SpringBootConfiguration
// The responsibility of this annotation is to mark this class as a configuration class and so it knows where to look
// or scan for other beans to manage
public class ReviewAppApplication implements CommandLineRunner {



	public static void main(String[] args) {
		SpringApplication.run(ReviewAppApplication.class, args);
	}


	/*
	Component Scanning is important. Basically when we component scan, Spring is looking through the specified package
	If none is given the current package is chosen (com.revature and its subpackages) and it will search for things
	called Stereotype Annotations.
		- Component
			- General component used in the application. Marking a class with @Component makes it so Spring knows it
			needs to manage that class as a bean
		- Repository
			- More specific version of component, specifically denotes that a class is used to interact with a
			repository of data somewhere (DAO Classes/interface)
		- Service
			- More specific version of component, denotes that a class is a service class (Namely that it'll be used
			for business logic)
		- Controller
			- More specific version of component, denotes that a class will be used to manage http traffic (requests
			and responses)


	 The Application we'll build today will be a simple application for reviewing topics. End users will make a request
	 to the API for a question, which will send back a question with a correct answer, a few incorrect answers and
	 a topic. Essentially think of a multiple choice application.
	 */

	private final QuestionService qs;

	@Autowired
	public ReviewAppApplication(QuestionService qs) {
		this.qs = qs;
	}

	@Override
	public void run(String... args) throws Exception {
		// This is generally used if we wanted to have a console-based spring application. We're using it now since
		// we don't have a controller layer set up yet

		// We pulled in the questionservice so we can use the methods in there.
		Question newQuestion = new Question();
		newQuestion.setQuestion("Which SQL clause is used to filter the results of a SELECT statement to include only rows that satisfy a specified condition?");
		newQuestion.setCorrectAnswer("WHERE");
		newQuestion.setIncorrectAnswer1("ORDER BY");
		newQuestion.setIncorrectAnswer2("GROUP BY");
		newQuestion.setTopic("SQL");

		// Now that we have a question, let's attempt to add it to the db using our service class
		Question returnedQuestion = qs.saveQuestionToDB(newQuestion);

		System.out.println(returnedQuestion);

		System.out.println("---------------------------------");

		// Test our getByID method
		System.out.println(qs.getQuestionById(1));
		System.out.println(qs.getQuestionById(247));

		// Let's add in a few other questions
		Question newQuestion2 = new Question();
		newQuestion2.setQuestion("What is the purpose of the final keyword in Java?");
		newQuestion2.setCorrectAnswer("To declare a variable that cannot be changed");
		newQuestion2.setIncorrectAnswer1("To indicate the end of a method");
		newQuestion2.setIncorrectAnswer2("To define a constant value");
		newQuestion2.setTopic("Java");

		Question newQuestion3 = new Question();
		newQuestion3.setQuestion("In Java, what is the difference between == and .equals() when comparing objects?");
		newQuestion3.setCorrectAnswer("== compares the references of objects, while .equals() compares their content");
		newQuestion3.setIncorrectAnswer1("== compares the content of objects, while .equals() compares their references");
		newQuestion3.setIncorrectAnswer2("Both are used for reference comparison");
		newQuestion3.setTopic("JaVA");

		Question newQuestion4 = new Question();
		newQuestion4.setQuestion("What is the purpose of the SQL JOIN operation?");
		newQuestion4.setCorrectAnswer("To combine rows from two or more tables based on a related column");
		newQuestion4.setIncorrectAnswer1("To order the results of a query in ascending or descending order");
		newQuestion4.setIncorrectAnswer2("To update existing records in a table");
		newQuestion4.setTopic("SQL");

		// Add in the questions
		qs.saveQuestionToDB(newQuestion2);
		qs.saveQuestionToDB(newQuestion3);
		qs.saveQuestionToDB(newQuestion4);

		System.out.println("---------------------------------");

		String topic = "sql";
		System.out.println("Getting all of the " + topic + " questions");

		List<Question> returnedQuestions = qs.getAllQuestionsByTopic(topic);

		for (Question q: returnedQuestions){
			System.out.println(q);
		}


	}

}
