package Day2;
import java.util.*;
public class Homeless {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int people[]=new int[n];
		int house[]=new int[n];
		for(int i=0;i<n;i++) {
			people[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			house[i]=sc.nextInt();
		}
		int i=0,j=0,assigned=0;
		while(i<n && j<n) {
			if(people[i]<=house[j]) {
				assigned++;
				i++;
				j++;
			}
			else {
				j++;
			}
		}
		System.out.println(n-assigned);
	}
}
