import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})


export class FacturaServiceService {
  private url = environment.URL;
  constructor(private http : HttpClient) { 
    
  }

  getFacturas(): Observable<any> {
    return this.http.get(`${this.url}/factura/findAll`)
  }

  public saveFacturas(date:Date, idcliente:number){
    return this.http.post(`${this.url}/factura/save`, 
    {
      "num_factura":null,
      "id_cliente":idcliente,
      "fecha":date
    }).subscribe(data=>{
      console.log(data);
      
    })
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
