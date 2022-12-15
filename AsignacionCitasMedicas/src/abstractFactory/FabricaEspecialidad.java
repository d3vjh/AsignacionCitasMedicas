package abstractFactory;

import crud.Create;
import crud.CreateEspecialidad;
import crud.Delete;
import crud.Read;
import crud.ReadEspecialidad;
import crud.Update;

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
	
	@Override
	public Create crearRegistro() {
		// TODO Auto-generated method stub
		return new CreateEspecialidad(atributoAConsultar);
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

