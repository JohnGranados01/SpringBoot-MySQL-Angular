package Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pruebatecnica.Dao.FacturaDao;
import com.pruebatecnica.model.Factura;

// Indicar que es service
@Service
public class ServicioImplementadoFactura implements ServicioFactura{
    @Autowired
    private FacturaDao facturaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Factura> findAll(){
        return (List<Factura>) facturaDao.findAll();
    }

    @Override
    @Transactional(readOnly = false)
    public Factura save(Factura factura){
        return facturaDao.save(factura);
    }

    @Override
    @Transactional(readOnly = true)
    public Factura findById(Integer id){
        return facturaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id){
        facturaDao.deleteById(id);
    }

}
