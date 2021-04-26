package ar.unrn.tp3.ej2.servicio;

import ar.unrn.tp3.ej2.modelo.EnviarEmail;
import ar.unrn.tp3.ej2.servicio.Libreria.Email;
import ar.unrn.tp3.ej2.servicio.Libreria.SmtpException;

public class ServicioEmail implements EnviarEmail {
    private Email email;

    @Override
    public void enviarEmail(String destinatario, String asunto, String mensaje) {
        try {
            email = new Email(destinatario, asunto, mensaje);
            email.enviar();
        } catch (SmtpException e) {
            throw new RuntimeException("No pudo enviarse el email", e);
        }
    }


}
