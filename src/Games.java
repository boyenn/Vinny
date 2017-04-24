import java.util.Arrays;

public class Games {


    private Vraag[] vragen = new Vraag[2];

    public Games() {
        String[] antwoordenVraag0 = {"Yes","Ja"};
        vragen[0] = new Vraag("is teemo part of league of legends?",antwoordenVraag0);
        String[] antwoordenVraag1 = {"No","Nee"};
        vragen[1] = new Vraag("is boyenn bad at rocket league?",antwoordenVraag1);
    }

    public Vraag[] getVragen() {
        return vragen;
    }

    public Vraag getRandomQuestion() {
        int aantalInArray = vragen.length;
        int positieVanElementDieWeGaanNemen = (int) Math.floor(Math.random() * aantalInArray);
        return vragen[positieVanElementDieWeGaanNemen];
    }
}
