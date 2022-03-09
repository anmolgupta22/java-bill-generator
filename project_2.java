package project;
import java.awt.*;
import java.util.*;
class data {
    float bill_Amount, unit, fans,fans_long, light,light_long, ac,ac_long,ac_temp,
            cooler,cooler_long, refrigerator,refrigerator_long,
            Mobile_laptop,Mobile_laptop_long;
    float fan,fans_watt=0.06f,Light,light_watt=0.012f, Ac,ac_unit=0,Cooler,cooler_watt=0.2f,
            refri,refri_watt=0, area_temp,total, day2=25,day=30,day1=27,day3=28,day4_ac=23;
    void entervalues() {
        Scanner key=new Scanner(System.in);
        System.out.print("Enter the electric Bills amount                                                =");
        bill_Amount =key.nextFloat();

        System.out.print("Enter the electric unit                                                        =");
        unit =key.nextFloat();
        System.out.print("How many fans are there and how long does run in average(hours)                =");
        fans=key.nextFloat();
        fans_long= key.nextFloat();
        System.out.print("How many electric lights are there and how long does run in average(hours)     =");
        light=key.nextFloat();
        light_long=key.nextFloat();
        System.out.print("How many Air Conditioner(Ac) are there and how long does run in average(hours) =");
        ac=key.nextFloat();
        ac_long=key.nextFloat();
        System.out.print("Enter average Ac temperature                                                   =");
        ac_temp=key.nextFloat();
        System.out.print("How many cooler are there and how long does run in average(hours)              =");
        cooler=key.nextFloat();
        cooler_long=key.nextFloat();
        System.out.print("How many refrigerator are there and how long does run in average(hours)        =");
        refrigerator= key.nextFloat();
        refrigerator_long=key.nextFloat();
        System.out.print("Enter Area temperature                                                         =");
        area_temp=key.nextFloat();
//        System.out.print("How many Mobiles & laptop are there and how long does run in average(hours)    =");
//        Mobile_laptop =key.nextFloat();
//        Mobile_laptop_long=key.nextFloat();
    }
    void logic()
    {
// per unit charge
        float unit_charge=bill_Amount/unit;
// fans logic
fan =fans*fans_long;
fan=fan*fans_watt;
fan=fan*day2;
fan=fan*unit_charge;

//Light logic
        Light=light*light_long;
        Light=Light*light_watt;
        Light=Light*day;
        Light=Light*unit_charge;
// ac logic

        if(ac_long>=1 && ac_long<=1.5) {
            if(ac_temp>=18 && ac_temp<=25) {
                ac_unit = 1.7f;
            }
            else if(ac_temp==26)
            {
                ac_unit=1.5f;
            }
            else if(ac_temp==27)
            {
                ac_unit=1f;
            }
            else if(ac_temp==28)
            {
                ac_unit=0.8f;
            }
            else if(ac_temp==29 && ac_temp==30)
            {
                ac_unit=0.5f;
            }
            else {
                ac_unit = 0f;
            }
        }
        else if(ac_long>=1.6 && ac_long<=3)
        {
            if(ac_temp>=18 && ac_temp<=22) {
                ac_unit = 2.8f;
            }
            else if(ac_temp==23 && ac_temp==25)
            {
                ac_unit=2.5f;
            }
            else if(ac_temp==26)
            {
                ac_unit=2.2f;
            }
            else if(ac_temp==27)
            {
                ac_unit=2f;
            }
            else if(ac_temp==28)
            {
                ac_unit=1.7f;
            }
            else if(ac_temp==29 && ac_temp==30)
            {
                ac_unit=1f;
            }
            else {
                ac_unit = 0f;
            }
        }
        else if(ac_long>3.1 && ac_long<=4)
        {
            if(ac_temp>=18 && ac_temp<=22) {
                ac_unit = 3.5f;
            }
            else if(ac_temp==23 && ac_temp==25)
            {
                ac_unit=3f;
            }
            else if(ac_temp==26)
            {
                ac_unit=2.5f;
            }
            else if(ac_temp==27)
            {
                ac_unit=2.2f;
            }
            else if(ac_temp==28)
            {
                ac_unit=1.9f;
            }
            else if(ac_temp==29 && ac_temp==30)
            {
                ac_unit=1.4f;
            }
            else {
                ac_unit = 0f;
            }
        }
        else if(ac_long>=4.1 && ac_long<=5)
        {
            if(ac_temp>=18 && ac_temp<=22) {
                ac_unit = 4f;
            }
            else if(ac_temp==23 && ac_temp==25)
            {
                ac_unit=3.7f;
            }
            else if(ac_temp==26)
            {
                ac_unit=3f;
            }
            else if(ac_temp==27)
            {
                ac_unit=2.5f;
            }
            else if(ac_temp==28)
            {
                ac_unit=2.1f;
            }
            else if(ac_temp==29 && ac_temp==30)
            {
                ac_unit=1.7f;
            }
            else {
                ac_unit = 0f;
            }
        }
        else if(ac_long>=5.1 && ac_long<=7){
            if(ac_temp>=18 && ac_temp<=22) {
                ac_unit = 5.5f;
            }
            else if(ac_temp==23 && ac_temp==25)
            {
                ac_unit=4.7f;
            }
            else if(ac_temp==26)
            {
                ac_unit=4f;
            }
            else if(ac_temp==27)
            {
                ac_unit=3.5f;
            }
            else if(ac_temp==28)
            {
                ac_unit=2.7f;
            }
            else if(ac_temp==29 && ac_temp==30)
            {
                ac_unit=2.1f;
            }
            else {
                ac_unit = 0f;
            }
        }
        else if(ac_long>=7.1 && ac_long<=10){
            if(ac_temp>=18 && ac_temp<=22) {
                ac_unit = 8f;
            }
            else if(ac_temp==23 && ac_temp==25)
            {
                ac_unit=7f;
            }
            else if(ac_temp==26)
            {
                ac_unit=6f;
            }
            else if(ac_temp==27)
            {
                ac_unit=4.5f;
            }
            else if(ac_temp==28)
            {
                ac_unit=3.2f;
            }
            else if(ac_temp==29 && ac_temp==30)
            {
                ac_unit=2.8f;
            }
            else {
                ac_unit = 0f;
            }
        }
        else if(ac_long>=10.1 && ac_long<=15)
        {
            if(ac_temp>=18 && ac_temp<=22) {
                ac_unit = 12f;
            }
            else if(ac_temp==23 && ac_temp==25)
            {
                ac_unit=9f;
            }
            else if(ac_temp==26)
            {
                ac_unit=7.5f;
            }
            else if(ac_temp==27)
            {
                ac_unit=6f;
            }
            else if(ac_temp==28)
            {
                ac_unit=4.7f;
            }
            else if(ac_temp==29 && ac_temp==30)
            {
                ac_unit=3.7f;
            }
            else {
                ac_unit = 0f;
            }
        }
        else if(ac_long>=15.1 && ac_long<=20)
        {
            if(ac_temp>=18 && ac_temp<=22) {
                ac_unit = 15f;
            }
            else if(ac_temp==23 && ac_temp==25)
            {
                ac_unit=12f;
            }
            else if(ac_temp==26)
            {
                ac_unit=9.5f;
            }
            else if(ac_temp==27)
            {
                ac_unit=8f;
            }
            else if(ac_temp==28)
            {
                ac_unit=6.7f;
            }
            else if(ac_temp==29 && ac_temp==30)
            {
                ac_unit=5f;
            }
            else {
                ac_unit = 0f;
            }
        }
        else if(ac_long>=5 && ac_long<=24)
        {

            if(ac_temp>=18 && ac_temp<=22) {
                ac_unit = 15f;
            }
            else if(ac_temp==23 && ac_temp==25)
            {
                ac_unit=12f;
            }
            else if(ac_temp==26)
            {
                ac_unit=9.5f;
            }
            else if(ac_temp==27)
            {
                ac_unit=8f;
            }
            else if(ac_temp==28)
            {
                ac_unit=6.7f;
            }
            else if(ac_temp==29 && ac_temp==30)
            {
                ac_unit=5f;
            }
            else {
                ac_unit = 0f;
            }
        }
        else {
            ac_unit = 0;
        }
        Ac=ac*ac_unit;
        Ac=Ac*day4_ac;
        Ac=Ac*unit_charge;

        //cooler logic
        Cooler=cooler*cooler_long;
        Cooler=Cooler*cooler_watt;
        Cooler=Cooler*day1;
        Cooler=Cooler*unit_charge;
        //refrigerator logic
        if(area_temp>=-10 && area_temp<=0)
        {
            refri_watt=0.015f;
        }
        else if(area_temp>=1 && area_temp<=5)
        {
            refri_watt=0.030f;
        }
        else if(area_temp>=6 && area_temp<=10)
        {
            refri_watt=0.040f;
        }
        else if(area_temp>=10 && area_temp<=15)
        {
            refri_watt=0.045f;
        }
        else if(area_temp>=16 && area_temp<=20)
        {
            refri_watt=0.050f;
        }
        else if(area_temp>=21 && area_temp<=25)
        {
            refri_watt=0.070f;
        }
        else if(area_temp>=26 && area_temp<30)
        {
            refri_watt=0.080f;
        }
        else if(area_temp>=31 && area_temp<=35)
        {
            refri_watt=0.095f;
        }
        else if(area_temp>=36 && area_temp<=40)
        {
            refri_watt=0.107f;
        }
        else if(area_temp>=41 && area_temp<=45)
        {
            refri_watt=0.118f;
        }
        else if(area_temp>=46 && area_temp<=50)
        {
            refri_watt=0.125f;
        }
        else if(area_temp==0)
        {
            refri_watt=0f;
        }
        else
        {
            System.out.println("Enter Refrigerator temperature very high in this condition refrigerator can not survive");
        }

        refri=refrigerator*refrigerator_long;
        refri=refri*refri_watt;
        refri=refri*day3;
        refri=refri*unit_charge;
        //total
        total=refri+Cooler+fan+Light+Ac;

    }
    void Display()
    {
        System.out.println();
        System.out.println("***********************************************************************************");
        System.out.println();
    System.out.println("fans bills                                                                     ="+fan);
    System.out.println("light bills                                                                    ="+Light);
    System.out.println("Ac bills                                                                       ="+Ac);
    System.out.println("Cooler bills                                                                   ="+Cooler);
    System.out.println("Refrigerator bills                                                             ="+refri);
    System.out.println("Approximatively Total bills amount depend on enter all the details             ="+total);
    }
}
    public class project_2 {
        public static void main(String[] args) {
data da=new data();
da.entervalues();
da.logic();
da.Display();
        }
    }