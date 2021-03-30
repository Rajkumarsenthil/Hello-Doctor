/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginSignUp;

/**
 *
 * @author 18tuc
 */
class RUser {
   
     String patient_id="",feedback="",r;
    int rating=0;
    RUser(String string, int aInt, String string0) {
        this.patient_id=string;
        this.feedback=string0;
        this.rating=aInt;
        
    }
    public String getid()
    {
        return patient_id;
    }
     public String getre()
    {
        return feedback;
    }
     public int getra()
    {
        return rating;
    }
     
}
