package capitulo7;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class EspiralQuadrada extends JPanel{
	
	public EspiralQuadrada() {
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int tamanho = 30;
		
		int Xorigem = getWidth()/2;
		int Yorigem = getHeight()/2;
		int Xfim = 0;
		int Yfim = 0;
		
		for(int counter = 1; counter <= 20; counter++) {
			
			g.setColor(Color.red);
							
			
			if(counter%2 == 0) {
				tamanho *= -1;
				Xfim = Xorigem + tamanho;
				g.drawLine(Xorigem, Yorigem, Xfim,Yorigem);
				Xorigem = Xfim;
				if(tamanho > 0)
					tamanho+=35;
				else
					tamanho-=35;
				
			}else {
				Yfim = Yorigem + tamanho;
				g.drawLine(Xorigem, Yorigem, Xorigem,Yfim);
				Yorigem = Yfim;
			}
		}
	}
}
