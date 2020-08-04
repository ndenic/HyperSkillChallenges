package MathLibrary;

import java.util.Scanner;

public class TheAngleBetweenVectors {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a1,b1,a2,b2;
        a1 = sc.nextInt();
        b1 = sc.nextInt();
        a2 = sc.nextInt();
        b2 = sc.nextInt();
        
        double angle = Math.abs(Math.atan2(b1, a1)-Math.atan2(b2, a2));
        System.out.println(Math.toDegrees(angle));
        
    }
    
}
