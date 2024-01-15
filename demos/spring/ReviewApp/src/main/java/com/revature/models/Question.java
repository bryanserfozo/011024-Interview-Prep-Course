package com.revature.models;

import javax.persistence.*;
import java.util.Objects;

@Entity // Marks this class as an entity we want to track in the DB
@Table(name="questions") // Table allows us to provide configuration details about the table itself
public class Question {
    /*
    This class will be our model class to denote HOW we want a question to look in the database and how we want it
    represented in the JSON that will be sent to the end-user

    We need to define this class with specific JPA annotations. The annotations are in charge of controlling how we
    store the data in the database.
     */

    // We need to declare all the fields we want our class to have

    // Always think of a primary key first
    @Id // Denotes this field is the primary key of this table
    @Column(name = "question_id") // Similar to @Table, basically provides config details for the column
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Denotes field as serial (increments everytime I attempt to add a new record)
    private int id;

    // Fields we want: Topic Field, Question, Correct Answer, 2 incorrect answers

    private String topic;

    private String question;

    private String correctAnswer;

    private String incorrectAnswer1;

    private String incorrectAnswer2;

    // We'll definitely need a no-args constructor for Jackson Databind (conversion to JSON and back)
    public Question() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getIncorrectAnswer1() {
        return incorrectAnswer1;
    }

    public void setIncorrectAnswer1(String incorrectAnswer1) {
        this.incorrectAnswer1 = incorrectAnswer1;
    }

    public String getIncorrectAnswer2() {
        return incorrectAnswer2;
    }

    public void setIncorrectAnswer2(String incorrectAnswer2) {
        this.incorrectAnswer2 = incorrectAnswer2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question1 = (Question) o;
        return id == question1.id && Objects.equals(topic, question1.topic) && Objects.equals(question, question1.question) && Objects.equals(correctAnswer, question1.correctAnswer) && Objects.equals(incorrectAnswer1, question1.incorrectAnswer1) && Objects.equals(incorrectAnswer2, question1.incorrectAnswer2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, topic, question, correctAnswer, incorrectAnswer1, incorrectAnswer2);
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", topic='" + topic + '\'' +
                ", question='" + question + '\'' +
                ", correctAnswer='" + correctAnswer + '\'' +
                ", incorrectAnswer1='" + incorrectAnswer1 + '\'' +
                ", incorrectAnswer2='" + incorrectAnswer2 + '\'' +
                '}';
    }
}
