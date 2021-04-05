
public class Eleicao {
	private int totalEleitores;
	private int validos;
	private int brancos;
	private int nulos;

	public Eleicao(int totalEleitores, int validos, int brancos, int nulos) {
		super();
		this.totalEleitores = totalEleitores;
		this.validos = validos;
		this.brancos = brancos;
		this.nulos = nulos;
	}

	public int getTotalEleitores() {
		return totalEleitores;
	}

	public void setTotalEleitores(int totalEleitores) {
		this.totalEleitores = totalEleitores;
	}

	public int getValidos() {
		return validos;
	}

	public void setValidos(int validos) {
		this.validos = validos;
	}

	public int getBrancos() {
		return brancos;
	}

	public void setBrancos(int brancos) {
		this.brancos = brancos;
	}

	public int getNulos() {
		return nulos;
	}

	public void setNulos(int nulos) {
		this.nulos = nulos;
	}

	public double showPercentualValidos() {

		double resultado = 0;
		if (totalEleitores > 0) {
			resultado = (validos * 100) / totalEleitores;

		}
		return resultado;
	}
	
	public double showPercentualBrancos() {

		double resultado = 0;
		if (totalEleitores > 0) {
			resultado = (validos * 100) / totalEleitores;

		}
		return resultado;
	}
	
	public double showPercentualNulos() {

		double resultado = 0;
		if (totalEleitores > 0) {
			resultado = (validos * 100) / totalEleitores;

		}
		return resultado;
	}
	
	public void informacoesEleicao() {
		System.out.println("------------------- Resumo informa��es da Elei��o ----------------------------------");
		System.out.println("O percentual de votos v�lidos em rela��o ao total de eleitores nessa elei��o �: " + showPercentualValidos());
		System.out.println("O percentual de votos brancos em rela��o ao total de eleitores nessa elei��o �: " + showPercentualBrancos());
		System.out.println("O percentual de votos nulos em rela��o ao total de eleitores nessa elei��o �: " + showPercentualNulos());
		System.out.println("-----------------------------------------------------------------------------------");
	}
	
	

}
