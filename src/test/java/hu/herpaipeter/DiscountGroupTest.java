package hu.herpaipeter;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class DiscountGroupTest {

    @Test
    void empty_group_costs_zero() {
        DiscountGroup discountGroup = new DiscountGroup();
        assertEquals(0, discountGroup.getTotal(List.of()));
    }

    @Test
    void one_group_size_one_costs_unit_price() {
        DiscountGroup discountGroup = new DiscountGroup();
        assertEquals(8, discountGroup.getTotal(List.of(1)));
    }

    @Test
    void one_group_size_two_has_5_percent_discount() {
        DiscountGroup discountGroup = new DiscountGroup();
        assertEquals(0.95 * 2 * 8, discountGroup.getTotal(List.of(2)));
    }
}
