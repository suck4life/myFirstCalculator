import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class Calculator extends JFrame implements ActionListener {
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bDivision,bPlus,bMinus,bMultiply,bResult,bC,bPoint;
    JTextField t1;
    GridBagLayout gb=new GridBagLayout();
    GridBagConstraints gbc=new GridBagConstraints();
    double val1=0,val2=0;
    String s=null;
    // boolean decimal = false;
    void addComp(int row,int col,int width,Component com)
    {
        gbc.gridwidth=width;
        gbc.gridx=col;
        gbc.gridy=row;
        gb.setConstraints(com, gbc);
        add(com);
    }
    public Calculator() {
        t1=new JTextField(14);
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        bDivision=new JButton("/");
        bPlus=new JButton("+");
        bMinus=new JButton("-");
        bMultiply=new JButton("*");
        bResult =new JButton("=");
        bC=new JButton("C");
        bPoint=new JButton(".");
        setLayout(gb);
        addComp(1,1,3,t1);
        addComp(1,4,1,bPlus);
        addComp(2,1,1,b1);
        addComp(2,2,1,b2);
        addComp(2,3,1,b3);
        addComp(2,4,1,bMinus);
        addComp(3,1,1,b4);
        addComp(3,2,1,b5);
        addComp(3,3,1,b6);
        addComp(3,4,1,bMultiply);
        addComp(4,1,1,b7);
        addComp(4,2,1,b8);
        addComp(4,3,1,b9);
        addComp(4,4,1,bDivision);
        addComp(5,1,1,bPoint);
        addComp(5,2,1,b0);
        addComp(5,3,1,bC);
        addComp(5,4,2,bResult);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bPlus.addActionListener(this);
        bMinus.addActionListener(this);
        bMultiply.addActionListener(this);
        bDivision.addActionListener(this);
        bPoint.addActionListener(this);
        bC.addActionListener(this);
        bResult.addActionListener(this);
        setTitle("Мой первый калькулятор");
        setSize(230,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            t1.setText(t1.getText()+"1");
        }
        if(e.getSource()==b2){
            t1.setText(t1.getText()+"2");
        }
        if(e.getSource()==b3){
            t1.setText(t1.getText()+"3");
        }
        if(e.getSource()==b4){
            t1.setText(t1.getText()+"4");
        }
        if(e.getSource()==b5){
            t1.setText(t1.getText()+"5");
        }
        if(e.getSource()==b6){
            t1.setText(t1.getText()+"6");
        }
        if(e.getSource()==b7){
            t1.setText(t1.getText()+"7");
        }
        if(e.getSource()==b8){
            t1.setText(t1.getText()+"8");
        }
        if(e.getSource()==b9){
            t1.setText(t1.getText()+"9");
        }
        if(e.getSource()==b0){
            t1.setText(t1.getText()+"0");
        }
        if(e.getSource()==bPoint){
            t1.setText(t1.getText() + ".");
// if(!decimal)
        }
        if(e.getSource()==bDivision){
            val1=Double.parseDouble(t1.getText());
            t1.setText("");
//t1.setText("/");
            s="/";
        }
        if(e.getSource()==bPlus){
            val1=Double.parseDouble(t1.getText());
            t1.setText("");
//t1.setText("+");
            s="+";
        }
        if(e.getSource()==bMinus){
            val1=Double.parseDouble(t1.getText());
            t1.setText("");
// t1.setText("-");
            s="-";
        }
        if(e.getSource()==bMultiply){
            val1=Double.parseDouble(t1.getText());
            t1.setText("");
// t1.setText("*");
            s="*";
        }
        if(e.getSource()==bResult){
            val2 =Double.parseDouble(t1.getText());
            switch (s) {
                case "+" ->
                        t1.setText(String.valueOf(val1 + val2));
                case "-" ->
                        t1.setText(String.valueOf(val1 - val2));
                case "*" ->
                        t1.setText(String.valueOf(val1 * val2));
                case "/" ->
                        t1.setText(String.valueOf(val1 / val2));
                default ->
                        t1.setText(String.valueOf(0));
            }
            val1=val2=0;
        }
        if(e.getSource()==bC){
            t1.setText(" ");
        }
    }
    public static void main (String [] args){
        new Calculator();
    }
}