package co.edu.uptc.test;
import co.edu.uptc.models.AbstractCalculator;

public class RealCal <T>{
    
    public void run(AbstractCalculator<T> calculator, String title) {
        System.out.println("");
        System.out.println("----------"+ title+"-----");
    
        long startTime = System.nanoTime();
        calculator.calculate();
        T result = calculator.getResult();
    
        double endTime = System.nanoTime();
        double delayTime = endTime - startTime;
        
        System.out.println("Nano: "+delayTime);
        System.out.println("Mili: "+(delayTime/1_000_000));
        System.out.println("seg: "+(delayTime/1_000_000_000));
        System.out.println("result: "+result);

    }

}
