import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator myApp = new Calculator();
        Scanner scanner = new Scanner(System.in);
        
        //Method 1

        int operand1 = scanner.nextInt();
        int operand2 = scanner.nextInt();

        myApp.DoAddition(operand1, operand2, 
            (operandX, operandY) -> 
                    operandX + operandY
            );
        
        //Method 2

        myApp.DoMultiplication(scanner.nextInt(), scanner.nextInt(), 
            (operandA, operandB) -> 
                operandA * operandB    
            );

        myApp.DoSubtraction(operand1, operand2, 
            (a, b) -> a-b 
            );

        //Method 3

        myApp.DoDivision(scanner.nextInt(), scanner.nextInt(), 
            (x,y) -> {
                return x / y;
            }
        );

        scanner.close();
    }
}