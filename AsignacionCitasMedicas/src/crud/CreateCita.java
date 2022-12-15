package crud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import singletonConexion.ConexionBDD;

public class CreateCita implements Create{

	
	ConexionBDD conexion;
	private ArrayList<Object> array;
	private final String sede;
	private final String cedulaPaciente;
    private Statement st;
    private ResultSet rs;

	
	/**
	 * Crea la cita para una sede específica y para un paciente
	 * @param sede
	 * @param cedulaPaciente
	 */
	public CreateCita(String sede, String cedulaPaciente) {
		this.sede = sede;
		this.cedulaPaciente = cedulaPaciente;
	}
	
	@Override
	public ArrayList<Object> operacionCrud() {
		array = new ArrayList<Object>();
		//El String toca actualizarlo //Adicional a sede
		String sql = "select k_numiden, n_nombre, n_apellido from cli_compensar where k_numiden ='"+sede+"''"+cedulaPaciente+"';";
		conexion = ConexionBDD.getConexion();
		try {
			conexion.conectar();
			st=conexion.getConnection().createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()) {
				array.add(rs.getInt(1));
				array.add(rs.getString(2));
				array.add(rs.getString(3));
			}
			conexion.desconectar();
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "El paciente no se encuentra registrado");
		}
		return array;
	}
}
