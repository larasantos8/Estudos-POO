package fatec.edu.gov.aulaspoo.desafioLara;

public class Carro {
	private String roda;
	private String modelo;
	private Integer ano;
	private Double preco;

	public Carro() {

	}

	public Carro(String roda, String modelo, Integer ano, Double preco) {
		this.roda = roda;
		this.modelo = modelo;
		this.ano = ano;
		this.preco = preco;
	}
	
	public Carro(Carro carro) {
		this.roda = carro.getRoda();
		this.modelo = carro.getModelo();
		this.ano = carro.getAno();
		this.preco = carro.getPreco();
	}

	public Integer getAno() {
		return ano;
	}

	public String getModelo() {
		return modelo;
	}

	public Double getPreco() {
		return preco;
	}

	public String getRoda() {
		return roda;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public void setRoda(String roda) {
		this.roda = roda;
	}
	
	@Override
	public String toString() {
		return "Carro [roda=" + roda + ", modelo=" + modelo + ", ano=" + ano + ", preco=" + preco + "]";
	}
}
