package br.univel.custompanel;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class CustomPaintComponent {

	public static void main(String[] args) {

		// Garante que o código do método run será
		// executado na EDT, ou seja, na Thread de
		// eventos.
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				JFrame janela = new JFrame();
				// Tamanho
				janela.setSize(640, 480);
				// Centralizar na tela
				janela.setLocationRelativeTo(null);
				// Maximizar
//				janela.setExtendedState(JFrame.MAXIMIZED_BOTH);

				// Faz o programa terminar quando fecha a janela.
				janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				// Usa um fundo para a janela, pode ser
				// qualquer componente, inclusive um painel
				// com outros componentes.
				janela.setContentPane(new Fundo());

				// Mosta a janela. IMPORTANTE: todas as configurações
				// devem ser feitas antes de mostrar a janela.
				janela.setVisible(true);
			}
		});
	}
}
