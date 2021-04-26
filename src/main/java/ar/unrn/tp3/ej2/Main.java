package ar.unrn.tp3.ej2;

import ar.unrn.tp3.ej2.modelo.Cumpleaniero;
import ar.unrn.tp3.ej2.persistencia.EmpleadosEnDisco;
import ar.unrn.tp3.ej2.servicio.ServicioEmail;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\Daiana\\Documents\\Objetos2\\empleados.txt";
        Cumpleaniero cumpleaniero = new Cumpleaniero(new EmpleadosEnDisco(path), new ServicioEmail());
        cumpleaniero.enviarEmailDeCumpleanieros();
    }
}
