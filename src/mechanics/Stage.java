package mechanics;

public class Stage {

    public int currentStage = 1;
    final int MAXIMUM_STAGES = 5;

    public int currentStage() {
        return currentStage;
    }

    public void newStage(Hand Hand, Deck Deck) {
        if (currentStage() >= 1 && currentStage() <= 5) {
            currentStage++;
        }
    }
}