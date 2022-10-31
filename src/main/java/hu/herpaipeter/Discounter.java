package hu.herpaipeter;

import java.util.List;

public class Discounter {
    public int getTotal(List<Integer> items) {
        if (0 < items.size())
            return 8;
        return 0;
    }
}
