public class Calculator {

    public interface DoIntegerOperation {
        int doOperation(int operand1, int operand2);
    }

    public void DoAddition(int operand1, int operand2, DoIntegerOperation operation){
        System.out.println(operand1+" + "+operand2+" = "+operation.doOperation(operand1, operand2));
    }
    
    public void DoSubtraction(int operand1, int operand2, DoIntegerOperation operation){
        System.out.println(operand1+" - "+operand2+" = "+operation.doOperation(operand1, operand2));
    }

    public void DoMultiplication(int operand1, int operand2, DoIntegerOperation operation){
        System.out.println(operand1+" * "+operand2+" = "+operation.doOperation(operand1, operand2));
    }

    public void DoDivision(int operand1, int operand2, DoIntegerOperation operation){
        System.out.println(operand1+" / "+operand2+" = "+operation.doOperation(operand1, operand2));
    }
}