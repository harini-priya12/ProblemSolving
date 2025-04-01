package Day9;
import java.util.*;
public class maximumSubarraySum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0,max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			max=Math.max(max, sum);
			if(sum<0) {
				sum=0;
			}
		}
		System.out.println(max);
		sc.close();
	}
}