import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Traverse the matrix layer by layer from the outside to the inside. For each layer, collect the elements in a list in the order of rotation.
Rotate the elements in the list by the required amount. This can be done by reversing the list, reversing the first r elements, and then reversing the rest of the elements, where r is the number of rotations.
Put the rotated elements back into the matrix.*/
public class MatrixLayerRotation {
    public void rotate(int[][] matrix, int r) {
        int m = matrix.length;
        int n = matrix[0].length;
        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {
            List<Integer> list = new ArrayList<>();
            for (int i = layer; i < m - layer; i++) {
                list.add(matrix[i][layer]);
            }
            for (int j = layer + 1; j < n - layer; j++) {
                list.add(matrix[m - layer - 1][j]);
            }
            for (int i = m - layer - 2; i >= layer; i--) {
                list.add(matrix[i][n - layer - 1]);
            }
            for (int j = n - layer - 2; j > layer; j--) {
                list.add(matrix[layer][j]);
            }

            Collections.rotate(list, -r);

            int index = 0;
            for (int i = layer; i < m - layer; i++) {
                matrix[i][layer] = list.get(index++);
            }
            for (int j = layer + 1; j < n - layer; j++) {
                matrix[m - layer - 1][j] = list.get(index++);
            }
            for (int i = m - layer - 2; i >= layer; i--) {
                matrix[i][n - layer - 1] = list.get(index++);
            }
            for (int j = n - layer - 2; j > layer; j--) {
                matrix[layer][j] = list.get(index++);
            }
        }
    }
}