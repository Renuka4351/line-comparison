package com.bl;

public class UC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x1 = 2;
        int x2 = 4;
        int y1 = 5;
        int y2 = 10;

        int x3 = 3;
        int y3 = 6;
        int x4 = 7;
        int y4 = 14;

        double a;
        double b;


        System.out.println("A Length as 2 points : " + "("+x1+ "," +y1+ ")" + "and" + "(" +x2+ "," +y2+ ")");
        double LenthLine1 = Math.sqrt((x2 - x1) * (x2-x1)) + ((y2-y1) * (y2-y1));
        System.out.println("Length of a line : "+ LenthLine1);
        a = LenthLine1;

        System.out.println("A Length as 2 points : " + "("+x3+ "," +y3+ ")" + "and" + "(" +x4+ "," +y4+ ")");
        double LenthLine2 = Math.sqrt((x4 - x3) * (x4-x3)) + ((y4-y3) * (y4-y3));
        System.out.println("Length of a line : "+ LenthLine2);
        b = LenthLine2;

        if (Double.compare(a, b) == 0)
            System.out.println("LenthLine1 = LenthLine2");
        else if (Double.compare(a, b) < 0)
            System.out.println("LenthLine1 is lessthan LenthLine2");
        else
            System.out.println("LenthLine1 is graterthan LenthLine2");



	}

}
