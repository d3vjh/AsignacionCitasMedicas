package main;

import java.util.ArrayList;

import abstractFactory.AbstractFactoryCRUD;
import abstractFactory.FabricaPaciente;
import crud.Read;

public class Main {
	
	

	public static void main(String[] args) {

		AbstractFactoryCRUD miFabrica;
		Read read;
		miFabrica = new FabricaPaciente("4780");
		read = miFabrica.readRegistro();
		ArrayList<Object> arrTemp = read.operacionCrud();
		System.out.println("Si sirvio: "+arrTemp.get(2));
		
		
	}

}
