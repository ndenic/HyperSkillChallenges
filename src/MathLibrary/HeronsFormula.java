package MathLibrary;

import java.util.Scanner;

public class HeronsFormula {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        double p = (a+b+c)/2.0;
        
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        
        System.out.println(S);
        
    }
    
}
