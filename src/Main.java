import Datos.Doctor; // Importa la clase Doctor del paquete Datos
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Doctor> doctores = Doctor.listaDeDoctores(); // Llama al método estático de la clase Doctor

        // Imprimir la lista de doctores
        for (Doctor doctor : doctores) {
            System.out.println(doctor);
        }
    }
}

