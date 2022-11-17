package Productos;


import javax.swing.JOptionPane;

public class Producto {

    private String productos[][] = new String[2][6]; //se usa una matriz para guardar los productos

    //creacion de atributos
    private String fechaCaducidad;
    private String nombre;
    private String id;
    private String stock;
    private String categoria;
    private String precio;

    public Producto() {
    }

    public Producto(String fechaCaducidad, String nombre, String id, String stock, String categoria, String precio) {
        this.fechaCaducidad = fechaCaducidad;
        this.nombre = nombre;
        this.id = id;
        this.stock = stock;
        this.categoria = categoria;
        this.precio = precio;
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

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "------Producto------ " + "\n"
                + "ID: " + id + "\n"
                + "Nombre: " + nombre + "\n"
                + "Precio: " + precio + "\n"
                + "Stock: " + stock + "\n"
                + "Categoria: " + categoria + "\n"
                + "Expira: " + fechaCaducidad + "\n";
    }

    public void insertarEnMatriz() {  //Metodo para recoger  y llenar datos en la matriz

        //llenamos la matriz
        for (int i = 0; i < 2; i++) {//este for es para llenar las filas
            for (int j = 0; j < 6; j++) {//este for es para llenar las columnas
                if (i == 0) {

                    //esto es para mostrar en pantalla en forma de tabla
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
                        productos[i][j] = nombre;
                    } else if (j == 2) {
                        precio = JOptionPane.showInputDialog("Digite el precio del producto");
                        productos[i][j] = precio;
                    } else if (j == 3) {
                        stock = JOptionPane.showInputDialog("Digite la cantidad de productos que hay en la tienda");
                        productos[i][j] = stock;
                    } else if (j == 4) {
                        categoria = JOptionPane.showInputDialog("Digite la categoria del producto");
                        productos[i][j] = categoria;
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

        for (int n = 0; n < 2; n++) {//filas
            for (int p = 0; p < 6; p++) {//columnas

              System.out.print("\t" + productos[n][p]);

            }
            System.out.println("");
        }
    }

   

//este metodo retorna un "true" si el producto es para mayores de edad.
    //sino un retorna un "false" que signifca que es un producto al cual no importa la edad del "Cliente".
    public boolean validarCategoriaProducto(String nom) {//este id es el id del producto que queremos consultar
        boolean veri = false;
        for (int n = 0; n < 2; n++) {
            for (int p = 0; p < 1; p++) {

                if (productos[n][1].equals(nom)) {
                    if (productos[n][4].equals("licores") || productos[n][4].equals("Licores")) {
                        veri = true;
                    }
                }

            }

        }

        return veri;
    }
//este metodo es para traer unicamente el precio del producto "este metodo funciona pero por el momento esta en prueba"

    public int traerPrecioProductoEspecifico(String nom) {//este nombre es el nombre que queremos buscar en la matriz

        int precioProducto = 0;
        for (int n = 1; n < 2; n++) {// Recorre las filas de nuestro metodo
            for (int p = 1; p < 2; p++) {//Recorre las columnas de nuestro metodo
                if (productos[n][1].equals(nom)) {

                    precioProducto = Integer.parseInt(productos[n][2]);
                }
            }
        }

        return precioProducto;
    }

    //este metodo trae toda la info del producto 
    public Producto traerProductoEspecifico(String nom) {//este nombre es el nombre que queremos buscar en la matriz
        Producto producto;
        String fechaCaducidad = "";
        String nombre = "";
        String id = "";
        String stock = "";
        String categoria = "";
        String precio = "";
        int precioProducto = 0;

        for (int n = 1; n < 2; n++) {// Recorre las filas de nuestro metodo
            for (int p = 1; p < 2; p++) {//Recorre las columnas de nuestro metodo
                if (productos[n][1].equals(nom)) {//si el ecuentra el producto lo retorna
                    id = productos[n][0];
                    nombre = productos[n][1];
                    precio = productos[n][2];
                    stock = productos[n][3];
                    categoria = productos[n][4];
                    fechaCaducidad = productos[n][5];
                }
            }
        }
        producto = new Producto(fechaCaducidad, nombre, id, stock, categoria, precio);
        return producto;
    }

    //Este metodo busca si existe un producto especifico en la tienda
    public boolean productoExist(String nombre) {
        boolean exist = false;

        for (int n = 1; n < 2; n++) {// Recorre las filas de nuestro metodo
            for (int p = 1; p < 2; p++) {//Recorre las columnas de nuestro metodo

                if (productos[n][1].equals(nombre)) {
                    exist = true;

                }
            }

        }

        return exist;
    }
}
