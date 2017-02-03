package pl.hornunge.structural.adapter;

import pl.hornunge.structural.adapter.adapter.EnumIntComparatorClassAdapter;
import pl.hornunge.structural.adapter.adapter.EnumIntComparatorObjectAdapter;
import pl.hornunge.structural.adapter.adapter.IntComparatorClassAdapter;
import pl.hornunge.structural.adapter.adapter.IntComparatorObjectAdapter;
import pl.hornunge.structural.adapter.comparator.EnumIntComparator;
import pl.hornunge.structural.adapter.comparator.IntComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AdapterExample {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(new Integer[]{4,1,3,2,9,6,8,7,5});

        makeCopySortAndPrint(ints, new EnumIntComparatorClassAdapter());
        makeCopySortAndPrint(ints, new EnumIntComparatorObjectAdapter(new EnumIntComparator()));
        makeCopySortAndPrint(ints, new IntComparatorClassAdapter());
        makeCopySortAndPrint(ints, new IntComparatorObjectAdapter(new IntComparator()));
    }

    private static void makeCopySortAndPrint(List<Integer> ints, Comparator<Integer> comparator) {
        List<Integer> copyOfInts = new ArrayList<>(ints);
        copyOfInts.sort(comparator);
        System.out.println(copyOfInts);
    }
}
