package hu.herpaipeter;

import java.util.ArrayList;
import java.util.List;

public class UniqueItemsGroup {
    public List<List<List<Integer>>> getGroupCombinations(List<Integer> items) {
        List result = new ArrayList<>();
        if (1 <= items.size()) {
            if (Discounter.isDifferent(items))
                result.add(List.of(items));
            else {
                List groups = new ArrayList();
                for (int i = 0; i < items.size(); i++)
                    groups.add(List.of(items.get(i)));
                result.add(groups);
            }
        }
        return result;
    }
}
