import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ClienteServiceService } from 'src/app/Services/cliente-service.service';
import { FacturaServiceService } from 'src/app/Services/factura-service.service';

@Component({
  selector: 'app-factura',
  templateUrl: './factura.component.html',
  styleUrls: ['./factura.component.css']
})
export class FacturaComponent implements OnInit {

  // clients: string[]=["John Granados","Carlos Vargas","Jorge Acevedo"]
  products: string[]=["Papa","Arroz","Papel"]
  clients: []=[]
  constructor(private router: Router, public clienteService: ClienteServiceService, public facturaService: FacturaServiceService) { }

  ngOnInit(): void {
    this.getFacturas()
    this.saveFacturas()
  }

  btnClientesClick(){
    this.router.navigateByUrl("/client")
  }

  btnProductosClick(){
    this.router.navigateByUrl("/producto")
  }

  // async getClientes() {

  //   await this.clienteService.getClientes().subscribe(
  //     (res) =>{
  //       console.log(res);
        
  //     }
  //   )
    
  // }

  async getFacturas() {

    await this.facturaService.getFacturas().subscribe(
      (res) =>{
        console.log(res);
        
      }
    )
    
  }

  async saveFacturas() {

    await this.facturaService.saveFacturas().subscribe(
      (res) =>{
        console.log(res);
        
      }
    )
    
  }
}
