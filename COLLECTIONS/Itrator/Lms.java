package Itrator;

import java.util.HashMap;



public class Lms {
	public static void main(String[] args) {
		HashMap<Integer,String> lms = new HashMap<>();
        lms.put(123,"Karthi");
        lms.put(645,"loki");
        lms.put(897,"poo");
        lms.put(864,"jeeva");
        
        System.out.println(lms);
        lms.remove(123);
        System.out.println(lms.get(864));
        lms.put(897, "dheena");
        System.out.println(lms);
        for(String value:lms.values()) {
        	System.out.println(value);
        }
        for(Integer x:lms.keySet()) {
        	 System.out.println(x+" 'keyset enance forloop example' "+lms.get(x));
        }
       
        lms.forEach((x,y)->System.out.println(x+" 'foreach example' "+y));
        lms.values().forEach(y->System.out.println(y+" 'values() example' "));
        lms.keySet().forEach(x->System.out.println(x+" 'keyset example' "+lms.get(x)));
        lms.keySet().forEach(x->System.out.println(x+" 'keyset using values() method' "+lms.values()));
	}

}
