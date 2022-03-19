class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        return mergeSort(arr, 0, (int)N-1);
    }
    public static int mergeSort(long arr[], int l, int r) {
        int countOfInversions = 0;
        if(l < r) {
            int mid = l + (r-l)/2;
            countOfInversions += mergeSort(arr, l, mid);
            countOfInversions += mergeSort(arr, mid+1, r);
            countOfInversions += merge(arr, l, mid, r);
        }
        return countOfInversions; 
    }
    public static int merge(long arr[], int l, int mid, int r) {
        int i=l, j=mid+1, countOfInversions = 0;
        int sizeLeft = mid-l+1;
        int sizeRight = r-mid;
        long [] left = new long[sizeLeft];
        long [] right = new long[sizeRight];
        // populating left subarray
        for(int k=0; k<sizeLeft; k++, i++) {
            left[k] = arr[i];
        }
        // populating right subarray
        for(int k=0; k<sizeRight; k++, j++) {
            right[k] = arr[j];
        }
        i=sizeLeft-1;j=sizeRight-1;
        // sorting merging left and right into arr
        while(i >=0 && j>=0) {
            if(left[i] <= right[j]) {
                arr[r--] = right[j--];
            }
            else {
                countOfInversions+=(j+1);
                arr[r--] = left[i--];
            }
        }
        while(i >=0) {
            arr[r--] = left[i--];
        }
        while(j >=0) {
            arr[r--] = right[j--];
        }
        return countOfInversions;
    }
}