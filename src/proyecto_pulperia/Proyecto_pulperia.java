package proyecto_pulperia;

public class Proyecto_pulperia {

    public static void main(String[] args) {
        //menu

        Producto p = new Producto();
   
       p.insertarEnMatriz();
       p.mostrarDatosProducto();
        System.out.println(p.validarCategoriaProducto("2"));
       
      
    }

}
