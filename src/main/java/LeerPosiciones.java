import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerPosiciones {
  public static void main(String[] args) {
    try (FileReader fr = new FileReader("posiciones.txt"); BufferedReader br = new BufferedReader(fr);) {
      String linea;

      while ((linea = br.readLine()) != null) {
        try {
          String [] coordenadas = linea.split("");
          double x = Double.parseDouble(coordenadas[0]);
          double y = Double.parseDouble(coordenadas[1]);
          Punto posicion = new Punto(x,y);
          System.out.println(posicion);
        } catch (NumberFormatException e) {
          System.err.println("Uno de estos datos no es del tipo double: " + linea);
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
