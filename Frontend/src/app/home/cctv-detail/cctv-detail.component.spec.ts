import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CctvDetailComponent } from './cctv-detail.component';

describe('CctvDetailComponent', () => {
  let component: CctvDetailComponent;
  let fixture: ComponentFixture<CctvDetailComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CctvDetailComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CctvDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
