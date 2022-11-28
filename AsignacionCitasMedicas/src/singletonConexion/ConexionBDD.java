package singletonConexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBDD {

	private Connection conexion;
	private String password;
    private String user;
    private static ConexionBDD INSTANCE=null;
	
    private ConexionBDD(){
        password="password";
        user="postgres";
    }

public void conectar(){
    try {
        Class.forName("org.postgresql.Driver");
        conexion=DriverManager.getConnection("jdbc:postgresql://localhost:5432/EPS",user,password);
    }catch (SQLException | ClassNotFoundException e) {
        System.err.println("Error en conexion(conectar):" +e);
    }
}

private synchronized static void createInstance(){
    if(INSTANCE==null){
        INSTANCE=new ConexionBDD();
    }
}
public static ConexionBDD getConexion(){
    if (INSTANCE==null) {
        createInstance();
    }
    return INSTANCE;
}

public void desconectar() throws SQLException{
    try {
        conexion.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

public void setPassword(String password) {
    this.password = password;
}

public void setUser(String user) {
    this.user = user;
}
public Connection getConnection(){
    return conexion;
}




}
