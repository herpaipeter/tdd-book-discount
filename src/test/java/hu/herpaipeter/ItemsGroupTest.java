package hu.herpaipeter;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class ItemsGroupTest {

    @Test
    void empty_list_generate_empty_groups() {
        ItemsGroup itemsGroup = new ItemsGroup();
        assertEquals(List.of(), itemsGroup.getGroupCombinations(List.of()));
    }

}
