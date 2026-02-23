import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, String> func = str -> "Hello " + str;
        String ret = func.apply("World!!");
        System.out.println(ret);

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        // integerList.removeIf((Integer i) -> {return i % 2 != 0;});
        integerList.removeIf(i -> i % 2 != 0);
        System.out.println(integerList);
        
    }
}
