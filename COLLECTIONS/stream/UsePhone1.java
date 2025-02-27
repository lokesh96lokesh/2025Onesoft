package stream;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
//import java.util.Optional;
import java.util.stream.Collectors;



public class UsePhone1{
	public static void main(String[] args) {
		Phone1 p1 = new Phone1("B11","XY","Yellow",true,45000);
		Phone1 p2 = new Phone1("B12","Y","Green",true,55000);
		Phone1 p3 = new Phone1("B13","CSFI","Blue",false,34000);
		Phone1 p4 = new Phone1("B14","BGHKH","Black",false,48000);
		Phone1 p5 = new Phone1("B15","JKG","White",true,67000);
        
		List<Phone1> phones = Arrays.asList(p1,p2,p3,p4,p5);
		phones.forEach(x->System.out.println(x));
		System.out.println("");
		//filter
		List<Phone1> hp = phones.stream().filter(x->x.getColor().equals("White")).collect(Collectors.toList());
		hp.forEach(x->System.out.println(x));
		System.out.println("");
		//map
		List<String> hp1 = phones.stream().map(x->x.getBrand()).collect(Collectors.toList());
		hp1.forEach(x->System.out.println(x));
		System.out.println("");
		//count for iswarranty is  true
		Long c = phones.stream().filter(x->x.getIsWarranty()==true).count();
		System.out.println(c);
		System.out.println("");
		//count
		Long d = phones.stream().count();
		System.out.println(d);
		System.out.println("");
		//map for find ingprice  greater than 42000
		List<String> greater = phones.stream().filter(x->x.getPrice()>42000).map(x->x.getBrand()).collect(Collectors.toList());
		greater.forEach(x->System.out.println(x));
		System.out.println("");
		// maxprice
		Integer maxi = phones.stream().map(x->x.getPrice()).max(Comparable::compareTo).get();
		System.out.println(maxi+" max price");
		System.out.println("");
		//minimum
		Integer mini = phones.stream().map(x->x.getPrice()).min(Comparable::compareTo).get();
		System.out.println(mini+" min price");
		System.out.println("");
		//object
		Phone1 maxPrice = phones.stream().max(Comparator.comparing(Phone1::getPrice)).get();
		System.out.println(maxPrice+" max price");
		System.out.println("");
		//max color 
		Phone1 maxcolor = phones.stream().max(Comparator.comparing(Phone1::getColor)).get();
		System.out.println(maxcolor+" max color");
		System.out.println("");
		//Sorted
		List<Integer> sort = phones.stream().map(x->x.getPrice()).sorted().collect(Collectors.toList());
		sort.forEach(x->System.out.println(x));
		System.out.println("");
		//Reveres/decending order usinfg sort
		List<Integer> rev = phones.stream().map(x->x.getPrice()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		rev.forEach(x->System.out.println(x));
		System.out.println("");
		//Sorted object 
		List<Phone1> obj = phones.stream().sorted(Comparator.comparing(Phone1::getPrice)).collect(Collectors.toList());
		obj.forEach(x->System.out.println(x));
		System.out.println("");
		//reverse object
		List<Phone1> objr = phones.stream().sorted(Comparator.comparing(Phone1::getPrice).reversed()).collect(Collectors.toList());
		objr.forEach(x->System.out.println(x));
		System.out.println("");
		// 1. forEach - Iterates over each element in the stream
        phones.forEach(System.out::println);
        System.out.println("");

        // 2. filter - Filters elements based on a condition
        List<Phone1> whitePhones = phones.stream().filter(x -> x.getColor().equals("White")).collect(Collectors.toList());
        whitePhones.forEach(System.out::println);
        System.out.println("");

        // 3. map - Transforms each element in the stream
        List<String> brands = phones.stream().map(Phone1::getBrand).collect(Collectors.toList());
        brands.forEach(System.out::println);
        System.out.println("");

        // 4. count - Counts the number of elements in the stream
        long warrantyCount = phones.stream().filter(Phone1::getIsWarranty).count();
        System.out.println(warrantyCount);
        System.out.println("");

        // 5. distinct - Returns distinct elements in the stream
        List<String> distinctColors = phones.stream().map(Phone1::getColor).distinct().collect(Collectors.toList());
        distinctColors.forEach(System.out::println);
        System.out.println("");

        // 6. limit - Limits the number of elements in the stream
        phones.stream().limit(3).forEach(System.out::println);
        System.out.println("");

        // 7. skip - Skips the first N elements in the stream
        phones.stream().skip(2).forEach(System.out::println);
        System.out.println("");

        // 8. sorted - Sorts elements based on a comparator
        List<Phone1> sortedByPrice = phones.stream().sorted(Comparator.comparing(Phone1::getPrice)).collect(Collectors.toList());
        sortedByPrice.forEach(System.out::println);
        System.out.println("");

        // 9. sorted (reverse order) - Sorts elements in descending order
        List<Phone1> reverseSortedByPrice = phones.stream().sorted(Comparator.comparing(Phone1::getPrice).reversed()).collect(Collectors.toList());
        reverseSortedByPrice.forEach(System.out::println);
        System.out.println("");

        // 10. max - Finds the max element based on a comparator
        Phone1 maxPricePhone = phones.stream().max(Comparator.comparing(Phone1::getPrice)).get();
        System.out.println(maxPricePhone + " max price");
        System.out.println("");

        // 11. min - Finds the min element based on a comparator
        Phone1 minPricePhone = phones.stream().min(Comparator.comparing(Phone1::getPrice)).get();
        System.out.println(minPricePhone + " min price");
        System.out.println("");

        // 12. anyMatch - Checks if any element matches a condition
        boolean hasExpensivePhone = phones.stream().anyMatch(x -> x.getPrice() > 60000);
        System.out.println(hasExpensivePhone);
        System.out.println("");

        // 13. allMatch - Checks if all elements match a condition
        boolean allHaveWarranty = phones.stream().allMatch(Phone1::getIsWarranty);
        System.out.println(allHaveWarranty);
        System.out.println("");

        // 14. noneMatch - Checks if no element matches a condition
        boolean noneCheap = phones.stream().noneMatch(x -> x.getPrice() < 30000);
        System.out.println(noneCheap);
        System.out.println("");

        // 15. collect (Joining) - Collects elements into a formatted string
        String brandsJoined = phones.stream().map(Phone1::getBrand).collect(Collectors.joining(", "));
        System.out.println(brandsJoined);
        System.out.println("");

        // 16. flatMap - Flattens nested collections into a single stream
        List<List<Phone1>> nestedPhones = Arrays.asList(phones);
        List<Phone1> flattenedList = nestedPhones.stream().flatMap(List::stream).collect(Collectors.toList());
        flattenedList.forEach(System.out::println);
        System.out.println("");
        
        //object setPrice
        List<Phone1> f=phones.stream()
        .map(x ->{
        	if(x.getPrice()>40000) {
        		x.setPrice(x.getPrice() +x.getPrice()* 10/100);
        	}
        	return x;
        })
        .collect(Collectors.toList());
        f.forEach(System.out::println);
        System.out.println("obj");
        
        
        phones.stream()
        .filter(phone -> phone.getPrice() > 40000)
        .forEach(phone -> phone.setPrice(phone.getPrice() + 1000));
        phones.forEach(System.out::println);
        
        // second max
        Integer e=phones.stream()
        		.map(Phone1::getPrice)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();
        System.out.println(e);
        
        //min value
        Phone1 t=phones.stream().sorted(Comparator.comparingInt(Phone1::getPrice)).findFirst().get();
        System.out.println(t);
        //sec max value
        Phone1 y=phones.stream().sorted(Comparator.comparingInt(Phone1::getPrice).reversed()).skip(1).findFirst().get();
        System.out.println(y);
        //max value
        Phone1 u=phones.stream().sorted(Comparator.comparingInt(Phone1::getPrice).reversed()).findFirst().get();
        System.out.println(u);
        
        HashMap<Integer,Phone1> phones1 = new HashMap<>();
        phones1.put(1,p1);
        phones1.put(2,p2);
        phones1.put(3,p3);
        phones1.put(4,p4);
        
        //Iterator remove
        Iterator<Phone1> o=phones1.values().iterator();
        while(o.hasNext()) {
        	if (o.next().getPrice()>55000) {
        		o.remove();
        	}
        }
        System.out.println(phones1);
        
        //StartsWith m add to new array list
        ArrayList<Phone1> exchange = new ArrayList<>();
        for(Phone1 z:phones1.values()) {
        	if (z.getBrand().startsWith("B")){
        		exchange.add(z);
        	}
        }
        exchange.forEach(x->System.out.println(x));
        //first letter of brand
        ArrayList<Character> firstLetter = new ArrayList<>();
        for(Phone1 p:phones1.values()) {
        	firstLetter.add(p.getBrand().charAt(0));
        }
        System.out.println(firstLetter);
        
        //sort price using stream
        List<Integer> n= phones.stream().map(x->x.getPrice()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(n);
        
        //flatmap connect 2 string array
        List<String> l1 = Arrays.asList("loki");
		List<String> l2 = Arrays.asList("nostalgic");
		List<List<String>> nums = Arrays.asList(l1,l2);
		
		List<String>flatString=nums.stream()
				.flatMap(x->x.stream())
				.sorted()
				.collect(Collectors.toList());
		System.out.println(flatString);
        
	}
	}

class Phone1 {
	private String id;
	private String brand;
	private String color;
	private boolean isWarranty;
	private int price ;
	
	
	@Override
	public String toString() {
		return "Phone [id=" + id + ", brand=" + brand + ", color=" + color + ", isWarranty=" + isWarranty + ", price="
				+ price + "]";
	}
	
	
	
	public Phone1(String id, String brand, String color, boolean isWarranty, int price) {
		this.id = id;
		this.brand = brand;
		this.color = color;
		this.isWarranty = isWarranty;
		this.price = price;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public boolean getIsWarranty() {
		return isWarranty;
	}
	public void setIsWarranty(boolean isWarranty) {
		this.isWarranty = isWarranty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
