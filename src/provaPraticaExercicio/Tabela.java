package provaPraticaExercicio;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
 
/**
 * @author Rosicléia Frasson
 * {@link} https://www.devmedia.com.br/jtable-utilizando-o-componente-em-interfaces-graficas-swing/28857
 */

public class Tabela extends JFrame {
    
	public Tabela(Object[][] dados) {
        super ("Dados");
        this.dados = dados;
    }
	
	JPanel painelFundo;
    JTable tabela;
    JScrollPane barraRolagem;
    Object [][] dados;
    String [] colunas = {"Nome", "Idade", "Vacina", "Doses"}; 
    
    public void criaJanela(){
        painelFundo = new JPanel();
        painelFundo.setLayout(new GridLayout(1, 1));
        tabela = new JTable(dados, colunas);
        barraRolagem = new JScrollPane(tabela);
        painelFundo.add(barraRolagem); 
        getContentPane().add(painelFundo);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 120);
        setVisible(true);
    }
}