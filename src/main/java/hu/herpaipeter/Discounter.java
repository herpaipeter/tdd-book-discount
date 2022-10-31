package hu.herpaipeter;

import java.util.List;

public class Discounter {

    private static final int UNIT_PRICE = 8;

    public int getUnitPrice() {
        return UNIT_PRICE;
    }
    public double getTotal(List<Integer> items) {
        double total = items.size() * UNIT_PRICE;
        if (1 < items.size() && isDifferent(items))
            total *= (1.0 - (items.size() - 1) * 0.05);
        return total;
    }

    public boolean isDifferent(List<Integer> items) {
        List<Integer> integers = items.stream().sorted().toList();
        for (int i = 0; i < integers.size() - 1; ++i)
            if (integers.get(i) == integers.get(i + 1))
                return false;
        return true;
    }

}
