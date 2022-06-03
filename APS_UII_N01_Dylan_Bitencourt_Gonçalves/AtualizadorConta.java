package modelo;

public class AtualizadorConta {

	private float saldoTotal;
	private float taxaSelic;

	public AtualizadorConta(float taxaSelic) {
		this.taxaSelic = taxaSelic;
	}
	
	public void atualizaSaldo(Conta conta) {		
		
		System.out.print("\n Saldo da Conta : "+conta.getSaldo());
		
		
		conta.atualizarSaldo(this.taxaSelic);
		
		
		System.out.print("\n Saldo Atualizado da Conta : "+conta.getSaldo());
		
		
		this.saldoTotal = this.saldoTotal + conta.getSaldo();
	}
	
	public float getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(float saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	public float getTaxaSelic() {
		return taxaSelic;
	}

	public void setTaxaSelic(float taxaSelic) {
		this.taxaSelic = taxaSelic;
	}

	@Override
	public String toString() {
		return "AtualizadorConta [saldoTotal=" + saldoTotal + ", taxaSelic="
				+ taxaSelic + "]";
	}

}
