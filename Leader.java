public class Leader {
    public static void main(String[] args) {

 int arr[]={7, 10, 4, 10, 6, 5, 2};
 int maxsofar=arr[arr.length-1];
        System.out.println(maxsofar);

 for(int i=arr.length-1;i>=0;i--){
     if(maxsofar<arr[i]){

         maxsofar=arr[i];
         System.out.println(maxsofar);
     }
 }

    }
}
