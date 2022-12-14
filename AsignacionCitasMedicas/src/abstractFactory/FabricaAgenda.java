package abstractFactory;

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

}
