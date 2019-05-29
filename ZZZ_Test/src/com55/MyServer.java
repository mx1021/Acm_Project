package com55;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyServer extends JFrame implements ActionListener{

    JTextArea jtArea=null; //多行文本框组件
    JScrollPane jsp=null;
    JPanel jp1=null;
    JComboBox jcb=null;
    JTextField jtf=null;
    JButton jb=null;
    PrintWriter pw1=null;
    public static void main(String[] args) 
    {
        
     MyServer myServer3=new MyServer();
    }

    public MyServer()
    {
jtArea=new JTextArea();
        
        jp1=new JPanel();
        
        jsp=new JScrollPane(jtArea);
        
        String chatter[]={"服务器"};
        
        jcb=new JComboBox(chatter);
        jtf=new JTextField(10);
        jb=new JButton("发送");
        jb.addActionListener(this);
        
        //设置布局
        
        //添加组件
        jp1.add(jcb);
        jp1.add(jtf);
        jp1.add(jb);
        
        this.add(jp1,BorderLayout.SOUTH);
        this.add(jsp);
        
        
        
        this.setSize(300, 200);
        
        this.setTitle("腾讯QQ");
        
        this.setIconImage((new ImageIcon("image/qq2.jpg")).getImage());//插入图片
        
        this.setResizable(false);
        
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
       
        this.setLocation(200,200);
        
        this.setVisible(true);
        
        
            try {
                
                //在9999端口监听
                ServerSocket ss=new ServerSocket(9988);
                System.out.println("服务器正在监听.....");
                //等待连接
                Socket s=ss.accept();
                
                //先接收客户端发来的消息
                InputStreamReader isr1=new InputStreamReader(s.getInputStream());
                BufferedReader br1=new BufferedReader(isr1);
                
                 pw1=new PrintWriter(s.getOutputStream(),true);
                
                
                
                while(true)
                {
                    //接收从控制台输入的信息
                    
                    String info=br1.readLine();
                    jtArea.append("客户端发来:"+info+"\r\n");
                
                
        } 
            }
            catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        if(arg0.getSource()==jb)
        {
            //把服务器在jtf里面的内容发送给客户端
            String res=jtf.getText();
            pw1.println(res);
            jtf.setText("");//清空
        }
    }
}


