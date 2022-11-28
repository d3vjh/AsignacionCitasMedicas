package crud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.ArrayList; La idea es montarlo en un arrayList

import javax.swing.JOptionPane;

import singletonConexion.ConexionBDD;


public class testCRUD {
	
	ConexionBDD a;
    private Statement st;
    private ResultSet rs;
    
    public testCRUD() {
    	
    }

    public void prueba() {
    	
    	a = ConexionBDD.getConexion();
    	String sql="select * from cli_compensar;";
  	    a=ConexionBDD.getConexion();
  	    try {
  	    	a.conectar();
  	        st=a.getConnection().createStatement();
  	        rs=st.executeQuery(sql);
  	        while(rs.next()){
  	              System.out.println(rs.getInt(1));
  	            System.out.println(rs.getString(2));
  	          System.out.println(rs.getString(3));
  	        System.out.println(rs.getString(4));
  	            }
  	            a.desconectar();
  	        } catch (SQLException e) {
  	            e.printStackTrace();
  	            JOptionPane.showMessageDialog(null, "No se encuentra registrado");
  	        }
  	    }
  	   
    
	
}
