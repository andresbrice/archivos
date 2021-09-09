import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerEnteros {
  public static void main(String[] args) {
    int suma = 0;

    try (FileReader fr = new FileReader("enteros.txt"); BufferedReader br = new BufferedReader(fr);) {
      String linea;

      while ((linea = br.readLine()) != null) {
        try {
          suma += Integer.parseInt(linea);
        } catch (NumberFormatException e) {
          System.err.println("Este dato no son del tipo entero: " + linea);
        }
      }
      System.out.println("Suma: " + suma);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
