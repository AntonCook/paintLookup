import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Objects;


public class Main implements ActionListener {
    //Declaring all Swing Elements
    JFrame frame;
    JPanel menu, recordPanel, lookup;
    JButton menuRecord, menuLookup;
    JTextField customerName, paintColorName, paintColorNumber, ax, b, c, d, e, f, i, kx, l, m, s, t;
    JComboBox<String> paintType, base, finish, terior;
    JButton addRecord, menuRecordbtn;


    private void frameSetUp() {
        frame = new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Paint Records");



    }

    private void setUpMainMenu() {
        menu = new JPanel();
        menu.setLayout(new GridLayout(2, 1));
        menu.setBorder(BorderFactory.createEmptyBorder(200, 100, 200, 100));


        menuRecord = new JButton("Record");
        menuRecord.addActionListener(this);
        menuRecord.setFocusable(false);


        menuLookup = new JButton("Lookup");
        menuLookup.addActionListener(this);
        menuLookup.setFocusable(false);

        menu.add(menuRecord);
        menu.add(menuLookup);

        frame.add(menu);
    }

    private void setUpRecordPage() {
        recordPanel = new JPanel();
        recordPanel.setLayout(new GridLayout(20, 2));
        recordPanel.setBorder(BorderFactory.createEmptyBorder(200, 100, 200, 100));

        JLabel customerNameLabel = new JLabel("Customer Name");
        JLabel paintColorLabel = new JLabel("Paint Color");
        JLabel paintColorNumberLabel = new JLabel("Paint Color Number");
        JLabel PaintTypeLabel = new JLabel("Paint Type");
        JLabel baseLabel = new JLabel("Base");
        JLabel finishLabel = new JLabel("Finish");
        JLabel teriorLabel = new JLabel("Terior");
        JLabel axLabel = new JLabel("Ax");
        JLabel bLabel = new JLabel("B");
        JLabel cLabel = new JLabel("C");
        JLabel dLabel = new JLabel("D");
        JLabel eLabel = new JLabel("E");
        JLabel fLabel = new JLabel("F");
        JLabel iLabel = new JLabel("I");
        JLabel kLabel = new JLabel("K");
        JLabel lLabel = new JLabel("L");
        JLabel mLabel = new JLabel("M");
        JLabel sLabel = new JLabel("S");
        JLabel tLabel = new JLabel("T");

        customerName = new JTextField();
        paintColorName = new JTextField();
        paintColorNumber = new JTextField();

        String[] typeSelection = {"Medallion", "Medallion Plus", "Expressions", "Expressions Select"};
        paintType = new JComboBox<>(typeSelection);

        String[] baseSelection = {"Ultra-White", "Pastel", "Clear", "Tint"};
        base = new JComboBox<>(baseSelection);



        String[] finishSelection = {"Flat", "Eggshell", "Semigloss", "Satin"};
        finish = new JComboBox<>(finishSelection);

        String[] teriorSelection = {"Exterior", "Interior"};
        terior = new JComboBox<>(teriorSelection);

        ax = new JTextField();
        b = new JTextField();
        c = new JTextField();
        d = new JTextField();
        e = new JTextField();
        kx = new JTextField();
        f = new JTextField();
        i = new JTextField();
        l = new JTextField();
        m = new JTextField();
        s = new JTextField();
        t = new JTextField();


        addRecord = new JButton("Add Record");
        addRecord.setFocusable(false);
        addRecord.addActionListener(this);

        menuRecordbtn = new JButton("Main Menu");
        menuRecordbtn.addActionListener(this);
        menuRecordbtn.setFocusable(false);



        recordPanel.add(customerNameLabel);
        recordPanel.add(customerName);

        recordPanel.add(paintColorLabel);
        recordPanel.add(paintColorName);

        recordPanel.add(paintColorNumberLabel);
        recordPanel.add(paintColorNumber);

        recordPanel.add(PaintTypeLabel);
        recordPanel.add(paintType);

        recordPanel.add(baseLabel);
        recordPanel.add(base);

        recordPanel.add(finishLabel);
        recordPanel.add(finish);

        recordPanel.add(teriorLabel);
        recordPanel.add(terior);

        recordPanel.add(axLabel);
        recordPanel.add(ax);

        recordPanel.add(bLabel);
        recordPanel.add(b);

        recordPanel.add(cLabel);
        recordPanel.add(c);

        recordPanel.add(dLabel);
        recordPanel.add(d);

        recordPanel.add(eLabel);
        recordPanel.add(e);

        recordPanel.add(fLabel);
        recordPanel.add(f);

        recordPanel.add(iLabel);
        recordPanel.add(i);

        recordPanel.add(kLabel);
        recordPanel.add(kx);

        recordPanel.add(lLabel);
        recordPanel.add(l);

        recordPanel.add(mLabel);
        recordPanel.add(m);

        recordPanel.add(sLabel);
        recordPanel.add(s);

        recordPanel.add(tLabel);
        recordPanel.add(t);

        recordPanel.add(addRecord);
        recordPanel.add(menuRecordbtn);


        frame.remove(menu);
        frame.pack();

        frame.add(recordPanel);
        frame.pack();


    }

