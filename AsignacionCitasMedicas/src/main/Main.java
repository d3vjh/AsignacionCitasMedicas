package main;

import java.util.ArrayList;

import abstractFactory.AbstractFactoryCRUD;
import abstractFactory.FabricaPaciente;
import crud.Read;
import vista.VentanaIngresoPaciente;

public class Main {
	
	

	public static void main(String[] args) {

		VentanaIngresoPaciente vi = new VentanaIngresoPaciente();
		vi.setVisible(true);
		
		
		AbstractFactoryCRUD miFabrica;
		Read read;
		miFabrica = new FabricaPaciente("100104");
		read = miFabrica.readRegistro();
		ArrayList<Object> arrTemp = read.operacionCrud();
		System.out.println("Codigo"+arrTemp.get(0)+"\n Nombre: "+ arrTemp.get(1)+"\nApellido " +arrTemp.get(2)+"\n Tipo de afiliacion: "+arrTemp.get(3));
		
		
		
		
	}

}
