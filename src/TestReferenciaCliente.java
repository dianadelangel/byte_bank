public class TestReferenciaCliente {
    public static void main(String[] args) {
        Cliente sara = new Cliente();
        sara.titular = "Sara";
        sara.documento = "43567879";
        sara.telefono = "5611037536";

        cuenta cuentaSara = new cuenta();
        cuentaSara.agencia = 1;
        cuentaSara.titular = sara;

        System.out.println(cuentaSara.titular.documento);
        System.out.println(cuentaSara.titular.titular);
    }
}
