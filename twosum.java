public class twosum{
    public static void main(String[] args) {
        int arr[]={5,2,3,1,6,9};
        int target=3;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("target is in a"+" "+arr[i]);
                }
            }
        }
    }

}
    
