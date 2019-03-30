package SGPA;
import credit.*; 
public class tcourse
{
    public int tuto;
    public int assign;
    public int lab;
    public int sumt=0;
    public int suma=0;
    public int suml=0;
    public void caltutorial(int tut)
    {
        this.tuto=tut*4;
        //System.out.println(this.tuto);
        sumt=sumt+this.tuto;
    }
    public void calassign(int assig)
    {
        this.assign=assig*3;
        suma=suma+this.assign;
    }
    public void callab(int la)
    {
        this.lab=la*2;
        suml=suml+this.lab;
    }
    public int getcourse()
    {
        //System.out.println(sumt);
      //  System.out.println(suma);
        //System.out.println(suml);
        return sumt+suma+suml;
    }
    
}








