public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.agencia = 1;
        primeiraConta.numero = 1;
        primeiraConta.saldo = 200.0f;
        primeiraConta.titular = "Rogério Limas Moreira";
        System.out.println(primeiraConta.titular);
    }
}
