package abstractFactory;

import crud.Read;

public class FabricaMedicoConsultorio implements AbstractFactoryCRUD{
	
	String atributoParametro;
	
	public FabricaMedicoConsultorio(String atributoParametro) {
		this.atributoParametro = atributoParametro;
	}
	
	@Override
	public Read readRegistro() {
		// TODO Auto-generated method stub
		return null;
	}

}
