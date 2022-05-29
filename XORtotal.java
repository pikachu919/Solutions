public class XORtotal {
    public static int subsetxor(int []arr,int indexlvl,int xor){
        if(indexlvl==arr.length)
            return xor;
        int subin=subsetxor(arr,indexlvl+1,xor^arr[indexlvl]);
        int subex=subsetxor(arr,indexlvl+1,xor);
        return subex+subin;
    }
    public static void main(String[] args) {


        int arr[] = {  3, 1};
        int idlvl=0;
        int xor=0;
      var result=  subsetxor(arr,idlvl,xor);
        System.out.println(result);
    }}
