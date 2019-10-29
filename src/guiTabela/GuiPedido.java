package guiTabela;
import java.awt.BorderLayout;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class GuiPedido extends JPanel{
	private JPanel pnPrincipal, pnTable;
	private JButton btRemover, btAdicionar;
	private JScrollPane scrolltable;
	private JTable table;
	private JLabel lbNumero, lbTotal, lbProduto, lbPrecoUnitario, lbQuantidade;
	private JTextField tfNumero, tfTotal, tfProduto, tfPrecoUnitario, tfQuantidade;
	DecimalFormat df = new DecimalFormat("#.###.00");
	
	public GuiPedido() {
		
	}
	
	private void inicializarComponentes() {
		setLayout(null);
		lbProduto = new JLabel("Produto");
		lbQuantidade = new JLabel("Quantidade");
		lbPrecoUnitario = new JLabel("PreçoUnitario:");
		lbNumero = new JLabel("Número do Pedido:");
		lbTotal = new JLabel("Total do Pedido");
		tfProduto = new JTextField();
		tfPrecoUnitario = new JTextField();
		tfQuantidade = new JTextField();
		tfNumero = new JTextField();
		tfTotal = new JTextField();
		tfTotal.setEnabled(false);
		tfTotal.setHorizontalAlignment(JTextField.RIGHT);
		btAdicionar = new JButton("Adicionar");
		btAdicionar.setToolTipText("Adiciona um Item ao Pedido");
		btRemover = new JButton("Remover");
		btRemover.setToolTipText("Remover os Itens Selecionados");
		lbProduto.setBounds(15, 40, 100, 25);
		lbQuantidade.setBounds(225, 40, 100, 25);
		lbPrecoUnitario.setBounds(310, 40, 100, 25);
		lbNumero.setBounds(15, 10, 120, 25);
		lbTotal.setBounds(278, 360, 100, 25);
		tfProduto.setBounds(15, 65, 200, 25);
		tfQuantidade.setBounds(225, 65, 50, 25);
		tfPrecoUnitario.setBounds(310, 65, 80, 25);
		tfNumero.setBounds(130, 10, 50, 25);
		tfTotal.setBounds(375, 360, 100, 25);
		btAdicionar.setBounds(15, 100, 100, 22);
		btRemover.setBounds(125, 100, 100, 22);
		pnPrincipal = new JPanel();
		pnPrincipal.setLayout(null);
		pnPrincipal.setBounds(0, 0, 500, 400);
		pnPrincipal.add(lbNumero);
		pnPrincipal.add(lbTotal);
		pnPrincipal.add(tfNumero);
		pnPrincipal.add(tfTotal);
		pnPrincipal.add(lbProduto);
		pnPrincipal.add(lbQuantidade);
		pnPrincipal.add(tfQuantidade);
		pnPrincipal.add(lbPrecoUnitario);
		pnPrincipal.add(tfPrecoUnitario);
		pnTable = new JPanel(new BorderLayout());
		pnTable.setBorder(new TitledBorder("Itens do Pedido"));
		scrolltable = new JScrollPane();
		df.setMinimumFractionDigits(2);
		df.setMaximumFractionDigits(2);
		pnPrincipal.add(btAdicionar);
		pnPrincipal.add(btRemover);
		DefaultTableModel tableModel = new DefaultTableModel(
			new String[] {"Produto", "Qtde", "Preço Un.", "Total"}, 0);
		table = new JTable(tableModel);
		
	}
	
}


