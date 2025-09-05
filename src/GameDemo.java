/**
 * Name: Sachit Singh Chawla , Banner: B00865842
 * This is the game demo class which creates uses inputs to create/move/display the board/or ask for help
 */
import java.util.*;
public class GameDemo {
    public static void main ( String[] args ) {
        Scanner in  = new Scanner(System.in);
/*
Takes input from the user if the input to invoke if conditions for create/move/exit/help then creates a board
 */
        System.out.println ("Enter a command (type help for details):" );
        String input  = in.next ();
        Board board  = new Board ();
        while(!input.equalsIgnoreCase ( "exit" )){

            /*
            The create loop takes 2 input and sees and if there is a 4 th input or not and if there is
            saves and uses it to create object based on pace (slow/fast) and flexibility.
             */
            if(input.equalsIgnoreCase ( "create" )) {
                int xpos = in.nextInt ( );
                int ypos = in.nextInt ( );
                String pace = "slow";

                String a = in.nextLine ( );
                if ( a.trim ( ).equalsIgnoreCase ( "fast" ) ||
                        a.trim ( ).equalsIgnoreCase ( "fast flexible" ) ||
                        a.trim ( ).equalsIgnoreCase ( "slow flexible" ) ) {
                    pace = a;
                }
                // name and color input
                System.out.println ( "Input a name for the new piece:" );
                String name = in.next ( );
                System.out.println ( "Input a colour for the new piece:" );
                String color = in.next ( );

                //created objects using names and color and position
                if ( pace.equalsIgnoreCase ( "slow" ) ) {
                    SlowPiece p = new SlowPiece ( name, color, new Point ( xpos, ypos ) );
                    board.add ( p );
                }
                if ( pace.trim ( ).equalsIgnoreCase ( "slow flexible" ) ) {
                    SlowFlexible p = new SlowFlexible ( name, color, new Point ( xpos, ypos ) );
                    board.add ( p );
                }
                if ( pace.trim ().equalsIgnoreCase ( "fast" ) ) {
                    FastPiece p = new FastFlexible ( name, color, new Point ( xpos, ypos ) );
                    board.add ( p );
                }
                if ( pace.trim ().equalsIgnoreCase ( "fast flexible" ) ) {
                    FastFlexible p = new FastFlexible ( name, color, new Point ( xpos, ypos ) );
                    board.add ( p );
                }

            }
            /*
            if the user inputs move it takes input of 2 integer defining the piece's x and y pos and string
            defining the direction in which the piece to be moved, then sees if the piece is fast piece or not
            if its fast then takes a steps input and uses to move the piece from specified location to number of steps
             */
            else if (input.equalsIgnoreCase ( "move" )){
                int xpos = in.nextInt ( );
                int ypos = in.nextInt ( );
                String direction = in.next ();
                if(board.boardPosition [xpos][ypos]!=null) {
                    if ( board.boardPosition [xpos][ypos] instanceof FastPiece ) {
                        int steps = in.nextInt ( );
                        board.move ( board.boardPosition[xpos][ypos], direction, steps );
                        System.out.println ("Piece at ("+xpos+","+ypos+") moved "+ direction+" by "+steps+"spaces" );
                    }
                    else {
                            board.move (board.boardPosition[xpos][ypos],direction,1 );
                            System.out.println ("Piece at ("+xpos+","+ypos+") moved "+ direction+" by 1 space" );

                    }
                }
                else{
                    System.out.println ( "Error: no piece at ("+xpos+","+ypos+")\n" );
                }
            }
            /*
            displays the board in text based format
             */
            else if (input.equalsIgnoreCase ( "print" )){
                board.display();
            }
            /*
            shows the user what they could do with the program
             */
            else if (input.equalsIgnoreCase ( "help" )){
                System.out.println ("Possible commands are as follows:\n" +
                        "create location [fast][flexible]: Creates a new piece.\n" +
                        "move location direction [spaces]: Moves a piece.\n" +
                        "print: Displays the board.\n" +
                        "help: Displays help.\n" +
                        "exit: Exits the program." );
            }
            //take input until exit is invoked
            System.out.println ("Enter a command (type help for details):" );
            input = in.next();
        }
        System.out.println ("Done." );
    }
}

