package hu.herpaipeter;

import java.util.List;

public class DifferentItemsGroupDiscount {

    public DifferentItemsGroupDiscount() {
    }

    public double getUnitPrice() {
        return 8;
    }

    public double getTotal(List<Integer> groupSizes) {
        if (1 == groupSizes.size())
            return (1.0 - (groupSizes.get(0) - 1) * 0.05) * groupSizes.get(0) * getUnitPrice();
        return 0;
    }
}
