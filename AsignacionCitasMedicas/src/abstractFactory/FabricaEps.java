package abstractFactory;

import crud.Create;
import crud.CreateEps;
import crud.Delete;
import crud.Read;
import crud.ReadEps;
import crud.Update;

public class FabricaEps implements AbstractFactoryCRUD{
	
	private String nombre;
	private String nombreNuevaSede;
	private String direccion;
	
	
	
	/**
	 * Constructor para leer una eps
	 * @param nombre
	 */
	public FabricaEps(String nombre) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
	}
	
	/**
	 * Constructor para crear una EPS
	 * @param nombre
	 */
	public FabricaEps(String nombreNuevaEps, String direccion) {
		// TODO Auto-generated constructor stub
		this.nombreNuevaSede= nombreNuevaEps;
		this.direccion = direccion;
	}
	
	@Override
	public Read readRegistro() {
		// TODO Auto-generated method stub
		return new ReadEps(nombre);
	}
	
	@Override
	public Create crearRegistro() {
		// TODO Auto-generated method stub
		return new CreateEps(nombreNuevaSede, direccion);
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
