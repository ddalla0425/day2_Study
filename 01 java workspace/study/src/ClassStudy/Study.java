package ClassStudy;

public class Study {
    //필드 선언부
    private int studentNum;
    private String studentName;
    private int studentAge;

    //생성자 선언부
    public Study (int num, String name) {
        this.studentNum = num;
        this.studentName = name;
    }
    public Study (int num, String name, int age){
        this.studentNum = num;
        this.studentName = name;
        this.studentAge = age;

    }
    //메소드 선언부
    public String getInfo() {
        return "Study[studentNum=" + this.studentNum + ", studentName=" + this.studentName + ", studentAge=" + this.studentAge +"]";
    }

}


