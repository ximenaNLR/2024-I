package git;

import java.util.List;

public class canciones {
private String nombre;
private String album;
private String artista;
private String genero;

    public canciones() {
    }
    public canciones(String nombre, String album, String artista, String genero) {
        this.nombre = nombre;
        this.album = album;
        this.artista = artista;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "canciones{" + "nombre=" + nombre + ", album=" + album + ", artista=" + artista + ", genero=" + genero + '}';
    }

    void add(List<canciones> agregarCancion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    


}

