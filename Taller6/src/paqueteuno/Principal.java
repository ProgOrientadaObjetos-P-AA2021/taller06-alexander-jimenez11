package paqueteuno;

import java.util.Scanner;
import paquetedos.Enfermero;
import paquetedos.Hospital;
import paquetedos.CiudadHospital;
import paquetedos.Medico;

public class Principal {

    public static void main(String[] args) {
        // listado de variables para ingreso de datos por teclado
        Medico[] ListaMedicos;
        Enfermero[] ListaEnfermeros;
        Scanner sc = new Scanner(System.in);
        String nombreHospital, direccion, ciudad, provincia;
        String nombreMedico, especialidad, nombreEnfermero, tipoContrato;
        int numeroEspecialidades, cant_med, cant_enf;
        double sueldo_medico, sueldo_enfermero;

        System.out.print("Nombre del hospital: ");
        nombreHospital = sc.nextLine();
        System.out.print("Direccion del hospital: ");
        direccion = sc.nextLine();
        System.out.print("Ciudad donde esta el hospital: ");
        ciudad = sc.nextLine();
        System.out.print("Provincia donde esta el hospital: ");
        provincia = sc.nextLine();
        System.out.print("Cantidad de especialidades: ");
        numeroEspecialidades = sc.nextInt();
        System.out.println("");
        System.out.print("Cantidad de médicos: ");
        cant_med = sc.nextInt();

        ListaMedicos = new Medico[cant_med];
        for (int i = 0; i < cant_med; i++) {
            sc.nextLine();
            System.out.print("Ingrese nombre del médico " + (i + 1) + ": ");
            nombreMedico = sc.nextLine();
            System.out.print("Ingrese la especialidad del médico " + (i + 1)
                    + ": ");
            especialidad = sc.nextLine();
            System.out.print("Ingrese el sueldo del médico " + (i + 1) + ": ");
            sueldo_medico = sc.nextDouble();
            Hospital h = new Hospital();
            Medico m = new Medico(nombreMedico, especialidad, sueldo_medico);
            ListaMedicos[i] = m;
        }
        System.out.println("");
        System.out.print("Cantidad de enfermeros(as): ");
        cant_enf = sc.nextInt();
        ListaEnfermeros = new Enfermero[cant_enf];

        for (int i = 0; i < cant_enf; i++) {
            sc.nextLine();
            System.out.print("Ingrese en nombre del enfermero(a) " + (i + 1)
                    + ": ");
            nombreEnfermero = sc.nextLine();
            System.out.print("Ingrese el tipo de contrato del enfermero(a) "
                    + (i + 1) + ": ");
            tipoContrato = sc.nextLine();
            System.out.print("Ingrese el sueldo del enfermero(a) " + (i + 1)
                    + ": ");
            sueldo_enfermero = sc.nextDouble();
            Enfermero enf = new Enfermero(nombreEnfermero, tipoContrato,
                    sueldo_enfermero);
            ListaEnfermeros[i] = enf;
        }
        Hospital hosp = new Hospital(nombreHospital, direccion, ciudad,
                provincia, numeroEspecialidades, ListaMedicos, ListaEnfermeros);
        System.out.printf("\n%s\n", hosp);
    }
}
