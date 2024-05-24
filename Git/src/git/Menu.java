
package git;

import java.util.Scanner;


public class Menu {
 
   public static Scanner sc = new Scanner(System.in);
   public static bibllioteca biblio= new bibllioteca();
   public static Reproductor reproducir = new Reproductor();
    public static void main(String[] args) {
        Menu();
        int opc = Integer.parseInt(sc.nextLine());
        do{
       switch(opc){
           
           case 1:
               reproducir.crearCancion();
             break;  
           case 2:
               reproducir.agregarCancionALaBiblioteca();
               break;
           case 3:
              reproducir.listarCanciones();
               break;
           case 4:
               reproducir.reproducirCanciones();
               break;
           case 5:
               reproducir.PausarYReaundar();
               break;
           case 6:
               reproducir.AvanzarYRetroceder();
               break;
           case 7:
               reproducir.controlarVolumen();
               break;
           case 8:
               reproducir.salirDeAplicacion();
                   break;
            default:
       }
        }while(opc!=8);
        
        }
    public static void Menu(){
        System.out.println("¡Bienvenido/a!");
        System.out.println("Seleccione la opción que desea realizar");
        System.out.println("1. Crear canciones");
        System.out.println("2. Agregar canciones a la biblioteca");
        System.out.println("3. Listar canciones");
        System.out.println("4. Reproducir canciones");
        System.out.println("5. Pausar y reundar la reproducción");
        System.out.println("6. Avanzar y retroceder en la canción");
        System.out.println("7. Controlar el volumen");
        System.out.println("8. Salir de la aplicación "); 
    }  
  
}
