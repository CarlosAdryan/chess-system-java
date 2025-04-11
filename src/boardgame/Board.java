package boardgame;

public class Board {
	
	private int row;
	private int column;
	private Piece[][] pieces;
	
	public Board(int row, int column) {
		this.row = row;
		this.column = column;
		pieces = new Piece[row][column];
	}

	public int getRows() {
		return row;
	}

	public void setRows(int rows) {
		this.row = rows;
	}

	public int getColumns() {
		return column;
	}

	public void setColumns(int columns) {
		this.column = columns;
	}
	
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	

}
