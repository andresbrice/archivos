import java.io.*;

public class LeerArchivo {

  public static void main(String[] args) {
   // File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;

    try {
     // archivo = new File("archivo.txt"); //Apertura de fichero y creación de BufferReader para poder hacer una lectura comoda
      fr = new FileReader("archivo.txt");
      br = new BufferedReader(fr);

      //lectura del fichero
      String linea = br.readLine();
      while (linea != null) {
        System.out.println(linea);
        linea = br.readLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      /*
       En el finally cerramos el fichero, para asegurarnos que se cierra
       tanto si ttodo va bien como si salta una excepcion
      */
      try {
        if (fr != null) {
          fr.close();
        }
      } catch (Exception e2) {
        e2.printStackTrace();
      }
    }
  }
}
