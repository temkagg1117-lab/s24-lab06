package edu.cmu.cs.cs214.rec04;

public class DelegationSortedIntList implements IntegerList {

    private SortedIntList list = new SortedIntList();
    private int totalAdded = 0;

    @Override
    public boolean add(int value) {
        totalAdded++;
        return list.add(value);
    }

    @Override
    public boolean addAll(IntegerList other) {
        totalAdded += other.size();
        return list.addAll(other);
    }

    @Override
    public boolean remove(int index) {
        return list.remove(index);
    }

    @Override
    public boolean removeAll(IntegerList other) {
        return list.removeAll(other);
    }

    @Override
    public int get(int index) {
        return list.get(index);
    }

    @Override
    public int size() {
        return list.size();
    }

    public int getTotalAdded() {
        return totalAdded;
    }
}