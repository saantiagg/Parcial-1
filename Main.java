import java.util.Scanner; 

public class Main {
    public static void main(String[]args) { 
        Scanner sc=new Scanner(System.in);

        Libro libro1=new Libro("La divina comedia","Dante Alighieri",5,0);
        Libro libro2=new Libro("Cien años de soledad","Gabriel Garcia Marquez",3,0);
        Libro libro3=new Libro("Pinocho","Carlo Collodi",4,0);

        System.out.println("Catalogo de libros:");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);

        System.out.println("\nIngrese el libro a prestar:");
        System.out.println("1." + libro1.getTitulo());
        System.out.println("2." + libro2.getTitulo());
        System.out.println("3." + libro3.getTitulo());
        System.out.print("Seleccione una opcion: ");

    int opcion=sc.nextInt();

    Libro seleccionado=null;
    switch(opcion) {
        case 1:
            seleccionado=libro1;
            break;
        case 2:
            seleccionado=libro2;
            break;
        case 3:
            seleccionado=libro3;
            break;
        default:
            System.out.println("Opcion no valida.");

    }

    if(seleccionado!=null) {
        if(seleccionado.prestar()) {
            System.out.println("Prestamo exitoso de " + seleccionado.getTitulo());
        } else {
            System.out.println("No hay copias disponibles de " + seleccionado.getTitulo());
        }
        
        System.out.println("Estado actual del libro:");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);

        sc.close();



    }
    
    }
}
