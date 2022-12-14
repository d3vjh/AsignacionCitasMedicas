package abstractFactory;

import crud.Create;
import crud.Delete;
import crud.Read;
import crud.ReadAgenda;

public class FabricaAgenda implements AbstractFactoryCRUD{
	
	private String cedulaDoctor;
	
	public FabricaAgenda(String cedulaDoctor) {
		// TODO Auto-generated constructor stub
		this.cedulaDoctor = cedulaDoctor;
		
	}
	@Override
	public Read readRegistro() {
		// TODO Auto-generated method stub
		return new ReadAgenda(cedulaDoctor);
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
