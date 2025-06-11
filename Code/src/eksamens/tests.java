package eksamens;
import java.util.Random;

public class tests {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int garums = rand.nextInt(16) + 5;
        int platums = rand.nextInt(13) + 3;
        
        int laukums = garums * platums;
        int perimetrs = 2 * (garums + platums);
        
        System.out.println("Taisnstūra parametri:");
        System.out.println("Garums: " + garums);
        System.out.println("Platums: " + platums);
        System.out.println("------------------");
        System.out.println("Laukums: " + laukums);
        System.out.println("Perimetrs: " + perimetrs);
    }
}