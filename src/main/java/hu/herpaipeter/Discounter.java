package hu.herpaipeter;

import java.util.List;

public class Discounter {

    private static final int UNIT_PRICE = 8;

    public int getUnitPrice() {
        return UNIT_PRICE;
    }
    public double getTotal(List<Integer> items) {
        double total = items.size() * UNIT_PRICE;
        List<Integer> sorted = items.stream().sorted().toList();
        if (1 < sorted.size() && isDifferent(sorted))
            total *= (1.0 - (sorted.size() - (4 <= sorted.size() ? 0 : 1)) * 0.05);
        else if (sorted.size() == 3 &&
                sorted.get(0) == sorted.get(1) &&
                sorted.get(1) != sorted.get(2))
            total = 0.95 * 2 * UNIT_PRICE + UNIT_PRICE;
        return total;
    }

    public static boolean isDifferent(List<Integer> items) {
        List<Integer> integers = items.stream().sorted().toList();
        for (int i = 0; i < integers.size() - 1; ++i)
            if (integers.get(i) == integers.get(i + 1))
                return false;
        return true;
    }

}
