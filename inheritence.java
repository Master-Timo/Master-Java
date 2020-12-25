/*1 super class
1subclass that will find out all prime factors 
1 subclass that will find all prime Numbers */

class Number
{
    int num;
    
    Number (int a)
    {
        this.num = a;
    }  
}
class Prime extends Number
{
    Prime (int a)
    {
        super(a);
    }
    void prime_check() 
    {
        int i,c=0;
        for (i = 2; i < this.num / 2; i++) 
        {
            if (this.num % i == 0)
            {
                c++;
            }
        }
    }
}
class Factors extends Prime 
{
    Factors (int a )
    {
        super(a);
    }
    void fnfact(int num)
    {

    }
}
class Inheritence
{
    public static void main(String [] num)
    {
        Factors ob = new Factors(30);
        

    }
}
