// question-container.component.ts
import { Component, OnInit } from '@angular/core';
import { QuestionService } from '../../services/question.service';
import { IQuestion } from '../../interfaces/IQuestion';

@Component({
  selector: 'app-question-container',
  templateUrl: './question-container.component.html',
  styleUrls: ['./question-container.component.css']
})
export class QuestionContainerComponent implements OnInit {
  questions: IQuestion[] = [];
  filteredQuestions: IQuestion[] = [];
  topics: string[] = ['Java', 'SQL', 'Spring', 'Angular'];
  selectedTopic: string = 'Java';
  totalCorrect: number = 0;
  totalIncorrect: number = 0;

  // This is dependency injection
  constructor(private questionService: QuestionService) {}

  ngOnInit() {
    this.loadQuestions();
  }

  loadQuestions() {
    this.questionService.getQuestions().subscribe(
      response => {
        this.questions = response;
        this.filterQuestionsByTopic();
      },
      error => {
        console.error('Error loading questions:', error);
      }
    );
  }

  filterQuestionsByTopic() {
    this.filteredQuestions = this.questions.filter(
      question => question.topic.toLocaleLowerCase() === this.selectedTopic.toLocaleLowerCase()
    );
  }

  onTopicChange() {
    this.filterQuestionsByTopic();
  }

  onAnswerSelected(isCorrect: boolean) {
    if (isCorrect) {
      this.totalCorrect++;
    } else {
      this.totalIncorrect++;
    }
  }
}
