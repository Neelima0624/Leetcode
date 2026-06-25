class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int s = 0;
        int e = matrix.length-1;
        int cl = matrix[0].length;
        int row = -1;
        while(s<=e)
        {
            int m = (s+e)/2;
            if(target<=matrix[m][cl-1])
            {
                row = m;
                e = m-1;
            }
            else{
                s = m+1;
            }
        }
        if(row==-1)
        {
            return false;
        }
        int st = 0;
        int end = cl-1;
        while(st<=end)
        {
            int mid = (st+end)/2;
            if(matrix[row][mid]>target)
            {
                end = mid-1;
            }
            else if(matrix[row][mid]<target){
                st = mid+1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}