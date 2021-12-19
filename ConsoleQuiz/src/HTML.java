import java.util.Scanner;
import java.util.Objects;

public class HTML{
    int score = 0;
    private void Quiz1(){

        String answer;

        Scanner input = new Scanner(System.in);
        System.out.println(" 1. What does HTML stand for?");
        System.out.print(" Answer: ");
        answer = input.nextLine().toUpperCase();

        if(Objects.equals(answer, "HYPER TEXT MARKUP LANGUAGE")){
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
        System.out.println(" 2. What is the Proper tag for break ?");
        System.out.print(" Answer: ");
        answer = input.nextLine().toUpperCase();

        if(Objects.equals(answer, "<BR>")){
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
        System.out.println(" 3. How do you insert a copyright symbol on a browser page ?");
        System.out.print(" Answer: ");
        answer = input.nextLine().toUpperCase();

        if((Objects.equals(answer, "&COPY")) || (Objects.equals(answer, "#169"))){
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
        System.out.println(" 4. Do older HTML files work on newer browsers ?");
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

    private void Quiz5(){

        String answer;

        Scanner input = new Scanner(System.in);
        System.out.println(" 5. Does a hyperlink apply to text only ?");
        System.out.print(" Answer: ");
        answer = input.nextLine().toUpperCase();

        if(Objects.equals(answer, "NO")){
            System.out.println(" Correct Answer ");
            score++;
        }else{
            System.out.println(" Wrong Answer ");
        }
        System.out.println(" Current Score: " + score);

    }
    HTML() {
        Quiz1();
        Quiz2();
        Quiz3();
        Quiz4();
        Quiz5();
       if(score >= 3){
           System.out.println(" You passed HTML Quiz ");
       }else{
           System.out.println(" You fail HTML Quiz ");
       }
    }
}