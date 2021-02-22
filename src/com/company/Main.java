/**
 This program prints the colors of the chess board on the console using a 2-D Array

 Creaed by Sammy Thakas on 22/02/2021
 */
package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int dimension = 8;
        boolean isWhite = false;

        String [] [] chessBoard = new String[dimension][dimension];

        for( int y = 0; y < dimension; y++){
            isWhite = !isWhite ; // this sets the first square of the board to be white

            for (int x = 0; x < chessBoard[y].length; x++){

                if(isWhite)
                    chessBoard[y][x] = "White";
                else
                    chessBoard[y][x] = "Black";
                isWhite = !isWhite; // this resets the white square to black for the first run
            }
        }

        for (int i = 0; i < chessBoard.length; i++){
            System.out.println(Arrays.toString(chessBoard[i]));
        }
    }
}
