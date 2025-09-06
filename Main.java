import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        Libro libro1 = new Libro("La divina comedia", "Dante Alighieri", 5, 0);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 3, 0);
        Libro libro3 = new Libro("Pinocho", "Carlo Collodi", 4, 0);
 
        int opcionMenu;
        do {
            System.out.println("Catálogo");
            System.out.println("1. Prestar un libro");
            System.out.println("2. Devolver un libro");
            System.out.println("3. Ver catálogo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcionMenu = sc.nextInt();
 
            Libro seleccionado = null;
 
            switch (opcionMenu) {
                case 1:
                    System.out.println("\nSeleccione el libro a prestar:");
                    System.out.println("1. " + libro1.getTitulo());
                    System.out.println("2. " + libro2.getTitulo());
                    System.out.println("3. " + libro3.getTitulo());
                    System.out.print("Opción: ");
                    int opcionPrestamo = sc.nextInt();
 
                    switch (opcionPrestamo) {
                        case 1: seleccionado = libro1; break;
                        case 2: seleccionado = libro2; break;
                        case 3: seleccionado = libro3; break;
                        default: System.out.println("Opción inválida."); break;
                    }
 
                    if (seleccionado != null) {
                        if (seleccionado.prestar()) {
                            System.out.println("Préstamo exitoso de \"" + seleccionado.getTitulo() + "\"");
                        } else {
                            System.out.println("No hay copias disponibles de \"" + seleccionado.getTitulo() + "\"");
                        }
                    }
                    break;
 
                case 2:
                    System.out.println("\nSeleccione el libro a devolver:");
                    System.out.println("1. " + libro1.getTitulo());
                    System.out.println("2. " + libro2.getTitulo());
                    System.out.println("3. " + libro3.getTitulo());
                    System.out.print("Opción: ");
                    int opcionDevolucion = sc.nextInt();
 
                    switch (opcionDevolucion) {
                        case 1: seleccionado = libro1; break;
                        case 2: seleccionado = libro2; break;
                        case 3: seleccionado = libro3; break;
                        default: System.out.println("Opción inválida."); break;
                    }
 
                    if (seleccionado != null) {
                        seleccionado.devolver();
                        System.out.println("Devolución exitosa de \"" + seleccionado.getTitulo() + "\"");
                    }
                    break;
 
                case 3:
                    System.out.println("\nCatálogo de libros:");
                    System.out.println(libro1);
                    System.out.println(libro2);
                    System.out.println(libro3);
                    break;
 
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
 
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
                    break;
            }
 
        } while (opcionMenu != 4);
 
        sc.close();
    }
}
 