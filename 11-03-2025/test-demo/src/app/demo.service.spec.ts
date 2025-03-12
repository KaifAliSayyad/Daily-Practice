import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DemoService } from './demo.service';
import { DemoCompComponent } from './demo-comp/demo-comp.component';

describe('DemoService', () => {
  let service: DemoService;
  let component: DemoCompComponent;
  let fixture: ComponentFixture<DemoCompComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DemoService);
    // component = TestBed.inject(DemoCompComponent);

    fixture = TestBed.createComponent(DemoCompComponent);
    component = fixture.componentInstance;
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it("should call do some task", () =>{
    spyOn(service, 'doSomeTask');
    component.method();
    expect(service.doSomeTask).toHaveBeenCalled();
  })
});
