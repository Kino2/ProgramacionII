package Plugins;

public class Main {
    public static void main(String[] args) {
       ProcesadorTexto cpu = new ProcesadorTexto("Hola trolazos, Como andan?");
       Plugin plugin = new EliminarPalabraPlugin("como");
       cpu.ejecutarPlugin(plugin);
    }
}
