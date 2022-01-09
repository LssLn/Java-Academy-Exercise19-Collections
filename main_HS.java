import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class main_HS {

	public static void main(String[] args) {
		System.out.println("\n--SET\n");
		HashSet<Persona> set=new HashSet<>();
		set.add(new Persona(27,"marco","bianco"));
		set.add(new Persona(27,"marco","bianco"));
		set.add(new Persona(24,"luca","arancio"));
		set.add(new Persona(22,"giovanni","rossi"));
		set.add(new Persona(29,"mario","bianchi"));
		
		Iterator<Persona> it=set.iterator();
		while(it.hasNext()) {
			Persona p=it.next();
			System.out.println(p);
		}
		System.out.println();
		for(Persona p:set) {
			System.out.println(p);
		}
		
		
	}

}
