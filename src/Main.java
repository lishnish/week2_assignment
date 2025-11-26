import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        String title = "\t\t\tDedan Kimathi University of Technology\n"
                + "\t\t\t  School of Computer Science and IT\n"
                + "\t\t\t   Department of Computer Science\n"
                + "\t\t\t\tAcademic Year: 2024/2025\n"
                + "\t\tSTUDENT MARKSHEET (SECOND YEAR RESULTS)\n";
        Scanner inputScanner = new Scanner(System.in);
        String minusSeparator = "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
        String tableHeader = "Reg No.\t\t\t\t\tFull Name\t\t\tCCS 2207\tSMA 2215\tCCS 2208\tCCS 2209\tCCS 2210\tCCS 2211\tIGS 2202\t\tTOTALS\t\tAVERAGE\t\tSTATUS\t\tGRADE";

        System.out.print(title);

        System.out.print("Enter the registration number of the first student: ");
        String studentRegNo1 = inputScanner.nextLine();
        System.out.print("Enter the full names of the first student: ");
        String student1Name = inputScanner.nextLine();
        System.out.print("Enter the score for CCS 2207 (Internet Application Programming): ");
        int ccs2207ScoreStu1 = inputScanner.nextInt();
        System.out.print("Enter the score for SMA 2215 (Vector Analysis): ");
        int sma2215ScoreStu1 = inputScanner.nextInt();
        System.out.print("Enter the score for CCS 2208 (Computer Graphics): ");
        int ccs2208ScoreStu1 = inputScanner.nextInt();
        System.out.print("Enter the score for CCS 2209 (Computer Networks): ");
        int ccs2209ScoreStu1 = inputScanner.nextInt();
        System.out.print("Enter the score for CCS 2210 (Knowledge representation and reasoning): ");
        int ccs2210ScoreStu1 = inputScanner.nextInt();
        System.out.print("Enter the score for CCS 2211 (Object Oriented Programming): ");
        int ccs2211ScoreStu1 = inputScanner.nextInt();
        System.out.print("Enter the score for IGS 2202 (Communication Skills: African Technology and Literature): ");
        int igs2202ScoreStu1 = inputScanner.nextInt();

        double student1Total = ccs2207ScoreStu1 + sma2215ScoreStu1 + ccs2208ScoreStu1 + ccs2209ScoreStu1 + ccs2210ScoreStu1 + ccs2211ScoreStu1 + igs2202ScoreStu1;
        double student1Average = student1Total / 5;

        inputScanner.nextLine(); //Clear the buffer, I think
        System.out.print("Enter the registration number of the second student: ");
        String studentRegNo2 = inputScanner.nextLine();
        System.out.print("Enter the full names of the second student: ");
        String student2Name = inputScanner.nextLine();
        System.out.print("Enter the score for CCS 2207 (Internet Application Programming): ");
        int ccs2207ScoreStu2 = inputScanner.nextInt();
        System.out.print("Enter the score for SMA 2215 (Vector Analysis): ");
        int sma2215ScoreStu2 = inputScanner.nextInt();
        System.out.print("Enter the score for CCS 2208 (Computer Graphics): ");
        int ccs2208ScoreStu2 = inputScanner.nextInt();
        System.out.print("Enter the score for CCS 2209 (Computer Networks): ");
        int ccs2209ScoreStu2 = inputScanner.nextInt();
        System.out.print("Enter the score for CCS 2210 (Knowledge representation and reasoning): ");
        int ccs2210ScoreStu2 = inputScanner.nextInt();
        System.out.print("Enter the score for CCS 2211 (Object Oriented Programming): ");
        int ccs2211ScoreStu2 = inputScanner.nextInt();
        System.out.print("Enter the score for IGS 2202 (Communication Skills: African Technology and Literature): ");
        int igs2202ScoreStu2 = inputScanner.nextInt();

        double student2Total = ccs2207ScoreStu2 + sma2215ScoreStu2 + ccs2208ScoreStu2 + ccs2209ScoreStu2 + ccs2210ScoreStu2 + ccs2211ScoreStu2 + igs2202ScoreStu2;
        double student2Average = student2Total / 5;

        inputScanner.nextLine();
        System.out.print("Enter the registration number of the third student: ");
        String studentRegNo3 = inputScanner.nextLine();
        System.out.print("Enter the full names of the third student: ");
        String student3Name = inputScanner.nextLine();
        System.out.print("Enter the score for CCS 2207 (Internet Application Programming): ");
        int ccs2207ScoreStu3 = inputScanner.nextInt();
        System.out.print("Enter the score for SMA 2215 (Vector Analysis): ");
        int sma2215ScoreStu3 = inputScanner.nextInt();
        System.out.print("Enter the score for CCS 2208 (Computer Graphics): ");
        int ccs2208ScoreStu3 = inputScanner.nextInt();
        System.out.print("Enter the score for CCS 2209 (Computer Networks): ");
        int ccs2209ScoreStu3 = inputScanner.nextInt();
        System.out.print("Enter the score for CCS 2210 (Knowledge representation and reasoning): ");
        int ccs2210ScoreStu3 = inputScanner.nextInt();
        System.out.print("Enter the score for CCS 2211 (Object Oriented Programming): ");
        int ccs2211ScoreStu3 = inputScanner.nextInt();
        System.out.print("Enter the score for IGS 2202 (Communication Skills: African Technology and Literature): ");
        int igs2202ScoreStu3 = inputScanner.nextInt();

        double student3Total = ccs2207ScoreStu3 + sma2215ScoreStu3 + ccs2208ScoreStu3 + ccs2209ScoreStu3 + ccs2210ScoreStu3 + ccs2211ScoreStu3 + igs2202ScoreStu3;
        double student3Average = student3Total / 5;


        inputScanner.nextLine();
        System.out.print("Enter the registration number of the fourth student: ");
        String studentRegNo4 = inputScanner.nextLine();
        System.out.print("Enter the full names of the fourth student: ");
        String student4Name = inputScanner.nextLine();
        System.out.print("Enter the score for CCS 2207 (Internet Application Programming): ");
        int ccs2207ScoreStu4 = inputScanner.nextInt();
        System.out.print("Enter the score for SMA 2215 (Vector Analysis): ");
        int sma2215ScoreStu4 = inputScanner.nextInt();
        System.out.print("Enter the score for CCS 2208 (Computer Graphics): ");
        int ccs2208ScoreStu4 = inputScanner.nextInt();
        System.out.print("Enter the score for CCS 2209 (Computer Networks): ");
        int ccs2209ScoreStu4 = inputScanner.nextInt();
        System.out.print("Enter the score for CCS 2210 (Knowledge representation and reasoning): ");
        int ccs2210ScoreStu4 = inputScanner.nextInt();
        System.out.print("Enter the score for CCS 2211 (Object Oriented Programming): ");
        int ccs2211ScoreStu4 = inputScanner.nextInt();
        System.out.print("Enter the score for IGS 2202 (Communication Skills: African Technology and Literature): ");
        int igs2202ScoreStu4 = inputScanner.nextInt();

        double student4Total = ccs2207ScoreStu4 + sma2215ScoreStu4 + ccs2208ScoreStu4 + ccs2209ScoreStu4 + ccs2210ScoreStu4 + ccs2211ScoreStu4 + igs2202ScoreStu4;
        double student4Average = student4Total / 5;

        inputScanner.nextLine();
        System.out.print("Enter the registration number of the fifth student: ");
        String studentRegNo5 = inputScanner.nextLine();
        System.out.print("Enter the full names of the fifth student: ");
        String student5Name = inputScanner.nextLine();
        System.out.print("Enter the score for CCS 2207 (Internet Application Programming): ");
        int ccs2207ScoreStu5 = inputScanner.nextInt();
        System.out.print("Enter the score for SMA 2215 (Vector Analysis): ");
        int sma2215ScoreStu5 = inputScanner.nextInt();
        System.out.print("Enter the score for CCS 2208 (Computer Graphics): ");
        int ccs2208ScoreStu5 = inputScanner.nextInt();
        System.out.print("Enter the score for CCS 2209 (Computer Networks): ");
        int ccs2209ScoreStu5 = inputScanner.nextInt();
        System.out.print("Enter the score for CCS 2210 (Knowledge representation and reasoning): ");
        int ccs2210ScoreStu5 = inputScanner.nextInt();
        System.out.print("Enter the score for CCS 2211 (Object Oriented Programming): ");
        int ccs2211ScoreStu5 = inputScanner.nextInt();
        System.out.print("Enter the score for IGS 2202 (Communication Skills: African Technology and Literature): ");
        int igs2202ScoreStu5 = inputScanner.nextInt();

        double student5Total = ccs2207ScoreStu5 + sma2215ScoreStu5 + ccs2208ScoreStu5 + ccs2209ScoreStu5 + ccs2210ScoreStu5 + ccs2211ScoreStu5 + igs2202ScoreStu5;
        double student5Average = student5Total / 5;

        System.out.println('\n');
        System.out.println("Student Score Sheet");
        System.out.println(minusSeparator);
        System.out.println(tableHeader);
        System.out.println(minusSeparator);

        System.out.println(studentRegNo1 + "\t\t" + student1Name + "\t\t" + ccs2207ScoreStu1 + "\t\t\t" + sma2215ScoreStu1 + "\t\t\t" + ccs2208ScoreStu1 + "\t\t\t" + ccs2209ScoreStu1 + "\t\t\t" + ccs2210ScoreStu1 + "\t\t\t" + ccs2211ScoreStu1 + "\t\t\t" + igs2202ScoreStu1 + "\t\t\t" + student1Total + "\t\t" + student1Average);
        System.out.println(studentRegNo2 + "\t\t" + student2Name + "\t\t" + ccs2207ScoreStu2 + "\t\t\t" + sma2215ScoreStu2 + "\t\t\t" + ccs2208ScoreStu2 + "\t\t\t" + ccs2209ScoreStu2 + "\t\t\t" + ccs2210ScoreStu2 + "\t\t\t" + ccs2211ScoreStu2 + "\t\t\t" + igs2202ScoreStu2 + "\t\t\t" + student2Total + "\t\t" + student2Average);
        System.out.println(studentRegNo3 + "\t\t" + student3Name + "\t\t" + ccs2207ScoreStu3 + "\t\t\t" + sma2215ScoreStu3 + "\t\t\t" + ccs2208ScoreStu3 + "\t\t\t" + ccs2209ScoreStu3 + "\t\t\t" + ccs2210ScoreStu3 + "\t\t\t" + ccs2211ScoreStu3 + "\t\t\t" + igs2202ScoreStu3 + "\t\t\t" + student3Total + "\t\t" + student3Average);
        System.out.println(studentRegNo4 + "\t\t" + student4Name + "\t\t" + ccs2207ScoreStu4 + "\t\t\t" + sma2215ScoreStu4 + "\t\t\t" + ccs2208ScoreStu4 + "\t\t\t" + ccs2209ScoreStu4 + "\t\t\t" + ccs2210ScoreStu4 + "\t\t\t" + ccs2211ScoreStu4 + "\t\t\t" + igs2202ScoreStu4 + "\t\t\t" + student4Total + "\t\t" + student4Average);
        System.out.println(studentRegNo5 + "\t\t" + student5Name + "\t\t" + ccs2207ScoreStu5 + "\t\t\t" + sma2215ScoreStu5 + "\t\t\t" + ccs2208ScoreStu5 + "\t\t\t" + ccs2209ScoreStu5 + "\t\t\t" + ccs2210ScoreStu5 + "\t\t\t" + ccs2211ScoreStu5 + "\t\t\t" + igs2202ScoreStu5 + "\t\t\t" + student5Total + "\t\t" + student5Average);
    }

}
