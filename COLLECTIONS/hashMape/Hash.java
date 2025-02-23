package hashMape;

import java.util.HashMap;

public class Hash {
	public static void main(String[] args) {
		
	HashMap<Integer,String> hm = new HashMap<> ();
	hm.put(1584,"Ranga");
	hm.put(1585,"Saravanan");
	hm.put(0570,"Nisha");
	hm.put(1000,"Ranga");
	
	for(Integer a : hm.keySet()) {
		System.out.println(a);
	}
	for(String b : hm.values()) {
		System.out.println(b);
	}
	for(Integer c : hm.keySet()) {
		System.out.println(c+" "+hm.get(c));
	}
	hm.forEach((x,y)-> System.out.println(x+" "+y));
	hm.keySet().forEach(x->System.out.println(x));
	hm.values().forEach(y->System.out.println(y));

}
	
}

