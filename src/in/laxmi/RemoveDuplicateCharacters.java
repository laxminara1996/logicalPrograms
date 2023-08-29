package in.laxmi;

public class RemoveDuplicateCharacters {
public static void main(String[] args) {
	String s = "nagalakshmi";
	
	StringBuilder sb = new StringBuilder();
	s.chars().distinct().forEach(c->sb.append((char)c));
	System.out.println(sb);
	
	StringBuilder sb2 = new StringBuilder();
	for(int i=0;i<s.length();i++) {
		char ch = s.charAt(i);
		int index= s.indexOf(ch,i+1);
		if(index == -1) {
			sb2.append(ch);
		}
	}
	System.out.println(sb2);
}
}
