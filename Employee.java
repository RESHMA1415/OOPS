import java.util.*;
class employee
{
int empid,salary;
String empname,eaddress;
employee(int emid,String emname,String address,int sal);
{
empid=emid;
empname=empname;
eaddress=address;
salary=sal;
}
Void print()
{
System.out.println(“employee id : “+empid);
System.out.println(“employee Name :“+empname);
System.out.println(“employee Address :“+eaddress);
System.out.println(“employee Salary :“+salary);
}
}
Class teacher extends employee
{
String dept,sub1,sub2,sub3;
teacher(String deptm,String subj1,String subj2,String subj3)
{
dept=deptm;
sub1=subj1;
sub2=subj2;
sub3=subj3;
}
Void show()
{

System.out.println(“Department:“+dept);
System.out.println(“Subject 1:“+sub1);
System.out.println(“Subject 2:“+sub2);
System.out.println(“Subject 3:“+sub3);
}
Public static void main(String args[])
{
teacher[] t=new teacher[3];
t[1].print();
t[2].print();
t[2].show();
t[3].print();
t[3].show();
}
}

