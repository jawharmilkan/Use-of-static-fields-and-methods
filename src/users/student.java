package users;
import utility.Date;
import utility.courseGradeINfo;
class Matrix{}


public class Student {

    public static String getUniName() {
        return uniName;
    }

    public static void setUniName(String aUniName) {
        uniName = aUniName;
    }
   //int id; private String name,address;
    protected int id; protected String name,address;
    //private String[] grades;
    //private String[] courseIds;
    //private int[] credits;
    private courseGradeINfo[] myGrades;
    private Date dob;
    private static String uniName = "IUB";
    
//    public int getId(){return this.id;}
//    //public void setId(int val) {id=val;}
//    public void setId(int id) {this.id=id;}
    public Student() {
        id=0; name="TBA"; address="TBA";
        
        
    }

    public Student(int id, String name, String address, courseGradeINfo[] myGrades, Date dob) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.myGrades = myGrades;
        this.dob = dob;
    }

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public courseGradeINfo[] getMyGrades() {
        return myGrades;
    }

    public void setMyGrades(courseGradeINfo[] myGrades) {
        this.myGrades = myGrades;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
    public String getStringEquivalentofStudent(){
        String str;
        //str=concatenated string of All fields;
        return str;
    }
    
    public String getStringEquivalentofStudent(int fieldCount){
        if(fieldCount==1)
            return "Id="+id;
        else if(fieldCount==2)
            return "Id="+id+", Name="+name;
                else if(fieldCount==3)
            return "Id="+id+", Name="+name+", Address="+address;
        //else if upto 6
                else return null;
    }
    

    @Override
    public String toString() {
        return "student{" + "id=" + id + ", name=" + name + ", address=" + address + '}';
        
    }
  
    
    
    
    
    
}
    
    
  
