import java.util.Scanner;

public class PruebaMetodos {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        cuenta cuenta = new cuenta();

        cuenta.saldo = 300;
        cuenta.depositar(500);

        System.out.println(cuenta.saldo);
    }
}
