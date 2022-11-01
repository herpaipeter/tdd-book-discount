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
        assertEquals(discounter.getUnitPrice(), discounter.getTotal(List.of(1)));
    }

    @Test
    void same_book_twice_no_discount() {
        Discounter discounter = new Discounter();
        assertEquals(2 * discounter.getUnitPrice(), discounter.getTotal(List.of(1, 1)));
    }

    @Test
    void two_different_books_5_percent_discount() {
        Discounter discounter = new Discounter();
        assertEquals(0.95 * 2 * discounter.getUnitPrice(),
                discounter.getTotal(List.of(1, 2)));
    }

    @Test
    void three_different_books_10_percent_discount() {
        Discounter discounter = new Discounter();
        assertEquals(0.90 * 3 * discounter.getUnitPrice(),
                discounter.getTotal(List.of(1, 2, 3)));
    }

    @Test
    void four_different_books_15_percent_discount() {
        Discounter discounter = new Discounter();
        assertEquals(0.85 * 4 * discounter.getUnitPrice(),
                discounter.getTotal(List.of(1, 2, 3, 4)));
    }

    @Test
    void five_different_books_20_percent_discount() {
        Discounter discounter = new Discounter();
        assertEquals(0.80 * 5 * discounter.getUnitPrice(),
                discounter.getTotal(List.of(1, 2, 3, 4, 5)));
    }

    @Test
    void three_books_two_same_5_percent_discount() {
        Discounter discounter = new Discounter();
        assertEquals(0.95 * 2 * discounter.getUnitPrice() + discounter.getUnitPrice(),
                discounter.getTotal(List.of(1, 1, 2)));
    }
}
