package co.edu.uptc.models;

import java.util.List;

public abstract class AbstractCalculator <T>{

    private List<T> list = null;
    protected T result;

    public AbstractCalculator(List<T> list, T initialValue){
        this.list = list;
        this.result = initialValue;
    }

    protected abstract T operate(T a, T b);

    public void calculate(){
        for (int i = 0; i < list.size(); i++) {
            result = operate(result, list.get(i));
        }

    }

    public T getResult() {
        return result;
    }
    
}
