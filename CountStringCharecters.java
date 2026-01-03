package countStringCharecter;

public class CountStringCharecters {
	public static void main(String[]args) {
		String str = "yuvaraju";
		int count = 0;
		char ch ='a';
		for(int i = 0;i<str.length();i++) {
			if(ch == str.charAt(i)) {
				count++;
			}
		}
		System.out.print(count);
		
	  }

   }
