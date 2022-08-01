import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CctvListComponent } from './cctv-list.component';

describe('CctvListComponent', () => {
  let component: CctvListComponent;
  let fixture: ComponentFixture<CctvListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CctvListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CctvListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
