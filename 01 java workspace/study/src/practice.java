public class practice {
    public static void main(String[] args) {
        //문제만들어보기
        //region
        //길이가 10인 정수형 배열을 선언 하고 각 인덱스에 순차적으로 1부터 10까지의 값을 출력하고,
        //길이가 10인 정수형 배열을 선언 하고 각 인덱스에 역순으로 10부터 1까지의 값을 출력한다.

        /*출력예시
        =====순차적=====
        arr[0] 값은 : 1
        arr[1] 값은 : 2
        arr[2] 값은 : 3
        arr[3] 값은 : 4
        arr[4] 값은 : 5
        arr[5] 값은 : 6
        arr[6] 값은 : 7
        arr[7] 값은 : 8
        arr[8] 값은 : 9
        arr[9] 값은 : 10

        =====역순=====
        arr[9] 값은 : 10
        arr[8] 값은 : 9
        arr[7] 값은 : 8
        arr[6] 값은 : 7
        arr[5] 값은 : 6
        arr[4] 값은 : 5
        arr[3] 값은 : 4
        arr[2] 값은 : 3
        arr[1] 값은 : 2
        arr[8] 값은 : 1
        */


        int[] arr = new int[10];
        System.out.println("=====순차적=====");
        for(int i=0; i<arr.length;i++){
            arr[i] = i+1;
            System.out.println("arr[" + i +"] 값은 : " + arr[i]);
        }
        System.out.println();
        System.out.println("=====역순=====");

        int reverse = arr.length;
        for(int i=(arr.length -1); i>=0;i--){
            arr[i] = i+1;
            System.out.println("arr[" + i +"] 값은 : " + arr[i]);
        }
        //endregion


        /* 정수를 하나 입력 받아 그 수가 양수이면 "양수다." 라고 출력하고,
         * 양수가 아닌 경우 "양수가 아니다." 라고 출력하세요
         *
         * -- 입력 예시 --
         * 정수를 하나 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 양수다.
         * */
        //1부터 10사이의 정수를 하나 입력받아
        // 그 수가 짝수면 짝수이다.
        //홀수면 홀수이다.
        //1부터 10 사이의 수가 아니면 "1부터 10사이의 숫자를 입력해주세요"
        //
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("1부터 10사이의 정수를 하나 입력해 주세요 : ");
//        int inum = sc.nextInt();
//        if(!(inum < 1 && inum > 10)) {
//            System.out.println("1부터 10 사이의 숫자만 입력 가능합니다.");
//        }
        System.out.println();
int[] arrTest = new int[10];
/* (int i=0; i<arrTest.length; i++){
    arrTest[i] = i+1;
    System.out.println("arrTest["+i+"] = " + arrTest[i]);
}*/
        System.out.println();
        for (int i=arrTest.length; i>0; i--){
            arrTest[i] = i-1;
            System.out.println("arrTest["+i+"] = " + arrTest[i]);
        }

    }
}
