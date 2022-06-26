
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class GameOfLifeTest {
    @Test
    public void block_Pattern() {
        assertEquals(new GameOfLife(Point.at(1, 1), Point.at(1, 2), Point.at(2, 1),Point.at(2, 2)), new GameOfLife(Point.at(1, 1), Point.at(1, 2), Point.at(2, 1),Point.at(2, 2)).next());
    }
    @Test
    public void boat_Pattern() {
        assertEquals(new GameOfLife(Point.at(0, 1),Point.at(1, 0), Point.at(2, 1), Point.at(0, 2),Point.at(1, 2)), new GameOfLife(Point.at(0, 1),Point.at(1, 0), Point.at(2, 1), Point.at(0, 2),Point.at(1, 2)).next());
    }
    @Test
    public void blinker_Pattern() {
        assertEquals(new GameOfLife(Point.at(1, 1),Point.at(1, 0), Point.at(1, 2)).next(), new GameOfLife(Point.at(1, 1), Point.at(0, 1), Point.at(2, 1)));
    }
    @Test
    public void toad_Pattern() {
        assertEquals(new GameOfLife(Point.at(1, 1),Point.at(1, 2), Point.at(1, 3), Point.at(2, 2),Point.at(2, 3),Point.at(2, 4)).next(), new GameOfLife(Point.at(0, 2),Point.at(1, 1), Point.at(1, 4), Point.at(2, 1),Point.at(2, 4),Point.at(3, 3)));
    }
}
