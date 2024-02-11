package Snake.Utilities;

import java.awt.event.*;
import java.util.HashMap;

public class Input implements KeyListener
{
    private char currKey;
    private state currState;
    public enum state { Up, Down, Left, Right }

    public HashMap<Character, state> keyMap = new HashMap<Character, state>()
    {{
        put('w', state.Up);
        put('a', state.Left);
        put('s', state.Down);
        put('d', state.Right);
    }};

    public boolean validTravel(state _s)
    {
        // Snake cannot travel left <-> right into itself
        if (_s == state.Left & currState == state.Right ||
            _s == state.Right & currState == state.Left) return false;
        
        // Snake cannot travel up <-> down into itself
        if (_s == state.Up & currState == state.Down ||
        _s == state.Down & currState == state.Up) return false;

        return true;
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        char _k = e.getKeyChar();
        state _s = keyMap.get(_k);
        
        // Check that key is within WASD
        if (_s == null) return;
        
        // Check that key is not held
        if (_k == currKey) return;

        // Check that snake is not turning 180°
        if (!validTravel(_s)) return;

        currKey = _k;
        currState = _s;

        System.out.println("Typed " + currKey + " State is " + currState);
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
}
