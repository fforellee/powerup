package mechanics;

import design.ConsoleColor;
import global.Variables;

public class Card {
  public ConsoleColor color = new ConsoleColor();

  public int id;
  public String nome;
  public String descricao;
  
  final String comum = "white";
  final String especial = "yellow";
  final String lendaria = "purple";

  public Card(int id) {
    this.id = id;
    switch (id) {
      case 1:
        this.nome = color.setColor(this.comum, "Curar");
        this.descricao = "Descrição da carta Curar";
        break;
      case 2:
        this.nome = color.setColor(this.comum, "Recrutar");
        this.descricao = "Descrição da carta Recrutar";
        break;
      case 3:
        this.nome = color.setColor(this.comum, "Reunir");
        this.descricao = "Descrição da carta Reunir";
        break;
      case 4:
        this.nome = color.setColor(this.comum, "Sacrificar");
        this.descricao = "Descrição da carta Sacrificar";
        break;
      case 5:
        this.nome = color.setColor(this.comum, "Treinar");
        this.descricao = "Descrição da carta Treinar";
        break;
      case 6:
        this.nome = color.setColor(this.especial, "Arcano");
        this.descricao = "Descrição da carta Arcano";
        break;
      case 7:
        this.nome = color.setColor(this.especial, "Bispo");
        this.descricao = "Descrição da carta Bispo";
        break;
      case 8:
        this.nome = color.setColor(this.especial, "Mercenario");
        this.descricao = "Descrição da carta Mercenario";
        break;
      case 9:
        this.nome = color.setColor(this.especial, "Mumicate");
        this.descricao = "Descrição da carta Mumicate";
        break;
      case 10:
        this.nome = color.setColor(this.lendaria, "Bênção Divina");
        this.descricao = "Descrição da carta Bênção Divina";
        break;
      case 11:
        this.nome = color.setColor(this.lendaria, "Berserk");
        this.descricao = "Descrição da carta Berserk";
        break;
      case 12:
        this.nome = color.setColor(this.lendaria, "Necromante");
        this.descricao = "Descrição da carta Necromante";
        break;
      case 13:
        this.nome = color.setColor(this.lendaria, "Vampiro");
        this.descricao = "Descrição da carta Vampiro";
        break;
      default:
        this.nome = color.setColor("red", "undefined");
        this.descricao = "undefined";
        break;
    }
  }

  /*
   * Switch Func
   *
   */
  public Object usarCarta(Variables Global) {// valorCard a ser buscado
    switch (this.id) {
      case 1:
        return Curar(Global);
      case 2:
        return Recrutar(Global);
      case 3:
        return Reunir(Global);
      case 4:
        return Sacrificar(Global);
      case 5:
        return Treinar(Global);
      case 6:
        return Arcano(Global);
      case 7:
        return Bispo(Global);
      case 8:
        return Mercenario(Global);
      case 9:
        return Mumicate(Global);
      case 10: 
        return BencaoDivina(Global);
      case 11: 
        return Berserk(Global);
      case 12: 
        return Necromante(Global);
      // case 13: return Vampiro(Global);
    }
    return null;
  }

  /**
   * Cartas comuns
   * 
   * @return
   */

  public Object Curar(Variables Global) {
    Global.vida += 5;
    return Global.qtdCavaleiros -= 3;
  }

  public Object Recrutar(Variables Global) {
    return Global.qtdCavaleiros += 2;
  }

  private Object Reunir(Variables Global) {
    return Global.poderTotal += Global.danoTotal() + (double) Global.qtdCavaleiros / 2;
  }

  public Object Sacrificar(Variables Global) {
    Global.qtdCavaleiros--;
    return Global.poderTotal += Global.poderTotal * 1.5;
  }

  public Object Treinar(Variables Global) {
    return Global.poderTotal++;
  }

  /**
   * Cartas Especiais
   * 
   * @param global
   * @return
   */
  // Verificador de "IF"
  public Object Arcano(Variables Global) {
    return Global.poderTotal += Global.danoTotal() * 1.5;
  }

  public Object Bispo(Variables Global) {
    return Global.vida += 3;
  }

  public Object Mercenario(Variables Global) {
    return Global.qtdCavaleiros += 2;
  }

  public Object Mumicate(Variables Global) {
    return Global.vida += Global.qtdCavaleiros / 2;
  }

  /**
   * Cartas Lendarias
   * @param Global
   * @return
   */

  public Object Vampiro(Variables Global) {
    return "";
  }

  public Object Berserk(Variables Global) {
   Global.poderTotal = (Global.qtdCavaleiros * 0.5) + 20;
   return Global.qtdCavaleiros = 1;
  }

  public Object Necromante(Variables Global){
   return Global.qtdCavaleiros += 1;
  }

  public Object BencaoDivina(Variables Global){
   return Global.vida *= Global.qtdCavaleiros * 0.5;
  }

  /**
   * StringBuilder. Printa os cavaleiros com base na quantidade
   * 
   */
  // public String toString() {
  // StringBuilder soldado = new StringBuilder();
  // for (int i = 0; i < ; i++) {
  // soldado.append("t(-_-t) ");
  // }
  // return soldado.toString();
  // }
  // (ò_ó) <( ^.^ )> <(^_^<) <(o_o<) <( -'.'- )> <('.'-^) t(-_-t)
}