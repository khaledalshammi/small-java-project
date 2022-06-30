import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Coll_Of_All {
    public static ArrayList<PP> people = new ArrayList<>();
    //ArrayList that take P object its name is: people

    public static void people(){
        for(PP p: people){ //we want to get all people individually by each for loop
            System.out.println(p.getNn()+"-"+p.getId_n()); //then we want to show its toString() method
        }}
    public static void Add_DS(PP p, DdSs ds){ //we want to give treatment to patient
        if (!people.contains(p)){ //we want to check if the patient is exists or no
            System.out.println(p.getNn()+" is not exist, with us");
            //if the patient isn't exist we will appear message
            //that says patient is not exist
        }else{
            //if the patient is exists we need to check about how many times the patient took the treatment
            if(p.getL_O_D().size() >= 3){//if the patient took 3 does that means he/her took the full treatment
                //so he/her mustn't take more dose
                System.out.println(p.getNn()+" can't take more treatment");
                //let doctor know that patient took full treatment
            }else{
                //if the patient took less than 3 doses we can give him/her the treatment
                p.getL_O_D().add(ds);
                //retrieve ArrayList to add that dose to list of dose that related to patient
                System.out.println("all right, "+p.getNn()+" took "+p.getL_O_D().size()+" by "+ds.getHp().getNn());
                //let doctor know that patient took the treatment
            }}}

    public static boolean ck(PP pp){//method that take argument of PP class
        boolean exist = false;
        for(PP e: people){//for each to check
            if(e.getId_n() == pp.getId_n()){//if that id is already exist
                exist = true;//if exist return true
            }}
        return exist;
    }

    public static void Add_People(PP p){
        if (people.contains(p) || ck(p) == true){//check if that people or that id is already exist
            System.out.println(p.getNn()+"-"+p.getId_n()+" is exist");
            //so we can appear message by his/her name with is exists
        }else{//if is not exist in our ArrayList we will add it
            people.add(p);//add is ArrayList attributes to add value or object to ArrayList
            System.out.println("Done");//show small message to know that person is added to ArrayList
        }}

    public static void Done() throws FileNotFoundException { //we want to print our project in our file
         //we can use throws instead of try/catch with PrintWriter it will work as it
            PrintWriter k = new PrintWriter("khaledalshammi_200941.txt");
            //we defined the file that we want to write inside it
            for(PP p:people){ //we want to print each people individually by each for loop
                k.println(p);//it will print the project in Separate line, line by line
            }k.close(); //we have to close k to save it
            System.out.println("ok, every thing is going alright");
            //show some message to know that file is saved, it doesn't have errors
        }

    public static void two_doses(){
        //we want to check how many people took at least 2 doses of their treatment
        int how_many_people = 0;
        //we need variable to collect how many people took at least 2 doses of their treatment
        for (PP kh : people){ //we want to get all people individually by each for loop
            if (kh.getL_O_D().size()>1){ //we retrieve the number of treatment that patient took it
                how_many_people +=1; //if he/her took 2 or 3 doses we will rise the number of people
                // that took at least 2 doses
            }}
        System.out.println("there are/is "+how_many_people+" people who took 2 or more treatment");
        //when we call that method we want to let doctor
        //know how many people took 2 or 3 doses of their treatment
    }}