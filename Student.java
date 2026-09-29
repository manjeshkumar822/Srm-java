import java.util.*;
class Students{
    int Rollno;
    String  Name;
    String  Department;
    String  EmailId;
    String  PhoneNo;
    Students(int Rollno,String Name, String Department, String EmailId,String PhoneNo){
        this.Rollno=Rollno;
        this.Name=Name;
        this.Department=Department;
        this.EmailId=EmailId;
        this.PhoneNo=PhoneNo;
    } 
    void display(){
        System.out.println("RollNo : "+Rollno);
        System.out.println("Name : "+Name);
        System.out.println("Department : "+Department);
        System.out.println("EmailId : "+EmailId);
        System.out.println("PhoneNO : "+PhoneNo);
        System.out.println();
    }
}
public class Student{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roll=101;
        ArrayList<Students> arr = new ArrayList<>();

        while(true){
            System.out.println("1.Display all Students");
            System.out.println("2.Add Students");
            System.out.println("3.Update Students");
            System.out.println("4.Delete Students");
            int n=sc.nextInt();
            Students st = new Students(roll,"Manjesh","Gen AI","manjesh@gmail.com","9691652071");
            arr.add(st);
            System.out.println(arr);
            if(n==1){//Display all
                for(Students st4: arr){
                    st4.display();
                }
            }else if(n==2){// Add Students
                roll=roll++;
                String name;
                String dep;
                String email;
                String phone;
                System.out.print("Name : ");
                name=sc.nextLine();
                System.out.print("Email Id : ");
                email=sc.nextLine();
                System.out.print("Department : ");
                dep=sc.nextLine();
                System.out.print("Phone No : ");
                phone=sc.nextLine();
                Students st5 = new Students(roll,name,dep,email,phone);
                arr.add(st5);
            }else if(n==3){//Update Students

            }else if(n==4){//Delete Students

            }
        }
    }
}