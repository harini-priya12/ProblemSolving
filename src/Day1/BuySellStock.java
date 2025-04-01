package Day1;
import java.util.*;
public class BuySellStock {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int stock[]=new int[length];
		for(int i=0;i<length;i++)
		{
			stock[i]=sc.nextInt();
		}
		int maxloss=0;
		int maxasnow=stock[0];
		for(int i=1;i<length;i++) {
			maxloss=Math.max(maxloss, maxasnow-stock[i]);
			maxasnow=Math.max(maxasnow, stock[i]);
		}
		System.out.print(maxloss);
		sc.close();
	}
}