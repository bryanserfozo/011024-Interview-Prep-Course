// question-entry.component.ts
import { Component, Output, EventEmitter } from '@angular/core';
import { QuestionService } from '../../services/question.service';
import { IQuestion } from '../../interfaces/IQuestion';

@Component({
  selector: 'app-question-entry',
  templateUrl: './question-entry.component.html',
  styleUrls: ['./question-entry.component.css']
})
export class QuestionEntryComponent {
  @Output() questionAdded = new EventEmitter<IQuestion>(); // Update the event type

  newQuestion: IQuestion = {
    id: 0,
    topic: '',
    question: '',
    correctAnswer: '',
    incorrectAnswer1: '',
    incorrectAnswer2: ''
  };

  constructor(private questionService: QuestionService) {}

  addNewQuestion() {
    if (this.isValidQuestion()) {
      this.questionService.addQuestion(this.newQuestion).subscribe(
        response => {
          this.questionAdded.emit(response);
          this.newQuestion = {
            id: 0,
            topic: '',
            question: '',
            correctAnswer: '',
            incorrectAnswer1: '',
            incorrectAnswer2: ''
          };
        },
        error => {
          console.error('Error adding question:', error);
        }
      );
    } else {
      // Handle validation error
    }
  }

  // question-entry.component.ts
isValidQuestion(): boolean {
  return !!(
    this.newQuestion.topic &&
    this.newQuestion.question &&
    this.newQuestion.correctAnswer &&
    this.newQuestion.incorrectAnswer1 &&
    this.newQuestion.incorrectAnswer2
  );
}

}
