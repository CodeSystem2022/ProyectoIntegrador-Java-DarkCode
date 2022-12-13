package Metodo_sql;


public class Simulador_plazo {

    //int dia;
    //double cap;
    double TNA;
    double resultado;
    double suma;

    public double Simulador_plazo (int dia, double cap) {

        TNA = 0.75;
        resultado = cap * TNA * dia / 365;
        
	return resultado;
    }
    public double SumaPlazo (double cap,double resultado){
	    suma = cap + resultado;
	    return suma;
    }
}
