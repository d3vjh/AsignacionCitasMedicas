package abstractFactory;

import crud.Create;
import crud.CreateAgenda;
import crud.Delete;
import crud.Read;
import crud.ReadAgenda;
import crud.Update;

public class FabricaAgenda implements AbstractFactoryCRUD{
	
	private String cedulaDoctor;
	
	public FabricaAgenda(String cedulaDoctor) {
		// TODO Auto-generated constructor stub
		this.cedulaDoctor = cedulaDoctor;
		
	}
	
	
	/**
	 *Lee el registro de la agenda
	 */
	@Override
	public Read readRegistro() {
		// TODO Auto-generated method stub
		return new ReadAgenda(cedulaDoctor);
	}
	
	@Override
	public Create crearRegistro() {
		// TODO Auto-generated method stub
		return new CreateAgenda(cedulaDoctor);
	}
	
	@Override
	public Delete deleteRegistro() {
		// TODO Auto-generated method stub
		return null;
	}
	


}
