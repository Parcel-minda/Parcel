package Parcel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class B_publish extends JFrame{

	JLabel ���������� = new JLabel("\u5F85\u53D1\u5E03\u8BA2\u5355");
	JButton ���� = new JButton("\u53D1\u5E03");
	JButton ɾ�� = new JButton("\u5220\u9664");
	JButton ���� = new JButton("\u8FD4\u56DE");
	
	public void B_publish(final A_allinformation all,final String usertele){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				B_order a=new B_order();
				a.B_order(all,usertele);
				a.setVisible(true);
			}
		});
	}
	
	public B_publish() {
		this.setTitle("���Ӷ���");
		initialize();
	}
	private void initialize(){
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		����������.setFont(new Font("����", Font.BOLD, 24));
		����������.setBounds(138, 10, 221, 40);
		getContentPane().add(����������);
		
		
		����.setFont(new Font("����", Font.BOLD, 20));
		����.setBounds(34, 230, 100, 30);
		getContentPane().add(����);
		
		
		ɾ��.setFont(new Font("����", Font.BOLD, 20));
		ɾ��.setBounds(167, 230, 100, 30);
		getContentPane().add(ɾ��);
		
		
		
		����.setFont(new Font("����", Font.BOLD, 20));
		����.setBounds(293, 230, 100, 30);
		getContentPane().add(����);
	}

}
