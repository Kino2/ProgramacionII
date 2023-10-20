package Plugins;

public class ReemplazoTextoPlugin implements Plugin {
    private String palabraEspecifica;
    private String palabraQueReemplaza;

    public ReemplazoTextoPlugin(String palabraEspecifica, String palabraQueReemplaza) {
        this.palabraEspecifica = palabraEspecifica.toLowerCase();
        this.palabraQueReemplaza = palabraQueReemplaza;
    }

    public void ejecutar(String texto) {
        String textoReemplazado = texto.toLowerCase().replace(palabraEspecifica, palabraQueReemplaza);
        System.out.println(textoReemplazado);
    }
}
