
package git;

import java.util.ArrayList;
import java.util.List;


public class bibllioteca {
private List<canciones> listacanciones;

    public bibllioteca(List<canciones> listacancionres) {
        this.listacanciones = new ArrayList<>();
    }

    public bibllioteca() {
    }
    
    public List<canciones> agregarCancion(canciones cancion) {
        listacanciones.add(cancion);
        return listacanciones;
    }

    public void eliminarCancion(canciones cancion) {
        listacanciones.remove(cancion);
    }

    public  List<canciones> obtenerTodasLasCanciones() {
        for (canciones cancion : listacanciones) {
            System.out.println(cancion);
        }
    return listacanciones;
        
    }
        
    }

   


