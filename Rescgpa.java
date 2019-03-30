package SGPA;
import credit.Tcredit;
import course.tcourse;
import calculate.CGPA;
import java.util.Scanner;
public class Rescgpa
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       Tcredit tc=new Tcredit();
       tcourse tco=new tcourse();
       CGPA r=new CGPA();
       int t=sc.nextInt();
       int a=sc.nextInt();
       int l=sc.nextInt();
       int gp=0;
       tc.settutorial(t);
       tc.setassign(a);
       tc.setlab(l);
       int cr=tc.gettcredit();
       //System.out.println("Return cr:"+cr);
       while(t!=0)
       {
       String g=sc.next();
       if(g.equals("O"))
       gp=10;
       else if(g.equals("A+"))
       gp=9;
        else if(g.equals("A"))
       gp=8;
        else if(g.equals("B+"))
       gp=7;
       else if(g.equals("B"))
       gp=6;
        else if(g.equals("C"))
       gp=5;
       else if(g.equals("F"))
       gp=0;
       else if(g.equals("AB"))
       gp=0;
       else if(g.equals("W"))
       gp=0;
      // System.out.println(gp);
       tco.caltutorial(gp);
       t--;
       }
       while(a!=0)
       {
           String g=sc.next();
           if(g.equals("O"))
           gp=10;
           else if(g.equals("A+"))
            gp=9;
            else if(g.equals("A"))
            gp=8;
            else if(g.equals("B+"))
            gp=7;
            else if(g.equals("B"))
            gp=6;
            else if(g.equals("C"))
            gp=5;
            else if(g.equals("F"))
            gp=4;
            tco.calassign(gp);
            a--;
       }
       while(l!=0)
       {
           String g=sc.next();
           if(g.equals("O"))
           gp=10;
           else if(g.equals("A+"))
           gp=9;
           else if(g.equals("A"))
           gp=8;
           else if(g.equals("B+"))
           gp=7;
           else if(g.equals("B"))
           gp=6;
           else if(g.equals("C"))
           gp=5;
           else if(g.equals("F"))
           gp=4;
           tco.callab(gp);
           l--;
       }
       int co=tco.getcourse();
      // System.out.println("return co"+co);
      System.out.print("Your CGPA is ");
       System.out.printf("%.2f",r.cgpa(cr,co));
   }
    
}




























