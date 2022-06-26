
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class GameOfLifeTest {
    @Test
    public void block_Pattern() {
        assertEquals(new GameOfLife(GameOfLife.at(1, 1), GameOfLife.at(1, 2), GameOfLife.at(2, 1),GameOfLife.at(2, 2)), new GameOfLife(GameOfLife.at(1, 1), GameOfLife.at(1, 2), GameOfLife.at(2, 1),GameOfLife.at(2, 2)).next());
    }
    @Test
    public void boat_Pattern() {
        assertEquals(new GameOfLife(GameOfLife.at(0, 1),GameOfLife.at(1, 0), GameOfLife.at(2, 1), GameOfLife.at(0, 2),GameOfLife.at(1, 2)), new GameOfLife(GameOfLife.at(0, 1),GameOfLife.at(1, 0), GameOfLife.at(2, 1), GameOfLife.at(0, 2),GameOfLife.at(1, 2)).next());
    }
    @Test
    public void blinker_Pattern() {
        assertEquals(new GameOfLife(GameOfLife.at(1, 1), GameOfLife.at(1, 0), GameOfLife.at(1, 2)).next(), new GameOfLife(GameOfLife.at(1, 1), GameOfLife.at(0, 1), GameOfLife.at(2, 1)));
    }
    @Test
    public void toad_Pattern() {
        assertEquals(new GameOfLife(GameOfLife.at(1, 1),GameOfLife.at(1, 2), GameOfLife.at(1, 3), GameOfLife.at(2, 2),GameOfLife.at(2, 3),GameOfLife.at(2, 4)).next(), new GameOfLife(GameOfLife.at(0, 2),GameOfLife.at(1, 1), GameOfLife.at(1, 4), GameOfLife.at(2, 1),GameOfLife.at(2, 4),GameOfLife.at(3, 3)));
    }
}
