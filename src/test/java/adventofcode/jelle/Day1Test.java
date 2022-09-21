package adventofcode.jelle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class Day1Test {
    @Test
    void testStar_one() {
        var d1 = new Day1();
        assertEquals(5, d1.star_one(List.of("R2, L3")));
        assertEquals(2, d1.star_one(List.of("R2, R2, R2")));
        assertEquals(12, d1.star_one(List.of("R5, L5, R5, R3")));
    }
}
