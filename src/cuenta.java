class cuenta {
    double saldo;
    int agencia;
    int numero;
    String titular;

    //No retorna valor
    public void depositar(double saldo) {

        this.saldo += saldo;
    }

    //Retorna Valor
    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
}
