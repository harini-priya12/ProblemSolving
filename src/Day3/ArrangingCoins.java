package Day3;
import java.util.*;
public class ArrangingCoins {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long rows=0;
		if(n==1) {
			System.out.println(1);
		}
		else {
			for(int i=1;i<=n;i++) {
				rows+=i;
				if(rows>n) {
					System.out.println(i-1);
					break;
				}
				else if(rows==n) {
					System.out.println(i);
				}
			}
		}
	}
}