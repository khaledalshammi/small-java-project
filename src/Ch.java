import java.io.FileNotFoundException;
import java.util.Collections;

public class Ch {
    public static void main(String[] args) throws FileNotFoundException {
        Hh_Pp nurse_1 = new Hh_Pp(41,"fadii",6);
        Hh_Pp nurse_2 = new Hh_Pp(21,"shammi",13);
        Hh_Pp nurse_3 = new Hh_Pp(37,"alheman",24);
        Hh_Pp nurse_4 = new Hh_Pp(30,"aldawod",40);
        Hh_Pp nurse_5 = new Hh_Pp(46,"fadam",23);
        Hh_Pp nurse_6 = new Hh_Pp(23,"hower",1);
        Hh_Pp nurse_7 = new Hh_Pp(20,"jouma",20);
        Hh_Pp nurse_8 = new Hh_Pp(65,"zaiyd",16);
        Hh_Pp nurse_9 = new Hh_Pp(64,"sarmenie",33);

        DdSs treatment_1 = new DdSs("Measles","1995","A-P",nurse_1);
        DdSs treatment_2 = new DdSs("Diphtheria","1978","Albaten",nurse_4);
        DdSs treatment_3 = new DdSs("Rabies","1931","H-W",nurse_8);
        DdSs treatment_4 = new DdSs("Epinephrine","2009","Adan",nurse_9);
        DdSs treatment_5 = new DdSs("Pyridoxine","1892","Qahera",nurse_5);
        DdSs treatment_6 = new DdSs("Hepatiti-A","1999","Shariqa",nurse_6);
        DdSs treatment_7 = new DdSs("Riboflavin","1887","Oman",nurse_3);
        DdSs treatment_8 = new DdSs("Thiamine","1955","Salmiya",nurse_5);
        DdSs treatment_9 = new DdSs("Poliomyelitis","1744","Madrid",nurse_4);
        DdSs treatment_10 = new DdSs("fever","1500","S-W",nurse_1);
        DdSs treatment_11 = new DdSs("Hepatiti-B","1900","USA",nurse_6);
        DdSs treatment_12 = new DdSs("Acyclovir","1789","Istanpol",nurse_9);
        DdSs treatment_13 = new DdSs("Pertussis","2021","Altaif",nurse_2);
        DdSs treatment_14 = new DdSs("Simvastatin","2006","Maka",nurse_1);

        PP zakrea = new PP(66,"Zakarea",79.32,45,"indian",175.3);
        PP assel = new PP(32,"Assel",87.24,63,"Japan",155.6);
        PP ehsan = new PP(12,"Ehsan",137.96,21,"kuwait",182.6);
        PP taha = new PP(30,"Taha",72.38,17,"Oman",165.8);
        PP saja = new PP(20,"Saja",62.70,23,"Brazil",159.0);
        PP mousa = new PP(75,"Mousa",20.73,6,"Canada",95.0);
        PP hamdon = new PP(10,"Hamdon",42.50,28,"Lebanon",2.1);

        System.out.println(zakrea.toString());
        System.out.println(assel.toString());
        System.out.println(treatment_4.toString());
        System.out.println(treatment_8.toString());
        System.out.println(nurse_3.toString());
        System.out.println(nurse_9.toString());

        Coll_Of_All.Add_People(zakrea);
        Coll_Of_All.Add_People(zakrea);
        Coll_Of_All.Add_People(assel);
        Coll_Of_All.Add_People(ehsan);
        Coll_Of_All.Add_People(taha);
        Coll_Of_All.Add_People(saja);
        Coll_Of_All.Add_People(mousa);
        Coll_Of_All.Add_People(saja);
        Coll_Of_All.Add_People(hamdon);

        Coll_Of_All.Add_DS(zakrea,treatment_3);
        Coll_Of_All.Add_DS(zakrea,treatment_4);
        Coll_Of_All.Add_DS(zakrea,treatment_1);
        Coll_Of_All.Add_DS(zakrea,treatment_2);
        Coll_Of_All.Add_DS(ehsan,treatment_5);
        Coll_Of_All.Add_DS(ehsan,treatment_9);
        Coll_Of_All.Add_DS(assel,treatment_12);
        Coll_Of_All.Add_DS(mousa,treatment_6);
        Coll_Of_All.Add_DS(hamdon,treatment_7);
        Coll_Of_All.Add_DS(hamdon,treatment_14);
        Coll_Of_All.Add_DS(saja,treatment_10);
        Coll_Of_All.Add_DS(saja,treatment_8);
        Coll_Of_All.Add_DS(saja,treatment_11);
        Coll_Of_All.Add_DS(saja,treatment_13);

        Coll_Of_All.two_doses();
        Coll_Of_All.people();

        System.out.println(zakrea.getAg());
        System.out.println(zakrea.getNatlity());
        System.out.println(treatment_4.getHp());
        System.out.println(treatment_8.getTt_Mm());
        System.out.println(nurse_3.getEx());
        System.out.println(nurse_9.getNn());

        zakrea.setHt(191.0);
        zakrea.setNatlity("syria");
        treatment_4.setHp(nurse_4);
        treatment_8.setTt_Mm("1922");
        nurse_3.setEx(47);
        nurse_9.setNn("hadi");

        System.out.println(zakrea.getAg());
        System.out.println(zakrea.getNatlity());
        System.out.println(treatment_4.getHp());
        System.out.println(treatment_8.getTt_Mm());
        System.out.println(nurse_3.getEx());
        System.out.println(nurse_9.getNn());
        System.out.println(hamdon.getL_O_D());
        System.out.println(mousa.toString());
        System.out.println(taha.toString());
        System.out.println(treatment_3.toString());
        System.out.println(treatment_5.toString());
        System.out.println(nurse_7.toString());
        System.out.println(nurse_5.toString());

        Collections.sort(Coll_Of_All.people);
        Coll_Of_All.people();

        System.out.println(zakrea.equals(ehsan));
        System.out.println(assel.equals(hamdon));
        System.out.println(saja.equals(taha));
        System.out.println(zakrea.equals(zakrea));
        PP z = new PP(66,"daf",79,45,"k",17);
        Coll_Of_All.Add_People(z);
        Coll_Of_All.Done();
    }}