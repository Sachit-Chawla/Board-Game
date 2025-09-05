/**
 * Name: Sachit Singh Chawla , Banner: B00865842
 * The Board class will hold the 8 X 8 game board. Each position of the board
 * either contains a Piece or is empty. Since the pieces move around on the game board, any location may
 * contain any type of Piece.
 */
public class Board {
     Piece [][]boardPosition;
    public Board (){boardPosition= new Piece[8][8];}

    /**
     * adds the piece to the game board with specified piece location  and returns a warning if there is already a piece present
     * @param pieceToBePlaced the piece which is to be placed on the board
     */
    public void add (Piece pieceToBePlaced){
        int x = pieceToBePlaced.getXPosition();
        int y = pieceToBePlaced.getYPosition();
        if(boardPosition[x][y]==null){
            boardPosition[x][y]= pieceToBePlaced;
        }
        else{
            System.out.println ("There is already a Piece there!" );
        }
    }

    /**
     * Move method takes a piece which is to be moved, the direction it is be moved and by number of steps it is to be moved
     * sees if the piece is fast or slow and after checking it sees if it is flexible or not uses directions to move
     * stores the point where it is moved and nullifies the last location
     * Takes only left and right for fast/ slow pieces and left/right/up/down for flexible pieces
     * if it is fast piece or fast flexible piece it uses the steps to move to a new location with specified steps
     * @param pieceToBeMoved The piece which is to be moved
     * @param direction the direction is to be moved
     * @param steps the spaces it should be moved
     */
    public void move (Piece pieceToBeMoved, String direction, int steps) {
        int x = pieceToBeMoved.getXPosition ( );
        int y = pieceToBeMoved.getYPosition ( );
        Piece p = boardPosition[x][y];
        if ( boardPosition[x][y] instanceof SlowPiece ) {
            if ( boardPosition[x][y] instanceof SlowFlexible ) {
                if ( direction.equalsIgnoreCase ( "left" ) ) {
                    int newY = y - 1;
                    if ( boardPosition[x][newY] == null ) {
                        Point newPos = (((SlowFlexible) boardPosition[x][y]).move ( direction ));
                        boardPosition[newPos.getX ( )][newPos.getY ( )] = p;
                        boardPosition[x][y] = null;
                    } else {
                        System.out.println ( "There is already a piece there" );
                    }
                }
                if ( direction.equalsIgnoreCase ( "right" ) ) {
                    int newY = y + 1;
                    if ( boardPosition[x][newY] == null ) {
                        Point newPos = (((SlowFlexible) boardPosition[x][y]).move ( direction ));
                        boardPosition[newPos.getX ( )][newPos.getY ( )] = p;
                        boardPosition[x][y] = null;
                    } else {
                        System.out.println ( "There is already a piece there" );
                    }
                }
                if ( direction.equalsIgnoreCase ( "up" ) ) {
                    int newX = x - 1;
                    if ( boardPosition[newX][y] == null ) {
                        Point newPos = (((SlowFlexible) boardPosition[x][y]).move ( direction ));
                        boardPosition[newPos.getX ( )][newPos.getY ( )] = p;
                        boardPosition[x][y] = null;
                    } else {
                        System.out.println ( "There is already a piece there" );
                    }
                }
                if ( direction.equalsIgnoreCase ( "down" ) ) {
                    int newX = x + 1;
                    if ( boardPosition[newX][y] == null ) {
                        Point newPos = (((SlowFlexible) boardPosition[x][y]).move ( direction ));
                        boardPosition[newPos.getX ( )][newPos.getY ( )] = p;
                        boardPosition[x][y] = null;
                    } else {
                        System.out.println ( "There is already a piece there" );
                    }
                }
            } else {
                if ( direction.equalsIgnoreCase ( "left" ) ) {
                    int newY = y - 1;
                    if ( boardPosition[x][newY] == null ) {
                        Point newPos = (((SlowPiece) boardPosition[x][y]).move ( direction ));
                        boardPosition[newPos.getX ( )][newPos.getY ( )] = p;
                        boardPosition[x][y] = null;
                    } else {
                        System.out.println ( "There is already a piece there" );
                    }
                }
                if ( direction.equalsIgnoreCase ( "right" ) ) {
                    int newY = y + 1;
                    if ( boardPosition[x][newY] == null ) {
                        Point newPos = (((SlowPiece) boardPosition[x][y]).move ( direction ));
                        boardPosition[newPos.getX ( )][newPos.getY ( )] = p;
                        boardPosition[x][y] = null;
                    } else {
                        System.out.println ( "There is already a piece there" );
                    }
                }
            }
        }
        if ( boardPosition[x][y] instanceof FastPiece ) {
            if ( boardPosition[x][y] instanceof FastFlexible ) {
                if ( direction.equalsIgnoreCase ( "left" ) ) {
                    int newY = y - 1;
                    if ( boardPosition[x][newY] == null ) {
                        Point newPos = (((FastFlexible) boardPosition[x][y]).move ( direction, steps ));
                        boardPosition[newPos.getX ( )][newPos.getY ( )] = p;
                        boardPosition[x][y] = null;
                    } else {
                        System.out.println ( "There is already a piece there" );
                    }
                }
                if ( direction.equalsIgnoreCase ( "right" ) ) {
                    int newY = y + 1;
                    if ( boardPosition[x][newY] == null ) {
                        Point newPos = (((FastFlexible) boardPosition[x][y]).move ( direction, steps ));
                        boardPosition[newPos.getX ( )][newPos.getY ( )] = p;
                        boardPosition[x][y] = null;
                    } else {
                        System.out.println ( "There is already a piece there" );
                    }
                }
                if ( direction.equalsIgnoreCase ( "up" ) ) {
                    int newX = x - 1;
                    if ( boardPosition[newX][y] == null ) {
                        Point newPos = (((FastFlexible) boardPosition[x][y]).move ( direction, steps ));
                        boardPosition[newPos.getX ( )][newPos.getY ( )] = p;
                        boardPosition[x][y] = null;
                    } else {
                        System.out.println ( "There is already a piece there" );
                    }
                }
                if ( direction.equalsIgnoreCase ( "down" ) ) {
                    int newX = x + 1;
                    if ( boardPosition[newX][y] == null ) {
                        Point newPos = (((FastFlexible) boardPosition[x][y]).move ( direction, steps ));
                        boardPosition[newPos.getX ( )][newPos.getY ( )] = p;
                        boardPosition[x][y] = null;
                    } else {
                        System.out.println ( "There is already a piece there" );
                    }
                }
            } else {
                if ( direction.equalsIgnoreCase ( "left" ) ) {
                    int newY = y - 1;
                    if ( boardPosition[x][newY] == null ) {
                        Point newPos = (((FastPiece) boardPosition[x][y]).move ( direction, steps ));
                        boardPosition[newPos.getX ( )][newPos.getY ( )] = p;
                        boardPosition[x][y] = null;
                    } else {
                        System.out.println ( "There is already a piece there" );
                    }
                }
                if ( direction.equalsIgnoreCase ( "right" ) ) {
                    int newY = y + 1;
                    if ( boardPosition[x][newY] == null ) {
                        Point newPos = (((FastPiece) boardPosition[x][y]).move ( direction, steps ));
                        boardPosition[newPos.getX ( )][newPos.getY ( )] = p;
                        boardPosition[x][y] = null;
                    } else {
                        System.out.println ( "There is already a piece there" );
                    }
                }
            }
        }
    }

    /**
     * Displays the board in text based display
     */
    public void display(){
        for (int i = 0; i < boardPosition.length; i++){
            for (int j = 0; j < boardPosition.length; j++){
                if(boardPosition[j][i] == null)
                    System.out.printf("%-15s" , "-");
                else
                    System.out.printf("%-15s" ,boardPosition[j][i].toString ());
            }
            System.out.println();
        }
    }
}
