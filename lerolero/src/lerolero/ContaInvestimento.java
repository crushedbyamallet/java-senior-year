package lerolero;

public class ContaInvestimento extends Conta {
	   public ContaInvestimento(double saldoInicial) {
	       super(saldoInicial);
	   }

	   @Override
	   public void retirar(double valor) throws SaldoInsuficienteException {
	       if (valor > saldo) {
	           throw new SaldoInsuficienteException("Saldo insuficiente na conta de investimento");
	       }
	       saldo -= valor;
	   }
	}