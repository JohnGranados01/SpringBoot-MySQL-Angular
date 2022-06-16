import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'client', loadChildren: () => 
    import('./pages/client/client.module').then(m => m.ClientModule)
  },
  {
    path: 'factura', loadChildren: () => 
    import('./pages/factura/factura.module').then(m => m.FacturaModule)
  },
  {
    path: 'producto', loadChildren: () => 
    import('./pages/producto/producto.module').then(m => m.ProductoModule)
  },
  {path:'',pathMatch: 'full', redirectTo: 'client'},
  // {path:'factura',pathMatch: 'full', redirectTo: 'factura'},


];

@NgModule({
  imports: [RouterModule.forRoot(routes,{useHash: true})],
  exports: [RouterModule]
})
export class AppRoutingModule { }
