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
        DifferentItemsGroupDiscount differentItemsGroupDiscount = new DifferentItemsGroupDiscount();
        assertEquals(0, differentItemsGroupDiscount.getTotal(List.of()));
    }

    @Test
    void one_group_size_one_costs_unit_price() {
        DifferentItemsGroupDiscount differentItemsGroupDiscount = new DifferentItemsGroupDiscount();
        assertEquals(8, differentItemsGroupDiscount.getTotal(List.of(1)));
    }

    @Test
    void one_group_size_two_has_5_percent_discount() {
        DifferentItemsGroupDiscount differentItemsGroupDiscount = new DifferentItemsGroupDiscount();
        assertEquals(0.95 * 2 * 8, differentItemsGroupDiscount.getTotal(List.of(2)));
    }
}
