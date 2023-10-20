package Plugins;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GuardarArchivoPlugin implements Plugin {
    public void ejecutar(String texto) {
        String path = "D:\\ea\\archivoDestino.txt";
        try {
            Files.write(Paths.get(path), texto.getBytes());
            System.out.println("El contenido del documento se ha guardado en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo " + e);
        }
    }
}
