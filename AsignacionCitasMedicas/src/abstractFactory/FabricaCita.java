package abstractFactory;


import crud.Create;
import crud.CreateCita;
import crud.Delete;
import crud.Read;
import crud.ReadCita;
import crud.Update;
import crud.UpdateCita;

public class FabricaCita implements AbstractFactoryCRUD{

	private int cedulaPaciente;
	private String sede;
	
	private String tipoDocumento;
	private int codigoCita;
	
	/**
	 * Constructor para agendar una cita
	 * @param cedulaPaciente
	 */
	public FabricaCita(int cedulaPaciente, String tipoDocumento, int codigoCita) {
		// TODO Auto-generated constructor stub
		this.cedulaPaciente = cedulaPaciente;
		this.tipoDocumento = tipoDocumento;
		this.codigoCita = codigoCita;
	}
	
	
	
	/**
	 * Constructor para leer una cita
	 * @param cedulaPaciente
	 */
	public FabricaCita(int cedulaPaciente) {
		// TODO Auto-generated constructor stub
		this.cedulaPaciente = cedulaPaciente;
	}
	
	/**
	 * Constructor para crear una cita
	 * @param sede
	 * @param cedulaPaciente
	 */
	public FabricaCita(String sede, int cedulaPaciente) {
		this.sede = sede;
		this.cedulaPaciente = cedulaPaciente;
	}
	
	
	
	@Override
	public Read readRegistro() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Create crearRegistro() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Delete deleteRegistro() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Update updateRegistro() {
		// TODO Auto-generated method stub
		return new UpdateCita(cedulaPaciente, tipoDocumento, codigoCita);
	}
}
