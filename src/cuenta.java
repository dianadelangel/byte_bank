class cuenta {
    double saldo;
    int agencia;
    int numero;

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

    public boolean transferir(double valor,cuenta cuenta){
        if(this.saldo >= valor){
                this.saldo -= valor;
                cuenta.depositar(valor);
                return true;
        }else{
            return false;
        }
    }
}
