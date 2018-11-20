import java.util.Scanner;

public class Calc_Area{
    public static void main(String[] args) {
        
        // This Line Always Should be written, when you want to read input variables
        Scanner input = new Scanner(System.in);

        // Variables Creation
        int Length = 0;
        int Width = 0;
        float Area = 0;

        //Here we read int from screen 
        System.out.print("Enter Length: ");
        Length = input.nextInt();

        //Here we read int from screen
        System.out.print("Enter Width: ");
        Width = input.nextInt();

        //Here we make calculations
        Area = Length * Width;

        System.out.println("The Area of Rectangular is: "+ Area);

    }
}
