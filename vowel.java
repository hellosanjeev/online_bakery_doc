public class  vowel{
	  
     static void vowelinput(String inputs){ 
    for(int i=0;i<inputs.length();i++) {
   	// System.out.println(inputs.charAt(i));
   	 if(inputs.charAt(i)=='a'||inputs.charAt(i)=='e'||inputs.charAt(i)=='i'||inputs.charAt(i)=='o') {
   		System.out.println(" It\'s Vowel in sentence "+inputs.charAt(i)); 
   	 }else {
   		System.out.println("It\'s not  Vowel in sentence "+inputs.charAt(i));
   	 }
    }
    	 
   		 
		}
	public static void main(String [] args) { 
	     String sentence1="hello how are you";
	     String sentence2="are u ok";
	     String sentence3="bcdr kksjnkjb";
	    vowelinput(sentence1);
}
    }