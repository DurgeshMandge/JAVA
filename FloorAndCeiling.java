public class FloorAndCeiling {
    static int[] arr = {3,11,13,15,20,21};
    static int target = 14;
    static int floor = floor(arr,target);//ans=13
    static int ceilng = ceiling(arr,target);//ans=20
    public static void main(String[] args) {
        System.out.println(floor);
        System.out.println(ceilng);
    }
    private static int ceiling(int[] arr2, int target2) {
        if(arr2[arr2.length-1]<target2){return -1;}
        int start = 0 , end = arr2.length-1, mid;
        while(start<=end){
            mid= start+(end-start)/2;
            if(target2==arr2[mid]){
                return arr2[mid];
            }
            if(target2<arr2[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return arr2[start];
    }
    private static int floor(int[] arr2, int target2) {
        if(arr2[0]>target2){return -1;}
        int start = 0 , end = arr2.length-1, mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(target2==arr2[mid]){
                return arr2[mid];
            }
            if(target2<arr2[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return arr2[end];
    }
}
