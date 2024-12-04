import java.util.*;
public class faculty {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int paperpublished=sc.nextInt();
        int yearofexperience=sc.nextInt();
        int currentsalary=sc.nextInt();
        int salary=currentsalary;
        if(paperpublished >=5 && yearofexperience >=10)
        {
            System.out.println(salary+=salary*0.10);
        }
        else if(paperpublished>=3 && paperpublished<5 && yearofexperience<10)
        {
            salary+=(salary*0.08);
        }
        else if(paperpublished>=1 && paperpublished<3 && yearofexperience>=1 && yearofexperience<5)
        {
            salary+=(salary*0.06);
        }
        else{
            System.out.println("you are not eligibe for increament");
        }
    

    }
}
