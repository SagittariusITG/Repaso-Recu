public abstract class Combustibles {
    private Gasolinera gasolinera;

    public String toString() {
        return "Precio/Litro: " + gasolinera.combustible(this.getPrecioBase(), this.getImpuestos()) +
                "Cantidad destinada a impuestos: " + gasolinera.impuestos(this.getPrecioBase(), this.getImpuestos()) +
                "\nEso supone el " + gasolinera.porcenntajeImpuesto(this.getPrecioBase(), this.getImpuestos()) + "%" +
                "\nGracias por repostar en la Gasolinera Chivata.\n";
    }

    private double getImpuestos() {
        return this.getImpuestos();
    }

    private double getPrecioBase() {
        return this.getPrecioBase();
    }
}
