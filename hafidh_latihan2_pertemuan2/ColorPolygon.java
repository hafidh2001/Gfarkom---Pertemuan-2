package hafidh_latihan2_pertemuan2;

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author Hafidh
 */

public class ColorPolygon extends Applet {
    @Override
    public void paint (Graphics g)
    {
        int x [] ={20,40,70,80,100,10};
        int y [] ={20,40,10,50,70,80};
        int p=6;
        g.drawPolygon(x,y,p);
        g.fillPolygon(x,y,p);
        
    }
}