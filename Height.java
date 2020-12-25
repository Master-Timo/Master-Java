class Height 
{
    public static void main(String[] s) 
    {
        Height_add c1 = new Height_add(5, 116);
        Height_add c2 = new Height_add(2, 117);
        Height_add c3 = c1.add(c2);
        c3.show();

    }
}

class Height_add 
{
    private int m, cm;

    Height_add(int m, int cm) 
    {
        this.m = m;
        this.cm = cm;
    }

    void show() 
    {
        System.out.println(m + " meters " + cm + " centimeters"); 
    }

    Height_add add(Height_add h) 
    {
        int cms = cm + h.cm;
        int ms = m + h.m;
        if (cms > 100)
        {   cms = cms%100;
            ms = m + ((int)((double)cms/100));
        }
        return new Height_add(ms, cms);

    }
}
