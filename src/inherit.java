public abstract class inherit {
    //we made it abstract to prevent(ignore) create object from this class
    //we will use this class to inherit name/id_number
    //we will create two instance about patient(id_number,name)
    //our variables must be private

    //instances:
    private int id_n; //variable: id_number
    private String Nn; //variable: name

//----------------------------------------------------------------------------------------------------------------------

    //constructor method

    public inherit(){ //default constructor, it will be with default values
        //default value for int:0, String:null
        //this keyword that used in invoke constructor
        this(0,null); //invoke the two arguments constructor
    }

    public inherit(int number, String name){ //constructor with two arguments
        this.id_n = number; //number will be the new value
        this.Nn = name; //name will be the new value
    }

//----------------------------------------------------------------------------------------------------------------------

    //setter methods

    public void setNn(String nm) { //if we call it, it will change the value of name
        this.Nn = nm; //nm will be the new value
    }

    public void setId_n(int id) {//if we call it, it will change the value of id_number
        this.id_n = id; //id will be the new value
    }

//----------------------------------------------------------------------------------------------------------------------

    //getter methods

    public int getId_n() { //if we call it, it will return(get) the value of id_number
        //we will use return instead of System.out.println()
        //because we used int instead of void,
        //so we have to return integer value
        return id_n;
    }

    public String getNn() { //if we call it, it will return(get) the value of name
        //we will use return instead of System.out.println()
        //because we used String instead of void,
        //so we have to return String value
        return Nn;
    }

//----------------------------------------------------------------------------------------------------------------------

    //ToString method
    //ToString is overwriting method

    public String toString() { //if we call it
        //it will give information about all instance
        //we will use return instead of System.out.println()
        //because we used String instead of void,
        //so we have to return String value
        return "Id-number:"+this.id_n+" his/her-name:"+this.Nn;
    }}
