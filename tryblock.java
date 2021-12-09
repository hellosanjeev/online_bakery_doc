public class tryblock{
    public static void main(String args[]){
        try{
            System.out.println("Inside try block");
            int i=30/0;
            System.out.println("Data");
        }catch(NullPointerException e){
            System.out.println(e);

        }finally{
            System.out.println("Final block is always execute");
        }
        System.out.println("Rest of code always execute");
    }
}