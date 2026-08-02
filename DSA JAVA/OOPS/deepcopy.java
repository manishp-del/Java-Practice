package OOPS;
public class deepcopy {
    public static void main(String args[]){
        student s1 = new student();     //fixed class name
        s1.name = "Manish";
        s1.roll = 345;
        s1.password = "abcd";
   

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        student s2 = new student(s1);
        s2.password = "xyz";
        s1.marks[2] =100;
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }  
}
class student{
    String name;
    int roll;
    String password;
    int marks[];

    //default constructor
    student(){
        marks = new int[3];
    }

    //copy constructor
    // student(student s1){
       // marks = new int[3];
        // this.name = s1.name;
        // this.roll = s1.roll;
        // for(int i=0; i<3; i++){
           // this.marks[i] = s1.marks[i]; //deep copy
        // }}

    //deep copy constructor   
    student(student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks;.length; i++){
            this.marks[i] = s1.marks[i];
        }

        
    } 
    student(String name){
        marks = new int[3];
        this.name = name;

    }
    student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
}
