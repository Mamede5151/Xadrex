package boardgame;

public class Board {

    private int rows;
    private int colwmns;
    private Piece[][] pieces;

    public Board(int rows, int colwmns) {
        this.rows = rows;
        this.colwmns = colwmns;
        pieces = new Piece[rows][colwmns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColwmns() {
        return colwmns;
    }

    public void setColwmns(int colwmns) {
        this.colwmns = colwmns;
    }

    public Piece piece(int row, int colwmns){
        return pieces[row][colwmns];
    }

    public Piece piece (Position position){
        return pieces[position.getRow()][position.getColumn()];
    }
}
