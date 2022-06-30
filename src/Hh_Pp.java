public class Hh_Pp extends inherit {

    //we extended inherit to prevent repetition because we don't need
    //to make name and id_number many times
    //our variables must be private

    //instance:
    private int ex_p; //variable: experience

//----------------------------------------------------------------------------------------------------------------------

    //constructor method

    public Hh_Pp(int num, String nm, int e_x_p) { //constructor with three arguments
        //two of them will be for class that we inherited
        super(num, nm);//super keyword will perform the constructor that has two arguments in inherit class
        this.ex_p = e_x_p; //gives value for experience
    }

    public Hh_Pp(){ //default constructor, it will be with default values
        //default value for int:0, String:null
        //this keyword that used in invoke constructor
        this(0,null,0);//invoke the three arguments constructor with default value
    }

//----------------------------------------------------------------------------------------------------------------------

    //setter method for instance

    public void setEx(int exp) { //if we call it, it will change the value of experience
        this.ex_p = exp; //exp will be the new value
    }

//----------------------------------------------------------------------------------------------------------------------

    //getter method for instance

    public int getEx() { //if we call it, it will return(get) the value of experience
        //we will use return instead of System.out.println()
        //because we used int instead of void,
        //so we have to return integer value
        return ex_p;
    }

//----------------------------------------------------------------------------------------------------------------------

    //ToString method
    //ToString is overwriting method

    public String toString() { //if we call it
        //it will give information about our instance
        //super.toString() implement toString() that's exist in inherit class
        //we will use return instead of System.out.println()
        //because we used String instead of void,
        //so we have to return String value
        return super.toString()+" experience years:"+this.ex_p;
    }
}
