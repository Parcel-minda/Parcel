package Parcel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class D_sucsess extends JFrame{
	JLabel �Ǽǳɹ� = new JLabel("\u767B\u8BB0\u6210\u529F\uFF01");
	JButton ȷ�� = new JButton("\u786E\u5B9A");
	/**
	 * Launch the application.
	 */
	public void success(final A_allinformation all,final String usertele){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		ȷ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				D_main a=new D_main();
				a.mimain(all,usertele);
			}
		});
	}

	/**
	 * Create the application.
	 */
	public D_sucsess() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 400, 195);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		�Ǽǳɹ�.setFont(new Font("����", Font.BOLD, 24));
		�Ǽǳɹ�.setBounds(132, 29, 141, 54);
		getContentPane().add(�Ǽǳɹ�);
		ȷ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ȷ��.setFont(new Font("����", Font.PLAIN, 20));
		
		
		ȷ��.setBounds(107, 93, 158, 36);
		getContentPane().add(ȷ��);
	}
}
