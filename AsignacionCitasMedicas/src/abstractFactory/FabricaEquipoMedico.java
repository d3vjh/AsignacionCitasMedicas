package abstractFactory;

import crud.Create;
import crud.CreateEquipoMedico;
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
	
		return new CreateEquipoMedico(especialidad);//Aqui falta el parametro para crear
	}

	@Override
	public Delete deleteRegistro() {
		// TODO Auto-generated method stub
		return null;
	}
}
