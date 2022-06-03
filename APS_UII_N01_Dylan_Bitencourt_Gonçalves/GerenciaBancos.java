package exec;

import modelo.AtualizadorConta;
import modelo.Banco;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;
import excecoes.SaldoInsuficienteException;

public class GerenciaBancos {

	
	public static void main(String[] args) {
		 
		Conta conta = new Conta(100);
		
		ContaCorrente contaCorrente = new ContaCorrente(200);
		ContaPoupanca contaPoupanca = new ContaPoupanca(300);
		ContaCorrente contaCorrentePedro = new ContaCorrente(100);
		ContaPoupanca contaPoupancaPedro = new ContaPoupanca(10);
		ContaCorrente contaCorrenteJoao = new ContaCorrente(20000);
		ContaPoupanca contaPoupancaJoao = new ContaPoupanca(430000);
		ContaCorrente contaCorrenteMaria = new ContaCorrente(50000);
		ContaPoupanca contaPoupancaMaria = new ContaPoupanca(830000);
		ContaCorrente contaCorrenteJose = new ContaCorrente(200);
		ContaPoupanca contaPoupancaJose = new ContaPoupanca(30);
		
		System.out.print(contaCorrente);
		System.out.print(contaPoupanca);
		
		contaCorrente.depositar((float) 100.00);
		System.out.print(contaCorrente);
		
		try {
			contaPoupanca.sacar((float) 1000.00);
		} catch (SaldoInsuficienteException erroNoSaque) {
			System.out.print(erroNoSaque.getMessage() + " " + 
					         erroNoSaque.getSaldo() + " " + 
					         erroNoSaque.getValorSaque());
		}
		System.out.print(contaPoupanca);
		
		contaCorrente.atualizarSaldo((float) 10.00);
		System.out.print(contaCorrente);
		
		contaPoupanca.atualizarSaldo((float) 5.00);
		System.out.print(contaPoupanca);
		
		AtualizadorConta atualizador = new AtualizadorConta((float) 10.00);
		
		atualizador.atualizaSaldo(contaCorrentePedro);
		atualizador.atualizaSaldo(contaCorrenteJoao);
		atualizador.atualizaSaldo(contaCorrenteMaria);
		atualizador.atualizaSaldo(contaCorrenteJose);
		
		atualizador.atualizaSaldo(contaPoupancaPedro);
		atualizador.atualizaSaldo(contaPoupancaJoao);
		atualizador.atualizaSaldo(contaPoupancaMaria);
		atualizador.atualizaSaldo(contaPoupancaJose);
		
		System.out.print("\n Saldo Total Atualizado: " + atualizador.getSaldoTotal());
		
		Banco banco = new Banco();
		
		banco.adicionarConta(contaPoupancaJose);
		banco.adicionarConta(contaPoupancaMaria);
		banco.adicionarConta(contaPoupancaJoao);
		banco.adicionarConta(contaPoupancaPedro);
		banco.adicionarConta(contaCorrenteJoao);
		banco.adicionarConta(contaCorrentePedro);
		banco.adicionarConta(contaCorrenteMaria);
		banco.adicionarConta(contaCorrenteJose);
		
		float totalContas = banco.pegaTotalDeContas();
		System.out.print("\n Saldo Total de Todas as Contas: " + totalContas);
		
		float totalContasCorrente = banco.pegaTotalDeContasCorrente();
		System.out.print("\n Saldo Total de Todas as Contas Correntes: " + totalContasCorrente);
		
	}

}
