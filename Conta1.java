package Banco;


public class Conta1 {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta1(int agencia, int numero){
		Conta1.total++;
		System.out.println("O total de contas � " + total);
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		System.out.println("Estou criando uma conta " + this.numero);
	}
	public static int getTotal(){
		return Conta1.total;
	}
	
	public void depositar(double valor){
		this.saldo += valor;
		System.out.println("Ol� " + this.titular.getNome() + " valor depositado com sucesso!");
	}
	public boolean sacar(double valor){
		if(this.saldo >= valor){
			this.saldo -= valor;
			System.out.println("Ol� " + this.titular.getNome() + " saque realizado com sucesso, valor atual da conta: " + this.saldo);
			return true;
		}else{
			System.out.println("N�o foi possivel realizar o saque valor insuficiente!");
			return false;
		}
	}
	public boolean transfere(double valor, Conta1 destino){
		if(this.saldo >= valor){
			this.saldo -= valor;
			destino.saldo += valor;
			System.out.println("Ol� " + this.titular.getNome() + " valor transferido para a(o) " + destino.titular.getNome() +  " com sucesso saldo atual da sua conta: " + this.saldo);
			return true;
		}else{
			System.out.println("N�o foi possivel realizar a transfer�ncia valor insuficiente!");
			return false;
		}
	}
	public double getSaldo(){
		return this.saldo;
	}
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia <= 0){
			System.out.println("N�o pode valor menor que 0.");
			return;
		}
		this.agencia = agencia;
	}
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		if(agencia <= 0){
			System.out.println("N�o pode valor menor que 0.");
			return;
		}
		this.numero = numero;
	}
	public Cliente getTitular() {
		return this.titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
		

}
