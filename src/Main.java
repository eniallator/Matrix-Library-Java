class Main {
    public static void main(String[] args) {
        double[][] arrayA = {
                {3.0, 5.0, 2.0},
                {1.0, 9.0, 6.0},
                {4.0, 2.0, 5.0}
        };
        double[][] arrayB = {
                {2.0, 8.0, 1.0},
                {7.0, 2.0, 8.0},
                {1.0, 8.0, 2.0}
        };

        Matrix A = new Matrix(arrayA);
        Matrix B = new Matrix(arrayB);
        Matrix result = A.add(B);

        System.out.println(A.toString() + "\r\n+\r\n" + B.toString() + "\r\n=\r\n" + result.toString());
    }
}