package hu.herpaipeter;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class UniqueItemsGroupTest {

    @Test
    void empty_list_generate_empty_groups() {
        UniqueItemsGroup uniqueItemsGroup = new UniqueItemsGroup();
        assertEquals(List.of(), uniqueItemsGroup.getGroupCombinations(List.of()));
    }

    @Test
    void one_element_generate_one_list() {
        UniqueItemsGroup uniqueItemsGroup = new UniqueItemsGroup();
        assertEquals(List.of(List.of(List.of(1))), uniqueItemsGroup.getGroupCombinations(List.of(1)));
    }

    @Test
    void different_elements_generate_one_list() {
        UniqueItemsGroup uniqueItemsGroup = new UniqueItemsGroup();
        assertEquals(List.of(List.of(List.of(1, 2, 3, 4))), uniqueItemsGroup.getGroupCombinations(List.of(1, 2, 3, 4)));
    }

}
