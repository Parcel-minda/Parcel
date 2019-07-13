package Parcel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class D_store_success extends JFrame{
	JLabel 保存成功 = new JLabel("\u4FDD\u5B58\u6210\u529F");
	JButton 确定 = new JButton("\u786E\u5B9A");

	public void store(final A_allinformation all,final String usertele) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					  setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		确定.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				D_main a=new D_main();
				a.mimain(all,usertele);
			}
		});
		
	}

	
	public D_store_success() {
		initialize();
	}

	
	private void initialize() {
		setBounds(100, 100, 267, 188);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		保存成功.setFont(new Font("Adobe 宋体 Std L", Font.BOLD, 24));
		保存成功.setBounds(79, 22, 105, 43);
		getContentPane().add(保存成功);
		
		
		确定.setBounds(79, 116, 93, 23);
		getContentPane().add(确定);
	}
}
