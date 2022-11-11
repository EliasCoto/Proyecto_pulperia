package proyecto_pulperia;

import javax.swing.JOptionPane;

public class Producto {

    private String productos[][] = new String[10][6];
    private String fechaCaducidad;
    private String nombre;
    private String id;
    private int stock;//esta es para hacer alguna operacion
    private String categoria;
    private int precio;//esta es para hacer alguna operacion
    private String precioMostrar;//esta variable es solo para mostrar
    private String stockMostrar;//esta variable es solo para mostrar

    public Producto() {
    }

    public Producto(String fechaCaducidad, String nombre, String id, int stock, String categoria, int precio, String precioMostrar, String stockMostrar) {
        this.fechaCaducidad = fechaCaducidad;
        this.nombre = nombre;
        this.id = id;
        this.stock = stock;
        this.categoria = categoria;
        this.precio = precio;
        this.precioMostrar = precioMostrar;
        this.stockMostrar = stockMostrar;
    }

    public String[][] getProductos() {
        return productos;
    }

    public void setProductos(String[][] productos) {
        this.productos = productos;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getPrecioMostrar() {
        return precioMostrar;
    }

    public void setPrecioMostrar(String precioMostrar) {
        this.precioMostrar = precioMostrar;
    }

    public String getStockMostrar() {
        return stockMostrar;
    }

    public void setStockMostrar(String stockMostrar) {
        this.stockMostrar = stockMostrar;
    }
public void recogerDatos() {

        id = JOptionPane.showInputDialog("Digite el id del producto");
        insertarEnMatriz(id);
        nombre = JOptionPane.showInputDialog("Digite el nombre del producto");
         insertarEnMatriz(nombre);
        precioMostrar = JOptionPane.showInputDialog("Digite el precio del producto");
        precio = Integer.parseInt(precioMostrar);
         insertarEnMatriz(precioMostrar);
        stockMostrar = JOptionPane.showInputDialog("Digite la cantidad de productos que hay en la tienda");
        stock = Integer.parseInt(stockMostrar);
        insertarEnMatriz(stockMostrar);
        categoria = JOptionPane.showInputDialog("Digite la actegoria del producto");
        insertarEnMatriz(categoria);
        fechaCaducidad = JOptionPane.showInputDialog("Digite la fecha de caducidad del producto");
         insertarEnMatriz(fechaCaducidad);
    }

    public void insertarEnMatriz(String dato) {
        //llenamos la matriz
        for (int i = 0; i < 10; i++) {//este for es para llenar las filas
            for (int j = 0; j < 6; j++) {//este for es para llenar las columnas
                int salario = Integer.parseInt(JOptionPane.showInputDialog("Digite un salario"));
                productos[i][j] = dato;
 
            }
            
        }
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
