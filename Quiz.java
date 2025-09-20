import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************");
        System.out.println("Welcome to Java quiz game ");
        System.out.println("****************************");
        String[] Questions = {"Q1. Which of the following is the correct way to declare a variable in Java?",
                "Q2. Which keyword is used to define a class in Java?",
                "Q3. What will be the output of the following code? int x = 5;\n" +
                        "System.out.println(x++);",
                "Q4. Which of the following is NOT a primitive data type in Java?"
        };
        String[][] Options = {{"a) int num = 10;", "b) num int = 10;", "c) int = 10 num;", "d) integer num = 10;"},
                {"a) function", "b) struct", "c) class", "d) define"},
                {"a) 6", "b) 5", "c) Error", "d) 0"},
                {"a) int", "b) float", "c) boolean", "d) String"}};
        String [] Answers = { "a" ,"c","b","d"};
        int correct=0;


        for (int i=0 ;i<Questions.length ;i++) {
            System.out.println(Questions[i]);

            for (String option : Options[i]) {
                    System.out.println(option);

                }
            System.out.print("Enter your Answer : ");
            String userAnswer = scanner.nextLine();
            if(userAnswer.equalsIgnoreCase(Answers[i])){
                System.out.println("*******");
                System.out.println("Correct ");
                System.out.println("********");
                correct++;
            }
            else {
                System.out.println("*******");
                System.out.println("Wrong");
                System.out.println("********");

            }
            }
        System.out.println("The final score is :  " + correct+ "/4");


            }
        }


