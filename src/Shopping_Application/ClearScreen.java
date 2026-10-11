package Shopping_Application;

public class ClearScreen {
    public void print(Object obj){
        System.out.println(obj);
    }
    public void clearScreen()
    {
        print("\033[H\033[2J");
        System.out.flush();
    }
}
