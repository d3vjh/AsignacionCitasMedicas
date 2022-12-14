package abstractFactory;

import crud.Create;
import crud.Delete;
import crud.Read;
import crud.ReadCita;

public class FabricaCita implements AbstractFactoryCRUD{

	private String cedulaPaciente;
	
	public FabricaCita(String cedulaPaciente) {
		// TODO Auto-generated constructor stub
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
		return null;
	}
	
	@Override
	public Delete deleteRegistro() {
		// TODO Auto-generated method stub
		return null;
	}
}
