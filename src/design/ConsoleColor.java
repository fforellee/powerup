package design;

public class ConsoleColor {
   private final String RED = "\u001B[31m";
   private final String GREEN = "\u001B[32m";
   private final String YELLOW = "\u001B[33m";
   private final String BLUE = "\u001B[34m";
   private final String PURPLE = "\u001B[35m";
   private final String CYAN = "\u001B[36m";
   private final String WHITE = "\u001B[37m";
   private final String RESET = "\u001B[0m";

   public String setColor(String color, String str) {
      switch (color.toUpperCase()) {
         case "RED":
            return this.RED + str + this.RESET;
         case "GREEN":
            return this.GREEN + str + this.RESET;
         case "YELLOW":
            return this.YELLOW + str + this.RESET;
         case "BLUE":
            return this.BLUE + str + this.RESET;
         case "PURPLE":
            return this.PURPLE + str + this.RESET;
         case "CYAN":
            return this.CYAN + str + this.RESET;
         case "WHITE":
            return this.WHITE + str + this.RESET;
      }
      return str;
   }
}