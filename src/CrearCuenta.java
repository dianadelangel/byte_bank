public class CrearCuenta {
    public static void main(String[] args) {
        cuenta primeraCuenta = new cuenta();
        cuenta segundaCuenta = new cuenta();

        primeraCuenta.saldo = 256.69;
        segundaCuenta.saldo = 856.54;

        System.out.println(primeraCuenta.saldo);
        System.out.println(segundaCuenta.saldo);
    }
}
