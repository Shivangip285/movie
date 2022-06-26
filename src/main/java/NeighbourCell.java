import java.util.Set;

public class NeighbourCell {
    public int neighbours(Point p, Set<Point> alives) {
        int count = 0;
        for (int yDelta = -1; yDelta <= 1; yDelta++) {
            for (int xDelta = -1; xDelta <= 1; xDelta++) {
                if (!(xDelta == 0 && yDelta == 0) && alives.contains(Point.at(p.x + xDelta, p.y + yDelta))) {
                    count++;
                }
            }
        }
        return count;
    }
}
