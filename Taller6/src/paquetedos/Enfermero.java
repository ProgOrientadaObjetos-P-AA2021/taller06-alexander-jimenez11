package paquetedos;

public class Enfermero {

    private String nombreEnfermero;
    private String tipo;
    protected double sueldoMensual;

    public Enfermero(String nombre, String ti, double sueldo) {
        nombreEnfermero = nombre;
        tipo = ti;
        sueldoMensual = sueldo;
    }

    public void establecerNombre(String n) {
        nombreEnfermero = n;
    }

    public void establecerEspecialidad(String n) {
        tipo = n;
    }

    public void establecerSueldoMensual(double n) {
        sueldoMensual = n;
    }

    public String obtenerNombre() {
        return nombreEnfermero;
    }

    public String obtenerEspecialidad() {
        return tipo;
    }

    public double obtenerSueldo() {
        return sueldoMensual;
    }
}
