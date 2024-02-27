package lerolero;

import java.util.ArrayList;

import java.util.List;

public class Main {

 public static void main(String[] args) {

     ContaCorrente cc = new ContaCorrente(1000);

     try {

         cc.retirar(500);

     } catch (SaldoInsuficienteException e) {

         System.out.println(e.getMessage());

     }

     List<ContaCorrente> contasCorrente = new ArrayList<>();

     contasCorrente.add(new ContaCorrente(1500));

     contasCorrente.add(new ContaCorrente(2500));

     contasCorrente.add(new ContaCorrente(3500));

     System.out.println("Saldos das contas corrente:");

     for (ContaCorrente conta : contasCorrente) {

         System.out.println(conta.getSaldo());

     }

 }

}
