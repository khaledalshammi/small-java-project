import java.util.ArrayList;
public class PP extends inherit implements Comparable<PP>{

    //we implemented comparable interface class, so we have
    //to apply all abstract method that's have
    //we extended inherit to prevent repetition because we don't need
    //to make name and id_number many times
    //our variables must be private

    //instances:
    private double wt; //variable: weight
    private int ag; //variable: age
    private String natlity; //variable: nationality
    private double ht; //variable: height
    private ArrayList<DdSs> L_O_D; //ArrayList: list of doses

//----------------------------------------------------------------------------------------------------------------------

    //constructor method

    public PP(int Ii_Dd, String N_n, double w_t, int a_g, String n, double h_t) {
        //constructor with six arguments
        //two of them will be for class that we inherited
        this(Ii_Dd,N_n,w_t);//invoke from two arguments constructor
        this.ag = a_g; //a_g will be the new value of age
        this.natlity = n; //n will be the new value of nationality
        this.ht = h_t; //h_t will be the new value of height
    }

    public PP() {//default constructor, it will be with default values for all instance
        //default value for int:0, String:null
        //this keyword that used in invoke constructor
        this(0,null,0,0,null,0);//invoke the six arguments constructor with default value
    }
    public PP(int ad, String Nn_Mm, double Ww_Tt){//constructor that takes three arguments
        super(ad,Nn_Mm);
        //super keyword will perform the constructor that has two arguments in inherit class
        this.wt = Ww_Tt;//w_t will be the new value of weight
        this.L_O_D = new ArrayList<>(); //ArrayList initialisation
    }

//----------------------------------------------------------------------------------------------------------------------

    //getter methods

    public String getNatlity() { //if we call it, it will return(get) the value of nationality
        //we will use return instead of System.out.println()
        //because we used String instead of void,
        //so we have to return String value
        return natlity;}

    public double getWt() { //if we call it, it will return(get) the value of weight
        //we will use return instead of System.out.println()
        //because we used int instead of void,
        //so we have to return integer value
        return wt;}

    public int getAg() { //if we call it, it will return(get) the value of age
        //we will use return instead of System.out.println()
        //because we used int instead of void,
        //so we have to return integer value
        return ag;}

    public ArrayList<DdSs> getL_O_D() { //if we call it, it will return(get) the list of list_of_doses
        //we will use return instead of System.out.println()
        //because we used ArrayList instead of void,
        //so we have to return list of values
        return this.L_O_D;}

    public double getHt() { //if we call it, it will return(get) the value of height
        //we will use return instead of System.out.println()
        //because we used int instead of void,
        //so we have to return integer value
        return ht;}

//----------------------------------------------------------------------------------------------------------------------

    //setter methods

    public void setNatlity(String n_ty) { //if we call it, it will change the value of nationality
        this.natlity = n_ty;} //n_ty will be the new value

    public void setWt(double w_t) { //if we call it, it will change the value of weight
        this.wt = w_t; //w_t will be the new value
    }

    public void setL_O_D(ArrayList<DdSs> l_o_ds) { //if we call it, it will change the list of doses
        this.L_O_D = l_o_ds;} //l_o_ds will be the new list for list_of_doses

    public void setHt(double h_ght) { //if we call it, it will change the value of height
        this.ht = h_ght;} //h_ght will be the new value

    public void setAg(int g) { //if we call it, it will change the value of age
        this.ag = g;} //g will be the new value

//----------------------------------------------------------------------------------------------------------------------

    //compareTo implement abstract method

    public int compareTo(PP gh) { //we use it to sort ArrayList
        if (gh.getId_n() > getId_n()){
            return -1; //we returned -1 because we want to sort it from smallest to biggest
        }else if(gh.getId_n() < getId_n()){
            return 1;
        }else{
            return 0;}}

    //equals is overwriting method

    public boolean equals(PP g){ //we use it to compare between two object of people
        return g.getId_n() == getId_n();} //check for equality

//----------------------------------------------------------------------------------------------------------------------

    //ToString method
    //ToString is overwriting method

    public String ck(){//method without argument
        if (this.L_O_D.size()==0){//check if the size of arraylist equal 0
            return super.toString() + " weight:" + this.wt + " age:" + this.ag +
                    " state:" + this.natlity + " height:" + this.ht +
                    "\n\t dose: None" ;
        }
        else{//if not equal zero
            return super.toString() + " weight:" + this.wt + " age:" + this.ag +
                    " state:" + this.natlity + " height:" + this.ht +
                    "\n\t dose:" + this.L_O_D;
        }
    }

    public String toString() {//if we call it
        //it will give information about our instance
        //super.toString() implement toString() that's exist in inherit class
        //we will use return instead of System.out.println()
        //because we used String instead of void,
        //so we have to return String value
        //we call the ck method that return String
        return ck();
        }}