package Metodo_sql;

public class Saldos {

    double monto;
    double saldo;
    double transferencia;
    double ingreso;
    double retiro;
    double pago;
    double prestamo;
    double totalc;
    double saldobase;
    double saldojframe;
    double TNA;
    double TNAsucu;
    double resultado;
    double resultadoSucu;
    double suma;
    double suma2;

    // TRANSFERENCIA
    public double saldo(double monto, double transferencia) {

        saldo = monto - transferencia;

        return saldo;
    }

    // PAGOS DE IMPUESTOS
    public double pagos(double monto, double pago) {

        saldo = monto - pago;

        return saldo;
    }

    // INGRESO DE DINERO
    public double ingreso(double monto, double ingreso) {

        saldo = monto + ingreso;

        return saldo;
    }

// RETIRO DE DINERO
    public double retiro(double monto, double retiro) {

        saldo = monto - retiro;

        return saldo;
    }
    // PRESTAMOS

    public double prestamos(double monto, double prestamo) {

        saldo = monto + prestamo;

        return saldo;
    }

    // PLAZO FIJO
    public double plazoFijo(double saldo, double monto ) {

        saldo = saldo - monto;

        return saldo;
    }

    public double CompraD(double monto, double transferencia) {

        saldo = monto - transferencia;

        return saldo;
    }

    public double VentaD(double monto, double transferencia) {

        saldo = monto + transferencia;

        return saldo;
    }

    public double saldod(double saldobase, double saldojframe) {

        saldo = saldobase + saldojframe;

        return saldo;
    }

    public double saldov(double saldobase, double saldojframe) {

        saldobase = saldobase - saldojframe;

        return saldobase;
    }

    public double Simulador_plazo(int dia, double cap) {

        TNA = 0.75;
        resultado = cap * TNA * dia / 365;

        return resultado;
    }

    public double Simulador_plazo2(int dia, double cap) {

        TNAsucu = 0.65;
        resultadoSucu = cap * TNAsucu * dia / 365;

        return resultadoSucu;
    }

    public double SumaPlazo(double cap, double resultado) {
        suma = cap + resultado;
        return suma;
    }

    public double SumaPlazo2(double cap, double resultado) {
        suma2 = cap + resultadoSucu;
        return suma2;
    }

    public double saldoPlazo(double monto, double transferencia) {

        saldo = monto - transferencia;

        return saldo;
    }

    //Operaciones Prestamos valor de la cuota
    public double prestamoValorCuota(double monto, double cuota) {

        if (cuota == 6) {
            prestamo = ((monto + (monto * 0.14)) / (cuota));
        }
        if (cuota == 9) {
            prestamo = ((monto + (monto * 0.18)) / (cuota));
        }
        if (cuota == 12) {
            prestamo = ((monto + (monto * 0.25)) / (cuota));
        }
        if (cuota == 18) {
            prestamo = ((monto + (monto * 0.40)) / (cuota));
        }
        if (cuota == 24) {
            prestamo = ((monto + (monto * 0.55)) / (cuota));
        }
        if (cuota == 36) {
            prestamo = ((monto + (monto * 0.73)) / (cuota));
        }
        if (cuota == 42) {
            prestamo = ((monto + (monto * 0.89)) / (cuota));
        }
        if (cuota == 48) {
            prestamo = ((monto + (monto * 0.92)) / (cuota));
        }
        return prestamo;
    }

    // Operaciones Prestamos Total a debitar
    public double prestamoTotal(double monto, double cuota) {
        if (cuota == 6) {
            prestamo = (monto + (monto * 0.14));
        }
        if (cuota == 9) {
            prestamo = (monto + (monto * 0.18));
        }
        if (cuota == 12) {
            prestamo = (monto + (monto * 0.25));
        }
        if (cuota == 18) {
            prestamo = (monto + (monto * 0.40));
        }
        if (cuota == 24) {
            prestamo = (monto + (monto * 0.55));
        }
        if (cuota == 36) {
            prestamo = (monto + (monto * 0.73));
        }
        if (cuota == 42) {
            prestamo = (monto + (monto * 0.89));
        }
        if (cuota == 48) {
            prestamo = (monto + (monto * 0.92));
        }
        return prestamo;
    }    
    
}
