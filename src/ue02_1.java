import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
        Out.println("Hello, World!");

        Out.println("Enter first number");
        int FirstNumber = In.readInt();

        Out.println("Enter second number");
        int SceondNumber = In.readInt();

        Out.println("Enter third number");
        int ThirdNumber = In.readInt();

        int max = 0;

        if (FirstNumber >= SceondNumber && FirstNumber >= ThirdNumber) {
            max = FirstNumber;
          }
           
          else if (SceondNumber >= FirstNumber && SceondNumber >= ThirdNumber) {
            max = SceondNumber;
          }

           else if (ThirdNumber >= FirstNumber && ThirdNumber >= SceondNumber) {
            max = ThirdNumber;
           }
            
           Out.println("Maximun");
           Out.print (max);
        }
    }
