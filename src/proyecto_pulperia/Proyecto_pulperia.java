package proyecto_pulperia;

import Factura.Facturas_metodos;
import Productos.Producto;

public class Proyecto_pulperia {

    public static void main(String[] args) {
        //menu

        Producto p = new Producto();
      
        
       p.insertarEnMatriz();
       
       p.mostrarDatosProducto();
        System.out.println(p.productoExist("Banano"));
    
       
       
      // Facturas_metodos f = new Facturas_metodos();
       
      //f.factura();
     // f.mostrarFacturas();
    }

}
