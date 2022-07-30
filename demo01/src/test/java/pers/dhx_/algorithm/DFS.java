package pers.dhx_.algorithm;

/**
 * @author Dhx_
 * @className DFS
 * @description TODO
 * @date 2022/7/23 22:04
 */
public class DFS {
        public int maxAreaOfIsland(int[][] grid) {
            int max_res=0;
            int m=grid[0].length,n=grid.length;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(grid[i][j]==1)
                        max_res=Math.max(max_res,DFS(grid, i, j, m, n));
                }
            }
            return max_res;
        }
        public static int DFS(int[][]grid,int i,int j,int m,int n){//  i j当前  m  n 总的
            if(i>=n||j>=m||grid[i][j]==0)
                grid[i][j]=0;
            return
                    DFS(grid, i+1, j, m, n)+
                            DFS(grid, i, j+1, m, n)+
                            DFS(grid, i-1, j, m, n)+
                            DFS(grid, i, j-1, m, n)+1;
        }

        public int[][] floodFill(int[][] image, int sr, int sc, int color) {
            int m=image[0].length,n=image.length;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(i==sr&&j==sc)
                        DFS(image,image[i][i], i, j, m, n);
                }
            }
            return image;
        }
        public static void DFS(int [][]image,int value,int i,int j,int m,int n){
            if(i<0||j<0||i>=n||j>=m||image[i][j]==0) return ;
            image[i][j]=value;
            DFS(image,value, i-1, j, m, n);
            DFS(image,value, i+1, j, m, n);
            DFS(image,value, i, j-1, m, n);
            DFS(image,value, i, j+1, m, n);
        }
}

