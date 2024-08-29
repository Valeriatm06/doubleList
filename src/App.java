import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
         List<Integer> randomNumber = generateRandomNumer(10000, 1, 10000);

          DemoArrayList ar = new DemoArrayList();
          ar.testArrayList(randomNumber);

          DemoDoubleList sl = new DemoDoubleList();
          sl.testDoubleList(randomNumber);;

    }

    public static List<Integer> generateRandomNumer(int size, int min, int max){
          List<Integer> list =  new ArrayList<Integer>();
          for (int i = 0; i < size; i++) {
               int randomNumber = ((int)(Math.random() * (max - min + 1))+min);
               list.add(randomNumber);
          }
          return list;
    }
}
