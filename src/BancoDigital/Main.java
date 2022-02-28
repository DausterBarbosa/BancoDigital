package BancoDigital;

public class Main {

	public static void main(String[] args) {
		
		ContaPoupanca contaPoupanca1 = new ContaPoupanca();
		ContaPoupanca contaPoupanca2 = new ContaPoupanca();
		
		contaPoupanca1.depositar(1000);
		
		contaPoupanca1.transferir(100, contaPoupanca2);

		contaPoupanca1.imprimirInformacoes();
		contaPoupanca2.imprimirInformacoes();

	}

}
