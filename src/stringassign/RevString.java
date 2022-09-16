package stringassign;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String name = "Shruthi", rev = "";
		System.out.println("Original string is " + name);
		for(i = name.length() - 1; i >= 0; i--)
			
		{
			rev = rev + name.charAt(i);
		}
		System.out.println("Reverse of a string is " + rev);

	}

}
