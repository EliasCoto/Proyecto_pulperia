package Proveedor;

import javax.swing.JOptionPane;

/**
 *
 * 
 */
/* Clase proveedor: la misma se encarga de guardar un proveedor con sus datos.
 * Métodos: mostrarDatos y tomarDatosProveedor
 */
public class Proveedor {

    private int idProvedor;
    private String nombre;
    private int cedula;
    private int telefono;
    private String correoElectronico;

    public void mostrarDatos() {
        System.out.println("Provedor ingresado: ");
        System.out.println("");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Cedula: " + this.cedula);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Correo Electronico: " + this.correoElectronico);
    }

// Método encargado de solicitar al usuario los datos necesarios para ingresar un proveedor.
    public void tomarDatosProveedor() {
        JOptionPane.showMessageDialog(null, "Ingresando un provedor");
        String id = JOptionPane.showInputDialog("Digite el id del provedor: ");
        String nombre = JOptionPane.showInputDialog("Digite el nombre del provedor: ");
        int numId = Integer.parseInt(id);
        this.idProvedor = numId;
        this.nombre = nombre;;
        JOptionPane.showMessageDialog(null, "Provedor agregado de manera Correcta");
    }
}
