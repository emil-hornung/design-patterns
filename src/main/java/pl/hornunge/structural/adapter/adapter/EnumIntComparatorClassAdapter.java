package pl.hornunge.structural.adapter.adapter;

import pl.hornunge.structural.adapter.comparator.ComparisonResult;
import pl.hornunge.structural.adapter.comparator.EnumIntComparator;

import java.util.Comparator;

public class EnumIntComparatorClassAdapter extends EnumIntComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        ComparisonResult comparisonResult = super.compare(o1, o2);
        switch (comparisonResult) {
            case LESS_THAN:
                return -1;
            case GREATER_THAN:
                return 1;
            case EQUAL:
                return 0;
            default:
                throw new IllegalStateException(comparisonResult + " is not supported ComparisonResult!");
        }
    }
}
