package in.laxmi;


public class ToggleString {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("NagaLAKSHMI");
		
		for(int i=0; i<sb.length();i++) {
			char ch = sb.charAt(i);
			if(ch>='a' && ch<='z') {
				char uch = (char)('A'+ ch-'a');
				sb.setCharAt(i, uch);
			}else {
				char lch = (char)('a'+ ch-'A');
				sb.setCharAt(i, lch);
			}
		}
		System.out.println(sb);
		/*String s = "nnsSBD";
		char ch[] = s.toCharArray();
		for(int i = 0;i<=ch.length-1;i++) {
			
			if(Character.isLetter(s.charAt(i))) {
				System.out.println(Character.toUpperCase(s.charAt(i)));
			}
		}*/
	}

	
	
}
