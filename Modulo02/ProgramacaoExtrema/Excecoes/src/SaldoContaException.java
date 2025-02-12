public class SaldoContaException extends Exception {

    private  float saldoConta;

    public SaldoContaException(float saldoConta) {
        super();
        this.saldoConta = saldoConta;
    }

    public SaldoContaException(String message){
        super(message);
    }

    public float getSaldoConta(){
        return saldoConta;
    }
}
