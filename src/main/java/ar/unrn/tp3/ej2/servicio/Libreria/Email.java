package ar.unrn.tp3.ej2.servicio.Libreria;

public class Email {
    private String destinatario;
    private String asunto;
    private String cuerpo;

    public Email(String destinatario, String asunto, String cuerpo) {
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
    }

    public void enviarEmail() throws SmtpException {
        System.out.println("Se envio el email con exito ");
    }

    public String mensaje() {
        return cuerpo;
    }
}
