package crud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import singletonConexion.ConexionBDD;

public class UpdateCita implements Update{
	
	
	ConexionBDD conexion;
	private ArrayList<Object> array;
	private int numeroDocumento;
	private String tipoDocumento;
	private int codigoCita;
	
	
    private Statement st;
    private ResultSet rs;

	

	
	public UpdateCita(int numeroDocumento, String tipoDocumento, int codigoCita) {
		this.numeroDocumento = numeroDocumento;
		this.tipoDocumento = tipoDocumento;
		this.codigoCita = codigoCita;
	}




	@Override
	public ArrayList<Object> operacionCrud() {
		array = new ArrayList<Object>();
		//El String toca actualizarlo
		String sql = "UPDATE cita SET k_paciente = "+numeroDocumento+", k_tipo_documento = '"+tipoDocumento+"' WHERE k_cita = "+codigoCita+ "; ";
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
			
			JOptionPane.showMessageDialog(null, "Paciente registrado con exicot ....");
			conexion.desconectar();
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Paciente registrado con exicot ....");
		}
		return array;
	}

}
