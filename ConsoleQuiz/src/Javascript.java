import java.util.Scanner;
import java.util.Objects;

public class Javascript{
    int score = 0;
    private void Quiz1(){

        String answer;

        Scanner input = new Scanner(System.in);
        System.out.println(" 1. Is Javascript a client side and a server side scripting language ?");
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

    private void Quiz2(){

        String answer;

        Scanner input = new Scanner(System.in);
        System.out.println(" 2. Is JavaScript also an Object-based Programming language ?");
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
        System.out.println(" 3. Which is faster between JavaScript and an ASP script?");
        System.out.print(" Answer: ");
        answer = input.nextLine().toUpperCase();

        if(Objects.equals(answer, "JAVASCRIPT")){
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
        System.out.println(" 4. Is it possible to break JavaScript Code into several lines ?");
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
        System.out.println(" 5. Which company developed JavaScript ?");
        System.out.print(" Answer: ");
        answer = input.nextLine().toUpperCase();

        if(Objects.equals(answer, "NETSCAPE")){
            System.out.println(" Correct Answer ");
            score++;
        }else{
            System.out.println(" Wrong Answer ");
        }
        System.out.println(" Current Score: " + score);

    }
    Javascript() {
        Quiz1();
        Quiz2();
        Quiz3();
        Quiz4();
        Quiz5();
        if(score >= 3){
            System.out.println(" You passed Javascript Quiz ");
        }else{
            System.out.println(" You fail Javascript Quiz ");
        }
    }
}