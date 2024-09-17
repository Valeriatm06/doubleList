package co.edu.uptc.test;
import java.util.ArrayList;
import java.util.List;
import co.edu.uptc.models.DoubleList;

public class Test {
    
    private List<Integer> list;

    public void testArrayList(List<Integer> randomNumbers){
       loadDataArrayList(randomNumbers); 
    }

    public void testDoubleList(List<Integer> randomNumbers){
        loadDataDoubleList(randomNumbers); 
     }

    private void loadDataArrayList(List<Integer> randomNumbers) {
        list = new ArrayList<Integer>();
        for (int i = 0; i < randomNumbers.size(); i++) {
            list.add(randomNumbers.get(i));
        }
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

    public List<Integer> getList() {
        return list;
    }

     

}
