import java.io.*;
class Single_letter extends Exception 
{
    String st;
    
    Single_letter(String s)
    {
        st=s;
    }
    public String toString()
    {
        return (String.format("Reversing a single lettered word : '%s' has no effect ", st));
        //return ("Expecting a word starting with upper case : " + st +" doesn't start with an Uppercase " );
    }
}


class Exception_user_defined_V02
{ 
    private static String sentnc;

    Exception_user_defined_V02()
    {
        sentnc = "";
    }

    void input() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence ");
        sentnc = br.readLine();
    }

    String reverse(String s)
    {
        int i;
        String nstr ="";
        for (i=s.length()-1;i>=0;i--)
            nstr += s.charAt(i);
        return nstr;
    }
    public static void main(String[] args) throws IOException 
    {
        String  rev, rev_str = "";
        Exception_user_defined_V02 ob = new Exception_user_defined_V02();
        ob.input();

            for (String s: sentnc.split(" ")) 
            {
                try
                {
                    if (s.length() == 1)
                    {
                        throw new Single_letter(s);
                    }
                    rev =  ob.reverse(s);
                    System.out.println(rev);
                    rev_str = rev_str +" " + rev;
                    
                }
                catch (Single_letter exp) 
                {
                    System.out.println(exp);
                }
            
        }
        System.out.println("Final output : " + rev_str);
    }
}
