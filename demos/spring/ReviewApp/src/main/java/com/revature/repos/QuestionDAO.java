package com.revature.repos;

import com.revature.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // Recall this is a stereotype annotation telling Spring to create a bean for this class and manage it
public interface QuestionDAO extends JpaRepository<Question, Integer> {

    /*
    This allows for us to be able to execute queries directly against the database.
    JPARepository has built-in methods for CRUD operations so we have access to those methods directly by extending the
    JPARepository, and additionally we can define methods in here that will be interpreted by Spring Data which will
    handle the creation of them behind the scenes (It'll handle all the painful JDBC stuff)
     */

    // TODO Add in findAllByTopic Query
    // GOAL: We want a query that will select a list of questions based off the topic
    // If defined correctly, we can utilize spring data to build a method automatically
    List<Question> findAllByTopicIgnoreCase(String topic);
}
