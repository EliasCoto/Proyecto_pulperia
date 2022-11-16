
package Cajas;

import Personas.Cliente;
import Productos.Producto;


public class Cajas {
    
   
    
//    private Cliente cliente;
    private Producto producto;
    private String metPago;
    private int total;

    public Cajas( Producto producto, String metPago, int total) {
       
        this.producto = producto;
        this.metPago = metPago;
        this.total = total;
    }



    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getMetPago() {
        return metPago;
    }

    public void setMetPago(String metPago) {
        this.metPago = metPago;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
  
    
    
    
    
    
    
}
