package abstractFactory;

import crud.Create;
import crud.CreateConsultorio;
import crud.Delete;
import crud.Read;
import crud.ReadConsultorio;
import crud.Update;

public class FabricaConsultorio implements AbstractFactoryCRUD{

	private String sede;
	private String numeroConsultorio;
	public FabricaConsultorio(String sede, String numeroConsultorio) {
		// TODO Auto-generated constructor stub
		this.numeroConsultorio = numeroConsultorio;
		this.sede = sede;
	}
	
	
	@Override
	public Read readRegistro() {
		// TODO Auto-generated method stub
		return new ReadConsultorio(sede, numeroConsultorio);
	}
	
	@Override
	public Create crearRegistro() {
		// TODO Auto-generated method stub
		return new CreateConsultorio(sede);
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
