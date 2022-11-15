
package Factura;

import Personas.Cliente;
import Personas.Empleado;
import Productos.Producto;



public class Factura {
    String  facturas[] = new String[2]; //vector de facturas
    
    private int id;
    private Cliente cliente;
    private Producto producto;
    private double precio;
    private String metodoPago;
    private String fecha;
    private Empleado empleado;

    public Factura() {
    }

    public Factura(int id, Cliente cliente, Producto producto, double precio, String metodoPago, String fecha, Empleado empleado) {
        this.id = id;
        this.cliente = cliente;
        this.producto = producto;
        this.precio = precio;
        this.metodoPago = metodoPago;
        this.fecha = fecha;
        this.empleado = empleado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

  
    
    
    public void factura(){
        for (int i = 0; i < facturas.length; i++) {
            
        }
        
        
    }
    
    
    
    
}
