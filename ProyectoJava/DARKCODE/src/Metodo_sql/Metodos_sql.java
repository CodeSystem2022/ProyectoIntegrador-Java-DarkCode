package Metodo_sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Metodos_sql {

	public static ConexionDB conexion = new ConexionDB();

	public static PreparedStatement sentencia_preparada;
	public static ResultSet resultado;
	public static String sql;
	public static int resultado_numero = 0;

	public int guardar(String DNI, String Apellido, String Nombre, String Usuario, String Correo, String Contraseña, String last_session, String CBUP, String CA, String CAD, String CBUD, String CBUE, String CAE) {
		int resultado = 0;
		Connection conexion = null;

		String sentencia_guardar = ("INSERT INTO usuarios (DNI,Apellido,Nombre,Usuario,Correo,Contraseña,last_session,CBUP,CA,CAD,CBUD,CBUE,CAE) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");

		try {
			conexion = ConexionDB.conectar();
			sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
			sentencia_preparada.setString(1, DNI);
			sentencia_preparada.setString(2, Apellido);
			sentencia_preparada.setString(3, Nombre);
			sentencia_preparada.setString(4, Usuario);
			sentencia_preparada.setString(5, Correo);
			sentencia_preparada.setString(6, Contraseña);
			sentencia_preparada.setString(7, last_session);
			sentencia_preparada.setString(8, CBUP);
			sentencia_preparada.setString(9, CA);
			sentencia_preparada.setString(10, CAD);
			sentencia_preparada.setString(11, CBUD);
                        sentencia_preparada.setString(12, CBUE);
                        sentencia_preparada.setString(13, CAE);

			resultado = sentencia_preparada.executeUpdate();
			sentencia_preparada.close();
			conexion.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return resultado;
	}

	public int guardarSaldo(String Usuario, String Saldo, String saldodolares, String saldoeuros) {
		int resultado = 0;
		Connection conexion = null;

		String sentencia_guardar = ("INSERT INTO saldo (Usuario, Saldo,saldodolares,saldoeuros) VALUES (?,?,?,?)");

		try {
			conexion = ConexionDB.conectar();
			sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
			sentencia_preparada.setString(1, Usuario);
			sentencia_preparada.setString(2, Saldo);
                        sentencia_preparada.setString(3, saldodolares);
                        sentencia_preparada.setString(4, saldoeuros);

			resultado = sentencia_preparada.executeUpdate();
			sentencia_preparada.close();
			conexion.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return resultado;
	}
        public int guardarPlazofijo(String Fecha, String Usuario, String Monto,String Plazo, String MontoFinal, String CA) {
		int resultado = 0;
		Connection conexion = null;

		String sentencia_guardar = ("INSERT INTO plazosfijos (Fecha,Usuario,Monto,Plazo,MontoFinal,CA) VALUES (?,?,?,?,?,?)");

		try {
			conexion = ConexionDB.conectar();
			sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
			sentencia_preparada.setString(1, Fecha);
                        sentencia_preparada.setString(2, Usuario);
                        sentencia_preparada.setString(3, Monto);
                        sentencia_preparada.setString(4, Plazo);
                        sentencia_preparada.setString(5, MontoFinal);
                        sentencia_preparada.setString(6, CA);
                        


			resultado = sentencia_preparada.executeUpdate();
			sentencia_preparada.close();
			conexion.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return resultado;
	}

	public int updateDatos(String last_session, String Usuario) {
		int resultado = 0;
		Connection conexion = null;

		try {
			conexion = ConexionDB.conectar();
			String sentencia_guardar = ("UPDATE usuarios  "
				+ "SET  "
				+ "`last_session` = ?  "
				+ "WHERE `Usuario` = '" + Usuario + "'");
			sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
			sentencia_preparada.setString(1, last_session);

			resultado = sentencia_preparada.executeUpdate();
			sentencia_preparada.close();
			conexion.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return resultado;
	}

	public static String buscarNombre(String Usuario) {
		String busqueda_nombre = null;
		String mostrar_id = null;
		Connection conexion = null;

		try {
			conexion = ConexionDB.conectar();
			String sentencia_buscar = ("SELECT Nombre,Apellido,last_session,id FROM usuarios WHERE Usuario = '" + Usuario + "'");

			sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
			resultado = sentencia_preparada.executeQuery();
			if (resultado.next()) {
				String Nombre = resultado.getString("Nombre");
				String Apellido = resultado.getString("Apellido");
				String ultimaconexion = resultado.getString("last_session");
				String id = resultado.getString("id");
				mostrar_id = ("numero de id" + id);
				busqueda_nombre = (Nombre + " " + Apellido
					+ "\n / Última conexión: " + ultimaconexion);

			}
			conexion.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return busqueda_nombre;
	}
        

	public static String buscarUsarioRegistrado(String Usuario, String Contraseña) {
		String busqueda_usuario = null;
		Connection conexion = null;

		try {
			conexion = ConexionDB.conectar();
			String sentencia_buscar_usuario = ("SELECT Nombre,Usuario,Contraseña FROM usuarios WHERE Usuario ='" + Usuario + "' && Contraseña = '" + Contraseña + "'");
			sentencia_preparada = conexion.prepareStatement(sentencia_buscar_usuario);
			resultado = sentencia_preparada.executeQuery();

			if (resultado.next()) {
				busqueda_usuario = "Usuario encontrado";
			} else {
				busqueda_usuario = "Usuario no encontrado";
			}
			conexion.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return busqueda_usuario;
	}
        public static String buscarSoloNombre(String Usuario) {
		String busqueda_nombre = null;
		String mostrar_id = null;
		Connection conexion = null;

		try {
			conexion = ConexionDB.conectar();
			String sentencia_buscar = ("SELECT Nombre,Apellido FROM usuarios WHERE Usuario = '" + Usuario + "'");

			sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
			resultado = sentencia_preparada.executeQuery();
			if (resultado.next()) {
				String Nombre = resultado.getString("Nombre");
				String Apellido = resultado.getString("Apellido");
				busqueda_nombre = (Nombre + " " + Apellido);

			}
			conexion.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return busqueda_nombre;
        }
        
	public static String buscarCa(String Usuario) {
		String buscar_CA = null;
		String buscar_CAD = null;
		Connection conexion = null;

		try {
			conexion = ConexionDB.conectar();
			String sentencia_buscar = ("SELECT CA,CAD FROM usuarios WHERE Usuario = '" + Usuario + "'");

			sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
			resultado = sentencia_preparada.executeQuery();

			if (resultado.next()) {
				String CA = resultado.getString("CA");
				String CAD = resultado.getString("CAD");
				buscar_CA = (CA);
				buscar_CAD = (CAD);
			}
			conexion.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return buscar_CA;
	}

	public static String buscarCad(String Usuario) {

		String buscar_CAD = null;
		Connection conexion = null;

		try {
			conexion = ConexionDB.conectar();
			String sentencia_buscar = ("SELECT CAD FROM usuarios WHERE Usuario = '" + Usuario + "'");

			sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
			resultado = sentencia_preparada.executeQuery();

			if (resultado.next()) {

				String CAD = resultado.getString("CAD");
				;
				buscar_CAD = (CAD);
			}
			conexion.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return buscar_CAD;
	}
        public static String buscarCaE(String Usuario) {

		String buscar_CAE = null;
		Connection conexion = null;

		try {
			conexion = ConexionDB.conectar();
			String sentencia_buscar = ("SELECT CAE FROM usuarios WHERE Usuario = '" + Usuario + "'");

			sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
			resultado = sentencia_preparada.executeQuery();

			if (resultado.next()) {

				String CAE = resultado.getString("CAE");
				
				buscar_CAE = (CAE);
			}
			conexion.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return buscar_CAE;
	}
        public int updatePlazo(String Fecha, String Usuario, String Monto,String Plazo, String MontoFinal, String CA) {
		int resultado = 0;
		Connection conexion = null;

		try {
			conexion = ConexionDB.conectar();
			String sentencia_guardar = ("UPDATE plazosfijos SET Fecha=?, Monto =?, Plazo=?,MontoFinal=?, CA=? WHERE Usuario ='"+Usuario+"'");
			sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
			
			sentencia_preparada.setString(1, Fecha);
                        sentencia_preparada.setString(2, Monto);
                        sentencia_preparada.setString(3, Plazo);
                        sentencia_preparada.setString(4, MontoFinal);
                        sentencia_preparada.setString(5, CA);

                        

			resultado = sentencia_preparada.executeUpdate();
			sentencia_preparada.close();
			conexion.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return resultado;
	}

}
