package CIE;

public class Internals extends Student{
public int[] marks=new int[5];

public void setint(int[] a){
for(int i=0;i<5;i++){
marks[i]=a[i];
}
}

public void getint(){
System.out.println("Internal marks");
for(int i=0;i<5;i++){
System.out.println("Subject "+i+": "+marks[i]);
}
}

}
