
package git;
import java.util.Scanner;

public class Reproductor {
     public static Scanner sc = new Scanner(System.in);
     public static bibllioteca biblio= new bibllioteca();
     public void reproducirCancion(canciones cancion) {
        System.out.println("Reproduciendo: " + cancion.getNombre());
    }
     public static void crearCancion(){
         System.out.println("Ingrese el nombre de la cancion");
         String nombre = sc.nextLine();
         System.out.println("Ingrese el nombre del album");
         String album = sc.nextLine();
         System.out.println("Ingrese el nombre del artista");
         String artista = sc.nextLine();
         System.out.println("Ingrese el genero");
         String genero = sc.nextLine();
         canciones cancion = new canciones(nombre, album, artista, genero);
         biblio.agregarCancion(cancion);
         System.out.println("Canción agregada correctamente a la biblioteca.");
     }
     public static void agregarCancionALaBiblioteca(){
        
    }
      public static void listarCanciones(){
        
    }
       public static void reproducirCanciones(){
        
    }
        public static void pausarYReundarLaReproduccion(){
        
    }
     public static void avanzarYRetrocederEnLaCancion(){
        
    }
      public static void controlarElVolumen(){
          
        
    }
       public static void salirDeAplicacion(){
        
    }
        public static void crearYGestionarListasDeReproduccion(){
        
    }
         public static void buscarCanciones(){
        
    }
          public static void ordenarCanciones(){
        
    }
           public static void eliminarCanciones(){
        
    }
    
    public static void Reproducir(){
        
    }
     public static void Avanzar(){
        
    }
      public static void Retroceder(){
        
    }
     public static void Pausar(){
        
    }
      public static void controlarVolumen(){
        
    }
}
