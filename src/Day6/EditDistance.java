package Day6;
import java.util.*;
public class EditDistance {
	public static int edit(String s1,String s2,int m, int n) {
		if(m==0) {
			return n;
		}
		else if(n==0) {
			return m;
		}
		else if (s1.charAt(m - 1) == s2.charAt(n - 1)) 
	            return edit(s1, s2, m - 1, n - 1);
		else {
			return 1 + Math.min(
			        Math.min(edit(s1, s2, m, n - 1),  
			                 edit(s1, s2, m - 1, n)),   
			        edit(s1, s2, m - 1, n - 1));
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int m=s1.length();
		int n=s2.length();
		System.out.print(edit(s1,s2,m,n));
	}
}