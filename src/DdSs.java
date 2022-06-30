public class DdSs {

    //instances:
    private String Mm_Ff; //variable: manufacturing
    private String Tt_Mm; //when the dose has token, variable: time
    private String Pp_Cc; //where the dose has token, variable: place
    private Hh_Pp Hh_Pp; //object from h_p

//----------------------------------------------------------------------------------------------------------------------

    //constructor method

    public DdSs(String facture, String date, String p, Hh_Pp hhpp) {//constructor with four arguments
        this(hhpp); //invoke constructor that has one argument
        this.Mm_Ff = facture; //facture will be the new value
        this.Tt_Mm = date; //date will be the new value
        this.Pp_Cc = p; //P will be the new value
    }

    public DdSs() {//default constructor, it will be with default values for instance
        //default value for String:null, object:null
        //this keyword that used in invoke constructor
        this(null,null,null,null);
        //invoke the four arguments constructor with default value
    }

    public DdSs(Hh_Pp pphh){//constructor with one argument
        this.Hh_Pp = pphh; //pphh will be the new value
    }

//----------------------------------------------------------------------------------------------------------------------

    //getter method for all instance

    public String getTt_Mm() {//if we call it, it will return(get) the value of time
        //we will use return instead of System.out.println()
        //because we used String instead of void,
        //so we have to return String value
        return Tt_Mm;
    }

    public String getMm_Ff() {//if we call it, it will return(get) the value of manufacturing
        //we will use return instead of System.out.println()
        //because we used String instead of void,
        //so we have to return String value
        return Mm_Ff;
    }

    public Hh_Pp getHp() {//if we call it, it will return(get) the h_p object
        //we will use return instead of System.out.println()
        //because we used h_p instead of void,
        //so we have to return object from h_p
        return Hh_Pp;
    }

    public String getPp_Cc() {//if we call it, it will return(get) the value of place
        //we will use return instead of System.out.println()
        //because we used String instead of void,
        //so we have to return String value
        return Pp_Cc;
    }

//----------------------------------------------------------------------------------------------------------------------

    //setter method for all instance

    public void setPp_Cc(String plc) {//if we call it, it will change the value of place
        this.Pp_Cc = plc;//plc will be the new value
    }

    public void setMm_Ff(String mf) {//if we call it, it will change the value of manufacturing
        this.Mm_Ff = mf;//mf will be the new value
    }

    public void setHp(Hh_Pp h) {//if we call it, it will change the value of experience
        this.Hh_Pp = h;//h will be the new value
    }

    public void setTt_Mm(String tm) {//if we call it, it will change the value of time
        this.Tt_Mm = tm;//tm will be the new value
    }

//----------------------------------------------------------------------------------------------------------------------

    //ToString method
    //ToString is overwriting method

    public String toString() {//if we call it
        //it will give information about our instance
        //we will use return instead of System.out.println()
        //because we used String instead of void,
        //so we have to return String value
        return "Treat:"+this.Mm_Ff +" time:"+this.Tt_Mm + " where:"+
                this.Pp_Cc + " name-Id:"+this.Hh_Pp.getNn()+"-"+this.Hh_Pp.getId_n();
    }}
