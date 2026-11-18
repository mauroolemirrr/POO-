public class MainCB {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(5000.0);
        
        System.out.println("Mi salario actual es : $" + cuenta.getSaldo());
        
        cuenta.setSaldo(7500.50);
        System.out.println("Mi nuevo salario es : $" + cuenta.getSaldo());
    }
}