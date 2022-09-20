package adventofcode.jelle;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class LineReaderTest {
    @Test
    public void testReadLinesForDay() {
        var lines = LineReader.readLinesForDay(0);
        assertTrue(lines.size()==2);
        assertTrue(lines.get(0).equals("A test file"));
        
    }
}
