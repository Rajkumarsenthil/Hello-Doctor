/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginSignUp;

import java.sql.Date;

/**
 *
 * @author 18tuc
 */
class User_1 {
     String api,ui,di,time,re,da,date;
    public User_1(String api,String ui,String di,String da,String date,String time,String re)
    {
        this.api=api;
        this.ui=ui;
        this.time=time;
        this.date=date;
        this.re=re;
        this.di=di;
        this.da=da;
    }
    public String getapi()
    {
        return api;
    }
    
    public String getui()
    {
        return ui;
    }
    
    public String getdi()
    {
        return di;
    }
    
    public String gettime()
    {
        return time;
    }
    public String getdate()
    {
        return date;
    }
    public String getre()
    {
        return re;
    }
    
}
