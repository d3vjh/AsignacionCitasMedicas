package abstractFactory;

import java.sql.Date;

import crud.Create;
import crud.CreatePaciente;
import crud.Delete;
import crud.Read;
import crud.ReadPaciente;
//Y asi con el resto del CRUD

public class FabricaPaciente implements AbstractFactoryCRUD{

	private String cedulaPaciente;
	private String tipoDocumentoPaciente;
	private int numeroDocumentoPaciente;
	private int categoriaPaciente;
	private String nombrePaciente;
	private String apellidoPaciente;
	private String tipoAfiliacion;
	private String fechaNacimientoPaciente;
	private long telefonoPaciente ; //-> Big int en lel motor BDD
	private String correoPaciente;
	private String sexoPaciente;
		
	private String tipoDocumentoAfiliado;
	private int numeroDocumentoAfiliado;
	
	
	
	
	public FabricaPaciente(int numeroDocumentoPaciente, String tipoDocumentoPaciente, int categoriaPaciente,
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

	public FabricaPaciente(String cedula) {
        this.cedulaPaciente=cedula;
    }
	
	@Override
	public Read readRegistro() {
		return new ReadPaciente(cedulaPaciente);
	}
	
	@Override
	public Create crearRegistro() {
		// TODO Auto-generated method stub
		return new CreatePaciente(numeroDocumentoPaciente, tipoDocumentoPaciente, 
				categoriaPaciente, nombrePaciente, apellidoPaciente, tipoAfiliacion, 
				fechaNacimientoPaciente, telefonoPaciente, correoPaciente, sexoPaciente, tipoDocumentoAfiliado, 
				numeroDocumentoAfiliado);
	}
	
	@Override
	public Delete deleteRegistro() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
}
