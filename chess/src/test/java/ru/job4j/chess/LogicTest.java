package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test(expected = FigureNotFoundException.class)
    public void figureNotFound()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A1));
        logic.add(new BishopBlack(Cell.B2));
        logic.move(Cell.A3, Cell.A1);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void impossibleMove()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A1));
        logic.move(Cell.A1, Cell.A2);
    }

    @Test(expected = OccupiedCellException.class)
    public void occupied()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException,
            NullPointerException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.D2));
        logic.move(Cell.C1, Cell.G5);
    }
}