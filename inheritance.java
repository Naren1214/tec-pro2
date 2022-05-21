class employee
{
float salary=50000;
}
class Programmer extends employee
{
int bonus=2000;
public static void main(String args[])
{
Programmer p=new Programmer();
System.out.println("Programmer salary is:"+p.salary);
System.out.println("Bonus of Programmer is:"+p.bonus);
}
}
