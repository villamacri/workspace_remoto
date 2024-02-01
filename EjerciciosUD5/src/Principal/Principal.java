package Principal;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> lista=new ArrayList<>();
		lista.add("Angel");
		lista.add("Rafa");
		
		System.out.println(lista.contains("Rafa"));
		
		lista.remove(0);
		
		System.out.println(lista);
		
		System.out.println(lista.size());
		
	}

}
