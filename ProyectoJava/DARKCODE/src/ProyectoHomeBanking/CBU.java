package ProyectoHomeBanking;

import java.util.Random;

public class CBU {

    Random random = new Random();

    //Creacion del CBU en pesos
    int Cbup = (int) (random.nextInt(1000000));
    String cbu = "00000000000000000" + Integer.toString(Cbup);

    //Creacion del CBU en dolares
    int Cbud = (int) (random.nextInt(1000000));
    String cbud = "00000000000000000" + Integer.toString(Cbud);
    //Creacion del CBU en Euros
    int Cbue = (int) (random.nextInt(1000000));
    String cbue = "00000000000000000" + Integer.toString(Cbue);
    //Creacion de código de sucursal, verificacion
    int verificador = (int) (random.nextInt(10));
    int Sucursal = (int) (random.nextInt(1000));

    String CBU = "00000000000000000" + Integer.toString(Cbup);
    String CBUD = "00000000000000000" + Integer.toString(Cbud);
    String CBUE = "00000000000000000" + Integer.toString(Cbue);
    String CA = Integer.toString(Sucursal) + "" + Integer.toString(Cbup) + "" + Integer.toString(verificador);
    String CAD = Integer.toString(Sucursal) + "" + Integer.toString(Cbud) + "" + Integer.toString(verificador);
    String CAE = Integer.toString(Sucursal) + "" + Integer.toString(Cbue) + "" + Integer.toString(verificador);
}
