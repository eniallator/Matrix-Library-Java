public class Matrix {
    private double[][] matrix;
    private int width;
    private int height;

    public Matrix(int width, int height) {
        this.width = width;
        this.height = height;
        matrix = new double[width][height];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public double getValue(int i, int j) {
        return matrix[i][j];
    }

    public void add(Matrix other) {
        if (other.getWidth() != width || other.getHeight() != height)
            return;

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                matrix[i][j] += other.getValue(i, j);
            }
        }
    }

    public void multiply(Matrix other) {

    }
}
