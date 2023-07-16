import java.util.Scanner;

public class PruebaMetodos {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        cuenta cuenta = new cuenta();

        cuenta.saldo = 300;
        cuenta.depositar(500);
        System.out.println(cuenta.saldo);

        cuenta.retirar(200);
        System.out.println(cuenta.saldo);

        cuenta cuentaDiana = new cuenta();
        cuentaDiana.depositar(1800);
        cuentaDiana.transferir(50,cuenta);
        System.out.println(cuenta.saldo);
        System.out.println("Saldo de la cuenta de Diana: " + cuentaDiana.saldo);
    }
}
