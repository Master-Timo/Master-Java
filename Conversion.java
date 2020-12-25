import java.io.*;

abstract class Convert
{
    protected double  val;
    abstract double convert();
}

class Temperature extends Convert
{
    Temperature(double val)
    {
        this.val =val;
    } 
    double convert()
    {
        return ((9 *val/5.0)+32);
    }
}
class Distance extends Convert
{
    Distance(double val)
    {
        this.val = val;
    }

    double convert() {
        return (12 * val );
    }

}
class Conversion
{
    public static void main (String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Temperature in Celcius: ");
        double celcius = Double.parseDouble(br.readLine());

        System.out.print("Enter Distance in feet: ");
        double feet = Double.parseDouble(br.readLine());

        Convert obj ;

        obj = new Temperature (celcius);
        System.out.println("Temperature in Farenheit is : " + obj.convert() );
        obj = new Distance(feet);
        System.out.println("Distance in inches is : " + obj.convert());

    }

}
