package abstractFactory;

import crud.Create;
import crud.CreateSede;
import crud.Delete;
import crud.Read;
import crud.ReadSede;
import crud.Update;

public class FabricaSede implements AbstractFactoryCRUD{

	private String nombreSede;
	
	public FabricaSede(String nombreSede) {
		// TODO Auto-generated constructor stub
		this.nombreSede = nombreSede;
	}
	
	
	@Override
	public Read readRegistro() {
		// TODO Auto-generated method stub
		return new ReadSede(nombreSede);
	}


@Override
	public Create crearRegistro() {
		// TODO Auto-generated method stub
		return new CreateSede(nombreSede);
	}

	@Override
	public Delete deleteRegistro() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Update updateRegistro() {
		// TODO Auto-generated method stub
		return null;
	}


}
