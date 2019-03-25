package calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Panel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

public class Calculadora extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu_Archivo = new JMenu("Archivo");
		menuBar.add(mnNewMenu_Archivo);

		JMenuItem mntmNuevo = new JMenuItem("Nuevo");
		mnNewMenu_Archivo.add(mntmNuevo);

		JMenuItem mntmAbrir = new JMenuItem("Abrir");
		mnNewMenu_Archivo.add(mntmAbrir);

		JMenuItem mntmSeparador = new JMenuItem("Separador");
		mnNewMenu_Archivo.add(mntmSeparador);

		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnNewMenu_Archivo.add(mntmSalir);

		JMenu mnNewMenu_Edicion = new JMenu("Edición");
		menuBar.add(mnNewMenu_Edicion);

		JMenuItem mntmCopiar = new JMenuItem("Copiar");
		mnNewMenu_Edicion.add(mntmCopiar);

		JMenuItem mntmPegar = new JMenuItem("Pegar");
		mnNewMenu_Edicion.add(mntmPegar);

		JMenu mnNewMenu_Ayuda = new JMenu("Ayuda");
		menuBar.add(mnNewMenu_Ayuda);

		JMenuItem mntmNewMenuItem = new JMenuItem("Manual de ayuda");
		mnNewMenu_Ayuda.add(mntmNewMenuItem);

		JSeparator separator = new JSeparator();
		mnNewMenu_Ayuda.add(separator);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Acerca de");
		mnNewMenu_Ayuda.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		Panel panel_Top = new Panel();
		contentPane.add(panel_Top, BorderLayout.NORTH);
		GroupLayout gl_panel_Top = new GroupLayout(panel_Top);
		gl_panel_Top.setHorizontalGroup(
				gl_panel_Top.createParallelGroup(Alignment.LEADING).addGap(0, 440, Short.MAX_VALUE));
		gl_panel_Top
				.setVerticalGroup(gl_panel_Top.createParallelGroup(Alignment.LEADING).addGap(0, 10, Short.MAX_VALUE));
		panel_Top.setLayout(gl_panel_Top);

		Panel panel_Middle = new Panel();
		contentPane.add(panel_Middle, BorderLayout.CENTER);

		JPanel panel_Middle_Middle = new JPanel();
		panel_Middle.add(panel_Middle_Middle);
		GridBagLayout gbl_panel_Middle_Middle = new GridBagLayout();
		gbl_panel_Middle_Middle.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panel_Middle_Middle.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_Middle_Middle.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_Middle_Middle.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_Middle_Middle.setLayout(gbl_panel_Middle_Middle);

		JButton btnMa = new JButton("MC");
		GridBagConstraints gbc_btnMa = new GridBagConstraints();
		gbc_btnMa.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnMa.insets = new Insets(0, 0, 5, 5);
		gbc_btnMa.gridx = 0;
		gbc_btnMa.gridy = 0;
		panel_Middle_Middle.add(btnMa, gbc_btnMa);

		JButton btnMc = new JButton("MR");
		GridBagConstraints gbc_btnMc = new GridBagConstraints();
		gbc_btnMc.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnMc.insets = new Insets(0, 0, 5, 5);
		gbc_btnMc.gridx = 1;
		gbc_btnMc.gridy = 0;
		panel_Middle_Middle.add(btnMc, gbc_btnMc);

		JButton btnMs = new JButton("MS");
		GridBagConstraints gbc_btnMs = new GridBagConstraints();
		gbc_btnMs.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnMs.insets = new Insets(0, 0, 5, 5);
		gbc_btnMs.gridx = 2;
		gbc_btnMs.gridy = 0;
		panel_Middle_Middle.add(btnMs, gbc_btnMs);

		JButton btnM = new JButton("M+");
		GridBagConstraints gbc_btnM = new GridBagConstraints();
		gbc_btnM.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnM.insets = new Insets(0, 0, 5, 5);
		gbc_btnM.gridx = 3;
		gbc_btnM.gridy = 0;
		panel_Middle_Middle.add(btnM, gbc_btnM);

		JButton btnM1 = new JButton("M-");
		GridBagConstraints gbc_btnM1 = new GridBagConstraints();
		gbc_btnM1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnM1.insets = new Insets(0, 0, 5, 0);
		gbc_btnM1.gridx = 4;
		gbc_btnM1.gridy = 0;
		panel_Middle_Middle.add(btnM1, gbc_btnM1);

		JButton btn_Del = new JButton("←");
		GridBagConstraints gbc_btn_Del = new GridBagConstraints();
		gbc_btn_Del.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn_Del.insets = new Insets(0, 0, 5, 5);
		gbc_btn_Del.gridx = 0;
		gbc_btn_Del.gridy = 1;
		panel_Middle_Middle.add(btn_Del, gbc_btn_Del);

		JButton btnCe = new JButton("CE");
		GridBagConstraints gbc_btnCe = new GridBagConstraints();
		gbc_btnCe.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCe.insets = new Insets(0, 0, 5, 5);
		gbc_btnCe.gridx = 1;
		gbc_btnCe.gridy = 1;
		panel_Middle_Middle.add(btnCe, gbc_btnCe);

		JButton btnC = new JButton("C");
		GridBagConstraints gbc_btnC = new GridBagConstraints();
		gbc_btnC.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnC.insets = new Insets(0, 0, 5, 5);
		gbc_btnC.gridx = 2;
		gbc_btnC.gridy = 1;
		panel_Middle_Middle.add(btnC, gbc_btnC);

		JButton btnMoreLess = new JButton("±");
		GridBagConstraints gbc_btnMoreLess = new GridBagConstraints();
		gbc_btnMoreLess.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnMoreLess.insets = new Insets(0, 0, 5, 5);
		gbc_btnMoreLess.gridx = 3;
		gbc_btnMoreLess.gridy = 1;
		panel_Middle_Middle.add(btnMoreLess, gbc_btnMoreLess);

		JButton btnRoot = new JButton("√");
		GridBagConstraints gbc_btnRoot = new GridBagConstraints();
		gbc_btnRoot.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnRoot.insets = new Insets(0, 0, 5, 0);
		gbc_btnRoot.gridx = 4;
		gbc_btnRoot.gridy = 1;
		panel_Middle_Middle.add(btnRoot, gbc_btnRoot);

		JButton button = new JButton("7");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.HORIZONTAL;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 0;
		gbc_button.gridy = 2;
		panel_Middle_Middle.add(button, gbc_button);

		JButton btnEight = new JButton("8");
		GridBagConstraints gbc_btnEight = new GridBagConstraints();
		gbc_btnEight.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEight.insets = new Insets(0, 0, 5, 5);
		gbc_btnEight.gridx = 1;
		gbc_btnEight.gridy = 2;
		panel_Middle_Middle.add(btnEight, gbc_btnEight);

		JButton btnNine = new JButton("9");
		GridBagConstraints gbc_btnNine = new GridBagConstraints();
		gbc_btnNine.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNine.insets = new Insets(0, 0, 5, 5);
		gbc_btnNine.gridx = 2;
		gbc_btnNine.gridy = 2;
		panel_Middle_Middle.add(btnNine, gbc_btnNine);

		JButton btnDivide = new JButton("/");
		GridBagConstraints gbc_btnDivide = new GridBagConstraints();
		gbc_btnDivide.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDivide.insets = new Insets(0, 0, 5, 5);
		gbc_btnDivide.gridx = 3;
		gbc_btnDivide.gridy = 2;
		panel_Middle_Middle.add(btnDivide, gbc_btnDivide);

		JButton btnPercentage = new JButton("%");
		GridBagConstraints gbc_btnPercentage = new GridBagConstraints();
		gbc_btnPercentage.insets = new Insets(0, 0, 5, 0);
		gbc_btnPercentage.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPercentage.gridx = 4;
		gbc_btnPercentage.gridy = 2;
		panel_Middle_Middle.add(btnPercentage, gbc_btnPercentage);

		JButton btnFour = new JButton("4");
		GridBagConstraints gbc_btnFour = new GridBagConstraints();
		gbc_btnFour.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnFour.insets = new Insets(0, 0, 5, 5);
		gbc_btnFour.gridx = 0;
		gbc_btnFour.gridy = 3;
		panel_Middle_Middle.add(btnFour, gbc_btnFour);

		JButton btnFive = new JButton("5");
		GridBagConstraints gbc_btnFive = new GridBagConstraints();
		gbc_btnFive.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnFive.insets = new Insets(0, 0, 5, 5);
		gbc_btnFive.gridx = 1;
		gbc_btnFive.gridy = 3;
		panel_Middle_Middle.add(btnFive, gbc_btnFive);

		JButton btnSix = new JButton("6");
		GridBagConstraints gbc_btnSix = new GridBagConstraints();
		gbc_btnSix.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSix.insets = new Insets(0, 0, 5, 5);
		gbc_btnSix.gridx = 2;
		gbc_btnSix.gridy = 3;
		panel_Middle_Middle.add(btnSix, gbc_btnSix);

		JButton btnMultiply = new JButton("*");
		GridBagConstraints gbc_btnMultiply = new GridBagConstraints();
		gbc_btnMultiply.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnMultiply.insets = new Insets(0, 0, 5, 5);
		gbc_btnMultiply.gridx = 3;
		gbc_btnMultiply.gridy = 3;
		panel_Middle_Middle.add(btnMultiply, gbc_btnMultiply);

		JButton btnFraction = new JButton("1/x");
		GridBagConstraints gbc_btnFraction = new GridBagConstraints();
		gbc_btnFraction.insets = new Insets(0, 0, 5, 0);
		gbc_btnFraction.gridx = 4;
		gbc_btnFraction.gridy = 3;
		panel_Middle_Middle.add(btnFraction, gbc_btnFraction);

		JButton btnOne = new JButton("1");
		GridBagConstraints gbc_btnOne = new GridBagConstraints();
		gbc_btnOne.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnOne.insets = new Insets(0, 0, 5, 5);
		gbc_btnOne.gridx = 0;
		gbc_btnOne.gridy = 4;
		panel_Middle_Middle.add(btnOne, gbc_btnOne);

		JButton btnTwo = new JButton("2");
		GridBagConstraints gbc_btnTwo = new GridBagConstraints();
		gbc_btnTwo.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnTwo.insets = new Insets(0, 0, 5, 5);
		gbc_btnTwo.gridx = 1;
		gbc_btnTwo.gridy = 4;
		panel_Middle_Middle.add(btnTwo, gbc_btnTwo);

		JButton btnThree = new JButton("3");
		GridBagConstraints gbc_btnThree = new GridBagConstraints();
		gbc_btnThree.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnThree.insets = new Insets(0, 0, 5, 5);
		gbc_btnThree.gridx = 2;
		gbc_btnThree.gridy = 4;
		panel_Middle_Middle.add(btnThree, gbc_btnThree);

		JButton btnSubtract = new JButton("-");
		GridBagConstraints gbc_btnSubtract = new GridBagConstraints();
		gbc_btnSubtract.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSubtract.insets = new Insets(0, 0, 5, 5);
		gbc_btnSubtract.gridx = 3;
		gbc_btnSubtract.gridy = 4;
		panel_Middle_Middle.add(btnSubtract, gbc_btnSubtract);

		JButton btnEqualize = new JButton("=");
		GridBagConstraints gbc_btnEqualize = new GridBagConstraints();
		gbc_btnEqualize.fill = GridBagConstraints.BOTH;
		gbc_btnEqualize.gridheight = 2;
		gbc_btnEqualize.gridx = 4;
		gbc_btnEqualize.gridy = 4;
		panel_Middle_Middle.add(btnEqualize, gbc_btnEqualize);

		JButton btnZero = new JButton("0");
		GridBagConstraints gbc_btnZero = new GridBagConstraints();
		gbc_btnZero.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnZero.gridwidth = 2;
		gbc_btnZero.insets = new Insets(0, 0, 0, 5);
		gbc_btnZero.gridx = 0;
		gbc_btnZero.gridy = 5;
		panel_Middle_Middle.add(btnZero, gbc_btnZero);

		JButton btnComa = new JButton(",");
		GridBagConstraints gbc_btnComa = new GridBagConstraints();
		gbc_btnComa.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnComa.insets = new Insets(0, 0, 0, 5);
		gbc_btnComa.gridx = 2;
		gbc_btnComa.gridy = 5;
		panel_Middle_Middle.add(btnComa, gbc_btnComa);

		JButton btnAdd = new JButton("+");
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAdd.insets = new Insets(0, 0, 0, 5);
		gbc_btnAdd.gridx = 3;
		gbc_btnAdd.gridy = 5;
		panel_Middle_Middle.add(btnAdd, gbc_btnAdd);

		Panel panel_Bottom = new Panel();
		contentPane.add(panel_Bottom, BorderLayout.SOUTH);
	}

}
