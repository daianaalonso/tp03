package ar.unrn.tp3.ej2.servicio;

import ar.unrn.tp3.ej2.modelo.EnviarEmail;
import ar.unrn.tp3.ej2.servicio.Libreria.Email;
import ar.unrn.tp3.ej2.servicio.Libreria.SmtpException;

public class ServicioEmail implements EnviarEmail {
    private Email email;
    private String mensaje;

    @Override
    public void enviarEmail(String destinatario, String asunto, String mensaje) {
        try {
            this.email = new Email(destinatario, asunto, mensaje);
            this.email.enviar();
            this.mensaje = mensaje;
        } catch (SmtpException e) {
            throw new RuntimeException("No pudo enviarse el email", e);
        }
    }

    public String mensajeEnviado(){
        return this.mensaje;
    }

}
