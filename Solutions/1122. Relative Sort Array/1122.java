class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] fre = new int[1001];
        for(int i = 0; i < arr1.length; i++){
            fre[arr1[i]]++;
        }
        int k = 0;
        for(int i = 0; i < arr2.length; i++){
            int n = fre[arr2[i]];
            for(int j = 0; j < n; j++){
                arr1[k++] = arr2[i];
                fre[arr2[i]]--;
            }
        }
        for(int i = 0; i < 1001; i++){
            while(fre[i] != 0){
                arr1[k++] = i;
                fre[i]--;
            }
        }
        return arr1;
    }
}