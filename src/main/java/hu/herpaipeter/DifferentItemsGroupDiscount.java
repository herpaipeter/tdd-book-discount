package hu.herpaipeter;

import java.util.List;

public class DifferentItemsGroupDiscount {

    public DifferentItemsGroupDiscount() {
    }

    public double getUnitPrice() {
        return 8;
    }

    public double getTotal(List<Integer> groupSizes) {
        if (1 == groupSizes.size() && groupSizes.get(0) == 1)
            return getUnitPrice();
        else if (1 == groupSizes.size() && groupSizes.get(0) == 2)
            return 0.95 * 2 * getUnitPrice();
        return 0;
    }
}
