/**
 * Name: Sachit Singh Chawla , Banner: B00865842
 * A Piece that moves left or right a specified, arbitrary number of steps per move
 */
public class FastPiece extends Piece{

    public FastPiece ( String Name, String Colour, Point Position ) {
        super ( Name, Colour, Position );
    }
    /**
     *A method to move the piece left or right by a specified
     * number of spaces. This method will accept a direction parameter and a number of spaces.
     * If a move is requested that would take the Piece off the edge of the board, it would simply return
     * without doing anything.
     * @param moveDirection the direction it has to be moved
     * @param numberOfSteps the number of spaces it would be moved
     * @return the new point which is moved
     */
    public Point move(String moveDirection, int numberOfSteps){
        int xVar = getXPosition ();
        int yVar = getYPosition ( );
        if(moveDirection.equalsIgnoreCase ( "right" )&& xVar==7 ||
                moveDirection.equalsIgnoreCase ( "left" ) && xVar==0){
            return null;
        }
        else{
            if ( moveDirection.equalsIgnoreCase ( "right" ) ) {
                xVar = xVar + numberOfSteps;
            }
            if ( moveDirection.equalsIgnoreCase ( "left" ) ) {
                xVar = xVar - numberOfSteps;
            }
        }
        return new Point ( xVar, yVar );
    }

    @Override
    public String toString () {
        return getName()+ getColour ()+"F";
    }
}
