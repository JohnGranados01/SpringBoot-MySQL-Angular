import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { FacturaRoutingModule } from './factura-routing.module';
import { FacturaComponent } from './factura.component';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    FacturaComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    FacturaRoutingModule
  ]
})
export class FacturaModule { }
