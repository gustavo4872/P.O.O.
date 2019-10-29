package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Ordenacao {
	
	public static void ordenaPorAno(ArrayList<Carro> lista) {
		Collections.sort(lista, new Comparator<Object>() {
			@Override
			public int compare(Object arg0, Object arg1) {
				Carro c1 = (Carro)arg0;
				Carro c2 = (Carro)arg1;
				return c1.getAno()-c2.getAno();
			}
		});
	}
	
	public static void ordenaPorPlaca(ArrayList<Carro> lista) {
		Collections.sort(lista, new Comparator<Object>() {
			@Override
			public int compare(Object arg0, Object arg1) {
				Carro c1 = (Carro)arg0;
				Carro c2 = (Carro)arg1;
				return c1.getPlaca().compareTo(c2.getPlaca());
			}
		});
	}
	
	public static void ordenaPorModelo(ArrayList<Carro> lista) {
		Collections.sort(lista, new Comparator<Object>() {
			@Override
			public int compare(Object arg0, Object arg1) {
				Carro c1 = (Carro)arg0;
				Carro c2 = (Carro)arg1;
				return c1.getModelo().compareTo(c2.getPlaca());
			}
		});
	}
}
