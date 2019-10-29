package help;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

public class Help {
	
	public static void main(String[] args) throws IOException {
		
		String[] opcoes = {"Masculino", "Feminino", "Indefinido"};
		String resposta = (String) JOptionPane.showInputDialog(null, "Selecione o Sexo:\n", "Pesquisa", JOptionPane.PLAIN_MESSAGE, null, opcoes, "Masculino");
		
		
		for (int horas = 0; horas < 24; horas++) {
			for (int minutos = 0; minutos < 60; minutos++) {
				for (int segundos = 0; segundos < 60; segundos++) {
					System.out.println(horas + "h:"+minutos+"m:"+segundos+"s");
					try {
						Thread.sleep(1000);
						if (segundos==10) {
							System.exit(0);
						}
					} catch (InterruptedException erro) {
						erro.toString();
					}
				}
			}
		}
		System.exit(0);
		String s= "";
		float base, altura = 0, area; 
		BufferedReader dado;  
		try{
		System.out.println("Entre com altura do trianulo:");
		dado = new BufferedReader(new InputStreamReader(System.in));
		s = dado.readLine();     
		System.out.println("Entre com base do trianulo:");
		dado = new BufferedReader(new InputStreamReader(System.in));
		s = dado.readLine();  
		base= Float.parseFloat(s); 
		area =(base*altura)/2;
		System.out.println("A área do triangulo é de: "+area);
		}catch(IOException erro){     
			System.out.print("Digite apenas valores númericos: "+erro.toString());
		}

		
		try {
			int x = Integer.parseInt(JOptionPane.showInputDialog("Valor:"));
			int y = x/0;
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro.getMessage());
			erro.printStackTrace();
		}
		
		
		try {
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Sua idade?"));
			if (idade < 18) {
				throw new Exception("Menor de idade não entra!");
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
		}
		
		
		String frase = JOptionPane.showInputDialog("Digite uma Frase:");
		try {
			FileWriter file = new FileWriter("c:/JavaThrow/frases.txt", true);
			PrintWriter out = new PrintWriter(file);
			out.println(frase);
			file.close();
			out.close();
		} catch (FileNotFoundException erro) {
			JOptionPane.showMessageDialog(null, "Erro");
		}

		
		try {
			String aux = JOptionPane.showInputDialog(null, "EAE\n", "EAE", JOptionPane.PLAIN_MESSAGE);
			int num1 = Integer.parseInt(aux.toString());
		} catch (NullPointerException | ArithmeticException erro) {
			JOptionPane.showMessageDialog(null, "Cancel Pressionado!\n"+erro.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null, "Final da Execução!");
		}
		
		
		
		//Control + D -> Apaga Linha
		System.out.println("a\\b");
		
		String ola;
		ola = new String("eae");
		
		String a1 = " a ";
		System.out.println(a1.trim());
		//Trim(): Retira espaço em branco do começo e fim
		
		String b1 = "b";
		System.out.println(b1.contains("s"));
		
		String a = "abcdefg ";
		System.out.println(a.replace(" ", "").length());
		
		String b = "";
		System.out.println(b.isEmpty());
		
		float c = 1E3F;
		System.out.println(c);
		
		char d = '\u0078';
		System.out.println(d);
		
		Instant agora = Instant.now();
		agora.now();
		
		LocalDate agora2 = LocalDate.now();
		System.out.println(agora2);
		
		LocalDate homemNoEspaco = LocalDate.of(1961,6, 12);
		LocalDate homemNaLua = LocalDate.of(1969,6, 25);
		Period periodo = Period.between(homemNoEspaco, homemNaLua);
		System.out.println(periodo); //P8Years13Days
		
		int[][] vTeste =new int[2][2];
		for (int i = 0; i < vTeste.length; i++) {
			for (int j = 0; j < vTeste.length; j++) {
				vTeste[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Number:"));
			}
		}
		procuraZero:
		for (int i = 0; i < vTeste.length; i++) {
			for (int j = 0; j < vTeste.length; j++) {
				System.out.println("i:"+i+"|j:"+j);
				if (vTeste[i][j]==0) {
					break procuraZero;
				}
			}
		}
		int[] e = {2,2};
		int x = Integer.parseInt(JOptionPane.showInputDialog("Number:"));
		int count = 0;
		for (int i = 0; i < e.length; i++) {
			if (e[i]!=x) continue;
			count++;
		}
		System.out.println(count);
	}
}


