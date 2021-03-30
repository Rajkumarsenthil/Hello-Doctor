package LoginSignUp;
public class info {
    private String patient_id;
    private String patient_name;
    private String approached_doc_id;
    private String approached_doctor;
    private String prescription_lists;
    private String past_consultations;
    
    public info(String patient_id,String patient_name,String approached_doc_id,String approached_doctor,String past_consultations,String prescription_lists){
        this.patient_id=patient_id;
        this.patient_name=patient_name;
        this.approached_doc_id=approached_doc_id;
        this.approached_doctor=approached_doctor;
        this.prescription_lists=prescription_lists;
        this.past_consultations=past_consultations;
        
    }
     public String getpatient_id(){
        return patient_id;
    }
    public String getpatient_name(){
        return patient_name;
    }
    public String getapproached_doc_id(){
        return approached_doc_id;
    }
    public String getapproached_doctor(){
        return approached_doctor;
    }
    public String getprescription_lists(){
        return prescription_lists;
    }
    public String getpast_consultations(){
        return past_consultations;
    }
    
    
    
}
