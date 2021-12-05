package mechanics;

import global.Variables;

public class Stage {

    public int currentStage = 1;
    final int MAXIMUM_STAGES = 5;
    public int step = 0;

    public int currentStage() {
        return currentStage;
    }

    public void newStage(Variables Global) {
        if (currentStage() >= 1 && currentStage() <= 5) {
            currentStage++;
        }
    }
}