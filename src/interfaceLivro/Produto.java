package interfaceLivro;

public class Produto implements DAO, Estoque{
	
	private int numero;
	private String descricao;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public void inserir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void localizar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void baixar() {
		// TODO Auto-generated method stub
		
	}
	
}
