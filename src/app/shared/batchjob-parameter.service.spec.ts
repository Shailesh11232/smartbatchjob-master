import { TestBed } from '@angular/core/testing';

import { BatchjobParameterService } from './batchjob-parameter.service';

describe('BatchjobParameterService', () => {
  let service: BatchjobParameterService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BatchjobParameterService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
