package hu.herpaipeter;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class DifferentItemsGroupDiscountTest {

    @Test
    void empty_group_costs_zero() {
        DifferentItemsGroupDiscount groupDiscount = new DifferentItemsGroupDiscount();
        assertEquals(0, groupDiscount.getTotal(List.of()));
    }

    @Test
    void one_group_size_one_costs_unit_price() {
        DifferentItemsGroupDiscount groupDiscount = new DifferentItemsGroupDiscount();
        assertEquals(groupDiscount.getUnitPrice(), groupDiscount.getTotal(List.of(1)));
    }

    @Test
    void one_group_size_two_has_5_percent_discount() {
        DifferentItemsGroupDiscount groupDiscount = new DifferentItemsGroupDiscount();
        assertEquals(0.95 * 2 * groupDiscount.getUnitPrice(), groupDiscount.getTotal(List.of(2)));
    }

    @Test
    void one_group_size_3_has_10_percent_discount() {
        DifferentItemsGroupDiscount groupDiscount = new DifferentItemsGroupDiscount();
        assertEquals(0.90 * 3 * groupDiscount.getUnitPrice(), groupDiscount.getTotal(List.of(3)));
    }

    @Test
    void one_group_size_4_has_15_percent_discount() {
        DifferentItemsGroupDiscount groupDiscount = new DifferentItemsGroupDiscount();
        assertEquals(0.85 * 4 * groupDiscount.getUnitPrice(), groupDiscount.getTotal(List.of(4)));
    }

    @Test
    void one_group_size_5_has_20_percent_discount() {
        DifferentItemsGroupDiscount groupDiscount = new DifferentItemsGroupDiscount();
        assertEquals(0.80 * 5 * groupDiscount.getUnitPrice(), groupDiscount.getTotal(List.of(5)));
    }

    @Test
    void two_groups_size_one_get_no_discount() {
        DifferentItemsGroupDiscount groupDiscount = new DifferentItemsGroupDiscount();
        assertEquals(2 * groupDiscount.getUnitPrice(), groupDiscount.getTotal(List.of(1, 1)));
    }

    @Test
    void two_groups_size_different_discounts() {
        DifferentItemsGroupDiscount groupDiscount = new DifferentItemsGroupDiscount();
        assertEquals(0.95 * 2 * groupDiscount.getUnitPrice() +
                        0.90 * 3 * groupDiscount.getUnitPrice(),
                groupDiscount.getTotal(List.of(2, 3)));
    }
}
