import java.util.Scanner;

public class Calc_Area{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int Length = 0;
        int Width = 0;
        float Area = 0;

        System.out.print("Enter Length: ");
        Length = input.nextInt();

        System.out.print("Enter Width: ");
        Width = input.nextInt();

        Area = Length * Width;

        System.out.println("The Area of Rectangular is: "+ Area);

    }
}
