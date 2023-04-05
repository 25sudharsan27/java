import java.util.Arrays;
import java.util.Scanner;

class practice{
    public static void main(String[] args)
    {
        int[] marks= new int[5];

        for(int i=0;i<=4;i++)
        {
            Scanner ne = new Scanner(System.in);
            System.out.println("Enter your value");
            int ma= ne.nextInt();
            marks[i]=ma;
        }
        for (int i=0;i<=4;i++)
        {
        System.out.println(marks[i]);
        }
        // System.out.println("Enter your values for marks: ");
        // for (int i=0;i<=5;i++)
        // {
        //     Scanner ne= new Scanner(System.in);

        //     int ma= ne.nextInt();
        //     marks[i]=ma;
        // }
        // for (int i=0;i<=5;i++)
        // {
        //     System.out.println(marks[i]);
        //     System.out.println("\n");
        // }
    }
}