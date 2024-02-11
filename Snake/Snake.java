package Snake;

import Snake.Utilities.GridMap;
import Snake.Utilities.Input;

public class Snake
{
    public GridMap map;
    public Input in;

    public Snake()
    {
        in = new Input();
        map = new GridMap(10, 10);
        map.addKeyListener(in);
    }

    // Current biggest issue: Cannot make a game using GridLayout alone. Need something else, or inefficient implementation.
    public static void main(String[] args)
    {
        System.out.println("Test run.");
        
        var x = new Snake();
    }
}