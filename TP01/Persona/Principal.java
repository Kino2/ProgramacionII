

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        // Crear una persona con diferentes constructores
        Persona persona1 = new Persona(12345678);
        Persona persona2 = new Persona(87654321, "Juan", "Pérez");
        Persona persona3 = new Persona(65432187, "María", "López", LocalDate.of(1995, 7, 15));

        // Mostrar información de las personas
        System.out.println(persona1.mostrarInformacion());
        System.out.println("Persona 1 - IMC: " + persona1.calcularIMC() + ", En forma: " + persona1.estaEnForma());
        System.out.println("Persona 1 - Cumple años: " + persona1.cumpleAnios());
        System.out.println("Persona 1 - Mayor de edad: " + persona1.esMayor());
        System.out.println("Persona 1 - Puede votar: " + persona1.puedeVotar());
        System.out.println("Persona 1 - Coherente: " + persona1.esCoherente());

        System.out.println(persona2.mostrarInformacion());
        System.out.println("Persona 2 - IMC: " + persona2.calcularIMC() + ", En forma: " + persona2.estaEnForma());
        System.out.println("Persona 2 - Cumple años: " + persona2.cumpleAnios());
        System.out.println("Persona 2 - Mayor de edad: " + persona2.esMayor());
        System.out.println("Persona 2 - Puede votar: " + persona2.puedeVotar());
        System.out.println("Persona 2 - Coherente: " + persona2.esCoherente());
        
        System.out.println(persona3.mostrarInformacion());
        System.out.println("Persona 3 - IMC: " + persona3.calcularIMC() + ", En forma: " + persona3.estaEnForma());
        System.out.println("Persona 3 - Cumple años: " + persona3.cumpleAnios());
        System.out.println("Persona 3 - Mayor de edad: " + persona3.esMayor());
        System.out.println("Persona 3 - Puede votar: " + persona3.puedeVotar());
        System.out.println("Persona 3 - Coherente: " + persona3.esCoherente());
        
    }
}
