package paquetedos;

public class Medico {

    private String nombreDoctor;
    private String especialidad;
    protected double sueldoMensual;

    public Medico(String nombre, String espe, double sueldo) {
        nombreDoctor = nombre;
        especialidad = espe;
        sueldoMensual = sueldo;
    }

    public void establecerNombre(String n) {
        nombreDoctor = n;
    }

    public void establecerEspecialidad(String n) {
        especialidad = n;
    }

    public void establecerSueldo(double n) {
        sueldoMensual = n;
    }

    public String obtenerNombre() {
        return nombreDoctor;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }

    public double obtenerSueldo() {
        return sueldoMensual;
    }
}
