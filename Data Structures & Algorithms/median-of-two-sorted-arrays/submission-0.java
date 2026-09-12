class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int k = n+m;

        int[] arr = new int[k];

        if(n==0 && m==0){
            return 0;
        }

        for(int i=0; i<n; i++){
            arr[i] = nums1[i];
        }

        for(int i=0; i<m; i++){
            arr[n+i] = nums2[i];
        }

        Arrays.sort(arr);

        double ans = 0;
 
        if(k%2!=0){
            return (double) arr[(k-1)/2];
        }
        else{
            int v1 = arr[(k-2)/2];
            int v2 = arr[k/2];

            return (double) ((double)(v1+v2)/2);
        }
    }
}
