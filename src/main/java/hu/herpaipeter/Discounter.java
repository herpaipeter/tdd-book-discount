package hu.herpaipeter;

import java.util.List;

public class Discounter {

    private static final int UNIT_PRICE = 8;

    public int getTotal(List<Integer> items) {
        return items.size() * UNIT_PRICE;
    }
}
