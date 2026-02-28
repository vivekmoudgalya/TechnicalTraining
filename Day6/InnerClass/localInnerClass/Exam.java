package Day6.InnerClass.localInnerClass;

import java.time.LocalDate;

public class Exam
{
    void evaluate(int marks)
    {
        class GradeCalculator
        {
            String calculate()
            {
                if(marks>=75) return "Distinction";
                else if(marks>=60) return "First Class";
                else return "Pass";
            }
        }
        GradeCalculator gc=new GradeCalculator();
        System.out.println(gc.calculate());
    }
    void displayExample()
    {
        LocalDate date=LocalDate.now().plusDays(7);
        System.out.println("The exam date is:"+date);
    }
    public static void main(String[] args) {
        Exam e=new Exam();
        e.evaluate(88);
        e.evaluate(65);
        e.displayExample();
    }
}
/*
ℹ️ Points to remember:
⭐ Grade logic is scoped to the "evaluate" method.
⭐ It avoids polluting the class with helper methods.
⭐ It helps in designing the codebase in a cleaner way.
 */
