package abstractFactory;

import crud.Read;
import crud.ReadEspecialidad;

public class FabricaEspecialidad implements AbstractFactoryCRUD{
	
	private String atributoAConsultar;
	
	public FabricaEspecialidad(String atributoAConsultar) {
		// TODO Auto-generated constructor stub
		this.atributoAConsultar = atributoAConsultar;
	}
	
	@Override
	public Read readRegistro() {
		// TODO Auto-generated method stub
		return new ReadEspecialidad(atributoAConsultar);
	}

}

