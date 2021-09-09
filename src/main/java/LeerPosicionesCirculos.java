import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerPosicionesCirculos {
  public static void main(String[] args) {

    try (FileReader fr = new FileReader("circulos.txt"); BufferedReader br = new BufferedReader(fr);) {
      String linea;

      while ((linea = br.readLine()) != null) {
        try {
          String[] coordenadas = linea.split(",");
          double r = Double.parseDouble(coordenadas[0]);
          if (r <= 0) {
            throw new InvalidRadioException("Radio negativo o cero");
          }
          double x = Double.parseDouble(coordenadas[1]);
          double y = Double.parseDouble(coordenadas[2]);
          Punto posicion = new Punto(x, y);
          Circulo c = new Circulo(posicion, r);
          System.out.println(c);
        } catch (InvalidRadioException rne) {
          System.err.println(rne.getMessage());
        } catch (NumberFormatException e) {
          System.err.println("Uno de estos datos no es del tipo double: " + linea);
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
