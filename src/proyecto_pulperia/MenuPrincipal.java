package proyecto_pulperia;

import Factura.Factura;
import Productos.Producto;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MenuPrincipal {

    //matriz
    static String productos[][] = new String[20][6]; //Se usa una matriz para guardar los precios
    //Arreglo de objetos
    static Factura facturas[] = new Factura[2];

    //inicializamos las clases
    static Producto p = new Producto();
    static Factura f = new Factura();

    public static void main(String[] args) {
        creacionMatrizProducto();
        creacionArrayFacturas();

        p = new Producto("1", "banano", "500", "20", "fruta", "No tiene");
        agregarProductoPulperia(p);
        p = new Producto("2", "chiky ", "2000", "100", "galleta", "22/03/2023");
        agregarProductoPulperia(p);
        p = new Producto("3", "coca", "1500", "200", "gaseosa", "20/12/2022");
        agregarProductoPulperia(p);
        p = new Producto("4", "bamboo", "1000", "100", "licores", "16/12/2022");
        agregarProductoPulperia(p);
        p = new Producto("5", "whisky", "47500", "20", "licores", "30/12/2022");
        agregarProductoPulperia(p);
        p = new Producto("6", "chirulitos", "900", "100", "snack", "16/12/2022");
        agregarProductoPulperia(p);
        p = new Producto("7", "tronaditas", "900", "20", "snack", "20/12/2022");
        agregarProductoPulperia(p);
        p = new Producto("8", "krunchy ", "1000", "100", "helado", "16/11/2022");
        agregarProductoPulperia(p);

        boolean parar = false;
        do {

            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "------Bienvenidos------\n"
                    + "1- Ingresar\n"
                    + "2- Login\n"
                    + " 3- Salir\n"));

            switch (opcion) {

                case 1:
                    menuEmpleado();

                    break;

                case 2:

                    break;

                case 3:
                    parar = true;
                    break;

            }

        } while (parar == false);

    }

    public static void menuEmpleado() {

        boolean parar = false;
        do {

            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "------Bienvenidos------\n"
                    + "1- Agregar producto\n"
                    + "2- Mostrar producto\n"
                    + "3- Ver empleados\n"
                    + "4- Agregar proveedor\n"
                    + "5- Ver proveedores\n"
                    + "6- Realizar pedido\n"
                    + "7- Mostrar pedidos\n"
                    + "8- Ver facturas\n"
                    + "9- Productos vendidos del dia\n"
                    + "10- Ver ganancias del dia\n"
                    + "11- Sumar ganancias del dia\n"
                    + "12- Salir"));

            switch (opcion) {

                case 1:
                    p.recogerDatos();
                    agregarProductoPulperia(p);

                    break;

                case 2:
                    mostrarProductosPulperia();

                    break;

                case 3:

                    break;

                case 4:
                    mostrarFacturas();

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;

                case 8:

                    break;

                case 9:

                    break;

                case 10:

                    break;

                case 11:

                    break;

                case 12:
                    parar = true;
                    break;

            }

        } while (parar == false);

    }

    public static void agregarProductoPulperia(Producto producto) { //

        //llenamos la matriz
        for (int i = 0; i < productos.length; i++) {//este for es para llenar las filas
            for (int j = 0; j < 1; j++) {//este for es para llenar las columnas

                if (productos[i][0].equals("-")) {
                    productos[i][0] = producto.getId();
                    productos[i][1] = producto.getNombre();
                    productos[i][2] = producto.getPrecio();
                    productos[i][3] = producto.getStock();
                    productos[i][4] = producto.getCategoria();
                    productos[i][5] = producto.getFechaCaducidad();
                    i = productos.length;
                }

            }
        }

    }

    public static void creacionMatrizProducto() {

        for (int i = 0; i < productos.length; i++) {//este for es para llenar las filas
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

                    productos[i][j] = "-";

                }

            }
        }
    }

    public static void mostrarProductosPulperia() {
        String s = "";
        String fechaCaducidad;
        String nombre;
        String id;
        String stock;
        String categoria;
        String precio;

        for (int i = 0; i < productos.length; i++) {//este for es para llenar las filas
            for (int j = 0; j < 1; j++) {//este for es para llenar las columnas

                id = productos[i][0];
                nombre = productos[i][1];
                precio = productos[i][2];
                stock = productos[i][3];
                categoria = productos[i][4];
                fechaCaducidad = productos[i][5];

                s = s + id + "\t" + nombre + "\t" + precio + "\t" + stock + "\t" + categoria + "\t" + fechaCaducidad + "\n";

            }

        }
        JTextArea ta = new JTextArea(null, s, 20, 50);
        JOptionPane.showMessageDialog(null, new JScrollPane(ta));

    }

    public static void creacionArrayFacturas() {
        for (int i = 0; i < facturas.length; i++) {

            f = new Factura(0, "-", "-", 0);
            facturas[i] = f;

        }

    }

    public static void mostrarFacturas() {
        String s = "";
        for (int i = 0; i < facturas.length; i++) {

            s = s + facturas[i];

        }
        JTextArea ta = new JTextArea(null, s, 20, 50);
        JOptionPane.showMessageDialog(null, new JScrollPane(ta));
    }
}
