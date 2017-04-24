import java.util.Scanner;

public class Quiz {

    private Player player1, player2;
    private Games game;
    private Scanner scan;

    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.printWelkomTekst();
        quiz.speelQuiz();
    }

    public Quiz() {
        player1 = new Player();
        player2 = new Player();
        scan = new Scanner(System.in);
        game = new Games();
    }

    public void printWelkomTekst() {
        System.out.println("Welcome to the online quiz");
        System.out.println("both players will start with 100 points");
        System.out.println("Wrong answer will give you minus 5 points");
        System.out.println("Right answer will give you plus 10 points");
        System.out.println("Player 1 may start, choose a category");
        System.out.println("Games or Anything");
    }

    public void speelQuiz() {
        String keuze = scan.nextLine();
        if (keuze.equals("Games")) {
            Vraag randomQuestion = game.getRandomQuestion();
            System.out.println(randomQuestion.getVraag());
            String gelezenString = scan.nextLine();
            if (randomQuestion.isJuistAntwoord(gelezenString)) {
                //Als het antwoord juist is
                System.out.println("Juist");
            } else {
                //Als het antwoord fout is
                System.out.println("Fout");
            }
        }
    }

}
