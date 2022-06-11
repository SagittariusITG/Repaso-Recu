public abstract class Combustible {
  protected String nombre;
  protected double precioBase;
  protected double impuestos;
  protected int litrosDisponibles;

  public void setPrecioBase(double precioBase) {
    if (precioBase > 0) {
      this.precioBase = precioBase;
    }
  }

  public double getImpuestos() {
    return this.impuestos;
  }

  public double getPrecioBase() {
    return this.precioBase;
  }

  public int getLitrosDisponibles() {
    return this.litrosDisponibles;
  }

  public String getNombre() {
    return this.nombre;
  }
}
