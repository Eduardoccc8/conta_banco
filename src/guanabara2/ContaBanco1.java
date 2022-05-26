package guanabara2;

public class ContaBanco1 {

	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(111);
		p1.setDono("jubileu");
		p1.abrirConta("CC");
		
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(222);
		p2.setDono("Creusa");
		p2.abrirConta("CP");
		
		
		p1.depositar(100);
		p2.depositar(500);
		p2.sacar(1000);
		
		p1.sacar(150);
		p1.fecharConta();
		
		p1.estadoAtual();
		p2.estadoAtual();
		
		
		
		
		

	}

}
