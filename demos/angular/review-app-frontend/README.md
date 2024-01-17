# Angular Quiz App

## Overview

This Angular application is a simple quiz app designed to manage and display questions, allow users to enter new questions, and provide a quiz-taking experience. The app utilizes various Angular features to create a seamless user experience.

## Components

### 1. Question Component

The `QuestionComponent` is responsible for displaying individual quiz questions. It includes features such as shuffling answer options, highlighting the selected answer, and displaying correctness feedback. The component emits events when an answer is selected using `EventEmitter`.

### 2. Question Entry Component

The `QuestionEntryComponent` serves as a form for users to input new quiz questions. It includes fields for the question topic, question text, correct answer, and two incorrect answers. The form utilizes two-way data binding with `ngModel` to update the component and send the entered question to the server using a `QuestionService`.

### 3. Question Container Component

The `QuestionContainerComponent` acts as a container for displaying a collection of quiz questions. It fetches questions from the server using the `QuestionService` and includes functionality for filtering questions by topic. This component utilizes Angular routing to switch between different views.

### 4. Navbar Component

The `NavbarComponent` provides navigation options for the application. It includes links to different sections, such as quizzing and question entry. This component utilizes Angular routing to navigate between views.

## Services

### Question Service

The `QuestionService` is a service responsible for handling communication with the server to fetch and submit quiz questions. It includes methods to retrieve questions based on topics and send new questions to the server using HTTP requests.

## Interface

### IQuestion Interface

The `IQuestion` interface defines the structure of a quiz question. It includes properties such as `id`, `topic`, `question`, `correctAnswer`, `incorrectAnswer1`, and `incorrectAnswer2`. This interface is used to ensure consistency in the structure of question objects throughout the application.

## Angular Topics Utilized

- **Components:** Angular components are used to create modular and reusable UI elements such as the quiz question, question entry form, question container, and navbar.

- **Routing:** Angular routing is implemented to navigate between different views, allowing users to switch between quiz-taking and question-entry sections.

- **Services:** The `QuestionService` demonstrates the use of Angular services to handle data communication with the server. It encapsulates the logic for fetching and submitting quiz questions.

- **Event Emitters:** The `QuestionComponent` uses `EventEmitter` to emit events when an answer is selected. This allows for communication between parent and child components.

- **Data Binding:** Two-way data binding with `ngModel` is employed in the `QuestionEntryComponent` to bind form inputs to component properties, enabling real-time updates and user interaction.

- **Directives:**
  - **Structural Directives:** Angular structural directives, such as `*ngFor`, are used in the `QuestionContainerComponent` to iterate over a list of questions and dynamically render them in the template.
  - **Attribute Directives:** Custom attribute directives can be added and utilized for styling or interactive behavior in different components.

- **Lifecycle Hooks:**
  - **OnInit:** Lifecycle hook `OnInit` is implemented in the `QuestionComponent` to perform actions when the component initializes, such as shuffling the answers.
  - **OnChanges:** Lifecycle hook `OnChanges` is used in the `QuestionComponent` to react to changes in the `questionData` input, ensuring the answers are shuffled accordingly.

## Getting Started

1. Clone the repository.
2. Install dependencies using `npm install`.
3. Run the application using `ng serve`.
4. Open the app in your browser at `http://localhost:4200/`.

Feel free to explore and customize the application for your specific needs!
