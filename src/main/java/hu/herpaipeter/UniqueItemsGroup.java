package hu.herpaipeter;

import java.util.List;

public class UniqueItemsGroup {
    public List<List<List<Integer>>> getGroupCombinations(List<Integer> items) {
        if (1 == items.size())
            return List.of(List.of(items));
        return List.of();
    }
}
