package hw3;

import java.util.Objects;

public class MultiplicationTable {
    private final int first;
    private final int second;

    public MultiplicationTable(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }
    public int getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MultiplicationTable that = (MultiplicationTable) o;
        return first == that.first && second == that.second && first == that.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    @Override
    public String toString() {
        return  first +
                " * " + second +
                " = ";
    }
}
