import java.util.Scanner;
import java.util.Objects;

public class CSS{
    int score = 0;
    private void Quiz1(){

        String answer;

        Scanner input = new Scanner(System.in);
        System.out.println(" 1. CSS stands for ?");
        System.out.print(" Answer: ");
        answer = input.nextLine().toUpperCase();

        if(Objects.equals(answer, "CASCADING STYLE SHEET")){
            System.out.println(" Correct Answer ");
            score++;
        }else{
            System.out.println(" Wrong Answer ");
        }
        System.out.println(" Current Score: " + score);

    }

    private void Quiz2(){

        String answer;

        Scanner input = new Scanner(System.in);
        System.out.println(" 2. Limitations of vertical control, is this consider a limitations of CSS?");
        System.out.print(" Answer: ");
        answer = input.nextLine().toUpperCase();

        if(Objects.equals(answer, "YES")){
            System.out.println(" Correct Answer ");
            score++;
        }else{
            System.out.println(" Wrong Answer ");
        }
        System.out.println(" Current Score: " + score);

    }

    private void Quiz3(){

        String answer;

        Scanner input = new Scanner(System.in);
        System.out.println(" 3. In how many ways can a CSS be integrated as a web page? (Ex. 2 Should be written in Two");
        System.out.print(" Answer: ");
        answer = input.nextLine().toUpperCase();

        if(Objects.equals(answer, "THREE")){
            System.out.println(" Correct Answer ");
            score++;
        }else{
            System.out.println(" Wrong Answer ");
        }
        System.out.println(" Current Score: " + score);

    }

    private void Quiz4(){

        String answer;

        Scanner input = new Scanner(System.in);
        System.out.println(" 4. How many parts does ruleset have (Ex. 2 Should be written in Two)?");
        System.out.print(" Answer: ");
        answer = input.nextLine().toUpperCase();

        if(Objects.equals(answer, "TWO")){
            System.out.println(" Correct Answer ");
            score++;
        }else{
            System.out.println(" Wrong Answer ");
        }
        System.out.println(" Current Score: " + score);

    }

    private void Quiz5(){

        String answer;

        Scanner input = new Scanner(System.in);
        System.out.println(" 5. Which among the following is more precedent: CSS properties or HTML procedures?");
        System.out.print(" Answer: ");
        answer = input.nextLine().toUpperCase();

        if(Objects.equals(answer, "CSS PROPERTIES")){
            System.out.println(" Correct Answer ");
            score++;
        }else{
            System.out.println(" Wrong Answer ");
        }
        System.out.println(" Current Score: " + score);

    }
    CSS() {
        Quiz1();
        Quiz2();
        Quiz3();
        Quiz4();
        Quiz5();
        if(score >= 3){
            System.out.println(" You passed CSS Quiz ");
        }else{
            System.out.println(" You fail CSS Quiz ");
        }
    }
}