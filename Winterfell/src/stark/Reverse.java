package stark;

import org.testng.annotations.Test;

public class Reverse {

	@Test
	/*
	public void reverseString() {
		String str="Mother of dragons";
		
		String[] s=str.split(" ");
		
		//System.out.println(s[2].charAt(3));
		String rev= "";
		
		System.out.println(s.length);
		
		for (int i = s.length-1; i >=0; i--) {
			
			rev = rev+s[i];
			//System.out.println(rev);
		}
		System.out.println(rev);
	}
	*/
	
	public void rev()
	{
		String S = "Mother of Dragons";
		String revs = "";
		for(int i=S.length()-1; i>=0; i--)
		{
			revs = revs+S.charAt(i);
		}
		System.out.println(revs);
	}

}
