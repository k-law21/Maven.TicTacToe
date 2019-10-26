package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Character[][] ticBoard;

    public Board(Character[][] matrix) {
        this.ticBoard = matrix;
    }

    public Boolean isInFavorOfX() {

        for (int i = 0; i < ticBoard.length; i++) {

            if (ticBoard[i][0] == 'X' && ticBoard[i][0] == 'X' && ticBoard[i][2] == 'X') {
            return true;}

            if (ticBoard[0][i] == 'X' && ticBoard[1][i] == 'X' && ticBoard[2][i] == 'X') {
            return true;}
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        for (int i = 0; i < ticBoard.length; i++) {

            if (ticBoard[i][0] == 'O' && ticBoard[i][0] == 'O' && ticBoard[i][2] == 'O'){
            return true;}

            if (ticBoard[0][i] == 'O' && ticBoard[1][i] == 'O' && ticBoard[2][i] == 'O'){
            return true;}


        }
        if (ticBoard[0][0] == 'X' && ticBoard[1][1] == 'X' && ticBoard[2][2] =='X'){

        return true;
        }
        if (ticBoard[0][2] == 'O' && ticBoard[1][1] == 'O' && ticBoard[2][0] == 'O'){
        return true;
        }
        return false;
    }


    public boolean isTie() {
        for (int i = 0; i < ticBoard.length; i++) {
            for (int j = 0; i < ticBoard.length; j++) {
                if (ticBoard[i][j] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }

            public String getWinner () {
                if (isInFavorOfX() == true) {
                    return "X";
                }

                if (isInFavorOfO() == true) {
                    return "O";
                }


                return "";


            }

    }