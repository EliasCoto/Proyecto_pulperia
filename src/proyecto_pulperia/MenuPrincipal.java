package proyecto_pulperia;

import Factura.Facturas_metodos;
import Productos.Producto;

public class MenuPrincipal {

    public static void main(String[] args) {
        //menu

        Producto p = new Producto();
      
        
       p.insertarEnMatriz();
       
       p. mostrarDatosProducto();
       
        System.out.println("\n------Pruebas---------");
        System.out.println("Existe el producto X en la pulperia");
        System.out.println(p.productoExist("banano")+"\n");
        
        System.out.println("------Pruebas---------");
        System.out.println("Trae el precio del producto X");
        System.out.println(p.traerPrecioProductoEspecifico("banano")+"\n");
        
        System.out.println("------Pruebas---------");
        System.out.println("Trae todos los datos del producto X");
        System.out.println(p.traerProductoEspecifico("banano")+"\n");
        
        System.out.println("------Pruebas---------");
        System.out.println("Verifica si es un producto X necesita de cedula");
        System.out.println(p.validarCategoriaProducto("banano"));
    
       
       
      // Facturas_metodos f = new Facturas_metodos();
       
      //f.factura();
     // f.mostrarFacturas();
    }

}
