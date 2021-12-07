import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        String string1= myObj.nextLine();
        
         Scanner obj2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        String string2= obj2.nextLine();  
        if(string1.equals(string2)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
	    
	    
}
}