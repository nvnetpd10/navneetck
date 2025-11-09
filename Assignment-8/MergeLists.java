import java.util.*;

public class MergeLists {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,3,5));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(2,4,6));
        ArrayList<Integer> c = new ArrayList<>();
        int i=0,j=0;
        while(i<a.size() && j<b.size()){
            if(a.get(i)<b.get(j)) c.add(a.get(i++));
            else c.add(b.get(j++));
        }
        while(i<a.size()) c.add(a.get(i++));
        while(j<b.size()) c.add(b.get(j++));
        System.out.println(c);
    }
}
