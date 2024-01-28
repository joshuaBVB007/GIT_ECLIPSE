package inputOutput;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class UsingFiles {
	public static void main(String[] args) {
		
		Integer[] numeros= {4,7,4};
		
		List<Integer> nombres=Arrays.asList(numeros);
		
		for (Integer integer : nombres) {
			System.out.println(integer);
		}
		
	}
}
