
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		
		System.out.println("primeira conta tem " + primeiraConta.saldo);
		System.out.println("Segunda conta tem " + segundaConta.saldo);
		
		primeiraConta.ag�ncia = 146;
		System.out.println(primeiraConta.ag�ncia);
		System.out.println(primeiraConta.numero);
		
		System.out.println(segundaConta.ag�ncia);
		
		segundaConta.ag�ncia = 146;
		System.out.println("agora a segunda conta est�"
				+ "na ag�ncia " + segundaConta.ag�ncia);
		
		if (primeiraConta == segundaConta) {
			System.out.println("mesma conta");			
		} else {
			System.out.println("contas diferentes");
		}		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
