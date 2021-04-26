package ar.unrn.tp3.ej2.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Empleado {
    private String apellido;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String email;

    public Empleado(String apellido, String nombre, String fechaNacimiento, String email) {
        if (apellido == null || apellido.isEmpty())
            throw new RuntimeException("El apellido no puede ser nulo o vacío.");
        this.apellido = apellido;
        if (nombre == null || nombre.isEmpty())
            throw new RuntimeException("El nombre no puede ser nulo o vacío.");
        this.nombre = nombre;
        if (fechaNacimiento == null || fechaNacimiento.isEmpty())
            throw new RuntimeException("La fecha de nacimiento no puede ser nula o vacía.");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        if (email == null || email.isEmpty())
            throw new RuntimeException("El email no puede ser nulo o vacío.");
        this.email = email;
    }

    public boolean esSuCumpleaños() {
        LocalDate hoy = LocalDate.now();
        return (this.fechaNacimiento.getDayOfMonth() == hoy.getDayOfMonth() &&
                this.fechaNacimiento.getMonth() == hoy.getMonth());
    }

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }
}
