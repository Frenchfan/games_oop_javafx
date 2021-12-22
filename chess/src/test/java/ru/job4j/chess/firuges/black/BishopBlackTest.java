package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        Cell target = Cell.A1;
        Figure bishop = new BishopBlack(target);
        Cell result = bishop.position();
        assertThat(target, is(result));
    }

    @Test
    public void testCopy() {
        Cell start = Cell.A1;
        Figure bishop = new BishopBlack(start);
        Cell newTarget = Cell.A3;
        Figure copyBishop = bishop.copy(newTarget);
        Cell dest = copyBishop.position();
        assertThat(newTarget, is(dest));
    }

    @Test
    public void testWay() {
        Cell start = Cell.C1;
        Figure bishop = new BishopBlack(start);
        Cell target = Cell.G5;
        Cell[] steps = bishop.way(target);
        Cell[] checkWay = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(steps, is(checkWay));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void bishopBlackIsDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.E1);
    }
}