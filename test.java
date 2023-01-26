import CIE.*;
import SEE.*;
import java.util.Scanner;

class Test{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter number of students");
int n=s.nextInt();
External[] dets=new External[n];

for(int i=0;i<n;i++){
System.out.println("Enter student details");
int usn=s.nextInt();
String name=s.next();
int sem=s.nextInt();

System.out.println("Enter internal marks");
int[] intr=new int[5];
for(int j=0;j<5;j++){
intr[j]=s.nextInt();
}

dets[i]=new External();
dets[i].setdets(usn,name,sem);
dets[i].setint(intr);

System.out.println("Enter external marks");
for(int j=0;j<5;j++){
intr[j]=s.nextInt();
}

dets[i].set(intr);

}

for(int i=0;i<n;i++){
dets[i].getdets();
dets[i].getint();
dets[i].get();

System.out.println("Final marks");
for(int j=0;j<5;j++){
System.out.println("Subject "+j+": "+(dets[i].marksi[j]/2+dets[i].marks[j]));
}
}

}
}
