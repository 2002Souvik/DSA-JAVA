public class Interfaces {
    public static void main(String args[]) {
        Queen queen = new Queen();
        Rook rook = new Rook();
        Bishop bishop = new Bishop();
        Knight knight = new Knight();
        Pawn pawn = new Pawn();
        King king = new King();
        queen.moves();
        rook.moves();
        bishop.moves();
        knight.moves();
        pawn.moves();
        king.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Queen can move any number of squares in any direction.");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Rook can move any number of squares horizontally or vertically.");
    }
}

class Bishop implements ChessPlayer {
    public void moves() {
        System.out.println("Bishop can move any number of squares diagonally.");
    }
}

class Knight implements ChessPlayer {
    public void moves() {
        System.out.println("Knight moves in an L-shape: two squares in one direction and then one square perpendicular.");
    }
}

class Pawn implements ChessPlayer {
    public void moves() {
        System.out.println("Pawn moves forward one square, with the option to move two squares on its first move.");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("King can move one square in any direction.");
    }
}
