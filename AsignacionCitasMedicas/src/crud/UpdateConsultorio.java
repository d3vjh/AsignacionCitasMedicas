package crud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import singletonConexion.ConexionBDD;

public class UpdateConsultorio implements Update{
	
	
	ConexionBDD conexion;
	private ArrayList<Object> array;
	private final String sede;
	//private final String consultorio;
    private Statement st;
    private ResultSet rs;

	
	
	public UpdateConsultorio(String sede /*String consultorio*/) {
		// TODO Auto-generated constructor stub
		this.sede = sede;
	}
	
	
	@Override
	public ArrayList<Object> operacionCrud() {
		array = new ArrayList<Object>();
		//El String toca actualizarlo
		String sql = "select k_numiden, n_nombre, n_apellido from cli_compensar where k_numiden ='"+sede+"';";
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
