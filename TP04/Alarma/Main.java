package TP04.Alarma;

public class Main {
    public static void main(String [] args){
        //Alarma alarma = new Alarma(); Es de prueba, con la alarma suena solo el timbre
        AlarmaLuminosa alarma = new AlarmaLuminosa();
        alarma.romperVidrio();
        alarma.comprobar();
        
    }
}
