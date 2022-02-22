/**
 * 
 */
package strings.main;
import java.util.Scanner;
/**
 * @author Lenovo
 *
 */
public class Stringassignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String name=new String();
		name=sc.nextLine();
		boolean num=false ;
		boolean ch=false;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)>='0' && name.charAt(i)<='9')
			{
				num=true;
			}
			if(name.charAt(i)>='a' && name.charAt(i)<='z' )
			{
				ch=true;
			}
			
		}
		
		if(num && ch)	
		{
			System.out.println("It contains string as well as numbers");
		}
		else
		{
			if(num && !ch)
				System.out.println("It contains only numbers");
			if(!num && ch)
				System.out.println("It contains only string");
		}

}
}
