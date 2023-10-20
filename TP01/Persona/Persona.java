import java.time.LocalDate;
import java.time.Period;

public class Persona {
    int dni;
    int edad;
    LocalString fechaNacimiento;
    String sexo;
    String nombre;
    String apellido;
    int peso;
    int altura;

    public Persona(int dni) {
        this.dni = dni;
        this.fechaNacimiento = LocalDate.of(2000, 1, 1);
        this.sexo = "Femenino";
        this.nombre = "N";
        this.apellido = "N";
        this.peso = 1;
        this.altura = 1;
        calcularEdad();
    }

    public Persona(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.fechaNacimiento = LocalDate.of(2000, 1, 1);
        this.sexo = "Femenino";
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = 1;
        this.altura = 1;
        calcularEdad();
    }

    public Persona(int dni, String nombre, String apellido, LocalString fechaNacimiento) {
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = "Femenino";
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = 77;
        this.altura = 2;
        calcularEdad();
    }

    public void calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(this.fechaNacimiento, fechaActual);
        this.edad = periodo.getYears();
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }
    
    public boolean estaEnForma(){
        double imc = calcularIMC();
        return imc >= 18.5 && imc <= 25;
    }

    public boolean cumpleAnios(){
        LocalDate fechaActual = LocalDate.now();
        return fechaActual.getDayOfMonth() == fechaNacimiento.getDayOfMonth() &&
        fechaActual.getMonthValue() == fechaNacimiento.getMonthValue();
    }

    public boolean esMayor(){
        return edad >= 18;
    }

    public boolean puedeVotar(){
        return edad >= 16;
    }

    public boolean esCoherente(){
        LocalDate fechaActual = LocalDate.now();
        return fechaNacimiento.getYear() == fechaActual.getYear() - edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setFechaNacimiento(LocalString fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setPeso(int peso){
        this.peso = peso;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public String mostrarInformacion() {
    return "Nombre: " + nombre + " Apellido " + apellido +
            "\nEdad: " + edad +
            "\nDNI: " + dni +
            "\nSexo: " + sexo +
            "\nPeso: " + peso +
            "\nAltura: " + altura;
    }
}