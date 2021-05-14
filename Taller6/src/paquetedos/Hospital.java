package paquetedos;

public class Hospital {

    private String nombreHospital;
    private String direccionHospital;
    private String ciudadHospital;
    private String provinciaHospital;
    private int numeroEspecialidades;
    private Medico[] medicos;
    private Enfermero[] enfermeros;

    public Hospital() {

    }

    public Hospital(String nombre, String direccion, String ciudad,
            String provincia, int especialidades, Medico[] m, Enfermero[] p) {
        nombreHospital = nombre;
        direccionHospital = direccion;
        ciudadHospital = ciudad;
        provinciaHospital = provincia;
        numeroEspecialidades = especialidades;
        medicos = m;
        enfermeros = p;
    }

    public void establecerNombreHospital(String n) {
        nombreHospital = n;
    }

    public void establecerDireccionHospital(String n) {
        direccionHospital = n;
    }

    public void establecerCiudadHospital(String n) {
        ciudadHospital = n;
    }

    public void establecerProvinciaHospital(String n) {
        provinciaHospital = n;
    }

    public void establecerNumeroEspecialidades(int n) {
        numeroEspecialidades = n;
    }

    public String obtenerNombreHospital() {
        return nombreHospital;
    }

    public String obtenerDireccionHospital() {
        return direccionHospital;
    }

    public String obtenerCiudadHospital() {
        return ciudadHospital;
    }

    public String obtenerProvinciaHospital() {
        return provinciaHospital;
    }

    public int obtenerNumeroEspecialidades() {
        return numeroEspecialidades;
    }

    public Medico[] obtenerMedicos() {
        return medicos;
    }

    public Enfermero[] obtenerEnfermeros() {
        return enfermeros;
    }

    public double obtenerTotalSueldo(Medico[] m, Enfermero[] enf) {
        double total_sueldomedico = 0;
        double total_sueldoenfermero = 0;
        for (int i = 0; i < m.length; i++) {
            total_sueldomedico += m[i].sueldoMensual;
        }

        for (int i = 0; i < enf.length; i++) {
            total_sueldomedico += enf[i].sueldoMensual;
        }
        return total_sueldomedico + total_sueldoenfermero;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("HOSPITAL %s\nDirección: %s\nCiudad: %s"
                + "\nProvincia: %s\nNúmero de especialidades: %d"
                + "\nListado de médicos\n", obtenerNombreHospital(),
                obtenerDireccionHospital(),
                obtenerCiudadHospital(), obtenerProvinciaHospital(),
                obtenerNumeroEspecialidades());
        for (int i = 0; i < obtenerMedicos().length; i++) {
            cadena = String.format("%s- %s - sueldo: %.2f - %s\n", cadena,
                    obtenerMedicos()[i].obtenerNombre(),
                    obtenerMedicos()[i].obtenerSueldo(),
                    obtenerMedicos()[i].obtenerEspecialidad());
        }
        cadena = String.format("%s\nListado de enfermeros(as)\n", cadena);
        for (int i = 0; i < obtenerEnfermeros().length; i++) {
            cadena = String.format("%s - %s - sueldo: %.2f - %s\n", cadena,
                    obtenerEnfermeros()[i].obtenerNombre(),
                    obtenerEnfermeros()[i].obtenerSueldo(),
                    obtenerEnfermeros()[i].obtenerEspecialidad());
        }
        cadena = String.format("%s \nTotal de sueldos a pagar por mes: %.2f",
                cadena, obtenerTotalSueldo(obtenerMedicos(),
                        obtenerEnfermeros()));
        return cadena;
    }
}
