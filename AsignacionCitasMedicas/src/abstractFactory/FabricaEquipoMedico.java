package abstractFactory;

import crud.Create;
import crud.Delete;
import crud.Read;
import crud.ReadEquipoMedico;

public class FabricaEquipoMedico implements AbstractFactoryCRUD{
	 
	private String especialidad;
	
	public FabricaEquipoMedico(String especialidad) {
		// TODO Auto-generated constructor stub
		this.especialidad = especialidad;
		
	}
	
	@Override
	public Read readRegistro() {
		// TODO Auto-generated method stub
		return new ReadEquipoMedico(especialidad);
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