    private void lookupPage() {

    }

    private void mySqlInsert() {
        String customerNameS = customerName.getText().toLowerCase();
        customerName.setText("");
        String paintColorS = paintColorName.getText().toLowerCase();
        paintColorName.setText("");
        String paintColorNumberS = paintColorNumber.getText().toLowerCase();
        paintColorNumber.setText("");
        String paintTypeS = Objects.requireNonNull(paintType.getSelectedItem()).toString();
        String baseS = Objects.requireNonNull(base.getSelectedItem()).toString();
        String finishS = Objects.requireNonNull(finish.getSelectedItem()).toString();
        String teriorS = Objects.requireNonNull(terior.getSelectedItem()).toString();
        String axS = ax.getText();
        ax.setText("");
        String bS = b.getText();
        b.setText("");
        String cs = c.getText();
        c.setText("");
        String ds = d.getText();
        d.setText("");
        String es = e.getText();
        e.setText("");
        String fs = f.getText();
        f.setText("");
        String is = i.getText();
        i.setText("");
        String kxs = kx.getText();
        kx.setText("");
        String ls = l.getText();
        l.setText("");
        String ms = m.getText();
        m.setText("");
        String ss = s.getText();
        s.setText("");
        String ts = t.getText();
        t.setText("");

        String sql = "INSERT INTO paintLookup (name, paintColor, paintNumber, terior, type, finish, base, Ax, B, C, D, E, F, I, Kx, L, M, S, T)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ,? ,?, ?, ?, ?, ?, ?)";


        try{
            String user = "root";
            String password = "sgjanssen5";
            String url = "jdbc:mysql://localhost:3306/trustworthy";

            Connection conn = DriverManager.getConnection(url,user, password);
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.getConnection();
            ps.setString(1, customerNameS);
            ps.setString(2, paintColorS);
            ps.setString(3, paintColorNumberS);
            ps.setString(4, teriorS);
            ps.setString(5, paintTypeS);
            ps.setString(6, finishS);
            ps.setString(7, baseS);
            ps.setString(8, axS);
            ps.setString(9, bS);
            ps.setString(10, cs);
            ps.setString(11, ds);
            ps.setString(12, es);
            ps.setString(13, fs);
            ps.setString(14, is);
            ps.setString(15, kxs);
            ps.setString(16, ls);
            ps.setString(17, ms);
            ps.setString(18, ss);
            ps.setString(19, ts);
            ps.executeUpdate();




        }
        catch(Exception e){
            System.out.println(e);
        }




    }



    boolean first = true;
    public Main() {
        frameSetUp();

        while (first) {
            setUpMainMenu();
            first = false;
        }
    }

    public void show() {
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean record = true;
        if (e.getSource() == menuRecord) {
            while(record) {
                setUpRecordPage();
                record = false;
            }
        }
        else if(e.getSource() == addRecord) {
            mySqlInsert();
        }
        else if(e.getSource() == menuRecordbtn) {
            frame.remove(recordPanel);
            frame.add(menu);
            frame.pack();
        }
    }
}
