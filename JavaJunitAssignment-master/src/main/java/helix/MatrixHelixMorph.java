package helix;

import java.util.Scanner;

public class MatrixHelixMorph {

    public static int[][] helix(int[][] mat){
        int m = mat.length; // number of rows
        int n = mat[0].length; // number of columns
        int[][] result = new int[m][n];
        for(int k = 0; k<n; k++){
            result[0][k] = mat[0][k];
        }
        if(m==1 || m == 0)
            return result;
        int hm = 1;int hn = n-1;int bsm = 1;int bem = m-1;int bsn = 0;int ben = n-1;String position = "down";
        for(int i = 1 ; i<m ; i++){
            for(int j = 0; j<n; j++){
                result[hm][hn] = mat[i][j];
                if(position.equals("down")){
                    if(hm<bem)
                        hm++;
                    else{
                        ben--;
                        hn--;
                        position = "left";
                    }
                }
                else if(position.equals("left")){
                    if(hn>bsn)
                        hn--;
                    else{
                        bem--;
                        hm--;
                        position = "up";
                    }
                }
                else if(position.equals("up")){
                    if(hm>bsm)
                        hm--;
                    else{
                        bsn++;
                        hn++;
                        position = "right";
                    }
                }
                else{
                    if(hn<ben)
                        hn++;
                    else{
                        bsm++;
                        hm++;
                        position = "down";
                    }
                }
            }
        }
        return result;
    }
}