import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LeerConScanner {
  public static void main(String[] args) throws FileNotFoundException {
    String miPath = "D:\\Programacion\\Argentina Programa\\Practica\\archivos\\src\\main\\java\\";
    Scanner scanner = new Scanner(new File(miPath + "datos.txt"));
    scanner.useLocale(Locale.ENGLISH);

    double[] vec = new double[scanner.nextInt()];

    for (int i = 0; i < vec.length; i++) {
      try {
        vec[i] = scanner.nextDouble();
      }catch (NoSuchElementException e){
        System.err.println("El numero de lineas indicado es diferente al total de las mismas");
      }
    }

    scanner.close();

    for (int i = 0; i < vec.length; i++) {
      System.out.println(vec[i]);
    }

  }
}