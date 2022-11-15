package Productos;

import proyecto_pulperia.*;
import javax.swing.JOptionPane;

public class Producto {

    private String productos[][] = new String[3][6]; //se usa una matriz para guardar los productos

    //creacion de atributos
    private String fechaCaducidad;
    private String nombre;
    private String id;
    private int stock; //esta es para hacer alguna operacion
    private String stockMostrar; //esta variable es solo para mostrar
    private String categoria;
    private int precio; //esta es para hacer alguna operacion
    private String precioMostrar; //esta variable es solo para mostrar

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

    public void insertarEnMatriz() {  //Metodo para recoger  y llenar datos en la matriz

        //llenamos la matriz
        for (int i = 0; i < 3; i++) {//este for es para llenar las filas
            for (int j = 0; j < 6; j++) {//este for es para llenar las columnas
                if (i == 0) {
                    
                        productos[0][0] = "ID";
                  
                        productos[0][1] = "Producto";
                 
                        productos[0][2] = "Precio";
                  
                        productos[0][3] = "Stock";
                 
                        productos[0][4] = "Categoria";
                  
                        productos[0][5] = "Expira";
                    
                } else {
                    //estos if son para ir saltando de columna en columna
                    if (j == 0) {
                        id = JOptionPane.showInputDialog("Digite el id del producto");
                        productos[i][j] = id;
                    } else if (j == 1) {
                        nombre = JOptionPane.showInputDialog("Digite el nombre del producto");
                        productos[i][j] = nombre+"\t";
                    } else if (j == 2) {
                        precioMostrar = JOptionPane.showInputDialog("Digite el precio del producto");
                        precio = Integer.parseInt(precioMostrar);
                        productos[i][j] = precioMostrar;
                    } else if (j == 3) {
                        stockMostrar = JOptionPane.showInputDialog("Digite la cantidad de productos que hay en la tienda");
                        stock = Integer.parseInt(stockMostrar);
                        productos[i][j] = stockMostrar;
                    } else if (j == 4) {
                        categoria = JOptionPane.showInputDialog("Digite la categoria del producto");
                        productos[i][j] = categoria+"   ";
                    } else if (j == 5) {
                        fechaCaducidad = JOptionPane.showInputDialog("Digite la fecha de caducidad del producto");
                        productos[i][j] = fechaCaducidad;
                    }
                }
                
            }

        }
    }

    //metodo es para mostrar la matriz con todos los productos
    public void mostrarDatosProducto() {

        for (int n = 0; n < 3; n++) {//filas
            for (int p = 0; p < 6; p++) {//columnas
               
                System.out.print("\t" + productos[n][p]);

            }
            System.out.println("");
        }
    }

//este metodo retorna un "true" si el producto es para mayores de edad.
    //sino un retorna un "false" que signifca que es un producto al cual no importa la edad del "Cliente".
    public boolean validarCategoriaProducto(String id) {//este id es el id del producto que queremos consultar
        boolean veri = false;
        for (int n = 0; n < 3; n++) {
            for (int p = 0; p < 1; p++) {

                if (productos[n][p].equals(id)) {
                    if (productos[n][4].equals("licores") || productos[n][4].equals("Licores")) {
                        veri = true;
                    }
                }

            }

        }

        return veri;
    }

}
