package Day4;
import java.util.*;
public class SucessiveElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<1) {
			System.out.println(0);
		}
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=0;
		Arrays.sort(arr);
		for(int i=0;i<n-1;i++)
		{
			int diff=arr[i+1]-arr[i];
			max=Math.max(max, diff);
		}
		System.out.println(max);
	}
}