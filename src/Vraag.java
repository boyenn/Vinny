public class Vraag {
    private String vraag;
    private String[] juisteAntwoorden;

    public Vraag(String vraag, String[] juisteAntwoorden) {
        this.vraag = vraag;
        this.juisteAntwoorden = juisteAntwoorden;
    }

    public boolean isJuistAntwoord(String a) {
        boolean heeftAntwoord = false;
        for (int i = 0; i < juisteAntwoorden.length; i++) {
            if (juisteAntwoorden[i].equalsIgnoreCase(a.trim())) {
                heeftAntwoord = true;
            }
        }
        return heeftAntwoord;
    }

    public String[] getJuisteAntwoorden() {
        return juisteAntwoorden;
    }

    public String getVraag() {
        return vraag;
    }


}
