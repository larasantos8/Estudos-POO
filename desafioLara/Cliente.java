package fatec.edu.gov.aulaspoo.desafioLara;

public class Cliente {
	private String nome;
	private String cpf;
	private Double carteira;
	private Carro carro;

	public Cliente() {

	}

	public Cliente(String nome, String cpf, Double carteira, Carro carro) {
		this.nome = nome;
		this.cpf = cpf;
		this.carteira = carteira;
		this.carro = carro;
	}
	
	public Cliente(Cliente cliente) {
		this.nome = cliente.getNome();
		this.cpf = cliente.getCpf();
		this.carteira = cliente.getCarteira();
		this.carro = new Carro(cliente.getCarro());
	}
	
	public void alugarCarro(Carro carro) {
		this.carro = new Carro(carro);
	}
	
	public String devolverCarro() {
		this.carro = new Carro();
		return "Carro devolvido com sucesso!";
	}

	public Carro getCarro() {
		return carro;
	}

	public Double getCarteira() {
		return carteira;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public void setCarteira(Double carteira) {
		this.carteira = carteira;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", carteira=" + carteira + ", carro=" + carro + "]";
	}

	
}
