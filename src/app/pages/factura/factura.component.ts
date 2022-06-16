import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-factura',
  templateUrl: './factura.component.html',
  styleUrls: ['./factura.component.css']
})
export class FacturaComponent implements OnInit {

  clients: string[]=["John Granados","Carlos Vargas","Jorge Acevedo"]
  products: string[]=["Papa","Arroz","Papel"]
  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  btnClientesClick(){
    this.router.navigateByUrl("/client")
  }

  btnProductosClick(){
    this.router.navigateByUrl("/producto")
  }

}
