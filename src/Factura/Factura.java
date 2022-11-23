package Factura;


public class Factura {

    private int id;
    //  private Cliente cliente;
    private String metodoPago;
    private String fecha;
    private double total;
    //  private Empleado empleado;

    public Factura() {
    }

    public Factura(int id, String metodoPago, String fecha, double total) {
        this.id = id;
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
        return "\n----------Factura-----------" + "\n"
                + "ID: " + id + "\t"
                + "Metodo de pago: " + metodoPago + "\t"
                + "Fecha: " + fecha + "\t"
                + "Total: " + total + "\n";
    }
   
}
