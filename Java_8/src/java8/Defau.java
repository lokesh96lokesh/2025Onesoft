package java8;

public class Defau {
    public static void main(String[] args) {
        Stad1 s = new Stad1();
        Stad2 r = new Stad2();
        
        System.out.println(Stad5.getName() + "\n" + s.getName() + "\n" + s.getAge() + "\n" + s.getWeight() + "\n" + r.getNameFromInterface());
    }
}

interface Stad5 {
    public static String getName() {
        return "Dara";
    }

    public default int getAge() {
        return 26;
    }

    public default float getWeight() {
        return 58.4f;
    }
}

class Stad1 implements Stad5 {
    public String getName() {
        return "Loki";
    }

    public int getAge() {
        return 35;
    }

    public float getWeight() {
        return 65;
    }
}

class Stad2 extends Stad1 {
    public String getName() {
        return "Anu";
    }

    public int getAge() {
        return 45;
    }

    public float getWeight() {
        return 55;
    }

    // Method to call "Dara" from Stad5
    public String getNameFromInterface() {
        return Stad5.getName(); // Calling static method from interface
    }
}
