
        import java.util.Scanner;
        public class Student
        {
            String fname, lname;
            int age,sscore,hscore;

            Student()
            {}
            Student(String nm)
            {
                this.fname=nm;

            }

            void studRegistration()
            {
                Scanner sc =new Scanner(System.in);
                System.out.println("Enter you First Name: ");
                System.out.println(" Enter you Last Name: ");
        lname =sc.nextLine();
        System.out.println("Enter you age: ");
        age =sc.nextInt();
        System.out.println("Enter you Secondary Score: ");
        sscore =sc.nextInt();
        System.out.println("Enter you Higher Secondary Score: ");
        hscore =sc.nextInt();}



    void studRegistration(String ln)
    {
        lname =ln;

    }
    void studRegistration(String fn,String ln, int ag,int scr,int hscr)
    {
        this.fname=fn;
        this.lname=ln;
        this.age=ag;
        this.sscore=scr;
        this.hscore=hscr;

    }

    void studRegistration(int ag,int scr,int hscr)
    {
        this.age=ag;
        this.sscore=scr;
        this.hscore=hscr;
    }

    public static void main(String[] args)
    {
        Student st1 = new Student();

        Scanner sc = new Scanner(System.in);
        st1.studRegistration();

        Student st2 =new Student("Bob");
        st2.studRegistration("Trump","Micky" ,32 ,78 ,80);

        Student st3=new Student();
        st3.studRegistration(30,90,95);

        System.out.println("Enter you First Name: ");
        String ltnm =sc.nextLine();
        st2.studRegistration(ltnm);
    }
}

