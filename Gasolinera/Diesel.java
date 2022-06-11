public class Diesel extends Combustibles {
    private String nombre = "Diesel";
    private double precioBase = 1.095;
    private double impuestos = 0.379;
    private int litrosDisponibles = 100;

    public void setPrecioBase(double precioBase) {
        if(precioBase != 0){
            this.precioBase = precioBase;
        }
    }
    public double getPrecioBase() { return this.precioBase; }
    public double getImpuestos() { return this.impuestos; }
    public int getLitrosDisponibles() { return this.litrosDisponibles; }
    public String getNombre() { return this.nombre; }
}
