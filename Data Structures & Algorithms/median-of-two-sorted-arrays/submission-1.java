class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
       int n=nums1.length;
       int m=nums2.length;
       int a[]=new int[n+m];
       for(int i=0;i<n;i++)
       {
          a[i]=nums1[i];
       } 
       for(int j=n;j<n+m;j++)
       {
          a[j]=nums2[j-n];
       }
       for(int i=0;i<a.length;i++)
       {
        for(int j=0;j<a.length-1-i;j++)
        {
            if(a[j]>a[j+1])
            {
                int temp=a[j+1];
                a[j+1]=a[j];
                a[j]=temp;
            }
        }
       }
       if(a.length%2!=0)
       {
          return (double)a[a.length/2];
       }
       double sum=(a[a.length/2]+a[a.length/2-1])/2.0;
       return sum;
    }
}
