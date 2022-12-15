package abstractFactory;

import crud.Create;
import crud.Delete;
import crud.Read;

public interface AbstractFactoryCRUD {


	    public Create crearRegistro();
	    public Delete deleteRegistro();
	    public Read readRegistro();
	    //public Update updateRegistro();
	
}
