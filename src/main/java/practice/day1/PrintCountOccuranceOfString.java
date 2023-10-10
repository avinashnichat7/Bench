package practice.day1;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintCountOccuranceOfString {
    public static void main(String[] args) {
        String name="I live in India";
        String replace = name.replace(" ", "");
        String[] input = replace.split("");

        Map<String, Long> collect = Arrays.stream(input).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);
    }
}
