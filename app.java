package Bytes_project;
class Solution {
    public int binarysearch(int[] arr, int k) {
        int l=0;
        int r=arr.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(arr[mid]==k){
                while(mid>0 && arr[mid]==arr[mid-1]) mid--;
                return mid;

                
            }
            if(arr[mid]<k) l=mid+1;
            if(arr[mid]>k) r=mid-1;
        }
        return -1;
    }
}