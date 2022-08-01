import { TestBed } from '@angular/core/testing';

import { CctvService } from './cctv.service';

describe('CctvService', () => {
  let service: CctvService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CctvService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
