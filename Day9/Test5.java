public class Test5 {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < arr.length; i++) {
            if(i % 2 ==0){
                arr[i] /= 2;
            }else{
                arr[i] *= 2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
