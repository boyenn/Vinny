public class Player {
    private static final int STARTING_POINTS = 100;
    private int currentPoints;

    public Player(){
        currentPoints = STARTING_POINTS;
    }

    public int getCurrentPoints() {
        return currentPoints;
    }

    public void setCurrentPoints(int currentPoints) {
        this.currentPoints = currentPoints;
    }

    public void updateCurrentPoints(int difference){
        this.currentPoints = this.currentPoints + difference;
    }
}
