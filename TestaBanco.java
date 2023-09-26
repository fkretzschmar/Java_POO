package Banco;

public class TestaBanco {

	public static void main(String[] args) {
		Conta1 conta = new Conta1(1337, 24226);
		Conta1 conta2 = new Conta1(13537, 35226);
		System.out.println(Conta1.getTotal());
	}

}
