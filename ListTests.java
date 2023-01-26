import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;


public class ListTests{
    @Test
    public void testFilter(){
        StringChecker sc = new StringChecker(){
            public boolean checkString(String s){
                if(s.contains("app")){
                    return true;
                }
                else{
                    return false;
                }
            } };
        List<String> input = new ArrayList<>();
        input.add("apple");
        input.add("apple");
        input.add("orange");
        input.add("pineapple");
        input.add("orange");
        List<String> filtered = ListExamples.filter(input, sc);
        assertArrayEquals(new String[]{"apple","apple", "pineapple"}, filtered.toArray());
    }

    @Test
    public void testMerge(){
        List<String> input1 = new ArrayList<>();
        input1.add("add");
        input1.add("bee");
        input1.add("cat");
        List<String> input2 = new ArrayList<>();
        input2.add("dog");
        input2.add("elk");
        input2.add("frog");
        List<String> result = ListExamples.merge(input1, input2);
        assertArrayEquals(new String[]{"add", "bee", "cat", "dog", "elk", "frog"}, result.toArray());
    }
}