package co.edu.uptc.models;

import java.util.List;

public class IntegerCalculator<T> extends AbstractCalculator<Integer> {

    private Operation operation;

    public IntegerCalculator(List<Integer> list, Operation operation) {
        super(list, 0);
        this.operation = operation;
    }

    @Override
    protected Integer operate(Integer a, Integer b) {
        Integer result;
        switch (operation) {
            case SUM:
                result = a + b;
                break;
            case SUBSTRACTION:
                result = a - b;
                break;
            case MULTIPLICATION:
                result = a * b;
                break;
            case DIVISION:
                if (b == 0) throw new ArithmeticException("Cannot divide by zero");
                result = a / b;
                break;
            default:
                throw new UnsupportedOperationException("No se encuentra esa operación");
        }
        return result;
    }

    public void resetResult(){
        result = 0;
    }
    
}
