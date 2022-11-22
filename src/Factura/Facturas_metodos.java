package Factura;

import Productos.Producto;
import javax.swing.JOptionPane;

public class Facturas_metodos {

    Producto p = new Producto();
    Factura facturas[] = new Factura[1];//aqui hacemos el arreglo de objetos

    public void factura() {
        //aqui unicamente generamos facturas

        //agregar el cliente
        //hasta que karla lo termine
        //agrego el id de la factura
        for (int i = 0; i < facturas.length; i++) {
            //agrego el id de la factura
            int id = (int) (Math.random() * 10 + 1);
            //agrego los productos del cliente
            String nombreProductoComprado = "";
            boolean seguir = false;
            String[] botones = {"Si", "No"};
            while (!seguir) {
                nombreProductoComprado = JOptionPane.showInputDialog("Digite el nombre del producto que desea comprar");

                int opcion = JOptionPane.showOptionDialog(null,
                        "Desea comprar otro producto?",
                        "Pulperia Miguelito",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null,
                        botones, botones[0]);

                if (opcion == 1) {
                    seguir = true;
                } else {
                    seguir = false;
                }
            }

            // agrego el metodo de pago del cliente
            String metodoPago = JOptionPane.showInputDialog("Digite el metodo de pago");

            //sumo todos los productos y eso me genera un total
            double precioProductoComprado = p.traerPrecioProductoEspecifico(nombreProductoComprado);
            double totalFactura = 0;
            totalFactura = totalFactura + precioProductoComprado;
            String fecha = JOptionPane.showInputDialog("Digite la fecha de la factura");

            facturas[i] = new Factura(id, p.traerProductoEspecifico(nombreProductoComprado), precioProductoComprado, metodoPago, fecha, totalFactura);
        }

        //luego envio el total de cada factura a cajas y en cajas sumo todas las facturas
    }

    public void mostrarFacturas() {
        for (int i = 0; i < facturas.length; i++) {
            System.out.println(facturas[i]);
        }

    }

}
