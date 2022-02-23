public class CuentaBancaria{
    private double saldoCorriente;
    private double saldoAhorros;
    private static int numeroCuenta = 0;
    private static double sumaSaldoCorriente = 0;
    private static double sumaSaldoAhorros = 0;

    public CuentaBancaria(){
        this.saldoCorriente = 0.0;
        this.saldoAhorros = 0.0;
        
    }

    public CuentaBancaria(double saldoCorriente,double saldoAhorros){
        this.saldoCorriente = saldoCorriente;
        this.saldoAhorros = saldoAhorros;
        numeroCuenta ++;
        sumaSaldoCorriente += saldoCorriente;
        sumaSaldoAhorros += saldoAhorros;
    }

    public double getSaldoCorriente(){
        return this.saldoCorriente;
    }

    public double getSaldoAhorros(){
        return this.saldoAhorros;
    }

    public void depositoSaldoCorriente( double saldoCorriente){
        sumaSaldoCorriente += saldoCorriente;
    }

    public void depositoSaldoAhorros( double saldoAhorros){
        sumaSaldoAhorros += saldoAhorros;
    }

    public void retiroSaldoCorriente( double saldoCorriente){
        if (sumaSaldoCorriente > 0 ){
            sumaSaldoCorriente -= saldoCorriente;
            if(sumaSaldoCorriente > 0 ){
                sumaSaldoCorriente = sumaSaldoCorriente;
            }
            else{
                System.out.println("Fondos insuficientes");
                sumaSaldoCorriente += saldoCorriente;
            }
        }
        else{
            System.out.println("Fondos insuficientes");
        }
    }

    public void retiroSaldoAhorros( double saldoAhorros){
        if (sumaSaldoAhorros > 0){
            sumaSaldoAhorros -= saldoAhorros;
            if(sumaSaldoAhorros > 0 ){
                sumaSaldoAhorros = sumaSaldoAhorros;
            }
            else{
                System.out.println("Fondos insuficientes");
                sumaSaldoAhorros += saldoAhorros;
            }
        }
        else{
            System.out.println("Fondos insuficientes");
        }
    }

    public static int numCuentas(){
        return numeroCuenta;
    }

    public static String totalSaldo(){
        return "Cuenta Corriente: " + sumaSaldoCorriente + "\n"+
                "Cuenta Ahorro: " + sumaSaldoAhorros + "\n";
    }


}