public class test2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] reArr = new int[arr.length];

        for (int i = 0, value = 0; i < arr.length; i++) {
            arr[i] = value++;
            System.out.println("arr[" + value + "] 값은 : " + arr[i] );
        }

        System.out.println();

        for (int i = arr.length - 1, value = arr.length + 1; i >= 0; i--) {
            reArr[i] = i;
            value--;
            System.out.println("arr[" + value + "] 값은 : " + reArr[i]);
            }
    }
}
