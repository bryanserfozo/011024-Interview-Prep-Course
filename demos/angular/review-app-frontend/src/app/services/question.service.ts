import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { IQuestion } from '../interfaces/IQuestion';

@Injectable({
  providedIn: 'root'
})
export class QuestionService {
  private apiUrl = 'http://localhost:8080/questions';

  constructor(private http: HttpClient) {}

  getQuestions(): Observable<IQuestion[]> { 
    return this.http.get<IQuestion[]>(this.apiUrl);
  }

  addQuestion(questionData: IQuestion): Observable<IQuestion> { 
    return this.http.post<IQuestion>(this.apiUrl, questionData);
  }
}

