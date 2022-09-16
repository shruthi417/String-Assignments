package stringassign;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Sai Shruthi";
		String str2 = "";
		int s = 0, e = 2, i;
		for(i = s; i <= e; i++)
		{
			str2 += String.valueOf(str1.charAt(i));
		}
		System.out.println("Substring is " + str2);
		
		
		
		

	}

}
