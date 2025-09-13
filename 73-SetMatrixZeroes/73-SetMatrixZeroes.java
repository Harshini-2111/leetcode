// Last updated: 13/09/2025, 10:36:00
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean rowzero =false;
        boolean colzero=false;


        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]==0){
                colzero=true;

            }
        }

        for(int i=0;i<matrix[0].length;i++){
            if(matrix[0][i]==0){
                rowzero=true;
            }
        }

        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length ;j++){
                if(matrix[i][j]==0){

                   matrix[i][0]=0;
                   matrix[0][j]=0;
                }
            }
        }

        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length ;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            if(colzero){
                matrix[i][0]=0;
            }
        }
        for(int i=0;i<matrix[0].length;i++){
            if(rowzero){
                matrix[0][i]=0;
            }
        }



    }
}