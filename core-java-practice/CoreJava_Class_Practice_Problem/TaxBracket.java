package corejava.class_practice_problem;
import java.util.Scanner;
public class TaxBracket {
    public static void main(String[] args){
        double tax;
        double income;
        String tax_Bracket=" ";

        Scanner scanner = new Scanner(System.in);
        income=scanner.nextDouble();

        if(income <= 5000){
            tax = income*0.05;
            tax_Bracket="Tax of 5%";
        } else if (income <= 10000){
            tax = income*0.10;
            tax_Bracket="Tax of 10%";
        }
        System.out.println(income+"->"+tax_Bracket);

    }
}
