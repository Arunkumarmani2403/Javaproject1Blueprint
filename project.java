import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class project extends Frame implements ActionListener
{
Panel p=new Panel();
   List l1;
Font f1,f2,f3,f4,f5,f6;
int i=0;

project()
{
 
setLayout(new BorderLayout());
   l1=new List(3,false);
  
   l1.add("Path from Main Gate to New Admin Block.");
   l1.add("Path from Main Gate to Reception.");
   
l1.add("Path from Reception to VC office");
   l1.add("Path from Main Gate to UCO BANK");
   l1.add("Path from Academic Block to UCO BANK");
   l1.add("Path from Academic Block to Library");
   l1.add("Path from Academic Block to Mess 1");
   l1.add("Path from Academic Block to Mess 2");
   l1.add("Path from Boys Hotstel1 to Mess 1");
   l1.add("Path from Boys Hotstel1 to Mess 2");
   l1.add("Path from Boys Hotstel2 to Mess 1");
   l1.add("Path from Boys Hostel 2 to Mess 2");
   l1.add("Path from Girls Hostel 1 to Mess 1");
   l1.add("Path from Girls Hostel 2 to Mess 1");
   l1.add("Path from Girls Hostel 3 to Mess 1");
   l1.add("Path from Girls Hostel 1 to Mess 2");
   l1.add("Path from Girls Hostel 2 to Mess 2");
   l1.add("Path from Girls Hostel 3 to Mess 2");
   l1.add("Path from Boys Hotstel 1 to Basketball Court ");
   l1.add("Path from Boys Hotstel 2 to Basketball Court "); 
   l1.add("Path from Academic Block to Open Audi ");    

add(l1,BorderLayout.SOUTH);
l1.addActionListener(this);  
  }

  public void actionPerformed(ActionEvent ae)

   {
 String msg=l1.getSelectedItem();
   

if(msg.equals("Path from Main Gate to New Admin Block."))
    i=1;
if(msg.equals("Path from Main Gate to Reception."))
    i=2;
if(msg.equals("Path from Reception to VC office"))
    i=3;
if(msg.equals("Path from Main Gate to UCO BANK"))
    i=4;
if(msg.equals("Path from Academic Block to UCO BANK"))
    i=5;
if(msg.equals("Path from Academic Block to Library"))
    i=6;
if(msg.equals("Path from Academic Block to Mess 1"))
    i=7;
if(msg.equals("Path from Academic Block to Mess 2"))
    i=8;
if(msg.equals("Path from Boys Hotstel1 to Mess 1"))
    i=9;
if(msg.equals("Path from Boys Hotstel1 to Mess 2"))
    i=10;
if(msg.equals("Path from Boys Hotstel2 to Mess 1"))
    i=11;
if(msg.equals("Path from Boys Hostel 2 to Mess 2"))
    i=12;
if(msg.equals("Path from Girls Hostel 1 to Mess 1"))
    i=13;
if(msg.equals("Path from Girls Hostel 2 to Mess 1"))
    i=14;
if(msg.equals("Path from Girls Hostel 3 to Mess 1"))
    i=15;
if(msg.equals("Path from Girls Hostel 1 to Mess 2"))
    i=16;
if(msg.equals("Path from Girls Hostel 2 to Mess 2"))
    i=17;
if(msg.equals("Path from Girls Hostel 3 to Mess 2"))
    i=18;
if(msg.equals("Path from Boys Hotstel 1 to Basketball Court "))
    i=19;
if(msg.equals("Path from Boys Hotstel 2 to Basketball Court "))
    i=20;
if(msg.equals("Path from Academic Block to Open Audi "))
   i=21;




repaint();

    


   }




public void paint (Graphics g)   
 { 
      
       setBackground(Color.black);
      setForeground(Color.green);
       g.drawRect(240,20,90,60); 
       g.drawLine(330,50,350,50);
       g.drawRect(350,20,70,50);
       g.drawLine(420,50,440,50);
       g.drawRect(440,20,80,60);  
       g.drawLine(520,50,540,50);
       g.drawRect(540,20,70,50);
       g.drawLine(610,20,1000,20);
       g.drawLine(540,70,540,130);    
       g.drawLine(540,130,280,130);
       g.drawLine(280,130,280,80);
       g.drawLine(240,80,240,130); 
       g.drawLine(240,130,140,130); 
       g.drawRect(10,70,130,170);
       g.drawLine(140,190,540,190);
       g.drawLine(170,160,200,160);
       g.drawLine(230,160,260,160);
       g.drawLine(290,160,320,160);
       g.drawLine(350,160,380,160);
       g.drawLine(410,160,440,160);
       g.drawLine(470,160,500,160);
       g.drawLine(530,160,560,160);         
       g.drawLine(610,70,610,130);
       g.drawLine(1000,330,1000,20);
       g.drawRect(850,110,130,90);
       g.drawLine(575,100,575,130);
       g.drawLine(575,160,575,190);
       g.drawLine(575,220,575,250);
       g.drawLine(540,190,540,330);
       g.drawLine(575,280,575,310);
       g.drawLine(730,330,240,330);
       g.drawLine(730,380,450,380);
       g.drawLine(520,330,520,380);
       g.drawLine(500,330,500,380);
       g.drawLine(480,330,480,380);
       g.drawLine(460,330,460,380);
       g.drawRect(240,300,210,110);
       g.drawLine(380,300,380,410);
       g.drawLine(310,300,310,410);
       g.drawLine(240,380,610,380);
       g.drawLine(540,330,610,330);
       g.drawRect(610,300,160,110);
       g.drawLine(650,300,650,410);
       g.drawLine(690,300,690,410);
       g.drawLine(730,300,730,410);
       g.drawLine(770,300,770,410);
       g.drawLine(760,300,890,300);
       g.drawLine(890,300,890,360);
       g.drawLine(890,360,840,360); 
       g.drawLine(840,360,840,390);
       g.drawLine(840,390,1000,390);
       g.drawLine(1000,390,1000,300);
       g.drawLine(1000,300,890,300);
       g.drawLine(860,360,860,390);
       g.drawLine(850,360,850,390);
       g.drawLine(870,360,870,390);
       g.drawLine(880,360,880,390);
       g.drawLine(890,360,890,390);
       g.drawLine(340,230,340,280);
       g.drawLine(340,230,450,230);
       g.drawLine(450,230,450,280);
       g.drawLine(450,280,340,280);
       g.drawLine(340,430,340,480);
       g.drawLine(340,480,450,480);
       g.drawLine(450,480,450,430);
       g.drawLine(450,430, 340,430);
       g.drawLine(610,410,610,500);
       g.drawLine(575,410,575,440);
       g.drawLine(575,470,575,500);
       g.drawLine(610,500,1000,500);
       g.drawLine(1060,500,1160,500);
       g.drawLine(1000,500,1000,390);
       g.drawLine(1030,500,1030,470);
       g.drawLine(1030,440,1030,410);
       g.drawLine(1030,380,1030,350);
       g.drawLine(1030,320,1030,290); 
       g.drawLine(1060,500,1060,290);
       g.drawRect(1080,290,50,200);
       g.drawLine(1160,500,1160,90);
       g.drawRect(1160,30,60,60);
       g.drawLine(1160,90,1180,90);
       g.drawLine(1220,90,1220,520);
       g.drawRect(1230,520,40,60);
       g.drawRect(1230,600,40,60);
       g.drawLine(1220,520,1230,520);
       g.drawLine(1230,600,890,600);
       g.drawLine(830,600,830,630);
       g.drawLine(890,600,890,630);
       g.drawLine(830,600,610,600);
       g.drawRect(830,630,60,60);
       g.drawLine(1220,520,610,520);
       g.drawLine(1220,560,1190,560);
       g.drawLine(1160,560,1130,560);
       g.drawLine(1100,560,1070,560);
       g.drawLine(1040,560,1010,560);
       g.drawLine(980,560,950,560);
       g.drawLine(920,560,890,560);
       g.drawLine(860,560,830,560);
       g.drawLine(800,560,770,560);
       g.drawLine(740,560,710,560); 
       g.drawLine(680,560,650,560);
       g.drawLine(620,560,590,560);
       g.drawLine(575,530,575,560);
       g.drawRect(1140,610,50,80);
       g.drawRect(1000,610,50,80);
       g.drawRect(560,630,50,60);
       g.drawLine(575,590,575,620);
       g.drawLine(560,560,530,560);
       g.drawLine(500,560,470,560);
       g.drawLine(440,560,410,560);
       g.drawLine(380,560,350,560);
       g.drawLine(320,560,290,560);
       g.drawLine(260,560,230,560);
       g.drawLine(610,600,610,630);
       g.drawLine(560,600,560,630);
       g.drawLine(480,650,480,620);
       g.drawLine(480,650,420,650);
       g.drawLine(420,690,560,690);
       g.drawLine(420,670,450,670);
       g.drawLine(480,670,510,670);
       g.drawRect(320,620,60,70);
       g.drawLine(480,600,300,600);
       g.drawLine(520,670,520,640);
       g.drawLine(520,610,520,580);
       g.drawLine(480,600,480,630);
       g.drawLine(300,600,300,690);
       g.drawLine(230,690,230,600);
       g.drawLine(230,600,100,600);
       g.drawRect(180,620,50,60);      
       g.drawLine(260,690,260,660);
       g.drawLine(260,630,260,600);
       g.drawRect(30,610,70,80);
       g.drawLine(100,600,100,610);
       g.drawLine(530,520,30,520);
       g.drawLine(30,520,30,610);
       g.drawLine(260,560,230,560);
       g.drawLine(200,560,170,560);
       g.drawLine(140,560,110,560);
       g.drawLine(80,560,50,560);
       g.drawLine(530,520,540,520);
       g.drawLine(540,520,540,380);
//lines in map to show paths.
// 1. line from main gate to new admin block. 
    
      if(i==1) 
     { 
       g.setColor(Color.red);
       g.drawLine(570,70,570,150);  
       g.drawLine(570,150,140,150);
     }
// 2. lines from main gate to reception
      if(i==2)
    {
       g.setColor(Color.red);
       g.drawLine(570,70,570,150);  
       g.drawLine(570,150,570,350);
       g.drawLine(570,350,400,350);
    }
// 3. lines from reception to vc sir office.
       if(i==3)
     {
      g.setColor(Color.red);
      g.drawLine(400,350,350,350);
      g.drawLine(350,350,350,320);  
     }
// 4.line from main gate to uco bank.
      if(i==4)
     {
      g.setColor(Color.red);
      g.drawLine(570,70,570,150);  
      g.drawLine(570,150,260,150);
      g.drawLine(260,150,260,80);
     }
// 5.line from academic block to uco bank.
      if(i==5)
    {
      g.setColor(Color.red);
      g.drawLine(610,350,570,350);
      g.drawLine(570,350,570,150);
      g.drawLine(570,150,260,150);
      g.drawLine(260,150,260,80);
    }
// 6.line from to academic block to library.
     if(i==6)
   {
     g.setColor(Color.red); 
     g.drawLine(610,350,240,350);
   }
// 7.line from academic block to mess 1.
      if(i==7)
    {
      g.setColor(Color.red);
      g.drawLine(610,350,570,350);
      g.drawLine(570,350,570,290);
      g.drawLine(570,290,400,290);
      g.drawLine(400,290,400,280);
    }
// .8.line from academic block to mess 2.
      if(i==8)
    {
      g.setColor(Color.red);
      g.drawLine(610,350,570,350);
      g.drawLine(570,350,570,420);
      g.drawLine(570,420,400,420);
      g.drawLine(400,420,400,430);
    }
//  9.line from boys hostel 1 to mess 1.
      if(i==9)
    {
      g.setColor(Color.red);
      g.drawLine(860,630,860,550);
      g.drawLine(860,550,570,550);
      g.drawLine(570,550,570,290);
      g.drawLine(570,290,400,290);
      g.drawLine(400,290,400,280);  
    }
// 10.line from boys hostel 1 mess 2.
      if(i==10)
    {
      g.setColor(Color.red);
      g.drawLine(860,630,860,550);
      g.drawLine(860,550,570,550);
      g.drawLine(570,550,570,420);
      g.drawLine(570,420,400,420);
      g.drawLine(400,420,400,430);
    }
// 11.line from boys hostel 2 to mess 1.
      if(i==11)
    {
      g.setColor(Color.red);
      g.drawLine(60,610,60,550); 
      g.drawLine(60,550,570,550);
      g.drawLine(570,550,570,290);
      g.drawLine(570,290,400,290);
      g.drawLine(400,290,400,280); 
    } 
// 12. line from boys hostel 2 to mess 2.
    if(i==12)
  {
    g.setColor(Color.red);
    g.drawLine(60,610,60,550); 
    g.drawLine(60,550,570,550);
    g.drawLine(570,550,570,420);
    g.drawLine(570,420,400,420);
    g.drawLine(400,420,400,430);
  }
// 13.line from girls hostel 1 to mess 1.
    if(i==13)
  {
    g.setColor(Color.red);
    g.drawLine(1230,550,570,550); 
    g.drawLine(570,550,570,290);
    g.drawLine(570,290,400,290);
    g.drawLine(400,290,400,280); 
  }
// 14.lines from girls hostel 2 mess 1.
    if(i==14)
  {
    g.setColor(Color.red);
    g.drawLine(1250,600,1250,590);
    g.drawLine(1250,590,1220,590);
    g.drawLine(1220,590,1220,550);
    g.drawLine(1220,550,570,550); 
    g.drawLine(570,550,570,290);
    g.drawLine(570,290,400,290);
    g.drawLine(400,290,400,280); 
  }
// 15.line from girls hostel 3 to mess 1.
    if(i==15)
  {
    g.setColor(Color.red);
    g.drawLine(380,660,530,660);
    g.drawLine(530,660,530,550);
    g.drawLine(530,550,570,550);
    g.drawLine(570,550,570,290);
    g.drawLine(570,290,400,290);
    g.drawLine(400,290,400,280); 
  }
// 16.line from girls hostel 1 to mess 2.
    if(i==16)
  {
    g.setColor(Color.red);
    g.drawLine(1230,550,570,550); 
    g.drawLine(570,550,570,420);
    g.drawLine(570,420,400,420);
    g.drawLine(400,420,400,430);
  }
// 17.line from girls hostel 2 to mess 2.
    if(i==17)
  {
    g.setColor(Color.red);
    g.drawLine(1250,600,1250,590);
    g.drawLine(1250,590,1220,590);
    g.drawLine(1220,590,1220,550);
    g.drawLine(1220,550,570,550); 
    g.drawLine(570,550,570,420);
    g.drawLine(570,420,400,420);
    g.drawLine(400,420,400,430);
  }
// 18.line from girls hostel 3 to mess 2.
    if(i==18)
  {
    g.setColor(Color.red);
    g.drawLine(380,660,530,660);
    g.drawLine(530,660,530,550);
    g.drawLine(530,550,570,550);
    g.drawLine(570,550,570,420);
    g.drawLine(570,420,400,420);
    g.drawLine(400,420,400,430);
  }
// 19.line from boys hostel 1 to basketball court   
    if(i==19)
  {
    g.setColor(Color.red);
    g.drawLine(860,630,860,550);
    g.drawLine(860,550,1030,550);
    g.drawLine(1030,550,1030,400);
    g.drawLine(1030,400,1060,400);
  }
// 20.line from boys hostel 2 to basketball court
    if(i==20)
  {
   g.setColor(Color.red);
    g.drawLine(60,610,60,550); 
    g.drawLine(60,550,1030,550);
    g.drawLine(1030,550,1030,400);
    g.drawLine(1030,400,1060,400);  
  }
// 21.line from academic block to open audi.
    if(i==21)
  {
    g.setColor(Color.red);
    g.drawLine(610,350,570,350);
    g.drawLine(570,350,570,260);
    g.drawLine(570,260,620,260);
   }  
    f6=new Font("arial",Font.BOLD,15);
     g.setColor(Color.blue);  
     g.setFont(f6);
   
    g.drawString("C    U",550,350);
  
    g.drawString("BRIDGE",540,370);
    f1=new Font("arial",Font.BOLD,12);       
    g.setFont(f1); 
    g.drawString ("UCO BANK",240,40);
    f2=new Font("arial",Font.BOLD,10);
    g.setFont(f2);
    g.drawString("ALTERNATE",350,40);
    g.drawString("GATE",350,60);
    g.drawString("SECURITY",450,40);
    g.drawString("MAIN",550,40);
    g.drawString("GATE",550,60);
    f3=new Font("arial",Font.BOLD,12);
    g.setFont(f3); 
    g.drawString("NEW ADMIN BLOCK",20,170);
    f4=new Font("arial",Font.BOLD,20);
    g.setFont(f4); 
    g.drawString("OPEN AUDI",700,160);
    g.drawString("STAGE",900,160);
    g.setFont(f1);
    g.drawString("VC office",320,320);
    g.drawString("LIBRARY",250,400);
    g.drawString("MESS 1",380,260);
    g.drawString("MESS 2",380,460);
    g.drawString("COMPUTER",900,330);
    g.drawString("LABS",900,360); 
    f5=new Font("arial",Font.BOLD, 15);      
    g.setFont(f5);
    g.drawString("MBA BLOCK ",750,450);   
    g.drawString("B",1090,310);
    g.drawString("A",1090,330);
    g.drawString("S",1090,350);
    g.drawString("K",1090,370);
    g.drawString("E",1090,390);
    g.drawString("T",1090,410);
    g.drawString("B",1090,430);
    g.drawString("A",1090,450);
    g.drawString("L",1090,470);
    g.drawString("L",1090,490);
    g.drawString("C",1110,370);
    g.drawString("O",1110,390);
    g.drawString("U",1110,410);
    g.drawString("R",1110,430);
    g.drawString("T",1110,450);  
    f4=new Font("arial",Font.BOLD,10);      
    g.setFont(f4);
    g.drawString("GIRLS 1",1230,540);
    g.drawString("HOSTEL",1230,560); 
    g.drawString("GIRLS",1230,620);
    g.drawString("HOSTEL 2",1230,640);   
    g.drawString("BOYS",840,650);
    g.drawString("HOSTEL 1",840,670);
    g.drawString("T",1150,620);
    g.drawString("E",1150,630);
    g.drawString("N",1150,640);
    g.drawString("N",1150,650);
    g.drawString("I",1150,660);       
    g.drawString("S",1150,670);
    g.drawString("C",1170,630);
    g.drawString("O",1170,640);
    g.drawString("U",1170,650);
    g.drawString("R",1170,660);
    g.drawString("T",1170,670);
    g.drawString("V",1010,620);
    g.drawString("O",1010,630);
    g.drawString("L",1010,640);
    g.drawString("L",1010,650);
    g.drawString("E",1010,660);
    g.drawString("V",1010,670);
    g.drawString("B",1025,630);
    g.drawString("A",1025,640);
    g.drawString("L",1025,650);
    g.drawString("L",1025,660);
    g.drawString("C",1040,620);
    g.drawString("O",1040,630);
    g.drawString("U",1040,640);
    g.drawString("R",1040,650);
    g.drawString("T",1040,660); 
    g.drawString("LAUNDRY",560,660); 
    g.drawString("GIRLS",330,640);
    g.drawString("HOSTEL 3",330,660);
   
 g.drawString("CANTEEN", 180,650);
    g.drawString("BOYS",50,640); 
    g.drawString("HOSTEL 2",50,660);
    g.drawString("reception",390,320);

  

     






}
    

public static void main (String args[])
     {
      project p1=new project();
      p1.setSize(1280,750);
      p1.setVisible(true);
    
    }
}
  