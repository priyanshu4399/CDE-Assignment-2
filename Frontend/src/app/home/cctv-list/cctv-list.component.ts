import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cctv-list',
  templateUrl: './cctv-list.component.html',
  styleUrls: ['./cctv-list.component.css']
})
export class CctvListComponent implements OnInit {

  cctvList : any;

  constructor() { 
    
  }

  ngOnInit(): void {
  }

}
