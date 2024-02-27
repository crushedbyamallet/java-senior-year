package lerolero;

public abstract class Conta {
	protected double saldo;
	 public Conta(double saldoInicial) {
		 this.saldo = saldoInicial;
	   }
	 public abstract void retirar(double valor) throws SaldoInsuficienteException;
	 public double getSaldo() {
	     return saldo;
	   }
	}