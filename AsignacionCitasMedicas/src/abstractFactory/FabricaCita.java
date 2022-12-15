package abstractFactory;


import crud.Create;
import crud.CreateCita;
import crud.Delete;
import crud.Read;
import crud.ReadCita;

public class FabricaCita implements AbstractFactoryCRUD{

	private String cedulaPaciente;
	private String sede;
	
	/**
	 * Constructor para leer una cita
	 * @param cedulaPaciente
	 */
	public FabricaCita(String cedulaPaciente) {
		// TODO Auto-generated constructor stub
		this.cedulaPaciente = cedulaPaciente;
	}
	
	/**
	 * Constructor para crear una cita
	 * @param sede
	 * @param cedulaPaciente
	 */
	public FabricaCita(String sede, String cedulaPaciente) {
		this.sede = sede;
		this.cedulaPaciente = cedulaPaciente;
	}
	
	
	
	@Override
	public Read readRegistro() {
		// TODO Auto-generated method stub
		return new ReadCita(cedulaPaciente);
	}
	
	@Override
	public Create crearRegistro() {
		// TODO Auto-generated method stub
		return new CreateCita(sede, cedulaPaciente);
	}
	
	@Override
	public Delete deleteRegistro() {
		// TODO Auto-generated method stub
		return null;
	}
}
