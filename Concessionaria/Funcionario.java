package fatec.edu.gov.aulaspoo.desafioLara;

public class Funcionario {
	private Long id;
	private String nome;
	private Double comissao;
	private Double salario;
	private Integer qtdVendas;

	public Funcionario() {
	}

	public Funcionario(Long id, String nome, Double comissao, Double salario, Integer qtdVendas) {
		this.id = id;
		this.nome = nome;
		this.comissao = comissao;
		this.salario = salario;
		this.qtdVendas = qtdVendas;
	}
	
	public Funcionario(Funcionario funcionario) {
		this.id = funcionario.getId();
		this.nome = funcionario.getNome();
		this.comissao = funcionario.getComissao();
		this.salario = funcionario.getSalario();
		this.qtdVendas = funcionario.getQtdVendas();
	}

	public Double getComissao() {
		return comissao;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Integer getQtdVendas() {
		return qtdVendas;
	}

	public Double getSalario() {
		return salario;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setQtdVendas(Integer qtdVendas) {
		this.qtdVendas = qtdVendas;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", comissao=" + comissao + ", salario=" + salario
				+ ", qtdVendas=" + qtdVendas + "]";
	}
 
	
}
