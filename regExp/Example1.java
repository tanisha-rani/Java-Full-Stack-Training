package regExp;

public class Example1 {
	public static void main(String[] args) {
		String s1="abc123";
		for( int i=0; i<s1.length(); i++) {
			char c= s1.charAt(i);
			if(c>='0' && c<='9') {
				continue;
			}else {
				System.out.println("Not numeric String");
				break;
			}
		}
	}
}
