package Parcel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Send_menu extends JFrame{

	/**
	 * Launch the application.
	 */
	JLabel ��Ҫ���� = new JLabel("\u6211\u8981\u53D1\u4EF6");
	JButton �鿴���� = new JButton("1.\u67E5\u770B\u8BA2\u5355");
	JButton ���Ӷ��� = new JButton("2.\u589E\u52A0\u8BA2\u5355");
	JButton ɾ������ = new JButton("3.\u5220\u9664\u8BA2\u5355");
	JButton �޸Ķ��� = new JButton("4.\u4FEE\u6539\u8BA2\u5355");
	JButton �����ϼ� = new JButton("5.\u8FD4\u56DE\u4E0A\u7EA7");
	JButton �ص���ҳ = new JButton("6.\u8FD4\u56DE\u4E3B\u9875");
	
	public void menu(final A_allinformation all,final String usertele){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		���Ӷ���.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Send_order a=new Send_order();
				a.order(all,usertele);
				a.setVisible(true);
				
			}
		});
		ɾ������.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Send_delete a=new Send_delete();
				a.delete(all,usertele);
				a.setVisible(true);
				
			}
		});
		�޸Ķ���.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Send_innum a=new Send_innum();
				a.innum(all,usertele);
				a.setVisible(true);
				
			}
		});
		
		�����ϼ�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//����������----------------------------------------
				B_center center=new B_center();
				center.center_main(all,usertele);
				center.setVisible(true);
				return;
			}
		});
		�ص���ҳ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				A_enter enter=new A_enter();
				enter.enter(all);
				enter.setVisible(true);
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Send_menu() {
		this.setTitle("�˵�");
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 413, 372);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		��Ҫ����.setFont(new Font("����", Font.BOLD, 24));
		��Ҫ����.setBounds(139, 31, 108, 29);
		getContentPane().add(��Ҫ����);
		
		
		�鿴����.setBounds(26, 87, 123, 29);
		getContentPane().add(�鿴����);
		
		
		���Ӷ���.setBounds(26, 146, 123, 29);
		getContentPane().add(���Ӷ���);
		
		
		ɾ������.setBounds(219, 87, 123, 29);
		getContentPane().add(ɾ������);
		
		
		�޸Ķ���.setBounds(219, 146, 123, 29);
		getContentPane().add(�޸Ķ���);
		//ɾ������.setBounds(219, 146, 123, 29);
		//getContentPane().add(ɾ������);
		�����ϼ�.setBounds(26, 206, 123, 29);
		
		getContentPane().add(�����ϼ�);
		�ص���ҳ.setBounds(219, 206, 123, 29);
		
		getContentPane().add(�ص���ҳ);
	}

}
