package BancoDigital;

public class Main {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente();
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		
		contaPoupanca.depositar(1000);
		
		contaPoupanca.transferir(100, contaPoupanca);
		
		contaCorrente.imprimirInformacoes();
		contaPoupanca.imprimirInformacoes();

	}

}
