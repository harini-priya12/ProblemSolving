package Day6;
import java.util.*;
public class LongestCommonPrefix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str[]=new String[n];
		for(int i=0;i<n;i++) {
			str[i]=sc.next();
		}
		int i=0;
		Arrays.sort(str);
		String s1=str[0];
		String s2=str[str.length-1];
		String ans="default";
		while(i<s1.length()&& i<s2.length()) {
			if(s1.charAt(i)==s2.charAt(i)) {
				ans+=s1.charAt(i);
				i++;
			}
			else {
				break;
			}
		}
		System.out.print(ans);
	}
}