class Main {
    public static void main(String[] args) {
//        double[][] arrayA = {
//                {3.0, 5.0, 2.0},
//                {1.0, 9.0, 6.0},
//                {4.0, 2.0, 5.0}
//        };
//        double[][] arrayB = {
//                {2.0, 8.0, 1.0},
//                {7.0, 2.0, 8.0},
//                {1.0, 8.0, 2.0}
//        };
//
//        Matrix A = new Matrix(arrayA);
//        Matrix B = new Matrix(arrayB);
//        Matrix result = A.add(B);
//
//        System.out.println(A + "\r\n+\r\n" + B + "\r\n=\r\n" + result);

//        double[][] arrayA = {
//                {1.0, 2.0, 3.0, 4.0, 5.0}
//        };
//
//        double[][] arrayB = {
//                {1.0},
//                {2.0},
//                {3.0},
//                {4.0},
//                {5.0}
//        };
//
//        Matrix A = new Matrix(arrayA);
//        Matrix B = new Matrix(arrayB);
//
//        Matrix result = A.multiply(B);
//
//        System.out.println(A + "\r\n*\r\n" + B + "\r\n=\r\n" + result);

        double[][] arrayC = {
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0}
        };
        Matrix C = new Matrix(arrayC);

        System.out.println(C.transpose());
        System.out.println(C.multiply(3.0));
    }
}