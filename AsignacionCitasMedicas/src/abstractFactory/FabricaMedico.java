package abstractFactory;

import crud.Create;
import crud.Delete;
import crud.Read;
import crud.ReadMedico;

public class FabricaMedico implements AbstractFactoryCRUD{
	
	private String cedula;
	
	 public FabricaMedico(String cedula) {
		// TODO Auto-generated constructor stub
		 this.cedula = cedula;
	}
	
	@Override
	public Read readRegistro() {
		// TODO Auto-generated method stub
		return new ReadMedico(cedula);
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
