package code;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Eat extends JFrame 
{
	JButton z1=new JButton("哲学家1");
	 JTextArea t1 = new JTextArea("哲学家1思考中\n");
	 
	JButton z2=new JButton("哲学家2");

	 JTextArea t2 = new JTextArea("哲学家2思考中\n");
	JButton z3=new JButton("哲学家3");
	 JTextArea t3 = new JTextArea("哲学家3思考中\n");
	JButton z4=new JButton("哲学家4");
	 JTextArea t4 = new JTextArea("哲学家4思考中\n");
	JButton z5=new JButton("哲学家5");
	 JTextArea t5 = new JTextArea("哲学家5思考中\n");
	JButton kr1=new JButton("");
	
	JButton kl2=new JButton("");
	
	JButton kl3=new JButton("");
	
	JButton kl4=new JButton("");
	
	JButton kl5=new JButton("");
	
	JButton kl1=new JButton("");
	
	JButton kr2=new JButton("");
	
	JButton kr3=new JButton("");

	JButton kr4=new JButton("");
	
	JButton kr5=new JButton("");
	int l1,l2,l3,l4,l5,r1,r2,r3,r4,r5;
	JButton reset=new JButton("重置");
	ImageIcon image1 = new ImageIcon("eating1.jpg");
	ImageIcon image2 = new ImageIcon("starving1.jpg");
	ImageIcon image3 = new ImageIcon("thinking1.jpg");

	public Eat(String title)
	{	
		super(title);
		z1.setIcon(image3);
		z2.setIcon(image3);
		z3.setIcon(image3);
		z4.setIcon(image3);
		z5.setIcon(image3);
		l1=0;l2=0;l3=0;l4=0;l5=0;
		r1=0;r2=0;r3=0;r4=0;r5=0;
		z1.setBounds(330, 110, 90, 70);
		t1.setBounds(330,40 , 90, 70);
		z1.setEnabled(false);
		z2.setBounds(570, 270, 90, 70);
		t2.setBounds(660,270 , 90, 70);
		z2.setEnabled(false);
		kr1.setBounds(330, 190, 20, 80);
		z3.setBounds(430, 480, 90, 70);
		t3.setBounds(430,550 , 90, 70);
		z3.setEnabled(false);
		z4.setBounds(240, 480, 90, 70);
		t4.setBounds(240,550 , 90, 70);
		z4.setEnabled(false);
		z5.setBounds(100, 270, 90, 70);
		t5.setBounds(10,270 , 90, 70);
		z5.setEnabled(false);
		kr2.setBounds(470, 270, 90, 20);
		kl3.setBounds(430, 390, 20, 80);
		kl4.setBounds(240, 390, 20, 80);
		kl5.setBounds(200, 270, 90, 20);
		kl1.setBounds(400, 190, 20, 80);
		kl2.setBounds(470, 320, 90, 20);
		kr3.setBounds(490, 390, 20, 80);
		kr4.setBounds(310, 390, 20, 80);
		kr5.setBounds(200, 320, 90, 20);
		reset.setBounds(530, 520, 90, 20);
		Panel p1=new Panel();
		p1.setLayout(null);
		p1.add(z1);
		p1.add(z2);
		p1.add(z3);
		p1.add(z4);
		p1.add(z5);
		p1.add(kl1);
		p1.add(kr1);
		p1.add(kl2);
		p1.add(kr2);
		p1.add(kl3);
		p1.add(kr3);
		p1.add(kl4);
		p1.add(kr4);
		p1.add(kl5);
		p1.add(kr5);
		p1.add(t1);
		p1.add(t2);
		p1.add(t3);
		p1.add(t4);
		p1.add(t5);
		p1.add(reset);
		setLocation(100,15);
		add(p1);
		setSize(900,700);
		//setVisible(true);
		z1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
					l1=0;r1=0;
					z1.setEnabled(false);
					kl1.setEnabled(true);
					kr2.setEnabled(true);
					kl5.setEnabled(true);
					kr1.setEnabled(true);
					 t1.setText("");
				     t1.append("哲学家1 吃饱了\n");
				     t1.append("哲学家1 开始思考\n");
				     z1.setIcon(image3);
			}
		});
		z2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				l2=0;r2=0;
				z2.setEnabled(false);
				kl2.setEnabled(true);
				kr3.setEnabled(true);
				kl1.setEnabled(true);
				kr2.setEnabled(true);
				t2.setText("");
			     t2.append("哲学家2 吃饱了\n");
			     t2.append("哲学家2 开始思考\n");
			     z2.setIcon(image3);
			}
		});
		z3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				l3=0;r3=0;
				z3.setEnabled(false);
				kl3.setEnabled(true);
				kr4.setEnabled(true);
				kr3.setEnabled(true);
				kl2.setEnabled(true);
				t3.setText("");
			     t3.append("哲学家3 吃饱了\n");
			     t3.append("哲学家3 开始思考\n");
			     z3.setIcon(image3);
			}
		});
		z4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				l4=0;r4=0;
				z4.setEnabled(false);
				kl4.setEnabled(true);
				kr5.setEnabled(true);
				kr4.setEnabled(true);
				kl3.setEnabled(true);
				t4.setText("");
			     t4.append("哲学家4 吃饱了\n");
			     t4.append("哲学家4 开始思考\n");
			     z4.setIcon(image3);
			}
		});
		z5.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent e)
			{
				
				l5 =0;r5=0;
				z5.setEnabled(false);
				kl5.setEnabled(true);
				kr1.setEnabled(true);
				kr5.setEnabled(true);
				kl4.setEnabled(true);
				t5.setText("");
			     t5.append("哲学家5 吃饱了\n");
			     t5.append("哲学家5 开始思考\n");
			     z5.setIcon(image3);
			}
		});
		kl1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				l1=1;t1.append("获得左边筷子\n");
				z1.setIcon(image2);
				if(l1==1&&r1==1)	
					{
						z1.setEnabled(true);
						t1.append("哲学家1可以吃饭\n");
						z1.setIcon(image1);
					}
				kl1.setEnabled(false);
				kr2.setEnabled(false);
			
			   
			}
		});
		kr1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{	r1=1;t1.append("获得右边筷子\n");
			z1.setIcon(image2);
			if(l1==1&&r1==1)	
			{
				z1.setEnabled(true);
				t1.append("哲学家1可以吃饭\n");
				z1.setIcon(image1);
			}	
				
				kl5.setEnabled(false);
				kr1.setEnabled(false);
				
			}
		});
		kl2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{l2=1;t2.append("获得左边筷子\n");
			z2.setIcon(image2);
			if(l2==1&&r2==1)	
			{
				z2.setEnabled(true);
				t2.append("哲学家2可以吃饭\n");
				z2.setIcon(image1);
			}	
				
				kl2.setEnabled(false);
				kr3.setEnabled(false);
			}
		});
		kr2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{r2=1;t2.append("获得右边筷子\n");
			z2.setIcon(image2);
			if(l2==1&&r2==1)	
			{
				z2.setEnabled(true);
				t2.append("哲学家2可以吃饭\n");
				z2.setIcon(image1);
			}	
				
				kl1.setEnabled(false);
				kr2.setEnabled(false);
				
			}
		});
		kl3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{	l3=1;t3.append("获得左边筷子\n");
			z3.setIcon(image2);
			if(l3==1&&r3==1)	
			{
				z3.setEnabled(true);
				t3.append("哲学家3可以吃饭\n");
				z3.setIcon(image1);
			}	
				
				kl3.setEnabled(false);
				kr4.setEnabled(false);
				
			}
		});
		kr3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{	r3=1;t3.append("获得右边筷子\n");
			z3.setIcon(image2);
			if(l3==1&&r3==1)	
			{
				z3.setEnabled(true);
				t3.append("哲学家3可以吃饭\n");
				z3.setIcon(image1);
			}	
				kr3.setEnabled(false);
				kl2.setEnabled(false);
				
			}
		});
		kl4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{	l4=1;
			t4.append("获得左边筷子\n");
			z4.setIcon(image2);
			if(l4==1&&r4==1)	
			{
				z4.setEnabled(true);
				t4.append("哲学家4可以吃饭\n");
				z4.setIcon(image1);
			}	
				kl4.setEnabled(false);
				kr5.setEnabled(false);
				
			}
		});
		kr4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{r4=1;
			t4.append("获得右边筷子\n");
			z4.setIcon(image2);
			if(l4==1&&r4==1)	
			{
				z4.setEnabled(true);
				t4.append("哲学家4可以吃饭\n");
				z4.setIcon(image1);
			}
				kr4.setEnabled(false);
				kl3.setEnabled(false);
			}
		});
		kl5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{l5=1;
			t5.append("获得左边筷子\n");
			z5.setIcon(image2);
			if(l5==1&&r5==1)	
			{
				z5.setEnabled(true);
				t5.append("哲学家5可以吃饭\n");
				z5.setIcon(image1);
			}
				kl5.setEnabled(false);
				kr1.setEnabled(false);
			}
		});
		kr5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{	r5=1;
			t5.append("获得右边筷子\n");
			z5.setIcon(image2);
			if(l5==1&&r5==1)	
			{
				z5.setEnabled(true);
				t5.append("哲学家5可以吃饭\n");
				z5.setIcon(image1);
			}
				kr5.setEnabled(false);
				kl4.setEnabled(false);
			}
		});
		reset.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{	z1.setEnabled(false);
				z2.setEnabled(false);
				z3.setEnabled(false);
				z4.setEnabled(false);
				z5.setEnabled(false);
				kl1.setEnabled(true);
				kl2.setEnabled(true);
				kl3.setEnabled(true);
				kl4.setEnabled(true);
				kl5.setEnabled(true);
				kr1.setEnabled(true);
				kr2.setEnabled(true);
				kr3.setEnabled(true);
				kr4.setEnabled(true);
				kr5.setEnabled(true);
				l1=0;l2=0;l3=0;l4=0;l5=0;
				r1=0;r2=0;r3=0;r4=0;r5=0;
				t1.setText("");
			     t1.append("哲学家1开始思考\n");
			 	t2.setText("");
			     t2.append("哲学家2 开始思考\n");
			 	t3.setText("");
			     t3.append("哲学家3开始思考\n");
			 	t4.setText("");
			     t4.append("哲学家4 开始思考\n");
			 	t5.setText("");
			     t5.append("哲学家5 开始思考\n");
					z1.setIcon(image3);
					z2.setIcon(image3);
					z3.setIcon(image3);
					z4.setIcon(image3);
					z5.setIcon(image3);
			}
		});
	}
	public void changef(JButton j)
	{
		j.setEnabled(false);
	}
	public void changet(JButton j)
	{
		j.setEnabled(true);
	}
	public static void main(String args[])
	{
		Eat e=new Eat("手动--允许死锁");
		e.setVisible(true);
	}
}
