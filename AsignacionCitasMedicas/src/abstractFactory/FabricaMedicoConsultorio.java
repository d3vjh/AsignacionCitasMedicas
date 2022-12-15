package abstractFactory;

import crud.Create;
import crud.CreateMedicoConsultorio;
import crud.Delete;
import crud.Read;
import crud.ReadMedicoConsultorio;
import crud.Update;

public class FabricaMedicoConsultorio implements AbstractFactoryCRUD{
	
	String atributoParametro;
	
	public FabricaMedicoConsultorio(String atributoParametro) {
		this.atributoParametro = atributoParametro;
	}
	
	@Override
	public Read readRegistro() {
		// TODO Auto-generated method stub
		return new ReadMedicoConsultorio(atributoParametro);
	}
	
@Override
	public Create crearRegistro() {
		// TODO Auto-generated method stub
		return new CreateMedicoConsultorio(atributoParametro);
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
