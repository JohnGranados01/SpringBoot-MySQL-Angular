package Servicio;

import com.pruebatecnica.model.Factura;

import java.util.List;

public interface ServicioFactura {
    
    public List<Factura> findAll();
    public Factura save(Factura factura);
    public Factura findById(Integer id);
    public void delete(Integer id);
}
