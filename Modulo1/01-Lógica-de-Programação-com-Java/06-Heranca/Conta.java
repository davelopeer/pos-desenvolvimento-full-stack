abstract class Conta {
    private double saldo;

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public abstract void imprimeExtrato();
}


interface Conta2 {
    void depositar(double valor);
    void sacar(double valor);
    double getSaldo();
}