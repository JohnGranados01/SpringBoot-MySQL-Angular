import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ClienteServiceService {

  private url = environment.URL;
  constructor(private http : HttpClient) { 
    
  }

  public getClientes(): Observable<any> {
    return this.http.get(`${this.url}/cliente/findAll`)
  }
}
