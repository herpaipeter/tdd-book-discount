package hu.herpaipeter;

import java.util.List;

public class DifferentItemsGroupDiscount {

    public DifferentItemsGroupDiscount() {
    }

    public double getUnitPrice() {
        return 8;
    }

    public double getTotal(List<Integer> groupSizes) {
        double total = 0.0;
        for (int i = 0; i < groupSizes.size(); i++)
            total += (1.0 - (groupSizes.get(i) - (4 <= groupSizes.get(i) ? 0 : 1)) * 0.05) * groupSizes.get(i) * getUnitPrice();
        return total;
    }
}
