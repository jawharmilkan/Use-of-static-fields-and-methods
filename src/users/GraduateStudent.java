 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

/**
 *
 * @author jawhar
 */
public class GraduateStudent extends Student{
    private int noOfPublication;
    private String workExperience;

    public int getNoOfPublication() {
        return noOfPublication;
    }

    public void setNoOfPublication(int noOfPublication) {
        this.noOfPublication = noOfPublication;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }
    
    public String getStringEquivalentofStudent(int fieldCount, int noOfPrecision){
        if(fieldCount==1)
            return "Id="+getId();
        else if(fieldCount==2)
            return "Id="+id+", Name="+name;
                else if(fieldCount==3)
            return "Id="+id+", Name="+name+", Address="+address;
        else if(fieldCount==3)
            return "Id="+id+", Name="+name+", Address="+address;
        else if(fieldCount==4)
            return "Id="+id+", Name="+name+", Address="+address+",NoOfPublications="+noOfPublication;
        else if(fieldCount==5)
            return "Id="+id+", Name="+name+", Address="+address+",NoOfPublications="+noOfPublication+",WorkExperience="+workExperience;
        //else if upto 6
                else return null;
    }
    
    
}
