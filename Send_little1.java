package Parcel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Send_little1 extends JFrame {
	JLabel ɾ���ɹ� = new JLabel("\u5220\u9664\u8BA2\u5355\u6210\u529F!");
	JButton ���ز˵� = new JButton("\u8FD4\u56DE\u83DC\u5355");
	JButton ������ҳ = new JButton("\u8FD4\u56DE\u4E3B\u9875");
	
	void little1(final A_allinformation all,final String usertele){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		���ز˵�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Send_menu a=new Send_menu();
				a.menu(all,usertele);
				a.setVisible(true);
				
			}
		});
		������ҳ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				B_center center=new B_center();
				center.center_main(all,usertele);
				center.setVisible(true);
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Send_little1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 449, 201);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		ɾ���ɹ�.setFont(new Font("����", Font.BOLD, 24));
		ɾ���ɹ�.setBounds(125, 33, 175, 29);
		getContentPane().add(ɾ���ɹ�);
		
	
		���ز˵�.setBounds(56, 101, 123, 29);
		getContentPane().add(���ز˵�);
		
		
		������ҳ.setBounds(230, 101, 123, 29);
		getContentPane().add(������ҳ);
	}

}
