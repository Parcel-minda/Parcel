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
	JLabel 我要发件 = new JLabel("\u6211\u8981\u53D1\u4EF6");
	JButton 查看订单 = new JButton("1.\u67E5\u770B\u8BA2\u5355");
	JButton 增加订单 = new JButton("2.\u589E\u52A0\u8BA2\u5355");
	JButton 删除订单 = new JButton("3.\u5220\u9664\u8BA2\u5355");
	JButton 修改订单 = new JButton("4.\u4FEE\u6539\u8BA2\u5355");
	JButton 返回上级 = new JButton("5.\u8FD4\u56DE\u4E0A\u7EA7");
	JButton 回到主页 = new JButton("6.\u8FD4\u56DE\u4E3B\u9875");
	
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
		增加订单.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Send_order a=new Send_order();
				a.order(all,usertele);
				a.setVisible(true);
				
			}
		});
		删除订单.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Send_delete a=new Send_delete();
				a.delete(all,usertele);
				a.setVisible(true);
				
			}
		});
		修改订单.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Send_innum a=new Send_innum();
				a.innum(all,usertele);
				a.setVisible(true);
				
			}
		});
		
		返回上级.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//跳入主界面----------------------------------------
				B_center center=new B_center();
				center.center_main(all,usertele);
				center.setVisible(true);
				return;
			}
		});
		回到主页.addActionListener(new ActionListener() {
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
		this.setTitle("菜单");
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 413, 372);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		我要发件.setFont(new Font("宋体", Font.BOLD, 24));
		我要发件.setBounds(139, 31, 108, 29);
		getContentPane().add(我要发件);
		
		
		查看订单.setBounds(26, 87, 123, 29);
		getContentPane().add(查看订单);
		
		
		增加订单.setBounds(26, 146, 123, 29);
		getContentPane().add(增加订单);
		
		
		删除订单.setBounds(219, 87, 123, 29);
		getContentPane().add(删除订单);
		
		
		修改订单.setBounds(219, 146, 123, 29);
		getContentPane().add(修改订单);
		//删除单子.setBounds(219, 146, 123, 29);
		//getContentPane().add(删除单子);
		返回上级.setBounds(26, 206, 123, 29);
		
		getContentPane().add(返回上级);
		回到主页.setBounds(219, 206, 123, 29);
		
		getContentPane().add(回到主页);
	}

}
