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

public class TelaFichaPaciente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeDoPaciente;
	private JTextField txtNome;
	private JTextField txtTelefone;
	private JTextField txtEmail;
	private JTextField txtNomeSocial;
	private JTextField txtSexo;
	private JTextField txtNascimento;
	private JTextField txtCEP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFichaPaciente frame = new TelaFichaPaciente();
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
	public TelaFichaPaciente() {
		setTitle("Hospital Esmeralda");
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaFichaPaciente.class.getResource("/visao/logoHospital.png")));
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
		lblNewLabel.setIcon(new ImageIcon(TelaFichaPaciente.class.getResource("/visao/iconpeople.png")));
		lblNewLabel.setBounds(52, 44, 72, 96);
		panel_1.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setEditable(false);
		txtNome.setText("Inalterável");
		txtNome.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
		txtNome.setBounds(10, 274, 217, 20);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
		txtEmail.setText("Alterável");
		txtEmail.setBounds(11, 466, 214, 20);
		panel.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtNomeSocial = new JTextField();
		txtNomeSocial.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
		txtNomeSocial.setText("Alterável");
		txtNomeSocial.setBounds(10, 313, 217, 20);
		panel.add(txtNomeSocial);
		txtNomeSocial.setColumns(10);
		
		txtSexo = new JTextField();
		txtSexo.setEditable(false);
		txtSexo.setText("Inalterável");
		txtSexo.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
		txtSexo.setBounds(10, 349, 86, 20);
		panel.add(txtSexo);
		txtSexo.setColumns(10);
		
		txtNascimento = new JTextField();
		txtNascimento.setEditable(false);
		txtNascimento.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
		txtNascimento.setText("Inalterável");
		txtNascimento.setBounds(106, 349, 86, 20);
		panel.add(txtNascimento);
		txtNascimento.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(10, 262, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome social");
		lblNewLabel_2.setBounds(10, 300, 86, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Sexo");
		lblNewLabel_3.setBounds(10, 337, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_6 = new JLabel("Nascimento");
		lblNewLabel_6.setBounds(106, 336, 115, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("E-mail");
		lblNewLabel_7.setBounds(12, 451, 46, 14);
		panel.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.setIcon(new ImageIcon(TelaFichaPaciente.class.getResource("/visao/iconCheck.png")));
		btnNewButton.setBounds(237, 440, 59, 57);
		panel.add(btnNewButton);
		
		txtCEP = new JTextField();
		txtCEP.setText("Alterável");
		txtCEP.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
		txtCEP.setColumns(10);
		txtCEP.setBounds(9, 425, 214, 20);
		panel.add(txtCEP);
		
		JLabel lblNewLabel_5_1 = new JLabel("CEP");
		lblNewLabel_5_1.setBounds(11, 410, 90, 14);
		panel.add(lblNewLabel_5_1);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(11, 386, 115, 20);
		panel.add(txtTelefone);
		txtTelefone.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
		txtTelefone.setText("Alterável");
		txtTelefone.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Telefone");
		lblNewLabel_5.setBounds(10, 372, 90, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(410, -50, 369, 532);
		lblNewLabel_8.setIcon(new ImageIcon(TelaFichaPaciente.class.getResource("/visao/iconmedicina.png")));
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
