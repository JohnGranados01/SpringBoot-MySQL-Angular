import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
@Injectable({
  providedIn: 'root'
})


export class FacturaServiceService {
  private url = environment.URL;
  constructor(private http : HttpClient) { 
    
  }

  public getFacturas() {
    return this.http.get(`${this.url}/factura/findAll`, {headers:{
      "Access-Control-Allow-Origin": "*"
    }})
  }

  public saveFacturas(){
    return this.http.post(`${this.url}/factura/save`,{headers:{
      "Access-Control-Allow-Origin": "*"
    }})
  }

  // getConfig() {
  //   return this.http.get<Config>(this.configUrl);
  // }
  // showConfig() {
  //   this.configService.getConfig()
  //     .subscribe((data: Config) => this.config = {
  //         heroesUrl: data.heroesUrl,
  //         textfile:  data.textfile,
  //         date: data.date,
  //     });
}
