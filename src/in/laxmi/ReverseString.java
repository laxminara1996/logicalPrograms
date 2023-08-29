package in.laxmi;

public class ReverseString {
public static void main(String[] args) {
	String s = "nagalakshmi";
	StringBuilder sb = new StringBuilder();
	for(int i=s.length()-1;i>=0;i--) {
	 	System.out.println(s.charAt(i));
	 	sb.append(s.charAt(i));
	}
	System.out.println(sb);
}
}
