public class Circulo {

  Punto centro;
  double radio;

  public Circulo(Punto centro, double radio) throws InvalidRadioException{
    if (radio <= 0)
      throw new InvalidRadioException("Radio inválido");
    this.centro = centro;
    this.radio = radio;
  }
  @Override
  public String toString() {
    return "[centro=" + centro + ", radio=" + radio + "]";
  }

}