package chapter16;

import java.util.*;

public class DuplicateElimination {

    public static void main(String[] args) {
        String[] names = {"red", "white", "blue", "green", "gray", "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
        List<String> list = Arrays.asList(names);
        System.out.printf("List: %s%n", list);
        printNonDuplicates(list);
    }

    private static void printNonDuplicates( Collection<String> values ){
        Set<String> set = new HashSet<>(values);
        System.out.printf("%nNonDuplicates are: ");
        for (String value : set)
            System.out.printf("%s ", value);
        System.out.println();
    }
}
