import java.text.DecimalFormat;

public class Gasolinera {
  private double beneficioGasolinera;

  public Gasolinera() {
    this.beneficioGasolinera = 0.21;
  }

  public double getPrecioConIVA(double precioBase) {
    return precioBase * 1.21;
  }

  public double getPrecioPorLitro(Combustible combustible) {
    return getPrecioConIVA(combustible.getPrecioBase()) + combustible.getImpuestos() + this.beneficioGasolinera;
  }

  public double impuestos(double precioBase, double impuesto) {
    return impuesto + getPrecioConIVA(precioBase);
  }

  public double porcenntajeImpuesto(double precioBase, double impuesto) {
    return (impuestos(precioBase, impuesto) / (precioBase + impuestos(precioBase, impuesto))) * 100;
  }

  public void mostrarMensajeCombustible(Combustible combustible) {
    DecimalFormat decimals = new DecimalFormat("#.###");
    String mensaje = "Precio/Litro: " + decimals.format(this.getPrecioPorLitro(combustible)) +
        "\nCantidad destinada a impuestos: "
        + decimals.format(
            this.impuestos(combustible.getPrecioBase(), combustible.getImpuestos()) - combustible.getPrecioBase())
        +
        "\nEso supone el "
        + decimals.format(this.porcenntajeImpuesto(combustible.getPrecioBase(), combustible.getImpuestos())) + "%" +
        "\nGracias por repostar en la Gasolinera Chivata.\n";
    System.out.println(mensaje);
  }
}
