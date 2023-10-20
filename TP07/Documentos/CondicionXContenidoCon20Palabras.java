package Documentos;

public class CondicionXContenidoCon20Palabras extends Condicion {
    private int cantidadMinimaPalabras;

    public CondicionXContenidoCon20Palabras() {
        this.cantidadMinimaPalabras = 20;
    }

    public boolean cumple(Documento documento) {
        String contenido = documento.getContenidoTextual();
        if (contenido != null) {
            // Dividir el contenido en palabras utilizando un espacio en blanco como
            // delimitador
            String[] palabras = contenido.split("\\s+");

            // Verificar si la cantidad de palabras es mayor o igual a la cantidad mínima
            return palabras.length >= cantidadMinimaPalabras;
        }
        return false;
    }

}
