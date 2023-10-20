package Plugins;

public class ProcesadorTexto {
    private String texto;

    public ProcesadorTexto(String texto) {
        this.texto = texto;
    }

    public void ejecutarPlugin(Plugin plugin){
        plugin.ejecutar(texto);
    }
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    
}
