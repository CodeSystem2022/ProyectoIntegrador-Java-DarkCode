package ProyectoHomeBankingEN;

import ProyectoHomeBanking.*;

public class MetodosInversiones {

    // metodo para comprar dolares
    double totalsin;
    double totalcon;
    double pais;
    double rg;
    double total;

    public double calcularcompradolar(double monto, double compradolar) {

        totalsin = monto * compradolar;
        pais = 0.30 * totalsin;
        rg = 0.45 * totalsin;
        totalcon = totalsin + pais + rg;

        return totalcon;

    }

    public double calcularventadolar(double monto, double ventadolar) {

        total = monto * ventadolar;

        return total;

    }

}
