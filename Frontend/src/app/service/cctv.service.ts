import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CctvService {
  url = "http://localhost:8080/cctv/getDetails";
  constructor(private http:HttpClient) { 
  }

  getCctvList(){
    return this.http.get(this.url);
  }
}
