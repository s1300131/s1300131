import java.util.Scanner;
public class DiceGame {
    public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int[] a = new int[2];
	int total;

	a[0] = (int)Math.ceil(Math.random()*6)%7;
	a[1] = (int)Math.ceil(Math.random()*6);
	total = a[0]+a[1];

	System.out.println("What is your name?");
	System.out.print(">");
	String name = sc.next();
	System.out.println("Hello, " + name + "!");

	System.out.println("Rolling dice...");
	for(int i=1;i<3;i++)
	    System.out.println("Die "+ i +": " + a[i-1]);
	System.out.println("Total value: " + total);
	if(total>7) System.out.println("You won");
	else System.out.println("You lost");
    }
}

