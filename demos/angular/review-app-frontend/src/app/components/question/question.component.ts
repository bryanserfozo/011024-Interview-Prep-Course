// question.component.ts
import { Component, Input, Output, EventEmitter, OnInit, OnChanges, SimpleChanges } from '@angular/core';
import { IQuestion } from '../../interfaces/IQuestion';

@Component({
  selector: 'app-question',
  templateUrl: './question.component.html',
  styleUrls: ['./question.component.css']
})
export class QuestionComponent implements OnInit, OnChanges {
  @Input() questionData!: IQuestion;
  selectedAnswer: String = '';
  isAnsweredCorrectly: boolean | null = null;
  hasAnswered: boolean = false;
  shuffledAnswers: String[] = [];

  @Output() answerSelected = new EventEmitter<boolean>();

  ngOnInit(): void {
    this.shuffleAnswers();
  }

  ngOnChanges(changes: SimpleChanges): void {
    if (changes['questionData']) { // Use bracket notation to access 'questionData'
      this.shuffleAnswers();
    }
  }

  private shuffleAnswers(): void {
    const answers = [
      this.questionData.correctAnswer,
      this.questionData.incorrectAnswer1,
      this.questionData.incorrectAnswer2
    ];

    this.shuffledAnswers = this.shuffleArray([...answers]);
  }

  onSelectAnswer(answer: String): void {
    if (!this.hasAnswered) {
      this.selectedAnswer = answer;
      this.isAnsweredCorrectly = this.selectedAnswer === this.questionData.correctAnswer;
      this.answerSelected.emit(this.isAnsweredCorrectly);
      this.hasAnswered = true;
    }
  }

  private shuffleArray(array: String[]): String[] {
    for (let i = array.length - 1; i > 0; i--) {
      const j = Math.floor(Math.random() * (i + 1));
      [array[i], array[j]] = [array[j], array[i]];
    }
    return array;
  }
}

