package mechanics;

import global.Variables;

public class Stage {
    
    public int currentStage = 5;
    final int MAXIMUM_STAGES = 6;
    public int[] enemies = new int[MAXIMUM_STAGES];
    public int step = 0;

    /**
     * Pega o andar atual que o jogador se encontra
     * @return andar atual
     */
    public int currentStage() {
        return currentStage;
    }

    public void newStage(Variables Global) {
        if (currentStage() >= 1 && currentStage() <= 5) {
            currentStage++;
        }
    }

    public void testeDanoPorAndar() {
        for (int i = 1; i < enemies.length; i++) {
            step += 5 * i;
            enemies[i] = step;

            System.out.println(i + "° Andar");
            System.out.println("Dano do inimigo = " + enemies[i]);
        }
    }

    /**
     * A lógica do jogo roda em torno de uma iteração, através de uma lista de fases
     */
    public void teste2() {
        while (currentStage < enemies.length) {
            System.out.println("Dano do inimigo = " + enemies[currentStage]);
            System.out.println("Andar atual = " + currentStage());
            currentStage++;
        }
    }
    // Printa o placar, sinalizando o fim do jogo
}