import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Create the CardLayout manager
        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

        // Create different panels (cards)
        JPanel card1 = new JPanel();
        card1.add(new JLabel("This is Card 1"));
        card1.setBackground(Color.CYAN);

        JPanel card2 = new JPanel();
        card2.add(new JLabel("This is Card 2"));
        card2.setBackground(Color.MAGENTA);

        JPanel card3 = new JPanel();
        card3.add(new JLabel("This is Card 3"));
        card3.setBackground(Color.ORANGE);

        // Add cards to the panel with a name
        cardPanel.add(card1, "Card 1");
        cardPanel.add(card2, "Card 2");
        cardPanel.add(card3, "Card 3");

        // Create buttons to navigate between cards
        JButton btnNext = new JButton("Next");
        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cardPanel);
            }
        });

        JButton btnPrevious = new JButton("Previous");
        btnPrevious.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.previous(cardPanel);
            }
        });

        JButton btnFirst = new JButton("First");
        btnFirst.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.first(cardPanel);
            }
        });

        JButton btnLast = new JButton("Last");
        btnLast.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.last(cardPanel);
            }
        });

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnFirst);
        buttonPanel.add(btnPrevious);
        buttonPanel.add(btnNext);
        buttonPanel.add(btnLast);

        // Add panels to the frame
        frame.setLayout(new BorderLayout());
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
