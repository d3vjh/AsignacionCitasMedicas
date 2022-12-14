package abstractFactory;

import crud.Create;
import crud.Delete;
import crud.Read;
import crud.ReadPaciente;
//Y asi con el resto del CRUD

public class FabricaPaciente implements AbstractFactoryCRUD{

	 private String cedula;
//	 private String nombre;
//	 private String apellidos;
	
	
	public FabricaPaciente(String cedula) {
        this.cedula=cedula;
    }
	
	@Override
	public Read readRegistro() {
		return new ReadPaciente(cedula);
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
