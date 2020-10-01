import java.util.*;
class Person{
    public int age;
    public Person(int initialAge){
        if(initialAge<=0){
            this.age=0;
        }
        else{
            this.age=initialAge;
        }
    }
    public void amIOld(){
        if(age<=0){
            System.out.println("Age is not valid, setting age to 0.");
        }
        else if(age<13){
            System.out.println("You are young.");
        }
        else if(age>=13 && age<18){
            System.out.println("You are a teenager.");
        }
        else {
            System.out.println("You are old.");
        }
    }
    public void yearPasses(){
        age++;
    }
}
public class day4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int age=sc.nextInt();
            Person p=new Person(age);
            p.amIOld();
            for(int j=0;j<3;j++){
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
    }
}
