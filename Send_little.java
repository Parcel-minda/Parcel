package Parcel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Send_little extends JFrame{
	JLabel ��Ϣ�ύ�ɹ� = new JLabel("\u4FE1\u606F\u63D0\u4EA4\u6210\u529F\uFF01");
	JButton ���ز˵� = new JButton("\u8FD4\u56DE\u83DC\u5355");
	JButton ������ҳ = new JButton("\u8FD4\u56DE\u4E3B\u9875");
	
	public void little(final A_allinformation all,final String usertele){
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
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Send_menu a=new Send_menu();
				a.menu(all,usertele);
				a.setVisible(true);
			}
		});
		������ҳ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				//����������----------------------------------------
				B_center center=new B_center();
				center.center_main(all,usertele);
				center.setVisible(true);
				return;
			}
		});
}
	
	

	/**
	 * Create the application.
	 */
	public Send_little() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 449, 201);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		��Ϣ�ύ�ɹ�.setFont(new Font("����", Font.BOLD, 24));
		��Ϣ�ύ�ɹ�.setBounds(126, 15, 175, 58);
		getContentPane().add(��Ϣ�ύ�ɹ�);
		
		
		
		���ز˵�.setBounds(55, 88, 123, 29);
		getContentPane().add(���ز˵�);
		
		
		������ҳ.setBounds(231, 88, 123, 29);
		getContentPane().add(������ҳ);
		
	}

}
