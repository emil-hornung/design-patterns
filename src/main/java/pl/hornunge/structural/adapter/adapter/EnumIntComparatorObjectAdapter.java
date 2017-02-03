package pl.hornunge.structural.adapter.adapter;

import com.google.common.base.Preconditions;
import pl.hornunge.structural.adapter.comparator.ComparisonResult;
import pl.hornunge.structural.adapter.comparator.EnumIntComparator;

import java.util.Comparator;

import static com.google.common.base.Preconditions.*;

public class EnumIntComparatorObjectAdapter implements Comparator<Integer> {

    private final EnumIntComparator adaptee;

    public EnumIntComparatorObjectAdapter(EnumIntComparator adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int compare(Integer int1, Integer int2) {
        checkNotNull(int1, "int1 mustn't be null.");
        checkNotNull(int2, "int2 mustn't be null.");

        ComparisonResult comparisonResult = adaptee.compare(int1, int2);
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
