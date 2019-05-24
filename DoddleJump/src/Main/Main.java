package Main;


public class Main implements declarations{
    private static String path = System.getProperty("user.dir");
    public static void main(String[] args) {
        Display display = new Display(title);
        display.setupFrame(size[0], size[1]);
        display.setPanel(new Game());
        display.setIcon(path+"\\src\\Assests\\Dungeon assets pack\\Characters\\Player\\Player.png");
    }
}
