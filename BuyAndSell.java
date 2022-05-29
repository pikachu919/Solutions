public class BuyAndSell {
    public static void main(String[] args) {


 int arr[]={7,1,5,3,6,4};
 int N=arr.length;
 int maxtillnow[]=new int[N];
 int tempmax=arr[N-1];
      //using a prefix arr
 for(int i=N-1;i>=0;i--){
     if(arr[i]>tempmax)
         tempmax=arr[i];
     maxtillnow[i]=tempmax;
 }
       
 int maxprofit=0;
 for(int i=0;i<arr.length;i++){
     maxprofit=Math.max(maxprofit,maxtillnow[i]-arr[i]);
    }
        System.out.println(maxprofit);
 }

    }
//time complexity O(N)
//space used O(N)

