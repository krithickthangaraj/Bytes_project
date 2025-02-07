<<<<<<< HEAD
package Bytes_project;
=======
>>>>>>> 4eb2ffa3114fda7edc7955e30232deee45c1baa4
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
        if(arr[mid]<k) l=mid+1;
            if(arr[mid]>k) r=mid-1;if(arr[mid]<k) l=mid+1;
            if(arr[mid]>k) r=mid-1;
    }
}