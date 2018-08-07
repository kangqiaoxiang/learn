package Hash;

/**
 * Created by Administrator on 2018/8/6.
 */
public class Student {
    private int grade;
    private int cls;
    private String firstName;
    private String lastName;

    @Override
    public int hashCode(){
        int B = 31;

        int hash = 0;
        hash = hash * B +  grade;
        hash = hash * B + cls;
        hash = hash * B + firstName.toLowerCase().hashCode();
        hash = hash * B + lastName.toLowerCase().hashCode();
        return hash ;
    }

    @Override
    public boolean equals (Object o){
        if(this == o){
            return true;
        }
        if(o == null){
            return false;
        }
        if(getClass() != o.getClass()){
            return false;
        }
        return false;

    }
}
