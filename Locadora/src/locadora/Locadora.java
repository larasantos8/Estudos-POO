package locadora;

public class Locadora {

    public static void main(String[] args) {
      ListaGames ls = new ListaGames(10);
      try{
          ls.add(new Game(1, "GTA"));
          ls.add(new Game(2, "LOL"));
          ls.add(new Game(1, "Minecraft"));
      }
      catch(Exception exc){
          System.out.println(exc);
      }
      ls.printAll();
    }
    
}
