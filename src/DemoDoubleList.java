import java.util.List;

import co.edu.uptc.models.DoubleList;

public class DemoDoubleList {
    
    private List<Integer> list;

    public void testDoubleList(List<Integer> randomNumbers){
       loadDataDoubleList(randomNumbers);
       sumDataDoubleList(); 
    }

    private void loadDataDoubleList(List<Integer> randomNumbers) {
        list = new DoubleList<Integer>();
        for (int i = 0; i < randomNumbers.size(); i++) {
            list.add(randomNumbers.get(i));
            //ITERATOR
        // for (int integer : randomNumbers) {  
        //     list.add(integer);
        }
    }

    private void sumDataDoubleList() {
        int result = 0;
        System.out.println("");
        System.out.println("-------Double List-------");
        double start = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
        }
        double end = System.nanoTime();
        double time = end - start;
        System.out.println("Nano: " + time);
        System.out.println("Mili: " + (time/1000000));
        System.out.println("Seg: " + (time/1000000000));
        System.out.println("Resultado: " + result);
    }

}
