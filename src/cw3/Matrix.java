package cw3;



public class Matrix {

    private int [][]matrix;
    private int rows;
    private int colums;

    private static int tmp1[][];
    private static int rowTmp;
    private static int columnsTmp;
    private static int rowTmp1;//licznik zaczyna od 0

    private Matrix( int [][]tab , int row , int colum) {
        matrix=tab;
        rows=row;
        colums=colum;
    }

    public static Matrix create() {
        Matrix  matrix1=new Matrix(tmp1,rowTmp,columnsTmp);

        tmp1=null;
        rowTmp=0;
        columnsTmp=0;
        rowTmp1=0;
        return matrix1;
    }

    public static void setUpMatrix ( int rowCount , int columnCount){
        if (rowCount >0 && columnCount >0)
        {

            int [][] tmp = new int [rowCount][columnCount];
            tmp1=tmp;
            rowTmp=rowCount;
            rowTmp1=0;
            columnsTmp=columnCount;
        }
        else {
            throw new RuntimeException("rowCount i  columnCount muszą być większe od zera  ");
        }

    }

    public static void insertRow(int [] row){

        if (rowTmp>rowTmp1){
            tmp1[rowTmp1]=row;
            rowTmp1++;
        }
        else {
            throw new RuntimeException("  nie można dodać do Macierza ");  }







    }



    public void print() {

        try {
            int rows = matrix.length;
            int columns = matrix[0].length;
            String str = "|\t";

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    str += matrix[i][j] + "\t";
                }
                System.out.println(str + "|");
                str = "|\t";
            }
        } catch (Exception e) {
            System.out.println("Matrix is empty!!");
        }
    }



    public Matrix subtract(Matrix matrixB) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                this.matrix[i][j] =this.matrix[i][j]-matrixB.matrix[i][j];
            }
        }
        return this;
    }

    public static Matrix subtract(Matrix m1, Matrix m2){

        int[][] sum = new int[m1.rows][m1.colums];
        Matrix tmp = new Matrix(sum,m1.rows,m2.colums);
        for(int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m1.colums; j++) {
                sum[i][j] = m1.matrix[i][j] - m2.matrix[i][j];
            }
        }

        return tmp;

    }



    public Matrix add(Matrix m) {

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < colums; j++) {
                this.matrix[i][j] = this.matrix[i][j] + m.matrix[i][j];

            }
        }
        return this;
    }


    public static Matrix add(Matrix m1, Matrix m2){
        int[][] sum = new int[m1.rows][m1.colums];
        Matrix tmp = new Matrix(sum,m1.rows,m2.colums);
        for(int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m1.colums; j++) {
                sum[i][j] = m1.matrix[i][j] + m2.matrix[i][j];
            }
        }

        return tmp;
    }

    public static Matrix multiplication(Matrix m1, Matrix m2){
        int[][] multi = new int[m1.rows][m1.colums];
        Matrix tmp = new Matrix(multi,m1.rows,m2.colums);
        for(int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m1.colums; j++) {
                multi[i][j]=0;
                for (int k=0;k<m1.rows;k++){

                    multi[i][j] = m1.matrix[i][j] + m2.matrix[i][j];

                }


            }
        }

        return tmp;
    }
}

