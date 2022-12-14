package abstractFactory;

import crud.Read;
import crud.ReadSede;

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
	
}
