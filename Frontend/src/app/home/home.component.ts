import { HttpClient } from '@angular/common/http';
import { Component, ElementRef, OnInit,ViewChild } from '@angular/core';
import { Cctv} from '../model/Cctv';
import { CctvService } from '../service/cctv.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  cctvList : any;
  constructor(private service : CctvService) {
  }

  ngOnInit(): void {
    this.service.getCctvList().subscribe(response =>{
      console.log(response);
      this.cctvList = response;
    });
  }

}
