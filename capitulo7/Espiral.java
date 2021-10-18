package capitulo7;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Espiral extends JPanel{
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		/*int raio = 15;
		int Xorigem = getWidth()/2;
		int Yorigem = getHeight()/2;
		int width = 100;
	    int height = 100;
		int startAngle = 0;
		int arcAngle = 20;
		int DELTA = 1;
		
		
		
		
		for(int counter = 1; counter <= 13; counter++) {
			g.setColor(Color.blue);
			if(counter%2 != 0) {
			g.drawArc(Xorigem - raio * counter,
					  Yorigem - raio * counter,
					  raio*counter*2,
					  raio*counter*2,
					  anguloO, 180);
			}else {
				g.drawArc(Xorigem - raio * counter - 13,
						  Yorigem - raio * counter - 7,
						  raio*counter*2,
						  raio*counter*2,
						  anguloO, 180);
			}
			anguloO -= 180;
			
		}*/
		
		int x = getSize().width / 2;
        int y = getSize().height/ 2;
        int width = 30;
        int height = 30;
        int startAngle = 0;
        int arcAngle = 180;
        int depth = 10;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                //   g.drawArc(x + 10, y + 10, width, height, startAngle + 10, -arcAngle);
                //  x = x - 5;
            	y = y - depth;
                width = width + 2 * depth;
                height = height + 2 * depth;
                g.drawArc(x, y, width, height, startAngle, -arcAngle);
                
            } else {
                //  g.drawArc(x + 10, y + 10, width, height, startAngle + 10, arcAngle);
                x = x - 2*depth;
                y = y - depth;
                width = width + 2 * depth;
                height = height + 2 * depth;
                g.drawArc(x, y, width, height, startAngle, arcAngle);
            }
        }
		
		
		
	}

}
