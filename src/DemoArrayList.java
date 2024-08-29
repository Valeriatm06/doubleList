import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {

    private List<Integer> list;

    public void testArrayList(List<Integer> randomNumbers){
       loadDataArrayList(randomNumbers);
       sumDataArrayList(); 
    }

    private void loadDataArrayList(List<Integer> randomNumbers) {
        list = new ArrayList<Integer>();
        for (int i = randomNumbers.size()-1; i >= 0; i--) {
            list.add(randomNumbers.get(i));
        }
    }

    private void sumDataArrayList() {
        int result = 0;
        System.out.println("");
        System.out.println("-------Array List-------");
        double start = System.nanoTime();
        for (int i = list.size()-1; i >= 0; i--) {
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