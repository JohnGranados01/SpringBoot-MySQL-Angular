import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ICliente } from 'src/app/interfaces/cliente';
import { IFactura } from 'src/app/interfaces/factura';
import { ClienteServiceService } from 'src/app/Services/cliente-service.service';
import { FacturaServiceService } from 'src/app/Services/factura-service.service';

@Component({
  selector: 'app-factura',
  templateUrl: './factura.component.html',
  styleUrls: ['./factura.component.css']
})



export class FacturaComponent implements OnInit {

  factura: IFactura={numFactura:-1,fecha:new Date(),id_cliente:0}
  products: string[]=["Papa","Arroz","Papel"]
  clients: ICliente[]=[]
  constructor(private router: Router, public clienteService: ClienteServiceService, public facturaService: FacturaServiceService) { }

  ngOnInit(): void {
    this.getClientes()
  }

  btnClientesClick(){
    this.router.navigateByUrl("/client")
  }

  btnProductosClick(){
    this.router.navigateByUrl("/producto")
  }

  btnGuardarFactura(){
    this.facturaService.saveFacturas(this.factura.fecha, this.factura.id_cliente)
  }

  getClientes() {

    this.clienteService.getClientes().subscribe(
      (res) =>{
        this.clients = res
      }
    )
  }
}
