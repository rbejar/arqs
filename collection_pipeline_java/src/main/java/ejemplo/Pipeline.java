package ejemplo;

import java.util.*;
import java.util.stream.Collectors;

/** 
 * Implementa un collection pipeline que a partir de una lista 
 * de cadenas pasa a mayúsculas aquellas que tienen longitud 
 * par y las concatene en orden alfabético.
 * P. ej. “d”, “BaBb”, “cab”, “aB” debe dar como resultado “ABBABB” 
 * @author rbejar
 *
 */
public class Pipeline {
	
	public static void main(String[] argv) throws Exception {
		List<String> list = Arrays.asList("d", "BaBb", "cab", "aB"); // La lista así creada es inmutable
		String result = list
				.stream() // Las operaciones agregadas en Java 8 se hacen sobre streams, no sobre colecciones
				.filter(s -> s.length() % 2 == 0) // Quedarnos con las de longitud par						
				.map(String::toUpperCase) // Pasar a mayúsculas
				.sorted() // Ordenar después de pasar a mayúsculas, para que sea orden alfabético
				.collect(Collectors.joining()); // Convertir en String concatenando las que quedan    	
		System.out.println(result);
	}
}