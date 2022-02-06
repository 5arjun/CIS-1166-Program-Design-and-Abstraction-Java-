import java.util.Scanner;
public class Grades {
    //Arjun Patel
    //This program calculates a students grade in a class that has 3 scoring catergories
    //Each category has it's own weight
    public static void main(String[] args)  {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter Homework Weight: ");//Gets the weights form student
        double HWWeight = kb.nextInt();
        System.out.print("Enter Exam 1 weight: ");
        double exam1Weight = kb.nextInt();
        double exam2Weight = 100-HWWeight-exam1Weight;
        System.out.println("Using weights of:\n  Homework: "+HWWeight+"\n  Exam 1:   "+exam1Weight+ "\n  Exam 2:   "+exam2Weight);

        double HWWS = HWStuff(HWWeight);//Homework weighted score

        double exam1WS = exam1Stuff(exam1Weight);//Exam 1 weighted score
    
        double exam2WS = exam2Stuff(exam2Weight);//Exam 2 weighted score

        double courseGrade = HWWS+exam1WS+exam2WS;
        System.out.println(String.format("Course grade= %.2f", courseGrade));

    }
    static double HWStuff(double HWWeight){
        Scanner kb = new Scanner(System.in);
        System.out.print("Homework- \nNumber of Assignments: ");//gets info for the labs and HWs
        int numOfAssignments = kb.nextInt();
        System.out.print("Average Homework Grade: ");
        double avgHWGrade = kb.nextDouble();
        if (avgHWGrade > 0){//if they enter a negative number
            avgHWGrade = 0;
        }else if(avgHWGrade >((numOfAssignments * 10) + (numOfAssignments * 4))){
            avgHWGrade = (numOfAssignments * 10) + (numOfAssignments * 4);//if they enter a higher than possible number
        }
        System.out.print("Number of Late Days Used: ");
        int numOfLateDays = kb.nextInt();
        System.out.print("Number of Labs Attended: ");
        int labsAttended = kb.nextInt();

        if(numOfAssignments > 0){//while the num of assignments isn't negative
            int assignmentsTP = (numOfAssignments * 10) + (numOfAssignments * 4);//calculates the highest possible points
            double earnedTP = (avgHWGrade * numOfAssignments) + (labsAttended * 4);//calculates how much they scored total
            if(numOfLateDays > (numOfAssignments/2)){//the late day conditional 
                earnedTP = earnedTP *0.9;//minus 10%
            }else if(numOfLateDays == 0){
                earnedTP = earnedTP + 5; //Adding 5 pts
            }
            if(earnedTP > assignmentsTP){//if they have earned more than the possible amount of points
                earnedTP = assignmentsTP;
            }
            System.out.println(String.format("Total Points: %.2f / %d", earnedTP, assignmentsTP));
            double HWWS = ((earnedTP/assignmentsTP) * HWWeight);
            System.out.println(String.format("Weighted Score: %.2f", HWWS));
            return HWWS;
        }else{
            System.out.println(String.format("Weighted Score: %.2f",HWWeight ));
            return HWWeight;
        }
    }
    static double exam1Stuff(double exam1Weight){
        Scanner kb = new Scanner(System.in);
        System.out.println("Exam 1- ");//gets exam 1 score and curve
        System.out.print("Score: ");
        int exam1Score = kb.nextInt();
        if(exam1Score < 0){// if the score entered is negative or higher than 100
            exam1Score = 0;
        }else if(exam1Score > 100){
            exam1Score = 100;
        }
        System.out.print("Curve: ");
        int curve1 = kb.nextInt();

        exam1Score = exam1Score + curve1;
        if (exam1Score >= 100){// if they have over 100 pts after the curve
            exam1Score = 100;
        }
        
        System.out.println(String.format("Total Points: %d / 100", exam1Score));
        double exam1WS = exam1Score * (exam1Weight/100);
        System.out.println(String.format("Weighted Score: %.2f", exam1WS));

        return exam1WS;
    }
    static double exam2Stuff(double exam2Weight){
        Scanner kb = new Scanner(System.in);
        System.out.println("Exam 2- ");//gets exam 2 score and curve
        System.out.print("Score: ");
        int exam2Score = kb.nextInt();
        if(exam2Score < 0){// if the score entered is negative or higher than 100
            exam2Score = 0;
        }else if(exam2Score > 100){
            exam2Score = 100;
        }
        System.out.print("Curve: ");
        int curve2 = kb.nextInt();

        exam2Score = exam2Score + curve2;
        if (exam2Score >= 100){// if they have over 100 pts after the curve
            exam2Score = 100;
        }
        System.out.println(String.format("Total POints: %d / 100", exam2Score));
        double exam2WS = exam2Score * (exam2Weight/100);
        System.out.println(String.format("Weighted Score: %.2f", exam2WS));

        return exam2WS;
    }
}
