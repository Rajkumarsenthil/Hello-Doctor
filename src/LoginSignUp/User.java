package LoginSignUp;
public class User {
    private String doctor_id;
    private String doctor_name;
    private String specialization;
    private String cont_number;
    private String clin_address;
    private String date_time;
    private int rating;
    
    public User(String Doctor_id,String Doctor_name,String Specialization,String Cont_number,String Clin_address,int Rating){
        this.doctor_id=Doctor_id;
        this.doctor_name=Doctor_name;
        this.specialization=Specialization;
        this.cont_number=Cont_number;
        this.clin_address=Clin_address;
        
        this.rating=Rating;
    }
    public String getDoctor_id(){
        return doctor_id;
    }
    public String getDoctor_name(){
        return doctor_name;
    }
    public String getSpecialization(){
        return specialization;
    }
    public String getCont_number(){
        return cont_number;
    }
    public String getClin_address(){
        return clin_address;
    }
    
    public int getRating(){
        return rating;
    }
    
    
}
