package composition;

public class UseFlower {
	public static void main(String[] args) {
		Seed s1=new Seed();
		s1.type="soil";
		s1.price=20;
		s1.isSeedable=true;
		
		Seed s2=new Seed();
		s2.type="aqua";
		s2.price=80;
		s2.isSeedable=false;
		
		Flower f1=new Flower();
		f1.name="jasmine";
		f1.price=200;
		f1.seed=s1;
		
		Flower f2=new Flower();
		f2.name="money plant";
		f2.price=350;
		f2.seed=s2;
		

        System.out.println("Flower name: " + f2.name + "\n" +
                        "Flower price: " + f2.price + "\n" +
                        "Seed Type: " + f2.seed.type + "\n" +
                        "Seed Price: " + f2.seed.price + "\n" +
                        "isSeedable: " +f2.seed.isSeedable + "\n");
          
        System.out.println("Flower name: " + f1.name + "\n" +
                        "Flower price: " + f1.price + "\n" +
                        "Seed Type: " + f1.seed.type + "\n" +
                        "Seed Price: " + f1.seed.price + "\n" +
                        "isSeedable: " +f1.seed.isSeedable + "\n");
           
        }
	}

