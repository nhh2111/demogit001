public class page74c2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        String str = "";
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                str = str + arr[i] + " + ";
                sum += arr[i];
            }
        }
        str = str.substring(0, str.length() - 2);
        System.out.println("tong cac so chan trong mang la: " +str+ " = " +sum);
    }
}
