package ar.unrn.tp3.ej2;

import ar.unrn.tp3.ej2.modelo.Cumpleaniero;
import ar.unrn.tp3.ej2.modelo.Empleado;
import ar.unrn.tp3.ej2.modelo.ListadoEmpleados;
import ar.unrn.tp3.ej2.persistencia.EmpleadosEnMemoria;
import ar.unrn.tp3.ej2.servicio.ServicioEmail;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CumpleanieroTest {
    String hoy = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
    private final Empleado empleado = new Empleado("Young", "Angus", "1982/10/08", "angus@acdc.com");
    private final Empleado empleado2 = new Empleado("Johnson", "Brian", hoy, "brian@acdc.com");
    private List<Empleado> empleados;
    private Cumpleaniero cumpleaniero;
    private ServicioEmail servicioEmail;
    private ListadoEmpleados empleadosEnMemoria;

    @Test
    public void enviarMailACumpleaniero() {
        //INITIALIZATION
        empleados = new ArrayList<>();
        servicioEmail = new ServicioEmail();
        //EJERCITACIÓN
        empleados.add(empleado2);
        empleados.add(empleado);
        empleadosEnMemoria = new EmpleadosEnMemoria(empleados);
        cumpleaniero = new Cumpleaniero(empleadosEnMemoria, servicioEmail);
        cumpleaniero.enviarEmailDeCumpleanieros();
        String resultadoEsperado = "¡Feliz cumpleaños Brian!";
        //VERIFICACIÓN
        assertEquals(resultadoEsperado, servicioEmail.mensajeEnviado());
    }
}
