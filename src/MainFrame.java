import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame{
    MainFrame(){
        init();
    }
  //  private Container cp;
    private JButton jb1 = new JButton("範例");
    private JButton jb2 = new JButton("加密");
    private JButton jb3 = new JButton("解密");
    private JButton jb4 = new JButton("離開");
    private JTextArea jlbL = new JTextArea();
    private JTextArea jlbR = new JTextArea();
    private JTextField jbKey = new JTextField();
    private JLabel jlb = new JLabel("金鑰");
    private JPanel jpn = new JPanel(new GridLayout(6,1,3,3));
    private int x = 0;
    private int key= Integer.parseInt(jbKey.getText());
    private void init(){
        this.setLayout(new BorderLayout(3,3));
        this.setBounds(100,100,500,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.add(jpn,BorderLayout.CENTER);
        this.add(jlbL,BorderLayout.WEST);
        this.add(jlbR,BorderLayout.EAST);

        jlbL.setPreferredSize(new Dimension(200,400));
        jlbL.setLineWrap(true);
        jlbR.setPreferredSize(new Dimension(200,400));
        jlbR.setLineWrap(true);
        jpn.add(jb1);
        jpn.add(jb2);
        jpn.add(jlb);
        jpn.add(jbKey);
        jpn.add(jb3);
        jpn.add(jb4);
        jb1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
             jlbL.setText("What's also indisputable is that this shooting -- like the Pulse nightclub shooting before it and Newtown before that and Columbine before that -- will land in a political culture that is deeply divided on the proper role for guns in society and the need for -- or lack of a need for -- stricter gun control measures in the country.");
            }
        });
        jb2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char data[] = jlbL.getText().toCharArray();
                int len = data.length;
                for(int i = 0;i<len;i++){
                    data[i]+=key;
                }
                jlbR.setText(new String(data));
            }
        });
        jb3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char data[] = jlbL.getText().toCharArray();
                int len = data.length;
                for(int i = 0;i<len;i++){
                    data[i]-=key;
                }
                jlbR.setText(new String(data));
            }
        });

        jb4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }

}
