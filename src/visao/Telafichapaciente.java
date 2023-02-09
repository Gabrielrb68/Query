package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;

public class Telafichapaciente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeDoPaciente;
	private JTextField textFieldNome;
	private JTextField textFieldTelefone;
	private JTextField textFieldEmail;
	private JTextField textFieldNomeSocial;
	private JTextField textFieldGenero;
	private JTextField textFieldSexo;
	private JTextField textFieldNascimento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Telafichapaciente frame = new Telafichapaciente();
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
	public Telafichapaciente() {
		setTitle("Hospital Esmeralda");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Telafichapaciente.class.getResource("/visao/logoHospital.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 863, 569);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(219, 219, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNomeDoPaciente = new JTextField();
		txtNomeDoPaciente.setBounds(10, 11, 306, 36);
		txtNomeDoPaciente.setForeground(new Color(255, 255, 255));
		txtNomeDoPaciente.setHorizontalAlignment(SwingConstants.CENTER);
		txtNomeDoPaciente.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		txtNomeDoPaciente.setEditable(false);
		txtNomeDoPaciente.setBackground(new Color(64, 128, 128));
		txtNomeDoPaciente.setText("Informações pessoais");
		contentPane.add(txtNomeDoPaciente);
		txtNomeDoPaciente.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 306, 508);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(69, 57, 171, 191);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Telafichapaciente.class.getResource("/visao/iconpeople.png")));
		lblNewLabel.setBounds(52, 44, 72, 96);
		panel_1.add(lblNewLabel);
		
		textFieldNome = new JTextField();
		textFieldNome.setEditable(false);
		textFieldNome.setText("Inalterável");
		textFieldNome.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
		textFieldNome.setBounds(10, 274, 217, 20);
		panel.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		textFieldTelefone = new JTextField();
		textFieldTelefone.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
		textFieldTelefone.setText("Alterável");
		textFieldTelefone.setBounds(138, 399, 115, 20);
		panel.add(textFieldTelefone);
		textFieldTelefone.setColumns(10);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
		textFieldEmail.setText("Alterável");
		textFieldEmail.setBounds(13, 440, 214, 20);
		panel.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		textFieldNomeSocial = new JTextField();
		textFieldNomeSocial.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
		textFieldNomeSocial.setText("Alterável");
		textFieldNomeSocial.setBounds(10, 313, 217, 20);
		panel.add(textFieldNomeSocial);
		textFieldNomeSocial.setColumns(10);
		
		textFieldGenero = new JTextField();
		textFieldGenero.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
		textFieldGenero.setText("Alterável");
		textFieldGenero.setBounds(138, 358, 86, 20);
		panel.add(textFieldGenero);
		textFieldGenero.setColumns(10);
		
		textFieldSexo = new JTextField();
		textFieldSexo.setEditable(false);
		textFieldSexo.setText("Inalterável");
		textFieldSexo.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
		textFieldSexo.setBounds(13, 358, 86, 20);
		panel.add(textFieldSexo);
		textFieldSexo.setColumns(10);
		
		textFieldNascimento = new JTextField();
		textFieldNascimento.setEditable(false);
		textFieldNascimento.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
		textFieldNascimento.setText("Inalterável");
		textFieldNascimento.setBounds(13, 399, 86, 20);
		panel.add(textFieldNascimento);
		textFieldNascimento.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(10, 262, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome social");
		lblNewLabel_2.setBounds(10, 300, 86, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Sexo");
		lblNewLabel_3.setBounds(13, 346, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Gênero");
		lblNewLabel_4.setBounds(138, 346, 46, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Telefone");
		lblNewLabel_5.setBounds(137, 385, 90, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Nascimento");
		lblNewLabel_6.setBounds(13, 386, 115, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("E-mail");
		lblNewLabel_7.setBounds(14, 425, 46, 14);
		panel.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.setIcon(new ImageIcon(Telafichapaciente.class.getResource("/visao/iconCheck.png")));
		btnNewButton.setBounds(237, 440, 59, 57);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(410, -50, 369, 532);
		lblNewLabel_8.setIcon(new ImageIcon(Telafichapaciente.class.getResource("/visao/iconmedicina.png")));
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Registros dos pacientes");
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setBounds(453, -9, 270, 72);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_9);
		
		JButton btnAcessarHistorico = new JButton("Acessar histórico médico");
		btnAcessarHistorico.setForeground(new Color(255, 255, 255));
		btnAcessarHistorico.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 11));
		btnAcessarHistorico.setBounds(494, 478, 184, 23);
		btnAcessarHistorico.setBackground(new Color(64, 128, 128));
		contentPane.add(btnAcessarHistorico);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(64, 128, 128));
		panel_2.setBounds(467, -9, 243, 59);
		contentPane.add(panel_2);
	}
}
