
package Factura;

import Personas.Cliente;
import Personas.Empleado;
import Productos.Producto;



public class Factura {
  
    private int id;
  //  private Cliente cliente;
    private Producto producto;
    private double precio;
    private String metodoPago;
    private String fecha;
    private double total;
  //  private Empleado empleado;

    public Factura() {
    }

    
    
    public Factura(int id, Producto producto, double precio, String metodoPago, String fecha, double total) {
        this.id = id;
        this.producto = producto;
        this.precio = precio;
        this.metodoPago = metodoPago;
        this.fecha = fecha;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura{" + "id=" + id + ", producto=" + producto + ", precio=" + precio + ", metodoPago=" + metodoPago + ", fecha=" + fecha + ", total=" + total + '}';
    }

   
  


  
}
