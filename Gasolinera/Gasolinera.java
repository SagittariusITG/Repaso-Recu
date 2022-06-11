public class Gasolinera extends Combustibles {
    Diesel diesel = new Diesel();
    SP95 sp95 = new SP95();
    SP98 sp98 = new SP98();

    private double beneficioGasolinera = 0.21;

    public double calcularIVA(double precioBase) { return precioBase / 1.21; }

    public double combustible(double precioBase, double impuesto){ return precioBase + impuesto + calcularIVA(precioBase) + this.beneficioGasolinera; }

    public double impuestos(double precioBase, double impuesto) { return impuesto + calcularIVA(precioBase); }
    public double porcenntajeImpuesto(double precioBase, double impuesto) { return impuestos(precioBase, impuesto) / combustible(precioBase, impuesto) * 100; }
}
