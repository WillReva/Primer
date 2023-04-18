import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args){
        System.out.println("hello world");
        String words="this is a word this is also a word";

        String[] arr= words.split(" ");

        Map<String, Long> mp = Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(mp);



    }
}
