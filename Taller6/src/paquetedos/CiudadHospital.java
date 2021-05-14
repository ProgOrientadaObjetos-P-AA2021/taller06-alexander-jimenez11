package paquetedos;

public class CiudadHospital {

    private String nombreCiudad;
    private String provinciaCiudad;

    public CiudadHospital(String nombre, String provincia) {
        nombreCiudad = nombre;
        provinciaCiudad = provincia;
    }

    public void establecerNombreCiudad(String n) {
        nombreCiudad = n;
    }

    public void establecerProvinciaCiudad(String n) {
        provinciaCiudad = n;
    }

    public String obtenerNombreCiudad() {
        return nombreCiudad;
    }

    public String obtenerProvinciaCiudad() {
        return provinciaCiudad;
    }
}
