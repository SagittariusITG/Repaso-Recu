import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Gasolinera gasolinera = new Gasolinera();
    Diesel diesel = new Diesel();
    SP95 sp95 = new SP95();
    SP98 sp98 = new SP98();
    double precioBase;
    int opcion = 0;

    dias: for (int dia = 1;; dia++) {
      System.out.println(
          "\nBuenos días son las 05:00 de la mañana del día " + dia
              + ", por favor, introduzca los precios base de los combustibles.\n");
      System.out.println("\nPrecio base del diesel: ");
      precioBase = sc.nextDouble();
      diesel.setPrecioBase(precioBase);
      System.out.println("\nPrecio base de Sin Plomo 95: ");
      precioBase = sc.nextDouble();
      sp95.setPrecioBase(precioBase);
      System.out.println("\nPrecio base de Sin Plomo 98: ");
      precioBase = sc.nextDouble();
      sp98.setPrecioBase(precioBase);

      System.out.println("\n---------------------------\n");
      System.out.println("\nBienvenido a la Gasolinera Chivata\n");

      do {
        System.out.println("\nRepostador\n");
        System.out.println("1. Diesel\n2. Sin plomo 95\n3. Sin plomo 98\n4. Fin de día\n5. Salir");
        opcion = sc.nextInt();

        if (opcion == 1) {
          System.out.println("\nHas elegido Diesel.\n");
          gasolinera.mostrarMensajeCombustible(diesel);
        } else if (opcion == 2) {
          System.out.println("\nHas elegido Sin Plomo 95.\n");
          gasolinera.mostrarMensajeCombustible(sp95);
        } else if (opcion == 3) {
          System.out.println("\nHas elegido Sin Plomo 98.\n");
          gasolinera.mostrarMensajeCombustible(sp98);
        } else if (opcion == 4) {
          System.out.println("\nFin del dia.\n");
          continue dias;
        } else if (opcion == 5) {
          System.out.println("\nCerrar.\n");
          sc.close();
          System.exit(0);
        }
      } while (opcion != 5);
    }
  }
}