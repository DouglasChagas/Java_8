import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import static java.util.Comparator.*;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		//Collections.sort(palavras);
		
		//Comparator<String> comparador = new ComparadorDeStringPorTamanho();
		//Collections.sort(palavras, comparador);
		
		System.out.println(palavras);
		
		/*
		Comparator<String> comparador = new ComparadorDeStringPorTamanho();
		palavras.sort(comparador);
		
		System.out.println(palavras);

		Consumer<String> consumidor = new ConsumidorDeString();
		palavras.forEach(consumidor);
		*/
		
		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		//palavras.sort(Comparator.comparing(s -> s.length()));
		//palavras.sort(Comparator.comparing(String::length));
		
		//palavras.sort(comparing(String::length));
		
//		palavras.sort(Comparator.comparing(s -> s.length()*-1));
		
		palavras.sort(String.CASE_INSENSITIVE_ORDER);

		
		//palavras.forEach(s -> System.out.println(s));
		palavras.forEach(System.out::println);
		
		//Object o = s -> System.out.println(s);
/*
		new Thread(() -> System.out.println("Executando um Runnable")).start();
		
		//new Thread(() -> System.out.println("Executando um Runnable")).start();

		
		new Thread(new Runnable() {

		    @Override
		    public void run() {
		        System.out.println("Executando um Runnable");
		    }

		}).start();
*/
	}

}

class ConsumidorDeString implements Consumer<String> {
    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparadorDeStringPorTamanho implements Comparator<String> {
    public int compare(String s1, String s2) {
        if(s1.length() < s2.length()) 
            return -1;
        if(s1.length() > s2.length()) 
            return 1;
        return 0;
    }
}