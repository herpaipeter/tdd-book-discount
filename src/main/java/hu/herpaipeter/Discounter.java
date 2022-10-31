package hu.herpaipeter;

import java.util.List;

public class Discounter {

    private static final int UNIT_PRICE = 8;

    public int getUnitPrice() {
        return UNIT_PRICE;
    }
    public double getTotal(List<Integer> items) {
        double total = items.size() * UNIT_PRICE;
        if (items.size() == 2 && items.get(0) != items.get(1))
            total *= 0.95;
        if (items.size() == 3 && items.get(0) != items.get(1) &&
            items.get(0) != items.get(2) && items.get(1) != items.get(2))
            total *= 0.90;
        return total;
    }

}
