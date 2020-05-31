import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Range implements Iterable<Long> {

    private long fromInclusive;
    private long toExclusive;

    public Range(long from, long to) {
        this.fromInclusive = from;
        this.toExclusive = to;
    }

    @Override
    public Iterator<Long> iterator() {
        // write your code here
        List<Long> nums = new ArrayList<>();
        long from = fromInclusive;
        long to = toExclusive;
        while (from < to) {
            nums.add(from);
            from++;
        }
        return nums.iterator();
    }
}