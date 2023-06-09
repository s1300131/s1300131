public class DiceGame {
    public static void main(String args[]){
	int[] a = new int[2];
	int total;

	a[0] = (int)Math.ceil(Math.random()*6)%7;
	a[1] = (int)Math.ceil(Math.random()*6);
	total = a[0]+a[1];

	System.out.println("Rolling dice...");
	for(int i=1;i<3;i++)
	    System.out.println("Die "+ i +": " + a[i-1]);
	System.out.println("Total value: " + total);
    }
}

