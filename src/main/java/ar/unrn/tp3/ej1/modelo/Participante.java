package ar.unrn.tp3.ej1.modelo;

public class Participante {
    private final String nombre;
    private final String telefono;
    private final String region;

    public Participante(String nombre, String telefono, String region) {
        if (nombre == null || nombre.isEmpty())
            throw new RuntimeException("Debe cargar un nombre");
        this.nombre = nombre;
        if (telefono == null || telefono.isEmpty())
            throw new RuntimeException("Debe cargar un teléfono");
        if (!telefono.matches("\\d{4}-\\d{6}"))
            throw new RuntimeException("El teléfono debe ingresarse de la siguiente forma:NNNN - NNNNNN ");
        this.telefono = telefono;
        if (region == null || region.isEmpty())
            throw new RuntimeException("Debe cargar una región");
        if (!(region.equals("China") || region.equals("US") || region.equals("Europa")))
            throw new RuntimeException("Region desconocida. Las conocidas son: China, US, Europa");
        this.region = region;
    }

    public String nombre() {
        return this.nombre;
    }

    public String telefono() {
        return this.telefono;
    }

    public String region() {
        return this.region;
    }
}

