public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=0,n=0,c=0;
        int[] arr=new int[nums1.length+nums2.length];
        while(m<nums1.length&&n<nums2.length){
            if(nums1[m]<=nums2[n]){
                arr[c]=nums1[m];
                m++;
                c++;
            }else{
                arr[c]=nums2[n];
                n++;
                c++;
            }
        }
        while(m<nums1.length){
            arr[c]=nums1[m];
            m++;
            c++;
        }
        while(n<nums2.length){
            arr[c]=nums2[n];
            n++;
            c++;
        }
        m=arr.length;
        if(m==0)
            return (double)0;
        if(m==1)
            return (double)(arr[0]);
        if(m==2)
            return((double)(arr[0])+(double)(arr[1]))/2;
        if(arr.length%2!=0)
            return (double)(arr[arr.length/2]);
        else{
            double ans =((double)(arr[arr.length/2])+(double)(arr[(arr.length/2)-1]))/2;
            return ans;
        }
    }
