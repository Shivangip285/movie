import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class GameOfLife {
    private final Set<Point> aliveCell;
    public static Point at(int x, int y) {
        return new Point(x, y);
    }

    private GameOfLife(Set<Point> points) {
        aliveCell = points;
    }

        public GameOfLife(Point... points) {
            aliveCell = new HashSet<>(Arrays.asList(points));
        }

    public GameOfLife next() {
        Set<Point> aliveInNext = new HashSet<>();
        for (Point cell : aliveCell) {
            for (int yDelta = -1; yDelta <= 1; yDelta++) {
                for (int xDelta = -1; xDelta <= 1; xDelta++) {
                    Point testingCell = at(cell.x + xDelta, cell.y + yDelta);
                    NeighbourCell neighbourCell=new NeighbourCell();
                    if ((aliveCell.contains(testingCell) && neighbourCell.neighbours(testingCell, aliveCell) == 2) || neighbourCell.neighbours(testingCell, aliveCell) == 3) {
                        aliveInNext.add(testingCell);
                    }
                }
            }
        }
        return new GameOfLife(aliveInNext);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GameOfLife board = (GameOfLife) o;

        if (!Objects.equals(aliveCell, board.aliveCell)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return aliveCell != null ? aliveCell.hashCode() : 0;
    }
}
