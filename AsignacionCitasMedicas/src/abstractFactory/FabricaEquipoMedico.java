package abstractFactory;

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
}
