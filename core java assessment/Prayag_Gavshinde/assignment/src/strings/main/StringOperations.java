package strings.main;

public class StringOperations {
	public static void main(String[] args) {
		String hannah = "Did Hannah see bees? Hannah did.";
		System.out.println("--------Que 2---------");
		System.out.println("Length:" + hannah.length());
		System.out.println(hannah.charAt(12));
		System.out.println("b at index :"+ hannah.indexOf("b"));
		
		System.out.println("--------Que 3---------");
		String sr = "Was it a car or a cat I saw?";
		System.out.println(sr.substring(9,12));
		
		System.out.println("-------------------------");
		String hi = "Hi, ";
		String mom = "mom.";
		String hii = hi + mom;
		String hi2 = hi.concat(mom);
		System.out.println(hii);
		System.out.println(hi2);
	}
}
