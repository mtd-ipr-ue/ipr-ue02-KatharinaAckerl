import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        Out.println("Hello, World!");

        Out.println("Enter a x-cordinate");
        double x = In.readDouble();

        Out.println("Enter a y-cordinate");
        double y = In.readDouble();

        double radius = 4;
        double centerx = 0;
        double centery = 0;
        double Circle = (Math.PI * radius * radius)/4;

        if ((x <= 4 && x >= 0) && (y <= 4 && y >= 0)) {
            if (x*y > Circle) {
                Out.println("The cordinates are inside the green area");
                }
            else {
                Out.println("The cordinates are not inside the green area");
            }
        } 
        else {
            Out.println("The cordinates are not inside the green area");
        }
    }
}
