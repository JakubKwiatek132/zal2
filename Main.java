import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    Scanner o = new Scanner(System.in);
        System.out.println("Podaj a");
        int a = o.nextInt();

        System.out.println("Podaj b");
        int b = o.nextInt();
    
        System.out.println("Podaj c");
        int c = o.nextInt();

        int delta = (b*b)-(4*a*c);
    
        int p1 = (int)Math.sqrt(delta);
        int p2 = (int)Math.sqrt(delta);
    
        int x1 = (-b-p1)/2*a;
        int x2 = (-b+p2)/2*a;

        int x0 = -b/2*a;

        System.out.println("===== DELTA =====");
        System.out.println("     Delta: " + delta);
    
        if(delta<0){
          System.out.println("Delta mniejsza od zera, niema miejsc zerowych" );
        } else if(delta == 0){
          System.out.println("x0: " + x0);
        } else{
          System.out.println("==== MIEJSCA ZEROWE ====");
          System.out.println("     x1: " + x1);
          System.out.println("     x2: " + x2);
          System.out.println("=====");
        }
  }
}