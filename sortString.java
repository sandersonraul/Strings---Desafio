import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;

public class SortStringBySize {
    public static void main(String[] args) throws IOException {
         Scanner input = new Scanner(System.in);
        int lines = Integer.parseInt(input.nextLine());
    
        List<String> wordslist = new ArrayList<>();
        
        for (int i = 0; i < lines; i++) {
            var words = input.nextLine();
            wordslist.addAll(Arrays.stream(words.split(" ")).collect(Collectors.toList()));
            var sortedlist = wordslist.stream()
                .sorted(Comparator.comparingInt(String::length).reversed()
                .thenComparing(String::compareTo)).collect(Collectors.joining(" "));
    
            System.out.println(sortedlist);
            wordslist.clear();
        }
    }
}