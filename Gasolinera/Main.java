import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Gasolinera gasolinera = new Gasolinera();
        Diesel diesel = new Diesel();
        SP95 sp95 = new SP95();
        SP98 sp98 = new SP98();
        double precioBase;
        int opcion = 0;

        System.out.println("\nBuenos días son las 05:00 de la mañana, por favor, introduzca los precios base de los combustibles.\n");
        System.out.println("\nPrecio base del diesel: ");
        precioBase = sc.nextDouble();
        gasolinera.diesel.setPrecioBase(precioBase);
        System.out.println("\nPrecio base de Sin Plomo 95: ");
        precioBase = sc.nextDouble();
        gasolinera.sp95.setPrecioBase(precioBase);
        System.out.println("\nPrecio base de Sin Plomo 98: ");
        precioBase = sc.nextDouble();
        gasolinera.sp98.setPrecioBase(precioBase);

        System.out.println("\n---------------------------\n");
        System.out.println("\nBienvenido a la Gasolinera Chivata\n");

        do {
            System.out.println("\nRepostador\n");
            System.out.println("1. Diesel\n2. Sin plomo 95\n3. Sin plomo 98\n4. Salir\n");
            opcion = sc.nextInt();

            if(opcion == 1){
                System.out.println("\nHas elegido Diesel.\n");
                Combustibles.toString();
            } else if (opcion == 2) {
                System.out.println("\nHas elegido Sin Plomo 95.\n");
                Combustibles.toString();
            } else if (opcion == 3) {
                System.out.println("\nHas elegido Sin Plomo 98.\n");
                Combustibles.toString();
            }
        } while (opcion != 4);
    }
}