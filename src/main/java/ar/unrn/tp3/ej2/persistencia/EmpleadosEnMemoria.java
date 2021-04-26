package ar.unrn.tp3.ej2.persistencia;

import ar.unrn.tp3.ej2.modelo.Empleado;
import ar.unrn.tp3.ej2.modelo.ListadoEmpleados;

import java.util.List;

public class EmpleadosEnMemoria implements ListadoEmpleados {
    private List<Empleado> lista;

    public EmpleadosEnMemoria(List<Empleado> empleados) {
        this.lista = empleados;
    }

    @Override
    public List<Empleado> listaDeEmpleados() {
        return lista;
    }

}
