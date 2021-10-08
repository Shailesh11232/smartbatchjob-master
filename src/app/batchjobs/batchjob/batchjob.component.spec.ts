import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BatchjobComponent } from './batchjob.component';

describe('BatchjobComponent', () => {
  let component: BatchjobComponent;
  let fixture: ComponentFixture<BatchjobComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BatchjobComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BatchjobComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
