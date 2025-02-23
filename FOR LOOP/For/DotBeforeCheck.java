package For;

public class DotBeforeCheck {
    public static void main(String[] args) {
        String a = "NARAYANAN.RAY";
        String b = "RAY";

        // Find the index of the dot
        int dotIndex = a.indexOf('.');

        // Check if `b` is present before the dot
        if (dotIndex != -1 && a.substring(0, dotIndex).contains(b)) {
            System.out.println("OK");
        } else {
            System.out.println("NOT");
        }
    }
}
