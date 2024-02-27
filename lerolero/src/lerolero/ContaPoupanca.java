package lerolero;

public class ContaPoupanca extends Conta {
	   public ContaPoupanca(double saldoInicial) {
	       super(saldoInicial);
	   }

	   @Override
	   public void retirar(double valor) throws SaldoInsuficienteException {
	       if (valor > saldo) {
	           throw new SaldoInsuficienteException("Saldo insuficiente na conta poupança");
	       }
	       saldo -= valor;
	   }
	}