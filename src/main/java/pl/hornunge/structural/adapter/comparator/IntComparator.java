package pl.hornunge.structural.adapter.comparator;

public class IntComparator {
    public boolean firstIsGreaterThanSecond(int first, int second){
        return first > second;
    }

    public boolean firsIsLessThanSecond(int first, int second){
        return first < second;
    }

    public boolean bothAreEqual(int first, int second){
        return first == second;
    }
}
