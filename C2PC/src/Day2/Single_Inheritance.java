package Day2;
class father
{
    void house()
    {
        System.out.println("Father has own house.");
    }
}
class son extends father
{
    void print()
    {
        System.out.println("Son has new car.");
    }
}
public class Single_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son s=new son();
	    s.print();
	    s.house();
	}

}
