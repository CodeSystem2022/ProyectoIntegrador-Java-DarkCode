package Metodo_sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Metodos_Saldo_sql {

    public static ConexionDB conexion = new ConexionDB();

    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;

    // Metodo para guardar transferencia en la base de datos.
    public int guardar(String Beneficiario, String CBUALIASCVU, String Monto, String Concepto, String Usuario, String Fecha, String comentario, String CACAD) {
        int resultado = 0;
        Connection conexion = null;

        String sentencia_guardar = ("INSERT INTO transferencia (Beneficiario, CBUALIASCVU, Monto, Concepto, Usuario, Fecha, comentario, CACAD) VALUES (?,?,?,?,?,?,?,?) ");
        try {
            conexion = ConexionDB.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, Beneficiario);
            sentencia_preparada.setString(2, CBUALIASCVU);
            sentencia_preparada.setString(3, Monto);
            sentencia_preparada.setString(4, Concepto);
            sentencia_preparada.setString(5, Usuario);
            sentencia_preparada.setString(6, Fecha);
            sentencia_preparada.setString(7, comentario);
            sentencia_preparada.setString(8, CACAD);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    // Metodos para guardar prestamos en la base de datos.
    public int guardarPrestamos(String Usuario, String Cuotas, String Monto, String ValorCuota, String Total, String Fecha) {
        int resultado = 0;
        Connection conexion = null;

        String sentencia_guardar = ("INSERT INTO prestamos (Usuario, Cuotas, Monto, ValorCuota, Total, Fecha) VALUES (?,?,?,?,?,?) ");
        try {
            conexion = ConexionDB.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, Usuario);
            sentencia_preparada.setString(2, Cuotas);
            sentencia_preparada.setString(3, Monto);
            sentencia_preparada.setString(4, ValorCuota);
            sentencia_preparada.setString(5, Total);
            sentencia_preparada.setString(6, Fecha);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    // Metodos para guardar plazos fijos en la base de datos.
    public int guardarPlazoFijo(String Fecha, String Usuario, String Monto, String Plazo, String MontoFinal, String CA) {
        int resultado = 0;
        Connection conexion = null;

        String sentencia_guardar = ("INSERT INTO plazosfijos (Fecha, Usuario, Monto, Plazo, MontoFinal, CA) VALUES (?,?,?,?,?,?) ");
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

    // Metodo para guardar pagos en la base de datos
    public int guardarPagos(String usuario, String fecha, String AYSAM, String CTNET, String ECOGAS, String EDEMSA) {
        int resultado = 0;
        Connection conexion = null;

        String sentencia_guardar = ("INSERT INTO pagos (usuario, fecha, AYSAM,CTNET,ECOGAS,EDEMSA) VALUES (?,?,?,?,?,?) ");
        try {
            conexion = ConexionDB.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, usuario);
            sentencia_preparada.setString(2, fecha);
            sentencia_preparada.setString(3, AYSAM);
            sentencia_preparada.setString(4, CTNET);
            sentencia_preparada.setString(5, ECOGAS);
            sentencia_preparada.setString(6, EDEMSA);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    // Metodo para buscar por Dni en la base de datos
    public static String buscarCorreo(String Usuario) {
        String busqueda_Correo = null;
        Connection conexion = null;

        try {
            conexion = ConexionDB.conectar();
            String sentencia_buscar = ("SELECT Correo FROM usuarios WHERE Usuario = '" + Usuario + "'");

            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {
                String Correo = resultado.getString("Correo");

                busqueda_Correo = Correo;
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda_Correo;
    }

    //Metodo para actualizar el saldo Peso en la base de datos.
    public int updateSaldo(String Saldo, String Usuario) {
        int resultado = 0;
        Connection conexion = null;

        try {
            conexion = ConexionDB.conectar();
            String sentencia_guardar = ("UPDATE saldo  "
                    + "SET  "
                    + "`Saldo` = ?  "
                    + "WHERE `Usuario` = '" + Usuario + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, Saldo);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    //Metodo para actualizar el saldo Dolar en la base de datos.
    public int updateSaldoD(String saldodolares, String Usuario) {
        int resultado = 0;
        Connection conexion = null;

        try {
            conexion = ConexionDB.conectar();
            String sentencia_guardar = ("UPDATE saldo  "
                    + "SET  "
                    + "`saldodolares` = ?  "
                    + "WHERE `Usuario` = '" + Usuario + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, saldodolares);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    //Metodo para actualizar el saldo Euro en la base de datos.
    public int updateSaldoE(String saldoeuros, String Usuario) {
        int resultado = 0;
        Connection conexion = null;

        try {
            conexion = ConexionDB.conectar();
            String sentencia_guardar = ("UPDATE saldo  "
                    + "SET  "
                    + "`saldoeuros` = ?  "
                    + "WHERE `Usuario` = '" + Usuario + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, saldoeuros);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    //Metodo para buscar el saldo Peso en la base de datos y mostrarlo en el JFrame.
    public static String buscarSaldoP(String Usuario) {
        String buscar_SALDO = null;
        Connection conexion = null;

        try {
            conexion = ConexionDB.conectar();
            String sentencia_buscar = ("SELECT saldo FROM saldo WHERE Usuario = '" + Usuario + "'");

            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();

            if (resultado.next()) {

                String saldo = resultado.getString("saldo");
                buscar_SALDO = (saldo);

            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return buscar_SALDO;
    }

    //Metodo para buscar el saldo Dolar en la base de datos y mostrarlo en el JFrame.
    public static String buscarSaldoD(String Usuario) {
        String buscar_SALDOD = null;
        Connection conexion = null;

        try {
            conexion = ConexionDB.conectar();
            String sentencia_buscar = ("SELECT saldodolares FROM saldo WHERE Usuario = '" + Usuario + "'");

            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();

            if (resultado.next()) {

                String saldodolar = resultado.getString("saldodolares");
                buscar_SALDOD = (saldodolar);

            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return buscar_SALDOD;
    }

    //Metodo para buscar el saldo Euro en la base de datos y mostrarlo en el JFrame.
    public static String buscarSaldoE(String Usuario) {
        String buscar_SALDOE = null;
        Connection conexion = null;

        try {
            conexion = ConexionDB.conectar();
            String sentencia_buscar = ("SELECT saldoeuros FROM saldo WHERE Usuario = '" + Usuario + "'");

            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();

            if (resultado.next()) {

                String saldoeuro = resultado.getString("saldoeuros");
                buscar_SALDOE = (saldoeuro);

            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return buscar_SALDOE;
    }
    //Metodo para buscar el montofinal de plazofijo en la base de datos y mostrarlo en el JFrame.

    public static String buscarMontoFinal(String Usuario) {
        String buscar_montofinal = null;
        Connection conexion = null;

        try {
            conexion = ConexionDB.conectar();
            String sentencia_buscar = ("SELECT MontoFinal FROM plazosfijos WHERE Usuario = '" + Usuario + "'");

            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();

            if (resultado.next()) {

                String MontoFinal = resultado.getString("MontoFinal");
                buscar_montofinal = (MontoFinal);

            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return buscar_montofinal;
    }
}
