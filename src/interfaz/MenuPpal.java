package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import dominio.Calculadora;

public class MenuPpal extends JFrame {

	private JPanel contentPane;
	private JTextField textResultado;
	private Calculadora calc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPpal frame = new MenuPpal();
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
	public MenuPpal() {

		calc = new Calculadora();

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

		JMenu mnNewMenu_Edicion = new JMenu("EdiciÃ³n");
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

		JPanel panel_Top = new JPanel();
		contentPane.add(panel_Top, BorderLayout.NORTH);

		textResultado = new JTextField("0");
		textResultado.setColumns(10);
		// Cambiar algunas propiedades
		textResultado.setBackground(Color.WHITE);
		textResultado.setFont(new Font("Arial", Font.PLAIN, 15));
		textResultado.setHorizontalAlignment(JTextField.RIGHT);
		// Marcar que no se puede modificar directamente.
		textResultado.setEditable(false);
		GroupLayout gl_panel_Top = new GroupLayout(panel_Top);
		gl_panel_Top.setHorizontalGroup(gl_panel_Top.createParallelGroup(Alignment.LEADING).addComponent(textResultado,
				Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE));
		gl_panel_Top.setVerticalGroup(gl_panel_Top.createParallelGroup(Alignment.LEADING).addComponent(textResultado,
				GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE));
		panel_Top.setLayout(gl_panel_Top);

		Panel panel_Middle = new Panel();
		contentPane.add(panel_Middle, BorderLayout.CENTER);

		JPanel panel_Middle_Middle = new JPanel();
		panel_Middle.add(panel_Middle_Middle);
		GridBagLayout gbl_panel_Middle_Middle = new GridBagLayout();
		gbl_panel_Middle_Middle.columnWidths = new int[] { 40, 40, 40, 40, 40 };
		gbl_panel_Middle_Middle.rowHeights = new int[] { 40, 40, 40, 40, 40, 40 };
		gbl_panel_Middle_Middle.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0 };
		gbl_panel_Middle_Middle.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE, 0.0, 0.0, 0.0 };
		panel_Middle_Middle.setLayout(gbl_panel_Middle_Middle);

		JButton btnMa = new JButton("MC");
		btnMa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnMa = new GridBagConstraints();
		gbc_btnMa.fill = GridBagConstraints.BOTH;
		gbc_btnMa.insets = new Insets(0, 0, 5, 5);
		gbc_btnMa.gridx = 0;
		gbc_btnMa.gridy = 0;
		panel_Middle_Middle.add(btnMa, gbc_btnMa);

		JButton btnMc = new JButton("MR");
		GridBagConstraints gbc_btnMc = new GridBagConstraints();
		gbc_btnMc.fill = GridBagConstraints.BOTH;
		gbc_btnMc.insets = new Insets(0, 0, 5, 5);
		gbc_btnMc.gridx = 1;
		gbc_btnMc.gridy = 0;
		panel_Middle_Middle.add(btnMc, gbc_btnMc);

		JButton btnMs = new JButton("MS");
		GridBagConstraints gbc_btnMs = new GridBagConstraints();
		gbc_btnMs.fill = GridBagConstraints.BOTH;
		gbc_btnMs.insets = new Insets(0, 0, 5, 5);
		gbc_btnMs.gridx = 2;
		gbc_btnMs.gridy = 0;
		panel_Middle_Middle.add(btnMs, gbc_btnMs);

		JButton btnM = new JButton("M+");
		GridBagConstraints gbc_btnM = new GridBagConstraints();
		gbc_btnM.fill = GridBagConstraints.BOTH;
		gbc_btnM.insets = new Insets(0, 0, 5, 5);
		gbc_btnM.gridx = 3;
		gbc_btnM.gridy = 0;
		panel_Middle_Middle.add(btnM, gbc_btnM);

		JButton btnM1 = new JButton("M-");
		GridBagConstraints gbc_btnM1 = new GridBagConstraints();
		gbc_btnM1.fill = GridBagConstraints.BOTH;
		gbc_btnM1.insets = new Insets(0, 0, 5, 0);
		gbc_btnM1.gridx = 4;
		gbc_btnM1.gridy = 0;
		panel_Middle_Middle.add(btnM1, gbc_btnM1);

		JButton btn_Del = new JButton("<-");
		btn_Del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				retroceder();
			}
		});
		GridBagConstraints gbc_btn_Del = new GridBagConstraints();
		gbc_btn_Del.fill = GridBagConstraints.BOTH;
		gbc_btn_Del.insets = new Insets(0, 0, 5, 5);
		gbc_btn_Del.gridx = 0;
		gbc_btn_Del.gridy = 1;
		panel_Middle_Middle.add(btn_Del, gbc_btn_Del);

		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		GridBagConstraints gbc_btnCe = new GridBagConstraints();
		gbc_btnCe.fill = GridBagConstraints.BOTH;
		gbc_btnCe.insets = new Insets(0, 0, 5, 5);
		gbc_btnCe.gridx = 1;
		gbc_btnCe.gridy = 1;
		panel_Middle_Middle.add(btnCe, gbc_btnCe);

		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clear();
			}
		});
		GridBagConstraints gbc_btnC = new GridBagConstraints();
		gbc_btnC.fill = GridBagConstraints.BOTH;
		gbc_btnC.insets = new Insets(0, 0, 5, 5);
		gbc_btnC.gridx = 2;
		gbc_btnC.gridy = 1;
		panel_Middle_Middle.add(btnC, gbc_btnC);

		JButton btnMoreLess = new JButton("Â±");
		GridBagConstraints gbc_btnMoreLess = new GridBagConstraints();
		gbc_btnMoreLess.fill = GridBagConstraints.BOTH;
		gbc_btnMoreLess.insets = new Insets(0, 0, 5, 5);
		gbc_btnMoreLess.gridx = 3;
		gbc_btnMoreLess.gridy = 1;
		panel_Middle_Middle.add(btnMoreLess, gbc_btnMoreLess);

		JButton btnRoot = new JButton("âˆš");
		GridBagConstraints gbc_btnRoot = new GridBagConstraints();
		gbc_btnRoot.fill = GridBagConstraints.BOTH;
		gbc_btnRoot.insets = new Insets(0, 0, 5, 0);
		gbc_btnRoot.gridx = 4;
		gbc_btnRoot.gridy = 1;
		panel_Middle_Middle.add(btnRoot, gbc_btnRoot);

		JButton button = new JButton("7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				insertarNumero("7");
			}
		});
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.BOTH;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 0;
		gbc_button.gridy = 2;
		panel_Middle_Middle.add(button, gbc_button);

		JButton btnEight = new JButton("8");
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				insertarNumero("8");
			}
		});
		GridBagConstraints gbc_btnEight = new GridBagConstraints();
		gbc_btnEight.fill = GridBagConstraints.BOTH;
		gbc_btnEight.insets = new Insets(0, 0, 5, 5);
		gbc_btnEight.gridx = 1;
		gbc_btnEight.gridy = 2;
		panel_Middle_Middle.add(btnEight, gbc_btnEight);

		JButton btnNine = new JButton("9");
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				insertarNumero("9");
			}
		});
		GridBagConstraints gbc_btnNine = new GridBagConstraints();
		gbc_btnNine.fill = GridBagConstraints.BOTH;
		gbc_btnNine.insets = new Insets(0, 0, 5, 5);
		gbc_btnNine.gridx = 2;
		gbc_btnNine.gridy = 2;
		panel_Middle_Middle.add(btnNine, gbc_btnNine);

		JButton btnDivide = new JButton("/");
		GridBagConstraints gbc_btnDivide = new GridBagConstraints();
		gbc_btnDivide.fill = GridBagConstraints.BOTH;
		gbc_btnDivide.insets = new Insets(0, 0, 5, 5);
		gbc_btnDivide.gridx = 3;
		gbc_btnDivide.gridy = 2;
		panel_Middle_Middle.add(btnDivide, gbc_btnDivide);

		JButton btnPercentage = new JButton("%");
		GridBagConstraints gbc_btnPercentage = new GridBagConstraints();
		gbc_btnPercentage.fill = GridBagConstraints.BOTH;
		gbc_btnPercentage.insets = new Insets(0, 0, 5, 0);
		gbc_btnPercentage.gridx = 4;
		gbc_btnPercentage.gridy = 2;
		panel_Middle_Middle.add(btnPercentage, gbc_btnPercentage);

		JButton btnFour = new JButton("4");
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				insertarNumero("4");
			}
		});
		GridBagConstraints gbc_btnFour = new GridBagConstraints();
		gbc_btnFour.fill = GridBagConstraints.BOTH;
		gbc_btnFour.insets = new Insets(0, 0, 5, 5);
		gbc_btnFour.gridx = 0;
		gbc_btnFour.gridy = 3;
		panel_Middle_Middle.add(btnFour, gbc_btnFour);

		JButton btnFive = new JButton("5");
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				insertarNumero("5");

			}
		});
		GridBagConstraints gbc_btnFive = new GridBagConstraints();
		gbc_btnFive.fill = GridBagConstraints.BOTH;
		gbc_btnFive.insets = new Insets(0, 0, 5, 5);
		gbc_btnFive.gridx = 1;
		gbc_btnFive.gridy = 3;
		panel_Middle_Middle.add(btnFive, gbc_btnFive);

		JButton btnSix = new JButton("6");
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				insertarNumero("6");
			}
		});
		GridBagConstraints gbc_btnSix = new GridBagConstraints();
		gbc_btnSix.fill = GridBagConstraints.BOTH;
		gbc_btnSix.insets = new Insets(0, 0, 5, 5);
		gbc_btnSix.gridx = 2;
		gbc_btnSix.gridy = 3;
		panel_Middle_Middle.add(btnSix, gbc_btnSix);

		JButton btnMultiply = new JButton("*");
		GridBagConstraints gbc_btnMultiply = new GridBagConstraints();
		gbc_btnMultiply.fill = GridBagConstraints.BOTH;
		gbc_btnMultiply.insets = new Insets(0, 0, 5, 5);
		gbc_btnMultiply.gridx = 3;
		gbc_btnMultiply.gridy = 3;
		panel_Middle_Middle.add(btnMultiply, gbc_btnMultiply);

		JButton btnFraction = new JButton("1/x");
		GridBagConstraints gbc_btnFraction = new GridBagConstraints();
		gbc_btnFraction.fill = GridBagConstraints.BOTH;
		gbc_btnFraction.insets = new Insets(0, 0, 5, 0);
		gbc_btnFraction.gridx = 4;
		gbc_btnFraction.gridy = 3;
		panel_Middle_Middle.add(btnFraction, gbc_btnFraction);

		JButton btnOne = new JButton("1");
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				insertarNumero("1");
			}
		});
		GridBagConstraints gbc_btnOne = new GridBagConstraints();
		gbc_btnOne.fill = GridBagConstraints.BOTH;
		gbc_btnOne.insets = new Insets(0, 0, 5, 5);
		gbc_btnOne.gridx = 0;
		gbc_btnOne.gridy = 4;
		panel_Middle_Middle.add(btnOne, gbc_btnOne);

		JButton btnTwo = new JButton("2");
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				insertarNumero("2");
			}
		});
		GridBagConstraints gbc_btnTwo = new GridBagConstraints();
		gbc_btnTwo.fill = GridBagConstraints.BOTH;
		gbc_btnTwo.insets = new Insets(0, 0, 5, 5);
		gbc_btnTwo.gridx = 1;
		gbc_btnTwo.gridy = 4;
		panel_Middle_Middle.add(btnTwo, gbc_btnTwo);

		JButton btnThree = new JButton("3");
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				insertarNumero("3");
			}
		});
		GridBagConstraints gbc_btnThree = new GridBagConstraints();
		gbc_btnThree.fill = GridBagConstraints.BOTH;
		gbc_btnThree.insets = new Insets(0, 0, 5, 5);
		gbc_btnThree.gridx = 2;
		gbc_btnThree.gridy = 4;
		panel_Middle_Middle.add(btnThree, gbc_btnThree);

		JButton btnSubtract = new JButton("-");
		GridBagConstraints gbc_btnSubtract = new GridBagConstraints();
		gbc_btnSubtract.fill = GridBagConstraints.BOTH;
		gbc_btnSubtract.insets = new Insets(0, 0, 5, 5);
		gbc_btnSubtract.gridx = 3;
		gbc_btnSubtract.gridy = 4;
		panel_Middle_Middle.add(btnSubtract, gbc_btnSubtract);

		JButton btnEqualize = new JButton("=");
		btnEqualize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcular();
			}
		});
		GridBagConstraints gbc_btnEqualize = new GridBagConstraints();
		gbc_btnEqualize.fill = GridBagConstraints.BOTH;
		gbc_btnEqualize.gridheight = 2;
		gbc_btnEqualize.gridx = 4;
		gbc_btnEqualize.gridy = 4;
		panel_Middle_Middle.add(btnEqualize, gbc_btnEqualize);

		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				insertarNumero("0");
			}
		});
		GridBagConstraints gbc_btnZero = new GridBagConstraints();
		gbc_btnZero.fill = GridBagConstraints.BOTH;
		gbc_btnZero.gridwidth = 2;
		gbc_btnZero.insets = new Insets(0, 0, 0, 5);
		gbc_btnZero.gridx = 0;
		gbc_btnZero.gridy = 5;
		panel_Middle_Middle.add(btnZero, gbc_btnZero);

		JButton btnComa = new JButton(",");
		btnComa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				insertarNumero(",");
			}
		});
		GridBagConstraints gbc_btnComa = new GridBagConstraints();
		gbc_btnComa.fill = GridBagConstraints.BOTH;
		gbc_btnComa.insets = new Insets(0, 0, 0, 5);
		gbc_btnComa.gridx = 2;
		gbc_btnComa.gridy = 5;
		panel_Middle_Middle.add(btnComa, gbc_btnComa);

		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calc.sumar();
			}
		});
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.fill = GridBagConstraints.BOTH;
		gbc_btnAdd.insets = new Insets(0, 0, 0, 5);
		gbc_btnAdd.gridx = 3;
		gbc_btnAdd.gridy = 5;
		panel_Middle_Middle.add(btnAdd, gbc_btnAdd);

		Panel panel_Bottom = new Panel();
		contentPane.add(panel_Bottom, BorderLayout.SOUTH);

		// ---------------------D i s p l a y---------------------

		// Indicar el tamaÃ±o del frame
		setSize(350, 415);
		// Marcar que sea una aplicaciÃ³n que no se pueda redimensionar
		setResizable(false);
		// AÃ±adir el tÃ­tulo de la aplicaciÃ³n
		setTitle("Calculadora 2.0");

		// Cambiar algunas propiedades
		textResultado.setBackground(Color.WHITE);
		textResultado.setFont(new Font("Arial", Font.PLAIN, 15));
		textResultado.setHorizontalAlignment(JTextField.RIGHT);
		// Marcar que no se puede modificar directamente.
		textResultado.setEditable(false);

		// ---------------------D i s p l a y---------------------

		// -------------------------------------------------------

		// ---------------------M e t o d o s---------------------

	}

	private void insertarNumero(String numero) {

		calc.concatenar(numero);
		refrescarTextoResultado();

	}

	private void asignarOperacion(String operacion) {

	}

	private void calcular() {

	}

	private void raiz() {

	}

	private void inversa() {

	}

	private void cambiarSigno() {

	}

	private void retroceder() {

		calc.retroceder();
		refrescarTextoResultado();
	}

	private void clearError() {

	}

	private void clear() {

		calc.reset();
		this.textResultado.setText("0");
		refrescarTextoResultado();
	}

	private void refrescarTextoResultado() {

		this.textResultado.setText(calc.getNumActual());
	}
}
