package table;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.Properties;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class WelcomeWindow implements Runnable {
	
	private JFrame frame;
	private String fileName="image.gif";
	
	public void run() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int a=screenSize.width/2-250;
		int b=screenSize.height/2-250;
		
	    frame = new JFrame("刘述清XXXXXXXXXXX");
		frame.setBounds(a, b, 500, 500);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		URL base = this.getClass().getResource(fileName);	
		
		//Properties property= System.getProperties();
		
		//String classPath=property.get("java.class.path").toString();
		
		
		//String path=base.toString().substring(6).replace("Drawing/bin/table/", "").replace("le:/","").replace("drawing.jar!/table/","")+"Image/image.gif";
		String path=base.getPath();
		System.out.println(path);
		//System.out.println("classPath is:"+classPath);
		JLabel lable=new JLabel(new ImageIcon(base));
		lable.setSize(500, 500);
			
		lable.setVisible(true);
		
		
		frame.add(lable, BorderLayout.CENTER);
		frame.pack();
		//暂时不显示窗口
		//frame.setVisible(true);
		//JOptionPane.showMessageDialog(frame, path+"\n");
		
	}

}
