package com.exercise.lyl.chapter07;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.*;

//1、定义事件监听器类：一个类只要实现相应的事件监听器接口，就可以具备了监听器的资格。
public class ModelGUI extends JFrame implements ActionListener{
	JLabel jl_info=new JLabel("请输入年、月：");
	JTextField jtf_y=new JTextField(10);
	JTextField jtf_m=new JTextField(6);
	JTextArea jta=new JTextArea(8,30);
	JScrollPane jsp_center=null;
	//将用到的基本组件和中间容器作为私有属性进行定义和初始化
	JButton jb_ok=new JButton("确定");
	JButton jb_exit=new JButton("退出");
	JPanel jp_center=new JPanel();
	JPanel jp_top=new JPanel();
	JPanel jp_bottom=new JPanel();
	JPanel jp_south=new JPanel();
	//在构造方法中进行基本设置
	public ModelGUI() {
		//1、设置窗口标题
		super("月历");
		//8、为方便阅读，一般将窗口设置代码抽取成方法
		init();
	}
	private void runCustomProgram(){
		System.out.println("这是程序的输出内容");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//3、在事件处理方法中编写事件处理代码
		if(e.getSource()==jb_ok) {
			int y=Integer.parseInt(jtf_y.getText().trim());
			int m=Integer.parseInt(jtf_m.getText().trim());
			Calendar cal= Calendar.getInstance();
			int d=cal.get(Calendar.DAY_OF_MONTH);
			cal.set(y,m-1,1);
			int week=cal.get(Calendar.DAY_OF_WEEK);
			jta.setText(y+"年"+m+"月"+d+"日+\n");
			int days=cal.getActualMaximum(Calendar.DAY_OF_MONTH);

			jta.append("一\t二\t三\t四\t五\t六\t日\n");

			for (int i = 0; i < week-2; i++) {
				jta.append("\t");
			}
			for (int i = 1; i <= days; i++) {
				jta.append(i+"\t");
				if((i+week-1)%7==1){
					jta.append("\n");
				}
			}
			JOptionPane.showMessageDialog(this, "你单击了OK按钮");
		}
		if(e.getSource()==jb_exit) {
			int n=JOptionPane.showConfirmDialog(this, "你确定要退出吗？");
			if(n==0) {
				System.exit(0);
			}
		}
	}
	public void init() {
		//2、设置窗口关闭行为EXIT_ON_CLOSE或DISPOSE_ON_CLOSE,而不是默认的HIDE_ON_CLOSE
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//3、设置窗口大小
		setSize(740, 580);
		//4、设置窗口自动居中
		setLocationRelativeTo(null);
		//5、设置窗口布局：JFrame默认布局为BorderLayout
		setLayout(new BorderLayout());
		//6、将定义好的组件加入到中间容器，将中间容器放入顶级容器
		jp_south.add(jb_exit);
		jp_south.add(jb_ok);
		add(jp_south,BorderLayout.SOUTH);
		//2、将事件源和监听器关联
		jb_ok.addActionListener(this);
		jb_exit.addActionListener(this);
		//7.5将Jalbel和JTextField都放入到Jpanel_top当中，
		//将JTextArea放入到Jpanel_center当中，同理将Jbutton
		jp_top.add(jl_info);
		jp_top.add(jtf_y);
		jp_top.add(jtf_m);
		this.add(jp_top,BorderLayout.NORTH);
		this.add(jta,BorderLayout.CENTER);
		jsp_center=new JScrollPane(jta);
		this.add(jsp_center,BorderLayout.CENTER);
		//7、设置窗口可见
		setVisible(true);
	}
	public static void main(String[] args) {
		//9、在main方法中实例化窗口类即可运行
		new ModelGUI();
	}
	
}
