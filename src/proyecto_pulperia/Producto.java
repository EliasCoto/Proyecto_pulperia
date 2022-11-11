package proyecto_pulperia;

import javax.swing.JOptionPane;

public class Producto {

    private int fechaCaducidad;
    private String nombre;
    private int id;
    private int stock;
    private String categoria;
    private int precio;

    public Producto() {
    }

    public Producto(int fechaCaducidad, String nombre, int id, int stock, String categoria, int precio) {
        this.fechaCaducidad = fechaCaducidad;
        this.nombre = nombre;
        this.id = id;
        this.stock = stock;
        this.categoria = categoria;
        this.precio = precio;
    }

    public int getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(int fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void recogerDatosProducto() {

        precio = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio del producto"));
        nombre = JOptionPane.showInputDialog("Digite el nombre del producto");
        id = Integer.parseInt(JOptionPane.showInputDialog("Digite el id del producto"));
        stock = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos que hay en la tienda"));
        fechaCaducidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha de caducidad del producto"));
        categoria = JOptionPane.showInputDialog("Digite la actegoria del producto");

    }

    
    
    public void mostrarDatosProducto() {

        JOptionPane.showMessageDialog(null,
                "El precio del producto es : " + precio
                + "\n El nombre del producto es : " + nombre
                + "\n El id del producto es : " + id
                + "\n La cantidad de stocks es : " + stock
                + "\n Su fecha de caducidad es : " + fechaCaducidad
                + "\n La categoria del producto es  : " + categoria);

    }



}







