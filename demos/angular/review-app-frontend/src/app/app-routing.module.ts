import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { QuestionContainerComponent } from './components/question-container/question-container.component';
import { QuestionEntryComponent } from './components/question-entry/question-entry.component';

const routes: Routes = [
  { path: 'quiz', component: QuestionContainerComponent },
  { path: 'entry', component: QuestionEntryComponent },
  { path: '', redirectTo: '/quiz', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
