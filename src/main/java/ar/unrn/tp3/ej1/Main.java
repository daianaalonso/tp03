package ar.unrn.tp3.ej1;

import ar.unrn.tp3.ej1.bd.GuardarParticipantesJDBC;
import ar.unrn.tp3.ej1.ui.AgregarParticipante;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarParticipante(new GuardarParticipantesJDBC());
            }
        });
    }
}
