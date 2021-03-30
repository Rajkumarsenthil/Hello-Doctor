
package LoginSignUp;

public class DUser {
    String name="",dob="",age="",gen="",add="",spe="",contact="",pwd="",repwd="",govid="",uname="";
   public DUser(String a,String b,String c,String d,String e,String f,String g ,String h,String i,String j,String k)
   {
    this.name=a;
    this.dob=b;
    this.age=c;
    this.gen=d;
    this.add=e;
    this.spe=f;
    this.contact=g;
    this.govid=h;
    this.uname=i;
    this.pwd=j;
    this.repwd=k;
}
   public String getname()
   {
       return name;
   }
   public String getdob()
   {
       return dob;
   }
   public String getage()
   {
       return age;
   }
   public String getgen()
   {
       return gen;
   }
   public String getadd()
   {
       return add;
   }
   public String getspe()
   {
       return spe;
   }
   public String getcontact()
   {
       return contact;
   }
   public String getpwd()
   {
       return pwd;
   }
   public String getrepwd()
   {
       return repwd;
   }
   public String getgovid()
   {
       return govid;
   }
   public String getuname()
   {
       return uname;
   }
}
