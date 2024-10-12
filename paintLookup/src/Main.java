import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

public class Main implements ActionListener {
    //Declaring all Swing Elements
    JFrame frame;
    JPanel menu, record, lookup;
    JButton menuRecord, menuLookup;
    JTextField customerName, paintColorName, paintColorNumber, ax, b, c, d, e, f, i, kx, l, m, s, t;
    JComboBox<String> paintType, base, finish, terior;
    JButton addRecord;


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
        record = new JPanel();
        record.setLayout(new GridLayout(20, 2));
        record.setBorder(BorderFactory.createEmptyBorder(200, 100, 200, 100));

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

        record.add(customerNameLabel);
        record.add(customerName);

        record.add(paintColorLabel);
        record.add(paintColorName);

        record.add(paintColorNumberLabel);
        record.add(paintColorNumber);

        record.add(PaintTypeLabel);
        record.add(paintType);

        record.add(baseLabel);
        record.add(base);

        record.add(finishLabel);
        record.add(finish);

        record.add(teriorLabel);
        record.add(terior);

        record.add(axLabel);
        record.add(ax);

        record.add(bLabel);
        record.add(b);

        record.add(cLabel);
        record.add(c);

        record.add(dLabel);
        record.add(d);

        record.add(eLabel);
        record.add(e);

        record.add(fLabel);
        record.add(f);

        record.add(iLabel);
        record.add(i);

        record.add(kLabel);
        record.add(kx);

        record.add(lLabel);
        record.add(l);

        record.add(mLabel);
        record.add(m);

        record.add(sLabel);
        record.add(s);

        record.add(tLabel);
        record.add(t);

        record.add(addRecord);


        frame.remove(menu);
        frame.pack();

        frame.add(record);
        frame.pack();


    }

    private void lookupPage() {

    }

    private void mySqlInsert() {
        String customerNameS = customerName.getText();
        String paintColorS = paintColorName.getText();
        String paintColorNumberS = paintColorNumber.getText();
        String paintTypeS = Objects.requireNonNull(paintType.getSelectedItem()).toString();
        String baseS = b.getText();
        String finishS = Objects.requireNonNull(finish.getSelectedItem()).toString();
        String teriorS = Objects.requireNonNull(terior.getSelectedItem()).toString();
        String axS = ax.getText();
        String bS = b.getText();
        String cs = c.getText();
        String ds = d.getText();
        String es = e.getText();
        String fs = f.getText();
        String is = i.getText();
        String kxs = kx.getText();
        String ls = l.getText();
        String ms = m.getText();
        String ss = s.getText();
        String ts = t.getText();





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
    }
}
