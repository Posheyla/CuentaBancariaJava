public class BancoUtil{
    public static void main(String[]args){
        CuentaBancaria cuenta1= new CuentaBancaria();
        System.out.println(CuentaBancaria.totalSaldo());
        cuenta1.depositoSaldoAhorros(100);
        cuenta1.depositoSaldoCorriente(300);
        System.out.println(CuentaBancaria.totalSaldo());
        cuenta1.retiroSaldoAhorros(45.5);
        cuenta1.retiroSaldoCorriente(400);
        System.out.println(CuentaBancaria.totalSaldo());
    }
}