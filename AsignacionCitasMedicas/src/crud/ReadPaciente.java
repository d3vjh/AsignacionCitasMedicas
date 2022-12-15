package crud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import singletonConexion.ConexionBDD;

/**
 * @author DevJh
 * Lee el paciente de la base de datos
 *
 */
public class ReadPaciente implements Read{

	ConexionBDD conexion;
	private ArrayList<Object> array;
	private final String cedula;
    private Statement st;
    private ResultSet rs;
    
    
    
    public ReadPaciente(String cedula) {
		this.cedula = cedula;
		array=null;
	}
    

	@Override
	public ArrayList<Object> operacionCrud() {
		array = new ArrayList<Object>();
		//El String toca actualizarlo
		String sql = "select k_paciente, n_nombre, n_apellido, t_tipo_afiliacion from paciente where k_paciente ='"+cedula+"';";
		conexion = ConexionBDD.getConexion();
		try {
			conexion.conectar();
			st=conexion.getConnection().createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()) {
				array.add(rs.getInt(1));
				array.add(rs.getString(2));
				array.add(rs.getString(3));
				array.add(rs.getString(4));
			}
			conexion.desconectar();
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "El paciente no se encuentra registrado");
		}
		return array;
	}

	
}
