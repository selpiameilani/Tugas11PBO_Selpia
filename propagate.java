/**
 *
 * @author DELL
 */
public class propagate {
    
    public static void main(String[] args) 
    {
    try
    {
        System.out.println("This is a string");
    }
    catch (Exception e)
    {
        System.out.println("The String was blank");
    }
    finally
    {
        System.out.println("All done");
    }
}
    
    public static String reverse(String s) throws Exception 
    {
        if(s.length()==0)
        {
            throw new Exception ();
        }
        String reverseStr = "";
        for (int i=s.length ()-1 ; i>=0 ; --i){
            reverseStr.charAt(i);
        }
        return reverseStr;
    }
    }