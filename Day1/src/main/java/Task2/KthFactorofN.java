package Task2;
import java.util.*;
public class KthFactorofN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int k=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=1;i<N;i++) {
			if(N%i==0) {
				al.add(N/i);
			}
		}
		al.add(1);
		Collections.reverse(al);
		if(al.size()<k)
		{
			System.out.println(1);
		}
		else {
			System.out.println(al.get(k));
		}
	}
}