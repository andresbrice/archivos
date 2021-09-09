import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirConPrintWriter {
  public static void main(String[] args) throws IOException {
    PrintWriter salida = new PrintWriter(new FileWriter("salida.txt"));

    int dni = 38702789;
    String s = "dni: ";
    salida.print(s);
    salida.println(dni);

    for (int i = 0; i < 100; i++) {
      salida.println(i);
    }

    salida.close();
  }
}
