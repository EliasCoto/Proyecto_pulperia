package Personas;

import javax.swing.JOptionPane;

/**
 *
 *
 */
/* Clase empleado: la misma se encarga de almacenar los datos de cada empleado. 
 * Métodos: mostrarDatos y tomarDatosEmpleado
 */
public class Empleado {

    private int idEmpleado;
    private String nombre;
    private int cedula;
    private int telefono;
    private String correoElectronico;
    private boolean estado;

    private Empleado empleados[] = new Empleado[2]; // Arreglo que se encarga de guardar los empleados.

    public Empleado() {
    }

    public Empleado(int idEmpleado, String nombre, int cedula, int telefono, String correoElectronico, boolean estado) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.estado = estado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
// Muestra los datos de cada empleado.

    public void mostrarDatos() {
        System.out.println("Ingreso de empleado: ");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Cedula: " + this.cedula);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Correo Electronico: " + this.correoElectronico);
        if (isEstado() == true) {
            System.out.println("Empleado activo");
        } else {
            System.out.println("Empleado inactivo");
        }
    }

    // Recorre la lista de empleados y muestra cada uno.
    public void mostrarEmpleados() {
        for (int i = 0; i < 2; i += 1) {
            System.out.println("");
            System.out.println("Empleado: " + i);
            empleados[i].mostrarDatos();
        }
    }

    // Método encargado de solicitar al usuario la información correspondiente para el ingreso de cada empleado.
    public void tomarDatosEmpleado() {
        JOptionPane.showMessageDialog(null, "Insertando un empelado");
        String id = JOptionPane.showInputDialog("Digite el id del empleado: ");
        String cedula = JOptionPane.showInputDialog("Digite la cedula del empleado: ");
        String nombre = JOptionPane.showInputDialog("Digite el nombre del empleado: ");
        String telefono = JOptionPane.showInputDialog("Digite el numero de telefono del empleado: ");
        String correoElectronico = JOptionPane.showInputDialog("Digite el correo electronico del empleado: ");
        int numId = Integer.parseInt(id);
        int numCedula = Integer.parseInt(cedula);
        int numTelefono = Integer.parseInt(telefono);
        this.idEmpleado = numId;
        this.nombre = nombre;
        this.cedula = numCedula;
        this.telefono = numTelefono;
        this.correoElectronico = correoElectronico;
        this.estado = true;
        JOptionPane.showMessageDialog(null, "Empleado agregado de manera correcta!");
    }

    public void llenarMatriz() {
        for (int i = 0; i < 2; i += 1) {
            Empleado empleado1 = new Empleado();
            empleado1.tomarDatosEmpleado();
            empleados[i] = empleado1;
        }
    }
}
