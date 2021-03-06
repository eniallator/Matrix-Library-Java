import java.util.Arrays;

public class Matrix {
    private int rows;
    private int cols;
    private double[][] matrix;

    public Matrix(double[][] matrix) {
        this.rows = matrix.length;
        this.cols = matrix[0].length;
        this.matrix = matrix;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (double[] row : matrix) {
            if (builder.length() != 0) builder.append(",\r\n");
            builder.append("  " + Arrays.toString(row));
        }

        return "[\r\n" + builder.toString() + "\r\n]";
    }

    public double getValue(int i, int j) {
        return matrix[i][j];
    }

    public Matrix add(Matrix other) {
        if (other.getRows() != rows || other.getCols() != cols) return null;

        double[][] newMatrix = new double[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                newMatrix[i][j] = getValue(i, j) + other.getValue(i, j);
            }
        }

        return new Matrix(newMatrix);
    }

    public Matrix multiply(Matrix other) {
        if (cols != other.getRows()) return null;

        double[][] newMatrix = new double[rows][other.getCols()];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.getCols(); j++) {
                double entrySum = 0.0;

                for (int k = 0; k < cols; k++) {
                    entrySum += getValue(i, k) * other.getValue(k, j);
                }

                newMatrix[i][j] = entrySum;
            }
        }

        return new Matrix(newMatrix);
    }

    public Matrix multiply(double multiplier) {
        double[][] newMatrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                newMatrix[i][j] = matrix[i][j] * multiplier;
            }
        }

        return new Matrix(newMatrix);
    }

    public Matrix transpose() {
        double[][] newMatrix = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }

        return new Matrix(newMatrix);
    }
}
