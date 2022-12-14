package abstractFactory;

import crud.Create;
import crud.Delete;
import crud.Read;
import crud.ReadEps;

public class FabricaEps implements AbstractFactoryCRUD{
	
	private String nombre;
	
	public FabricaEps(String nombre) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
	}
	
	@Override
	public Read readRegistro() {
		// TODO Auto-generated method stub
		return new ReadEps(nombre);
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
