package ar.unrn.tp3.ej2.servicio.Libreria;

public class Email {
    private String destinatarioEmail;
    private String tituloEmail;
    private String cuerpoEmail;

    public Email(String destinatarioEmail, String tituloEmail, String cuerpoEmail) {
        this.destinatarioEmail = destinatarioEmail;
        this.tituloEmail = tituloEmail;
        this.cuerpoEmail = cuerpoEmail;
    }

    public void enviar() throws SmtpException {
        //conectar con el servidor SMTP para el envio
        //Si algo sale mal, se lanza una SmtpException
        //Si todo sale bien
        System.out.println("Se envió el email correctamente");
    }

}
