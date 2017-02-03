package pl.hornunge.structural.adapter.comparator;

public class EnumIntComparator {
    public ComparisonResult compare(int x, int y){
        if (x < y){
            return ComparisonResult.LESS_THAN;
        }
        if (x > y){
            return ComparisonResult.GREATER_THAN;
        }
        if (x == y){
            return  ComparisonResult.EQUAL;
        }
        throw new IllegalStateException("x is neither less nor greater then nor equal to y!");
    }
}
