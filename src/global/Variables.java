package global;

public class Variables {
  public int score;
  public double vida = 20;
  public int qtdCavaleiros = 5;
  public double poderTotal = 1.0;

  public double danoTotal() {
    return this.qtdCavaleiros * this.poderTotal;
  }
}
