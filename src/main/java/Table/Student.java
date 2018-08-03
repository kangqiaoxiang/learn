package Table;

/**
 * Created by Administrator on 2018/4/25.
 */
public class Student extends People{
    private String sId; //学号
    //Constructor
    public Student() {
        this("","","");
    }
    public Student(String name,String id,String sId){
        super(name,id);
        this.sId = sId;
    }
    public void sayHello(){
        super.sayHello();
        System.out.println("I am a student of department of computer science.");
    }
    //get & set method
    public String getSId(){
        return this.sId;
    }
    public void setSId(String sId){
        this.sId = sId;
       String s = new String();
    }

}
