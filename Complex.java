class Complex
{
    public static void main(String[] s)
    {
        complex_add c1 = new complex_add(5,6);
        complex_add c2 = new complex_add(2,7);
        complex_add c3 = c1.add(c2);
        c3.show();
    
    }
}

class complex_add
{
    private int real,img;
    complex_add (int real, int img)
    {
        this.real = real;
        this.img = img;
    }
    void show ()
    {
        System.out.println(real + "i" + img);
    }
    complex_add add(complex_add c)
    {
        return new complex_add(real+c.real,img+c.img);

    }
}
