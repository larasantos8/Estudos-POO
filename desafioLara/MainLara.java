package fatec.edu.gov.aulaspoo.desafioLara;

public class MainLara {

	public static void main(String[] args) {
		
		Carro uno = new Carro("Sei la", "Uno", 2000, 100.00);
		Cliente gabriel = new Cliente("Gabriel", "123456", 500.00, null );
		Funcionario perrotti = new Funcionario(123L, "Perrotti", 0.0, 1000.0, 0);
		
//		System.out.println(uno + "\n" + gabriel + "\n" + perrotti );
		
		gabriel.alugarCarro(uno);
		
		System.out.println(gabriel);
		
		System.out.println("\n" + gabriel.devolverCarro());
		
}

}
