package Movie_TB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ticket_Booking {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket_Booking window = new Ticket_Booking();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ticket_Booking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 858, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 842, 10);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("MOVIE TICKET BOOKING");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(196, 21, 386, 62);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MOVIE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(113, 123, 73, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TIME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(113, 167, 61, 33);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DATE");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(114, 222, 61, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("TICKETS");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(94, 284, 126, 29);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox M1 = new JComboBox();
		M1.setModel(new DefaultComboBoxModel(new String[] {"select", "dasara", "pathu thala"}));
		M1.setBounds(369, 115, 174, 22);
		frame.getContentPane().add(M1);
		
		JComboBox T1 = new JComboBox();
		T1.setModel(new DefaultComboBoxModel(new String[] {"select", "12:30PM", "1:30PM"}));
		T1.setBounds(369, 167, 174, 22);
		frame.getContentPane().add(T1);
		
		JComboBox D1 = new JComboBox();
		D1.setModel(new DefaultComboBoxModel(new String[] {"select", "02-05-2023", "03-05-2023"}));
		D1.setBounds(369, 227, 174, 22);
		frame.getContentPane().add(D1);
		
		JComboBox T2 = new JComboBox();
		T2.setModel(new DefaultComboBoxModel(new String[] {"select", "1", "2", "3", "4"}));
		T2.setBounds(369, 284, 174, 22);
		frame.getContentPane().add(T2);
		
		JButton btnNewButton = new JButton("booking");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String m=(String) M1.getSelectedItem();
				String t1=(String) T1.getSelectedItem();
				String d=(String) D1.getSelectedItem();
				String t2=(String) T2.getSelectedItem();
				int n=Integer.parseInt(t2);
				int bill=0;
				if(m.equals("dasara"))
				{
					bill=n*200;
				}
				else if(m.equals("pathu thala"))
				{
					bill=n*300;
				}
				else
				{
				JOptionPane.showMessageDialog(btnNewButton,"invalid");
				}
				JOptionPane.showMessageDialog(btnNewButton,"Thank you!"+"\nyour movie:"+m+"\ntime:"+t1+"\ndate:"+d+"\ntickets:"+t2+"\nbill:"+bill);
				
			}
		});
		btnNewButton.setBounds(381, 328, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
