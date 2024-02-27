package lerolero;

public class ContaCorrente extends Conta {
	   public ContaCorrente(double saldoInicial) {
	       super(saldoInicial);
	   }

	   @Override
	   public void retirar(double valor) throws SaldoInsuficienteException {
	       if (valor > saldo) {
	           throw new SaldoInsuficienteException("Saldo insuficiente na conta corrente");
	       }
	       saldo -= valor;
	   }
	}