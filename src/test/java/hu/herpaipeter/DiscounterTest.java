package hu.herpaipeter;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class DiscounterTest {

    @Test
    void empty_book_list_cost_zero() {
        Discounter discounter = new Discounter();
        assertEquals(0, discounter.getTotal(List.of()));
    }

    @Test
    void one_book_no_discount() {
        Discounter discounter = new Discounter();
        assertEquals(8, discounter.getTotal(List.of(1)));
    }

    @Test
    void same_book_twice_no_discount() {
        Discounter discounter = new Discounter();
        assertEquals(16, discounter.getTotal(List.of(1, 1)));
    }
}
