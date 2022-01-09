import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class main_LLAL {
	public static void main(String args[]) {
		System.out.println("\n--ARRAYLIST\n");
		ArrayList<Persona> lista=new ArrayList<>();
		lista.add(new Persona(27,"marco","bianco"));
		lista.add(new Persona(24,"luca","arancio"));
		lista.add(new Persona(22,"giovanni","rossi"));
		lista.add(new Persona(29,"mario","bianchi"));
		
		Iterator<Persona> it=lista.iterator();
		while(it.hasNext()) {
			Persona p=it.next();
			System.out.println(p);
		}
		for(int i=0;i<lista.size();i++) {
			Persona p=lista.get(i);
			System.out.println(p);
		}
		System.out.println("\n--LINKEDLIST\n");
		LinkedList<Persona> listaL=new LinkedList<>();
		listaL.add(new Persona(27,"marco","bianco"));
		listaL.add(new Persona(24,"luca","arancio"));
		listaL.add(new Persona(22,"giovanni","rossi"));
		listaL.add(new Persona(29,"mario","bianchi"));
		
		Iterator<Persona> itL=listaL.iterator();
		while(itL.hasNext()) {
			Persona p=itL.next();
			System.out.println(p);
		}
		for(int i=0;i<listaL.size();i++) {
			Persona p=listaL.get(i);
			System.out.println(p);
		}
	}
}
