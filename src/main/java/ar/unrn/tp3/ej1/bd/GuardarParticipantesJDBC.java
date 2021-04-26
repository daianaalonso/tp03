package ar.unrn.tp3.ej1.bd;

import ar.unrn.tp3.ej1.modelo.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GuardarParticipantesJDBC implements GuardarParticipantes {
    private Connection conection;

    @Override
    public void guardarParticipante(Participante participante) {
        try {
            PreparedStatement st = conection.prepareStatement("insert into participantes(nombre, telefono, region) values(?,?,?)");
            st.setString(1, participante.nombre());
            st.setString(2, participante.telefono());
            st.setString(3, participante.region());
            st.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("No se pudo guardar el participante", e);
        }
    }

    private void setupBaseDeDatos() throws SQLException {
        String url = "jdbc:derby://localhost:1527/participantes";
        String user = "app";
        String password = "app";
        this.conection = DriverManager.getConnection(url, user, password);
    }

}
