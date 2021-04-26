package ar.unrn.tp3.ej2.modelo;

public class Cumpleaniero {
    private final ListadoEmpleados empleados;
    private final EnviarEmail email;

    public Cumpleaniero(ListadoEmpleados empleados, EnviarEmail email) {
        this.empleados = empleados;
        this.email = email;
    }

    public void enviarEmailDeCumpleanieros() {
        for (Empleado e : this.empleados.listaDeEmpleados()) {
            if (e.esSuCumpleaños())
                email.enviarEmail(e.getEmail(), "Saludo de cumpleaños",
                        "¡Feliz cumpleaños " + e.getNombre() + "!");
        }
    }
}
