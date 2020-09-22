package projetoAv1;

public class Contrato {
	private int fornecedor;
	private int mesInicio;
	private int mesFim;
	private double valor;

	public Contrato(int fornecedor, int mesInicio, int mesFim, double valor) {
		super();
		this.fornecedor = fornecedor;
		this.mesInicio = mesInicio;
		this.mesFim = mesFim;
		this.valor = valor;
	}
	public Contrato() {
		
	}

	public int getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(int fornecedor) {
		this.fornecedor = fornecedor;
	}

	public int getMesInicio() {
		return mesInicio;
	}

	public void setMesInicio(int mesInicio) {
		this.mesInicio = mesInicio;
	}

	public int getMesFim() {
		return mesFim;
	}

	public void setMesFim(int mesFim) {
		this.mesFim = mesFim;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Contrato [fornecedor=" + fornecedor + ", mesInicio=" + mesInicio + ", mesFim=" + mesFim + ", valor="
				+ valor + "]";
	}

}
