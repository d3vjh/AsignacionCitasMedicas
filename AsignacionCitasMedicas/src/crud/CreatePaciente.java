package crud;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import singletonConexion.ConexionBDD;

public class CreatePaciente implements Create{
	
	
	ConexionBDD conexion;
	private ArrayList<Object> array;
	private final String tipoDocumentoPaciente;
	private final int numeroDocumentoPaciente;
	private final int categoriaPaciente;
	private final String nombrePaciente;
	private final String apellidoPaciente;
	private final String tipoAfiliacion;
	private final String fechaNacimientoPaciente;
	private final long telefonoPaciente ; //-> Big int en lel motor BDD
	private final String correoPaciente;
	private final String sexoPaciente;
	
	private final String tipoDocumentoAfiliado;
	private final int numeroDocumentoAfiliado;
	
	
	
    private Statement st;
    private ResultSet rs;

	
	public CreatePaciente (int numeroDocumentoPaciente,String tipoDocumentoPaciente, int categoriaPaciente,
			String nombrePaciente, String apellidoPaciente, String tipoAfiliacion, String fechaNacimientoPaciente,
			long telefonoPaciente, String correoPaciente, String sexoPaciente, String tipoDocumentoAfiliado,
			int numeroDocumentoAfiliado) {

		this.tipoDocumentoPaciente = tipoDocumentoPaciente;
		this.numeroDocumentoPaciente = numeroDocumentoPaciente;
		this.categoriaPaciente = categoriaPaciente;
		this.nombrePaciente = nombrePaciente;
		this.apellidoPaciente = apellidoPaciente;
		this.tipoAfiliacion = tipoAfiliacion;
		this.fechaNacimientoPaciente = fechaNacimientoPaciente;
		this.telefonoPaciente = telefonoPaciente;
		this.correoPaciente = correoPaciente;
		this.sexoPaciente = sexoPaciente;
		this.tipoDocumentoAfiliado = tipoDocumentoAfiliado;
		this.numeroDocumentoAfiliado = numeroDocumentoAfiliado;
	}

	
	@Override
	public ArrayList<Object> operacionCrud() {
		array = new ArrayList<Object>();
		//El String toca actualizarlo
		String sql = "INSERT INTO Paciente VALUES ("+numeroDocumentoPaciente+", '"+tipoDocumentoPaciente+"', "+categoriaPaciente+", "+1+", "+numeroDocumentoAfiliado+", '"+tipoDocumentoAfiliado+"', '"+nombrePaciente+"' ,'"+apellidoPaciente+"', '"+tipoAfiliacion+"', '"+fechaNacimientoPaciente+"',"+telefonoPaciente+", '"+correoPaciente+"', '"+sexoPaciente+"', 'A');"; 
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
			JOptionPane.showMessageDialog(null, "El paciente ya se encuentra registrado, contacte a Soporte");
		}
		return array;
	}

}
