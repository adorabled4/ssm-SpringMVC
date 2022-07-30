package pers.dhx_.algorithm;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhx_
 * @className solution
 * @description TODO
 * @date 2022/7/25 21:25
 */
public class Solution {
    @Test
    public void test(){
        int [][]test=new int[][]{{0,0,0},{0,1,0},{1,1,1}};
        updateMatrix(test);
    }

    public int[][] updateMatrix(int[][] matrix) {
        // 首先将所有的 0 都入队，并且将 1 的位置设置成 -1，表示该位置是 未被访问过的 1
        Queue<int[]> queue = new LinkedList<>();
        int m = matrix.length, n = matrix[0].length;
        for (int i = 0; i < m; i++) { //  0 全部入队， 然后把1 标记为 -1
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    queue.offer(new int[] {i, j});
                } else {
                    matrix[i][j] = -1;
                }
            }
        }

        int[] dx = new int[] {-1, 1, 0, 0};
        int[] dy = new int[] {0, 0, -1, 1};
        while (!queue.isEmpty()) {
            int[] point = queue.poll(); //poll()返回队首元素的同时删除队首元素，队列为空时返回NULL 注意这个queue的泛型是int[]
            int x = point[0], y = point[1];
            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                // 如果四邻域的点是 -1，表示这个点是未被访问过的 1
                // 所以这个点到 0 的距离就可以更新成 matrix[x][y] + 1。
                if (newX >= 0 && newX < m && newY >= 0 && newY < n
                        && matrix[newX][newY] == -1) {
                    matrix[newX][newY] = matrix[x][y] + 1;
                    queue.offer(new int[] {newX, newY});
                }
            }
        }
        return matrix;
    }
}
