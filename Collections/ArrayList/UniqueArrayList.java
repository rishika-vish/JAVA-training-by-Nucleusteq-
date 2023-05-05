package ArrayList;
import java.util.ArrayList;
//import java.util.HashSet;
import java.util.List;
//import java.util.Set;

public class UniqueArrayList<T> {

    private List<T> list;
    
    public UniqueArrayList() {
        this.list = new ArrayList<T>();
    }
    
    public boolean add(T element) {
        if (list.contains(element)) {
            return false;
        }
        list.add(element);
        return true;
    }
    
    public List<T> getList() {
        return list;
    }
    
    public static void main(String[] args) {
        UniqueArrayList<Integer> uniqueList = new UniqueArrayList<Integer>();
        uniqueList.add(1);
        uniqueList.add(2);
        uniqueList.add(1);
        uniqueList.add(2);
        uniqueList.add(1);
        uniqueList.add(2);
        uniqueList.add(1);
        uniqueList.add(2);
        uniqueList.add(1);
        
        System.out.println(uniqueList.getList()); // Output: [1, 2]
    }

}

