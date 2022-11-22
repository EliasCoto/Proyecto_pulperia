package proyecto_pulperia;

import Productos.Producto;
import javax.swing.JOptionPane;

public class MenuPrincipal {

    //matriz
    static String productos[][] = new String[20][6]; //Se usa una matriz para guardar los precios

    static Producto p = new Producto();

    public static void main(String[] args) {

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
                    + "3- Ver clientes\n"
                    + "4- Ver empleados\n"
                    + "5-  Ver facturas\n"
                    + "6- Productos vendidos del dia\n"
                    + "7- Ver ganancias del dia\n"
                    + "8- Sumar ganancias del dia\n"
                    + "9- Salir"));

            switch (opcion) {

                case 1:
                    p.recogerDatos();

                    break;

                case 2:

                    break;

                case 3:
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
}
