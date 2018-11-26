package br.com.core.util.maps;

import java.util.HashMap;
import java.util.Map;

public class TestInMaps {

	public static void main(String[] args) {
		
		Country brazil = new Country(3, "Brazil");
		Country portugal = new Country(1, "Portugal");
		Country paraguay = new Country(2, "Paraguay");
		Country argentina = new Country(8, "Argentina");
		Country italy = new Country(20, "Italy");
		
		Map<Integer, Country> countries = new HashMap<>();
		countries.put(brazil.getId(), brazil);
		countries.put(portugal.getId(), portugal);
		countries.put(paraguay.getId(), paraguay);
		countries.put(argentina.getId(), argentina);
		countries.put(italy.getId(), italy);
		
		System.out.println("Values and Key of map: "+countries);
		System.out.println("Values of map: "+countries.values());
		System.out.println("Keys of map: "+countries.keySet());

		System.out.println("Return value by key: "+countries.get(1));
		countries.replace(1, argentina);
		System.out.println("Remaping a key with other value...");
		System.out.println("Return value by key: "+countries.get(1));
		System.out.println("Return value by key: "+countries.get(8));
		
	}
	
}
