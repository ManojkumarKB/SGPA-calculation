package credit;
interface credit
{
    public static final int t=4;
    public static final int a=3;
    public static final int l=2;
}
public class Tcredit implements credit
{
    public int tuto;
    public int assign;
    public int lab;
    public void settutorial(int tut)
    {
        this.tuto=tut*t;
    }
    public void setassign(int assig)
    {
        this.assign=assig*a;
    }
    public void setlab(int la)
    {
        this.lab=la*l;
    }
    public int gettcredit()
    {
        return this.tuto+this.assign+this.lab;
    }
    
}
