import java.io.*;

class Arrange
{
    void sort(int a[],int len)
    {
        int i,j,temp;
        for (i = 0; i<len; i++)
        {
            for (j=0; j<len-1; j++)
            {
                if (a[j]>a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp; 
                }
            }
        }
        System.out.println("Sorted Elements: ");
        for (i = 0; i < len; i++) 
        {
            System.out.print(a[i]+" ");
        }
    }
}

class Array_arrange
{
    public static void main(String [] args) throws IOException
    {
        Arrange ob = new Arrange();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i,n,ar[];
        System.out.println("Enter the number of elements to be entered: ");
        
        n = Integer.parseInt(br.readLine());
        ar = new int[n];
        System.out.println("Enter the elements in the array: ");
        for(i = 0 ; i < n; i++)
        {
            ar[i]= Integer.parseInt(br.readLine());
        }
        ob.sort(ar,n);


    }
}
