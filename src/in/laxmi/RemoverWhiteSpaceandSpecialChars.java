package in.laxmi;

public class RemoverWhiteSpaceandSpecialChars {
public static void main(String[] args) {
	 String str="Hello World of computer Programming";
	   System.out.println( str.replaceAll("\\s", ""));
	   String str2 = "M$oh%a@n";
	   System.out.println(str2.replaceAll("[^a-zA-Z0-9]",""));

}
}
