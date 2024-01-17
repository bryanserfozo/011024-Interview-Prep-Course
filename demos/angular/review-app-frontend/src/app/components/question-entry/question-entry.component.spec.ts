import { ComponentFixture, TestBed } from '@angular/core/testing';

import { QuestionEntryComponent } from './question-entry.component';

describe('QuestionEntryComponent', () => {
  let component: QuestionEntryComponent;
  let fixture: ComponentFixture<QuestionEntryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [QuestionEntryComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(QuestionEntryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
