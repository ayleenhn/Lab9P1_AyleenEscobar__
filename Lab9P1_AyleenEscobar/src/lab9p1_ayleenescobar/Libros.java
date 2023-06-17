package lab9p1_ayleenescobar;

public class Libros {
    private String titulo;
    private String autor;
    private String genero;
    private int edad;
    
    public Libros (){
    }
    
    public Libros(String tituloN, String autorN,String generoN, int edadN) {
        this.titulo = tituloN;
        this.autor = autorN;
        this.genero = generoN;
        this.edad = edadN;
    }
    public String getTitulo() {
        return titulo;
    }
    public void settitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setautor(String autor) {
        this.autor = autor;
    }
    public String getGenero() {
        return genero;
    }
    public void setgenero(String genero) {
        this.genero = genero;
    }
    public int getEdad() {
        return edad;
    }
    public void setedad(int edad) {
        this.edad = edad;
    }
    
}
