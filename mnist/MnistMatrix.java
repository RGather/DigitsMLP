package digits.mnist;

/**
 * Holds MNIST Data in an easy to use format
 * @author Read LICENSE
 *
 */
public class MnistMatrix {

    private int [][] data;

    private int nRows;
    private int nCols;

    private int label;

    public MnistMatrix(int nRows, int nCols) {
        this.nRows = nRows;
        this.nCols = nCols;

        data = new int[nRows][nCols];
    }

    public void print() {
    	
        System.out.println("label: " + label);
        for (int r = 0; r < nRows; r++ ) {
            for (int c = 0; c < nCols; c++) {
                System.out.print(data[r][c] + " ");
            }
            System.out.println();
        }
        
    }
    
    public int getValue(int r, int c) {
        return data[r][c];
    }

    public void setValue(int row, int col, int value) {
        data[row][col] = value;
    }

    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }

    public int getNumberOfRows() {
        return nRows;
    }

    public int getNumberOfColumns() {
        return nCols;
    }

}
