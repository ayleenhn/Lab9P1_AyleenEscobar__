
package lab9p1_ayleenescobar;
import java.util.Scanner;
import java.util.ArrayList;

public class Lab9P1_AyleenEscobar {
    
    static ArrayList<Libros> libros = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc_p = new Scanner(System.in);
        
        boolean respuesta = true;
        while (respuesta){
            System.out.println("Menu");
            System.out.println("1.Libros y más Libros");
            System.out.println("2.SALIR");
            System.out.println("Ingrese su opcion: ");
            
            int opcion = sc.nextInt();
        
            switch (opcion){
                case 1: {
                    boolean respuesta2 = true;
                    while (respuesta2){
                        System.out.println("Elija una opción:");
                        System.out.println("");
                        System.out.println("1. Agregar Libro\n" +
                                            "2. Listar libros\n" +
                                            "3. Modificar libro\n" +
                                            "4. Eliminar libro\n" +
                                            "5. Buscar libro por titulo\n" +
                                            "6. Buscar libros según autor\n" +
                                            "7. Búsqueda con filtro de genero\n"+
                                            "8.Salir.");
                        System.out.println("");
                        System.out.print("Opción ingresada: ");
                        int opcion2 = sc.nextInt();

                        switch (opcion2){
                            case 1: {
                                System.out.println("Ha elegido la opción para agregar un libro, por favor aporte la información solicitada.");
                                System.out.print("Título: ");
                                String titulo = sc_p.nextLine();
                                System.out.print("Autor: ");
                                String autor = sc_p.nextLine();
                                System.out.print("Género: ");
                                String genero = sc_p.nextLine();
                                System.out.print("Edad mínima: ");
                                int edad = sc.nextInt();
                                Libros libritos = new Libros(titulo,autor,genero,edad);
                                libros.add(libritos);
                                System.out.println("Libro agregado exitosamente!");
                                System.out.println("");
                            }break;

                            case 2:{
                                if(libros.size() == 0){
                                    System.out.println("NO HAY NINGUN LIBRO INGRESADO.");
                                    System.out.println("");
                                } else{
                                    LibrosDisponibles();
                                }
                            }break;

                            case 3:{
                                if(libros.size() == 0){
                                    System.out.println("NO HAY NINGUN LIBRO INGRESADO.");
                                    System.out.println("");
                                } else{
                                    LibrosDisponibles();
                                    System.out.print("Libro seleccionado: ");
                                    int modif = sc.nextInt();
                                    System.out.println("Ha seleccionado el libro " +libros.get(modif-1).getTitulo()+", ¿qué atributo desea modificar?\n" +
                                                        "1. Titulo\n" +
                                                        "2. Autor\n" +
                                                        "3. Genero\n" +
                                                        "4. Edad Mínima");
                                    System.out.print("Opción ingresada: ");
                                    int mod = sc.nextInt();
                                    System.out.println("");
                                        switch (mod){
                                            case 1: {
                                                System.out.print("Modificara el titulo del libro, ingrese nuevo titulo: ");
                                                String nuevo_titulo = sc_p.nextLine();
                                                libros.get(modif-1).settitulo(nuevo_titulo);
                                                System.out.println("¡Libro modificado exitosamente!");
                                                System.out.println("");
                                            }break;

                                            case 2: {
                                                System.out.print("Modificara el autor del libro, ingrese nuevo autor: ");
                                                String nuevo_autor = sc_p.nextLine();
                                                libros.get(modif-1).setautor(nuevo_autor);
                                                System.out.println("¡Libro modificado exitosamente!");
                                                System.out.println("");
                                            }break;

                                            case 3: {
                                                System.out.print("Modificara el Genero del libro, ingrese nuevo genero: ");
                                                String nuevo_genero = sc_p.nextLine();
                                                libros.get(modif-1).setgenero(nuevo_genero);
                                                System.out.println("¡Libro modificado exitosamente!");
                                                System.out.println("");
                                            }break;

                                            case 4: {
                                                System.out.print("Modificara la edad del libro, ingrese nuevo edad: ");
                                                int nuevo_edad = sc.nextInt();
                                                libros.get(modif-1).setedad(nuevo_edad);
                                                System.out.println("¡Libro modificado exitosamente!");
                                                System.out.println("");
                                            }break;
                                            default:
                                                System.out.println("OPCION NO VALIDA, INTENTE DE NUEVO.");
                                            break;
                                        }
                                }
                            }break;

                            case 4:{
                                if(libros.size() == 0){
                                    System.out.println("NO HAY NINGUN LIBRO INGRESADO.");
                                    System.out.println("");
                                } else{
                                    System.out.println("Ha ingresado la opción de eliminar libros, elija el libro que eliminara:");
                                    LibrosDisponibles();
                                    System.out.print("Libro seleccionado: ");
                                    int modif = sc.nextInt();
                                    libros.remove(modif-1);
                                }
                            }break;

                            case 5:{
                                int cont_titulo=0;
                                if(libros.size() == 0){
                                    System.out.println("NO HAY NINGUN LIBRO INGRESADO.");
                                    System.out.println("");
                                } else{
                                    System.out.print("Ingrese el titulo a buscar: ");
                                    String titulob = sc_p.nextLine();
                                    System.out.println("Libros con titulo de "+titulob+":");
                                    System.out.println("");
                                    for (int i = 0; i < libros.size(); i++) {
                                        if(titulob.equalsIgnoreCase(libros.get(i).getTitulo())){
                                            Libros sacado = libros.get(i);
                                            System.out.println("Libro "+(i+1)+":");
                                            System.out.println("Título: " + sacado.getTitulo());
                                            System.out.println("Autor: " + sacado.getAutor());
                                            System.out.println("Género: " + sacado.getGenero());
                                            System.out.println("Edad mínima: " + sacado.getEdad());
                                            System.out.println("");
                                            cont_titulo ++;
                                        }
                                    }
                                    if(cont_titulo==0){
                                        System.out.println("No hay libros con el titulo "+titulob+".");
                                    }
                                }
                            }break;

                            case 6:{
                                int cont_autor=0;
                                if(libros.size() == 0){
                                    System.out.println("NO HAY NINGUN LIBRO INGRESADO.");
                                    System.out.println("");
                                } else{
                                    System.out.print("Ingrese el autor a buscar: ");
                                    String autorb = sc_p.nextLine();
                                    System.out.println("Libros con el autor de "+autorb+":");
                                    System.out.println("");
                                    for (int i = 0; i < libros.size(); i++) {
                                        if(autorb.equalsIgnoreCase(libros.get(i).getAutor())){
                                            Libros sacado = libros.get(i);
                                            System.out.println("Libro "+(i+1)+":");
                                            System.out.println("Título: " + sacado.getTitulo());
                                            System.out.println("Autor: " + sacado.getAutor());
                                            System.out.println("Género: " + sacado.getGenero());
                                            System.out.println("Edad mínima: " + sacado.getEdad());
                                            System.out.println("");
                                            cont_autor++;
                                        }
                                    }
                                    if(cont_autor==0){
                                        System.out.println("No hay libros con el autor "+autorb+".");
                                    }
                                }
                            }break;

                            case 7:{
                                int cont_genero=0;
                                if(libros.size() == 0){
                                    System.out.println("NO HAY NINGUN LIBRO INGRESADO.");
                                    System.out.println("");
                                } else{
                                    System.out.print("Ingrese el género a buscar: ");
                                    String generob = sc_p.nextLine();
                                    System.out.println("Libros con genero de "+generob+":");
                                    System.out.println("");
                                    for (int i = 0; i < libros.size(); i++) {
                                        if(generob.equalsIgnoreCase(libros.get(i).getGenero())){
                                            Libros sacado = libros.get(i);
                                            System.out.println("Libro "+(i+1)+":");
                                            System.out.println("Título: " + sacado.getTitulo());
                                            System.out.println("Autor: " + sacado.getAutor());
                                            System.out.println("Género: " + sacado.getGenero());
                                            System.out.println("Edad mínima: " + sacado.getEdad());
                                            System.out.println("");
                                            cont_genero++;
                                        }
                                    }
                                    if(cont_genero==0){
                                        System.out.println("No hay libros con el genero "+generob+".");
                                    }
                                }
                            }break;

                            case 8:{
                                respuesta2=false;
                            }
                        }
                        }
                }break;

                case 2:{
                   respuesta= false; 
                }break;

                default:
                    System.out.println("NUMERO NO VALIDO.");
                    break;
            }
        }
    }
    public static void LibrosDisponibles() {
        System.out.println("Libros Disponibles: ");
        System.out.println("");
        for (int i = 0; i < libros.size(); i++) {
            Libros sacado = libros.get(i);
            System.out.println("Libro "+(i+1)+":");
            System.out.println("Título: " + sacado.getTitulo());
            System.out.println("Autor: " + sacado.getAutor());
            System.out.println("Género: " + sacado.getGenero());
            System.out.println("Edad mínima: " + sacado.getEdad());
            System.out.println("");
        }
    }
    
}
