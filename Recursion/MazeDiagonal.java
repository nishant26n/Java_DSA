package Recursion;

import java.util.ArrayList;

class MazeDiagonal {

    static ArrayList<String> getMazePath(int currentRow, int currentCol, int endRow, int endCol) {
        
        // Positive Base Case
        if(currentRow == endRow && currentCol == endCol) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }

        // Negative Base Case
        if(currentRow > endRow || currentCol > endCol) {
            ArrayList<String> temp = new ArrayList<>();
            return temp;
        }

        ArrayList<String> finalResult = new ArrayList<>();

        // Move one step horizontally, it means column + 1 and rows + 1
        ArrayList<String> diagonalResult = getMazePath(currentRow+1, currentCol+1, endRow, endCol);
        for(String tempRes : diagonalResult) {
            finalResult.add("D" + tempRes);
        }

        return finalResult;
    }

    public static void main(String args[]){
        ArrayList<String> res = getMazePath(0, 0, 2, 2);
        System.out.println(res);
    }

}