package problemStmt;

/*

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display
 this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);

 */

import solution.ZigZagConversionSolution;

public class ZigzagConversion implements problems {

    String s;
    int numRows;
    String output;

    public ZigzagConversion(String s, int numRows) {
        this.s = s;
        this.numRows = numRows;
    }

    @Override
    public void solve() {

        ZigZagConversionSolution zigZagConversionSolution = new ZigZagConversionSolution();

        System.out.println(zigZagConversionSolution.convert(s, numRows));

    }
}
