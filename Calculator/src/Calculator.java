import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
    private JTextField display;
    private int equalButtonClickCount = 0;

    public Calculator() {
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Use JFrame.EXIT_ON_CLOSE instead of the magic number 3
        this.setSize(300, 200);
        this.getContentPane().setBackground(Color.decode("#45474B"));
        this.setLocationRelativeTo((Component) null);

        this.display = new JTextField();
        this.display.setEditable(false);
        this.display.setHorizontalAlignment(JTextField.RIGHT); // Use JTextField.RIGHT instead of the magic number 4
        this.display.setFont(new Font("Arial", Font.PLAIN, 24)); // Use Font.PLAIN instead of the magic number 0
        this.display.setBackground(Color.decode("#45474B"));
        this.display.setForeground(Color.decode("#F5F7F8"));

        String[] buttonInputs = new String[]{"7", "8", "9", "0", "*", "4", "5", "6", "+", "/", "1", "2", "3", "-", "="};

        JPanel buttonPanel = new JPanel(new GridLayout(3, 5, 10, 10));
        buttonPanel.setBackground(Color.decode("#45474B"));

        for (String label : buttonInputs) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            button.setBackground(Color.decode("#F4CE14"));
            button.setForeground(Color.decode("#45474B"));
            buttonPanel.add(button);
        }

        this.setLayout(new BorderLayout());
        this.add(this.display, BorderLayout.NORTH);
        this.add(buttonPanel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        private ButtonClickListener() {
        }

        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String buttonText = source.getText();

            if (buttonText.equals("=")) {
                ++Calculator.this.equalButtonClickCount;
                if (Calculator.this.equalButtonClickCount > 1) {
                    Calculator.this.display.setText("0");
                    Calculator.this.equalButtonClickCount = 0;
                } else {
                    String expression = Calculator.this.display.getText();
                    try {
                        double result = eval(expression);
                        Calculator.this.display.setText(Double.toString(result));
                    } catch (Exception var7) {
                        Calculator.this.display.setText("Erreur");
                    }
                }
            } else {
                JTextField textField = Calculator.this.display;
                textField.setText(textField.getText() + buttonText);
            }
        }

        private double eval(final String expression) {
            return new Object() {
                int pos = -1;
                int ch;

                void nextChar() {
                    this.ch = ++this.pos < expression.length() ? expression.charAt(this.pos) : -1;
                }

                boolean eat(int charToEat) {
                    while (this.ch == ' ') {
                        this.nextChar();
                    }
                    if (this.ch == charToEat) {
                        this.nextChar();
                        return true;
                    } else {
                        return false;
                    }
                }

                double parse() {
                    this.nextChar();
                    double x = this.parseExpression();
                    if (this.pos < expression.length()) {
                        throw new RuntimeException("Unexpected character: " + (char) this.ch);
                    } else {
                        return x;
                    }
                }

                double parseExpression() {
                    double x = this.parseTerm();

                    while (true) {
                        while (!this.eat('+')) {
                            if (!this.eat('-')) {
                                return x;
                            }
                            x -= this.parseTerm();
                        }
                        x += this.parseTerm();
                    }
                }

                double parseTerm() {
                    double x = this.parseFactor();

                    while (true) {
                        while (!this.eat('*')) {
                            if (!this.eat('/')) {
                                return x;
                            }
                            x /= this.parseFactor();
                        }
                        x *= this.parseFactor();
                    }
                }

                double parseFactor() {
                    if (this.eat('+')) {
                        return this.parseFactor();
                    } else if (this.eat('-')) {
                        return -this.parseFactor();
                    } else {
                        int startPos = this.pos;
                        double x;
                        if (this.eat('(')) {
                            x = this.parseExpression();
                            this.eat(')');
                        } else {
                            if ((this.ch < '0' || this.ch > '9') && this.ch != '.') {
                                throw new RuntimeException("Unexpected character: " + (char) this.ch);
                            }
                            while (this.ch >= '0' && this.ch <= '9' || this.ch == '.') {
                                this.nextChar();
                            }
                            x = Double.parseDouble(expression.substring(startPos, this.pos));
                        }
                        return x;
                    }
                }
            }.parse();
        }
    }
}