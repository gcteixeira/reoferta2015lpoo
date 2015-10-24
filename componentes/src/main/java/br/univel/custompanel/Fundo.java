package br.univel.custompanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Fundo extends JPanel {

	public Fundo() {
		setBackground(Color.BLACK);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		int larguraQuad = getWidth() / 8;
		int alturaQuad = getHeight() /8;
		
		g2.setColor(Color.WHITE);
		
		for (int stepH = 0; stepH < 4; stepH++) {
			for (int stepW = 0; stepW < 4; stepW++) {
				g2.fillRect(stepW*larguraQuad+stepW * larguraQuad,
						stepH*alturaQuad + stepH * alturaQuad,
						larguraQuad, alturaQuad);
				
				g2.fillRect(stepW*larguraQuad + stepW * larguraQuad + larguraQuad,
						stepH*alturaQuad + stepH * alturaQuad + alturaQuad,
						larguraQuad, alturaQuad);
			}
		}
		
	}

	
}
