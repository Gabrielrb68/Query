package visao;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;


public class TelaPadrao extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPadrao frame = new TelaPadrao();
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
	public TelaPadrao() {
		setForeground(new Color(0, 51, 51));
		setTitle("Hospital Esmeralda");
		setBackground(new Color(0, 51, 51));
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaPadrao.class.getResource("/visao/logoHospital.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 863, 569);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(219, 219, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 81, 81));
		panel.setBounds(0, 0, 192, 530);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Consultas pendentes");
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 81, 81));
		btnNewButton.setBounds(10, 96, 172, 23);
		panel.add(btnNewButton);
		
		JButton btnMarcarConsulta = new JButton("Marcar consulta");
		btnMarcarConsulta.setForeground(Color.WHITE);
		btnMarcarConsulta.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		btnMarcarConsulta.setBackground(new Color(0, 81, 81));
		btnMarcarConsulta.setBounds(10, 168, 167, 23);
		panel.add(btnMarcarConsulta);
		
		JButton btnCadastrarPaciente = new JButton("Cadastrar paciente");
		btnCadastrarPaciente.setForeground(Color.WHITE);
		btnCadastrarPaciente.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		btnCadastrarPaciente.setBackground(new Color(0, 81, 81));
		btnCadastrarPaciente.setBounds(10, 240, 167, 23);
		panel.add(btnCadastrarPaciente);
		
		JButton btnListaPaciente = new JButton("Pacientes");
		btnListaPaciente.setForeground(Color.WHITE);
		btnListaPaciente.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		btnListaPaciente.setBackground(new Color(0, 81, 81));
		btnListaPaciente.setBounds(10, 313, 167, 23);
		panel.add(btnListaPaciente);
		
		JButton btnProfissionais = new JButton("Profissionais");
		btnProfissionais.setForeground(Color.WHITE);
		btnProfissionais.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		btnProfissionais.setBackground(new Color(0, 81, 81));
		btnProfissionais.setBounds(10, 390, 167, 23);
		panel.add(btnProfissionais);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setForeground(new Color(255, 255, 255));
		btnSair.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		btnSair.setBackground(new Color(64, 128, 128));
		btnSair.setBounds(44, 496, 98, 23);
		panel.add(btnSair);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(77, 0, 82, 87);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(TelaPadrao.class.getResource("/visao/simbolomed.png")));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(64, 128, 128));
		panel_1.setBounds(190, 0, 657, 100);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Bem-vindo!");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(22, 11, 169, 62);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 240, 240));
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2.setBounds(251, 142, 230, 153);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Pacientes cadastrados:");
		lblNewLabel_2.setBounds(10, 99, 147, 43);
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		
		textField = new JTextField();
		textField.setBackground(new Color(240, 240, 240));
		textField.setEditable(false);
		textField.setBounds(156, 113, 64, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(TelaPadrao.class.getResource("/visao/iconPaciente (4).png")));
		lblNewLabel_3.setBounds(71, 11, 86, 77);
		panel_2.add(lblNewLabel_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3.setBounds(510, 142, 230, 153);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(TelaPadrao.class.getResource("/visao/iconMedico.png")));
		lblNewLabel_4.setBounds(78, 11, 82, 81);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("M??dicos dispon??veis:");
		lblNewLabel_2_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(9, 103, 137, 43);
		panel_3.add(lblNewLabel_2_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(142, 117, 64, 20);
		panel_3.add(textField_1);
		

		
	}
}
