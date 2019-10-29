package gravacaoMem;

public class UsaProduto {
	
	public static void main(String[] args) {
		//Teste de gravação
		ProdutoPersiste produto = new ProdutoPersiste();
		produto.setCodigo(2);
		produto.setDescricao("Sabonete");
		System.out.println(produto.gravar());
		 //Teste de leitura
		Produto p = ProdutoPersiste.ler(2);
		System.out.println(p.getCodigo());
		System.out.println(p.getDescricao());
	}
}
