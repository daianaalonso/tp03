package ar.unrn.tp3.ej2.persistencia;

import ar.unrn.tp3.ej2.modelo.Empleado;
import ar.unrn.tp3.ej2.modelo.ListadoEmpleados;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EmpleadosEnDisco implements ListadoEmpleados {
    private final String path;

    public EmpleadosEnDisco(String path) {
        this.path = path;
    }

    @Override
    public List<Empleado> listaDeEmpleados() {
        List<Empleado> lista = new ArrayList<Empleado>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(this.path));
            for (String l : lines) {
                String[] listaDatos = l.split(", ");
                lista.add(new Empleado(listaDatos[0], listaDatos[1], listaDatos[2], listaDatos[3]));
            }
        } catch (IOException e) {
            throw new RuntimeException("No se pudo obtener la lista de empleados", e);
        }
        return lista;
    }
}
