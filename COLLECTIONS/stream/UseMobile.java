package STREAM;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseMobile {

	public static void main(String[] args) {
		Mobile m1=new Mobile(101, "vivo", "black", true, 20000);
		Mobile m2=new Mobile(102, "oppo", "white", true, 10000);
		Mobile m3=new Mobile(103, "oneplus", "white", true, 80000);
		Mobile m4=new Mobile(104, "vivo", "yellow", false, 50000);
		Mobile m5=new Mobile(105, "Samsung", "Blue", true, 90000);
		List<Mobile>phone=Arrays.asList(m1,m2,m3,m4,m5);
		List<Integer>phone1=Arrays.asList(10,30,30,40,50);
		List<List<? extends Object>>nums=Arrays.asList(phone,phone1);
		System.out.println(nums);
		//phone.forEach(x->System.out.println(x));
		
		//filter() method;
		List<Mobile>whitephone=phone.stream().filter(x->x.getColor().equals("white")).collect(Collectors.toList());
		//System.out.println(whitephone);
		whitephone.forEach(x->System.out.println(x));
		
		//map() method;
		List<String>brand=phone.stream().map(x->x.getBrand().toUpperCase()).collect(Collectors.toList());
		System.out.println("---------map method-----");
		System.out.println(brand);
		brand.forEach(x->System.out.println(x));
		
		//count() method;
		Long count=phone.stream().count();
		System.out.println(count);
		
		//waranty is true find count;
		List<Mobile>wCount=phone.stream().filter(x->x.isWarranty()==true).collect(Collectors.toList());
		Long count1=wCount.stream().count();
		System.out.println("Warranty count is:"+count1);
		Long CountW=phone.stream().filter(x->x.isWarranty()==true).count();
		System.out.println("Warranty count is:"+CountW);
		System.out.println();
		
		//Price more than 20000 print their brand;
		List<String>br=phone.stream().filter(x->x.getPrice()>50000).map(x->x.getBrand()).collect(Collectors.toList());
		System.out.println("------Price more than 2000 their brand --");
		System.out.println(br);
		System.out.println();
		//Price more than 20000 print their object;
		/*List<Mobile>br=phone.stream().filter(x->x.getPrice()>50000).collect(Collectors.toList());
		System.out.println("------Price more than 2000 their brand --");
		System.out.println(br);*/
		
		//MaxPrice finding using map get maxPrice value only;
		Integer maxPrice=phone.stream().map(x->x.getPrice()).max(Comparable::compareTo).get();
		System.out.println("----MaxPrice------");
		System.out.println(maxPrice);
		System.out.println();
		
		//Maxprice finding Using comparator get maxPrice object value only;
		Mobile maxPrice1=phone.stream().max(Comparator.comparing(Mobile::getPrice)).get();
		System.out.println("------MaxPrice to print tha object----");
		System.out.println(maxPrice1);
		System.out.println();
		
		//accending Sorting the value using sorted method;
		List<Integer>sr=phone.stream().map(x->x.getPrice()).sorted().collect(Collectors.toList());
		System.out.println("-------Sorted the values-----");
		System.out.println(sr);
		System.out.println();
		
		//deccending sorting the value Using Comparator reverseorder method;
		List<Integer>sr1=phone.stream().map(x->x.getPrice()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("--------Sorted desending value-----");
		System.out.println(sr1);
		System.out.println();
		
		//accending sorting the value and get the object all value;
		List<Mobile>Accending=phone.stream().sorted(Comparator.comparing(Mobile::getPrice)).collect(Collectors.toList());
		System.out.println("--------Sorted the value get the object");
		System.out.println(Accending);
		System.out.println();
		
		//deccending sorting the value and get the object all value;
		List<Mobile>DeAccending=phone.stream().sorted(Comparator.comparing(Mobile::getPrice).reversed()).collect(Collectors.toList());
		System.out.println("------------soted the desending value------");
		System.out.println(DeAccending);
		System.out.println();
		
		//Skip methoad using skip the object if we give skip(2) then skip the first two skip;
		List<Mobile>sk=phone.stream().skip(2).collect(Collectors.toList());
		System.out.println("-----SKip the first two value------");
		System.out.println(sk);
		System.out.println();
		
		//Skip method Using skip the object skip using getBrand;
		List<String>sk1=phone.stream().map(x->x.getBrand()).skip(2).collect(Collectors.toList());
		System.out.println("-----Skip the first toe brand-----");
		System.out.println(sk1);
		System.out.println();
		
		//limit the value limit is the print if we give two so print first two value only;
		List<Mobile>li=phone.stream().limit(2).collect(Collectors.toList());
		System.out.println("----------limit print first 2 value-------");
		System.out.println(li);
		System.out.println();
		
		//limit method using first two limit using getBrand;
		List<String>li1=phone.stream().map(x->x.getBrand()).limit(2).collect(Collectors.toList());
		System.out.println("--------limit print first 2 get brand----");
		System.out.println(li1);
		System.out.println();
	
		//Max three object skip using;
		List<Mobile>skip1=phone.stream().sorted(Comparator.comparing(Mobile::getPrice).reversed()).limit(2).collect(Collectors.toList());
		System.out.println("-------sorted the value and skip the first two value----");
		System.out.println(skip1);
		System.out.println();
		
		//Distinct method it will give unique value;
		List<Boolean>d1=phone.stream().map(x->x.isWarranty()).distinct().collect(Collectors.toList());
		System.out.println("----------get unique value for isWarranty--------");
		System.out.println(d1);
		System.out.println();
		//object is not possible did't get unique values;
//		List<Mobile>d2=phone.stream().distinct().collect(Collectors.toList());
//		System.out.println(d2);
		
		//FindFirst method is using find the first value;
		Mobile first=phone.stream().findFirst().get();
		System.out.println("---print the first object------");
		System.out.println(first);
		System.out.println();
		
		//print the min object and using findfirst method;
		Mobile findmin=phone.stream().sorted(Comparator.comparing(Mobile::getPrice)).findFirst().get();
		System.out.println("----finding min using findFirst method-----");
		System.out.println(findmin);
		System.out.println();
		
		//print the max object and using findfirst method;
		Mobile findmax=phone.stream().sorted(Comparator.comparing(Mobile::getPrice).reversed()).findFirst().get();
		System.out.println("----finding max using findFirst method-----");
		System.out.println(findmax);
		System.out.println();
		
		//find the given value present or not using anyMatch() method it.s work like String contains method;
		boolean anymatch = phone.stream().anyMatch(x->x.getBrand()==("redmi"));
		System.out.println("----------Finding present or not methoad------");
		System.out.println(anymatch);
		System.out.println();
		
		
		//toMap method its will perform map concept like key, value pairs;
		Map<Integer, Mobile>map=phone.stream().collect(Collectors.toMap(x->x.getId(), y->y));
		System.out.println("-------Using toMap method----");
		//System.out.println(map);
		map.forEach((x,y)->System.out.println(x+""+y));
		System.out.println();
		
		//summingInt method its will perfom sum the all value if we take getprice result will be get the sum value of all price;
		int sum=phone.stream().collect(Collectors. summingInt(x->x.getPrice()));
		System.out.println("-------sum of all the prices");
		System.out.println(sum);
		System.out.println();
		
		//groupingBy() method it will only use is map concept grouping concept will perform group the value and give the counting;
		Map<String, Long>group=phone.stream().collect(Collectors.groupingBy(x->x.getBrand(),Collectors.counting()));
		System.out.println("-------group the value and get the count");
		System.out.println(group);
		System.out.println();
		
		//List<Integer> result = phone.stream().peek(n -> System.out.println("Processing: " + n)).map(n -> n * 2).collect(Collectors.toList());
		
		
	}
}


class Mobile {
	private int id;
	private String brand;
	private String color;
	private boolean isWarranty;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brand=" + brand + ", color=" + color + ", isWarranty=" + isWarranty + ", price="
				+ price + "]";
	}
	public Mobile(int id, String brand, String color, boolean isWarranty, int price) {
		super();
		this.id = id;
		this.brand = brand;
		this.color = color;
		this.isWarranty = isWarranty;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isWarranty() {
		return isWarranty;
	}
	public void setWarranty(boolean isWarranty) {
		this.isWarranty = isWarranty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}