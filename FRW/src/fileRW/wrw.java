package fileRW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.*;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class wrw extends JFrame {

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private String path1,path2,path3;
	private JButton Button4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wrw frame = new wrw();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void rw(String first,String second, String end) throws IOException {
		String line1=new String();
		String line2=new String();
		
		BufferedReader bfr1=new BufferedReader(new FileReader(first));
		BufferedReader bfr2=new BufferedReader(new FileReader(second));
		
		BufferedWriter bfw=new BufferedWriter(new FileWriter(end));
		line1=bfr1.readLine();
		line2=bfr2.readLine();
		System.out .println(line1);
		System.out .println(line2);
		while (line1!=null & line2!=null) {
			bfw.write(line1);
			bfw.newLine();
			int start=line2.indexOf(".");
			if(start==1)
				line2="  "+line2.substring(start+1);
			else
				line2="   "+line2.substring(start+1);
			bfw.write(line2);
			bfw.newLine();
			line1=bfr1.readLine();
			line2=bfr2.readLine();
		}	
		bfw.flush();
	}

	/**
	 * Create the frame.
	 */
	public wrw() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Button1 = new JButton("\u6253\u5F00");
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    JFileChooser chooser = new JFileChooser(new File("F:\\"));//声明并分配
			    FileNameExtensionFilter filtertxt = new FileNameExtensionFilter("文本文件*.txt","txt");//FileFilter是个抽象类。FileNameExtensionFilter类实现了该类。
			    FileNameExtensionFilter filterpng = new FileNameExtensionFilter("矢量图*.png","png");//FileFilter是个抽象类。FileNameExtensionFilter类实现了该类。
			    chooser.setFileFilter(filterpng);//设置文件过滤类型
			    chooser.setFileFilter(filtertxt);//设置文件过滤类型
			    int returnVal = chooser.showOpenDialog(chooser);
			    if(returnVal == JFileChooser.APPROVE_OPTION) {//判断窗口是否点的是打开或保存
			       path1=chooser.getSelectedFile().getPath();
			       text1.setText(path1);
			    }
			}
		});
		Button1.setBounds(269, 30, 93, 23);
		contentPane.add(Button1);
		
		JButton Button2 = new JButton("\u6253\u5F00");
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    JFileChooser chooser = new JFileChooser(new File("F:\\"));//声明并分配
			    FileNameExtensionFilter filtertxt = new FileNameExtensionFilter("文本文件*.txt","txt");//FileFilter是个抽象类。FileNameExtensionFilter类实现了该类。
			    FileNameExtensionFilter filterpng = new FileNameExtensionFilter("矢量图*.png","png");//FileFilter是个抽象类。FileNameExtensionFilter类实现了该类。
			    chooser.setFileFilter(filterpng);//设置文件过滤类型
			    chooser.setFileFilter(filtertxt);//设置文件过滤类型
			    int returnVal = chooser.showOpenDialog(chooser);
			    if(returnVal == JFileChooser.APPROVE_OPTION) {//判断窗口是否点的是打开或保存
			       path2=chooser.getSelectedFile().getPath();
			       text2.setText(path2);
			    }
			}
		});
		Button2.setBounds(269, 80, 93, 23);
		contentPane.add(Button2);
		

		JButton Button3 = new JButton("\u9009\u62E9");
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser(new File("F:\\"));//声明并分配
			    FileNameExtensionFilter filtertxt = new FileNameExtensionFilter("文本文件*.txt","txt");//FileFilter是个抽象类。FileNameExtensionFilter类实现了该类。
			    FileNameExtensionFilter filterpng = new FileNameExtensionFilter("矢量图*.png","png");//FileFilter是个抽象类。FileNameExtensionFilter类实现了该类。
			    chooser.setFileFilter(filterpng);//设置文件过滤类型
			    chooser.setFileFilter(filtertxt);//设置文件过滤类型
			    int returnVal = chooser.showOpenDialog(chooser);
			    if(returnVal == JFileChooser.APPROVE_OPTION) {//判断窗口是否点的是打开或保存
			       path3=chooser.getSelectedFile().getPath();
			       text3.setText(path3);
			    }
			}
		});
		Button3.setBounds(273, 147, 93, 23);
		contentPane.add(Button3);
		
		
		text1 = new JTextField();
		text1.setText("\u8BF7\u9009\u62E9\u7B2C\u4E00\u4E2A\u6587\u4EF6");
		text1.setBounds(26, 30, 222, 21);
		contentPane.add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setText("\u8BF7\u9009\u62E9\u7B2C\u4E8C\u4E2A\u6587\u4EF6");
		text2.setBounds(24, 83, 222, 21);
		contentPane.add(text2);
		text2.setColumns(10);
		
		text3 = new JTextField();
		text3.setText("\u8BF7\u9009\u62E9\u8F93\u51FA\u6587\u4EF6\u8DEF\u5F84");
		text3.setBounds(25, 148, 221, 21);
		contentPane.add(text3);
		text3.setColumns(10);
		
		Button4 = new JButton("\u5B8C\u6210");
		Button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					rw(path1,path2,path3);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out .println("成功");
				}
			});
		Button4.setBounds(157, 228, 93, 23);
		contentPane.add(Button4);
		
		
	}
}
