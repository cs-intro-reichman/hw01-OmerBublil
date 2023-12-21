/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
        int a = Integer.parseInt (args[0]);
        int b = Integer.parseInt (args [1]);
        int min = Math.min (a, b);
        int max = Math.max (a, b);
        int range = (max - min);
        int integer1 = ((int) (Math.random() * range)) + min;
        int integer2 = ((int) (Math.random() * range)) + min;
        int integer3 = ((int) (Math.random() * range)) + min;
        int mingeneratednum = Math.min ( (Math.min(integer1, integer2)) , integer3     );
        System.out.println (integer1);
        System.out.println (integer2);
        System.out.println (integer3);
        System.out.println ("The minimal generated number was " + mingeneratednum);
	}
}
