package design;

public class Screen {
  private String DAN = "@dannesx";
  private String EDU = "@eduGuilherme";
  private String FAB = "@DarkseekerGael";
  private String ICA = "@fforellee";
  private String SAU = "@UmPastelPraVC";

  ConsoleColor color = new ConsoleColor();

  public void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public void gameStartup() {
    clearScreen();
    System.out.println(color.setColor("cyan",   "██████╗  ██████╗ ██╗    ██╗███████╗██████╗     ██╗   ██╗██████╗ ██╗"));
    System.out.println(color.setColor("cyan",   "██╔══██╗██╔═══██╗██║    ██║██╔════╝██╔══██╗    ██║   ██║██╔══██╗██║"));
    System.out.println(color.setColor("cyan",   "██████╔╝██║   ██║██║ █╗ ██║█████╗  ██████╔╝    ██║   ██║██████╔╝██║"));
    System.out.println(color.setColor("cyan",   "██╔═══╝ ██║   ██║██║███╗██║██╔══╝  ██╔══██╗    ██║   ██║██╔═══╝ ╚═╝"));
    System.out.println(color.setColor("cyan",   "██║     ╚██████╔╝╚███╔███╔╝███████╗██║  ██║    ╚██████╔╝██║     ██╗"));
    System.out.println(color.setColor("cyan",   "╚═╝      ╚═════╝  ╚══╝╚══╝ ╚══════╝╚═╝  ╚═╝     ╚═════╝ ╚═╝     ╚═╝"));
  }

  public void gameCredits() {
    System.out.println();
    System.out.println(color.setColor("red",   "░▒█▀▀▀█░█▀▀▄░█▀▀▄░░▀░░█▀▀▀░█▀▀▄░█▀▄░▄▀▀▄░░░▄▀▀▄░▄▀▀▄░█▀▀▄░░░░░░▒█░▄▀▀▄░█▀▀▀░█▀▀▄░█▀▀▄░█▒░"));
    System.out.println(color.setColor("red",   "░▒█░░▒█░█▀▀▄░█▄▄▀░░█▀░█░▀▄░█▄▄█░█░█░█░░█░░░█▄▄█░█░░█░█▄▄▀░░░░░░▒█░█░░█░█░▀▄░█▄▄█░█▄▄▀░▀▒░"));
    System.out.println(color.setColor("red",   "░▒█▄▄▄█░▀▀▀▀░▀░▀▀░▀▀▀░▀▀▀▀░▀░░▀░▀▀░░░▀▀░░░░█░░░░░▀▀░░▀░▀▀░░░▒█▄▄█░░▀▀░░▀▀▀▀░▀░░▀░▀░▀▀░▄▒░"));
    System.out.println(color.setColor("cyan",   "                                                                                        "));
    System.out.println(color.setColor("yellow", "                                   Créditos à:                                          "));
    System.out.println(color.setColor("cyan",   "                              Daniel Antunes") + " " +color.setColor("green",this.DAN    ));
    System.out.println(color.setColor("cyan",   "                           Eduardo Medeiros") + " " + color.setColor("green", this.EDU   ));
    System.out.println(color.setColor("cyan",   "                            Fábio Nalini") + " " + color.setColor("green", this.FAB      ));
    System.out.println(color.setColor("cyan",   "                              Ícaro Onofre")  + " " + color.setColor("green", this.ICA   ));
    System.out.println(color.setColor("cyan",   "                            Saul Castillo") + " " + color.setColor("green", this.SAU     ));
    System.out.println(color.setColor("cyan",   "                                                                                        "));

  }
}
