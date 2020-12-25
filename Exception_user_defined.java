class Lower_Exception extends Exception 
{
  
    String st;
    Lower_Exception(String s)
    {
        st=s;
    }
    public String toString()
    {
        //return (String.format("Expecting a word starting with upper case : '%s' doesn't start with an Uppercase ", st));
        return ("Expecting a word starting with upper case : " + st +" doesn't start with an Uppercase " );
    }
}


public class Exception_user_defined 
{
    public static void main(String[] args)
    {
        
            for (String s: args) 
            {
                try
                {
                    if (Character.isLowerCase(s.charAt(0)))
                    {
                        throw new Lower_Exception(s);
                    }
                    System.out.println(s);
                }
                catch (Lower_Exception exp) 
                {
                    System.out.println(exp);
                }
        }
        
    }
}
