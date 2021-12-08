import java.util.Scanner;
public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //Array size 
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number of element");
	    int i=sc.nextInt();
	    int inc=i+1;
	    int arr[]=new int[inc];
	    //User input in array
	    for(int a=0;a<inc;a++) {
	    	System.out.println("Enter element");
	    	int element=sc.nextInt();
	    	arr[a]=element;
	    	
	    }
	    int length_array=arr.length;
	    
	    float sum=0;
	    for(int len=0;len<arr.length;len++) {
	    	sum=sum+arr[len];
	    	
	    	
	    }
	    System.out.println("Length of array"+length_array);
	    System.out.println("Average"+sum/length_array);
	    
	    
	}
}
