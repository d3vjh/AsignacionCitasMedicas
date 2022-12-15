package abstractFactory;

import crud.Create;
import crud.CreateMedico;
import crud.Delete;
import crud.Read;
import crud.ReadMedico;

public class FabricaMedico implements AbstractFactoryCRUD{
	
	private String cedulaMedico;
	private String nombreMedico;
	private String especialidadMedico;
	
	
	 /**
	  * Constructor para leer a un médico con su cedula
	 * @param cedula
	 */
	public FabricaMedico(String cedulaMedico) {
		// TODO Auto-generated constructor stub
		 this.cedulaMedico = cedulaMedico;
	}
	
	
	/**
	 * Constructor para crear a un médico
	 * @param cedulaMedico
	 * @param nombreMedico
	 * @param especialidadMedico
	 */
	public FabricaMedico(String cedulaMedico, String nombreMedico, String especialidadMedico) {
		// TODO Auto-generated constructor stub
		 this.cedulaMedico = cedulaMedico;
		 this.especialidadMedico = especialidadMedico;
		 this.nombreMedico = nombreMedico;
	}
	
	@Override
	public Read readRegistro() {
		// TODO Auto-generated method stub
		return new ReadMedico(cedulaMedico);
	}

	@Override
	public Create crearRegistro() {
		// TODO Auto-generated method stub
		return new CreateMedico(cedulaMedico, nombreMedico, especialidadMedico);
	}

	@Override
	public Delete deleteRegistro() {
		// TODO Auto-generated method stub
		return null;
	}
}
