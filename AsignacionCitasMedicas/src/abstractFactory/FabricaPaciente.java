package abstractFactory;

import crud.Create;
import crud.CreatePaciente;
import crud.Delete;
import crud.Read;
import crud.ReadPaciente;
//Y asi con el resto del CRUD

public class FabricaPaciente implements AbstractFactoryCRUD{

	 private String cedulaPaciente;
//	 private String nombre;
//	 private String apellidos;
	
	
	public FabricaPaciente(String cedula) {
        this.cedulaPaciente=cedula;
    }
	
	@Override
	public Read readRegistro() {
		return new ReadPaciente(cedulaPaciente);
	}
	
	@Override
	public Create crearRegistro() {
		// TODO Auto-generated method stub
		return new CreatePaciente(cedulaPaciente);
	}
	
	@Override
	public Delete deleteRegistro() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
