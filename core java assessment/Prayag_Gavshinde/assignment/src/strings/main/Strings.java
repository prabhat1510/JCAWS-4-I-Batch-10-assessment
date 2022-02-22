/**
 * 
 */
package strings.main;
import java.lang.*;

/**
 * @author Lenovo
 *
 */
public class Strings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        String str = "prayag";
        char[] t = str.toCharArray();
        int i = 0,j = str.length()-1;
 
        while(i<j) {  
            char temp = t[i];
            t[i] = t[j];
            t[j] = temp;
            i++;
            j--;
        }
        
        str = String.valueOf(t);
        System.out.println(str);
	}

}
