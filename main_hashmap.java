package main_hm;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class main_hashmap {
	public static void main(String[] args) {
		System.out.println("\n--MAP\n");
		HashMap<String,Persona> map=new HashMap<>();
		map.put("marco",new Persona(27,"marco","bianco"));
		map.put("luca",new Persona(24,"luca","arancio"));
		map.put("giovanni",new Persona(22,"giovanni","rossi"));
		map.put("marco",new Persona(29,"mario","bianchi"));
		
		Collection<Persona> collection = map.values();
		
		Iterator<Persona> it=collection.iterator();
		while(it.hasNext()) {
			Persona p=it.next();
			System.out.println(p);
		}
		/*System.out.println();
		for(Persona p:collection) {
			System.out.println(p);
		}*/
		
		System.out.println("\n\nPrinting kes and values");
		Set<String> set = map.keySet();
		for(String s:set) {
			System.out.println(s+" -- "+map.get(s));
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
