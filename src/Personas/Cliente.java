package Personas;

import javax.swing.JOptionPane;

/**
 *
 *
 */
/* Clase cliente: la misma se encarga de almacenar los datos correspondientes de un cliente. 
 * Métodos: mostrarDatos y tomarDatosCliente
 */
public class Cliente {

    private int idCliente;
    private int edad;
    private String nombre;
    private int telefono;
    private String correoElectronico;

    private Cliente cliente[] = new Cliente[2]; // Arreglo que se encarga de guardar los clientes.

    public Cliente() {
    }

    public Cliente(int idCliente, int edad, String nombre, int telefono, String correoElectronico) {
        this.idCliente = idCliente;
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
// Muestra los datos de cada empleado

    public void mostrarDatos() {
        System.out.println("Ingreso de cliente: ");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Correo Electronico: " + this.correoElectronico);

    }

  
    // Método encargado de solicitarle al usuario los datos correspondiente de cada cliente.

    public void tomarDatosCliente() {
        JOptionPane.showMessageDialog(null, "Insertando un cliente");
        String id = JOptionPane.showInputDialog("Digite el id del cliente: ");
        String nombre = JOptionPane.showInputDialog("Digite el nombre del cliente: ");
        String edad = JOptionPane.showInputDialog("Digite la edad del cliente: ");
        String telefono = JOptionPane.showInputDialog("Digite el numero de telefono del cliente: ");
        String correoElectronico = JOptionPane.showInputDialog("Digite el correo electronico del cliente: ");
        int numId = Integer.parseInt(id);
        int numEdad = Integer.parseInt(edad);
        int numTelefono = Integer.parseInt(telefono);
        this.idCliente = numId;
        this.nombre = nombre;
        this.edad = numEdad;
        this.telefono = numTelefono;
        this.correoElectronico = correoElectronico;
        JOptionPane.showMessageDialog(null, "Cliente agregado de manera correcta!");
    }

  
}
