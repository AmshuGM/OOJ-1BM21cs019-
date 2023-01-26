package CIE;

public class Student{
public int USN;
public String name;
public int sem;

public void setdets(int u,String s,int q){
USN=u;
name=s;
sem=q;
}

public void getdets(){
System.out.println("Student details");
System.out.println("USN:"+USN+"\nNAME:"+name+"\nSEMESTER:"+sem);
}

}
