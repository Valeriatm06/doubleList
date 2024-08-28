import co.edu.uptc.models.SumData;

public class App {
    public static void main(String[] args) throws Exception {
        SumData sm = new SumData();
        sm.addData(1000000);

        //ArrayList
        long startArray = System.nanoTime();
        int result = sm.sumDataArray();
        long endArray = System.nanoTime();
        System.out.println(result);
        System.out.println("Tiempo en nano: " + (endArray-startArray));
        System.out.println("Tiempo en seg: " + ((endArray-startArray)/1000000000));

        //Double List
        long startDouble = System.nanoTime();
        int resultDouble = sm.sumDataDouble();
        long endDouble = System.nanoTime();
        System.out.println(resultDouble);
        System.out.println("Tiempo en nano: " + (endDouble-startDouble));
        System.out.println("Tiempo en seg: " + ((endDouble-startDouble)/1000000000));


    }
}
