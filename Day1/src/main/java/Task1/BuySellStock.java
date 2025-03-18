package Task1;
import java.util.*;
public class BuySellStock {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int stock[]=new int[length];
		for(int i=0;i<stock.length;i++)
		{
			stock[i]=sc.nextInt();
		}
		int maxLoss = 0;
		int maxPriceSoFar = stock[0];
	    for (int i = 1; i < stock.length; i++) {
		        maxLoss = Math.max(maxLoss, maxPriceSoFar - stock[i]);
		        maxPriceSoFar = Math.max(maxPriceSoFar, stock[i]);
		    }
		System.out.println(maxLoss);
	}
}