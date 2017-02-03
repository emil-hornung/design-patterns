package pl.hornunge.structural.adapter.adapter;

import pl.hornunge.structural.adapter.comparator.IntComparator;

import java.util.Comparator;

import static com.google.common.base.Preconditions.checkNotNull;

public class IntComparatorClassAdapter extends IntComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer int1, Integer int2) {
        checkNotNull(int1, "int1 mustn't be null.");
        checkNotNull(int2, "int2 mustn't be null.");

        if (firsIsLessThanSecond(int1, int2)){
            return -1;
        }
        if (firstIsGreaterThanSecond(int1, int2)){
            return 1;
        }
        if (bothAreEqual(int1,int2)){
            return 0;
        }

        throw new IllegalStateException(String.format("Can't compare %d and %d", int1, int2));

    }
}
