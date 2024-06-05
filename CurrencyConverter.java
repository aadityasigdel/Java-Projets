import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CurrencyConverter {
    JFrame WorkingWindow ;
    JPanel WorkingArea;
    JLabel Suggetion;
    JComboBox<String> inputCountry;
    JComboBox<String> outputCountry;
    JButton Convert;
    ArrayList <String> countries ;
    JTextField toConvertCurrency;
    JTextField convertToCurrency;

    public CurrencyConverter(){

        this.WorkingWindow = new JFrame("Currency Converter");
        this.WorkingArea = new JPanel();
        this.Suggetion = new JLabel("Select the country to convert");
        this.toConvertCurrency = new JTextField(10);
        this.convertToCurrency = new JTextField(10);
        this.Convert = new JButton("Convert");
        this.WorkingWindow.setSize(500,500);
        WorkingArea.setLayout(new GridBagLayout());
        WorkingWindow.setLocationRelativeTo(null);
        
        this.countries = new ArrayList<>();
        List<String> countryList = Arrays.asList("Nepal", "India", "China", "USA", "Philippines", "Spain", "Australia");
        this.countries.addAll(countryList);
        this.inputCountry = new JComboBox<>(countries.toArray(new String[0]));
        this.outputCountry = new JComboBox<>(countries.toArray(new String[0]));

        this.WorkingWindow.add(this.WorkingArea);

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.WorkingArea.add(this.Suggetion,gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.WorkingArea.add(this.toConvertCurrency,gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.WorkingArea.add(this.convertToCurrency,gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.WorkingArea.add(this.Convert,gbc);



        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.WorkingArea.add(this.inputCountry,gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        this.WorkingArea.add(this.outputCountry,gbc);
        
        Convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertCurrency();
            }
        });

        this.WorkingWindow.setVisible(true);
        this.WorkingWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public  void convertCurrency() {
        String inputCountrySelected = (String) inputCountry.getSelectedItem();
        String outputCountrySelected = (String) outputCountry.getSelectedItem();
        String toConvertCurrencyText = toConvertCurrency.getText();

        double toConvertCurrencyIndex = Double.parseDouble(toConvertCurrencyText);
        double Result = 0.0;
        if (inputCountrySelected.equals("Nepal") && outputCountrySelected.equals("India")) {
            Result = toConvertCurrencyIndex / 1.65;
        }
        if (inputCountrySelected.equals("India") && outputCountrySelected.equals("Nepal")) {
            Result = toConvertCurrencyIndex * 1.65;
        }
        if (inputCountrySelected.equals("Nepal") && outputCountrySelected.equals("USA")) {
            Result = toConvertCurrencyIndex * 0.0075;
        }
        if (inputCountrySelected.equals("USA") && outputCountrySelected.equals("Nepal")) {
            Result = toConvertCurrencyIndex /  0.0075;
        }
        if (inputCountrySelected.equals("Nepal") && outputCountrySelected.equals("China")) {

            Result = toConvertCurrencyIndex * 0.054;
        }
        if (inputCountrySelected.equals("China") && outputCountrySelected.equals("Nepal")) {
            Result = toConvertCurrencyIndex / 0.054;
        }
        if (inputCountrySelected.equals("Nepal") && outputCountrySelected.equals("Spain")) {
            Result = toConvertCurrencyIndex * 0.0069;
        }
        if (inputCountrySelected.equals("Spain") && outputCountrySelected.equals("Nepal")) {
            Result = toConvertCurrencyIndex / 0.0069;
        }
        if (inputCountrySelected.equals("Nepal") && outputCountrySelected.equals("Australia")) {

            Result = toConvertCurrencyIndex * 0.011;
        }
        if (inputCountrySelected.equals("Australia") && outputCountrySelected.equals("Nepal")) {
            Result = toConvertCurrencyIndex / 0.011;
        }
        if (inputCountrySelected.equals("Nepal") && outputCountrySelected.equals("Philippines")) {

            Result = toConvertCurrencyIndex * 0.44;
        }
        if (inputCountrySelected.equals("Philippines") && outputCountrySelected.equals("Nepal")) {
            Result = toConvertCurrencyIndex / 0.44;
        }
        if (inputCountrySelected.equals("India") && outputCountrySelected.equals("USA")) {
            Result = toConvertCurrencyIndex * 0.012;
        }
        if (inputCountrySelected.equals("USA") && outputCountrySelected.equals("India")) {
            Result = toConvertCurrencyIndex / 0.012;
        }
        if (inputCountrySelected.equals("India") && outputCountrySelected.equals("China")) {
            Result = toConvertCurrencyIndex * 0.087;
        }
        if (inputCountrySelected.equals("China") && outputCountrySelected.equals("India")) {
            Result = toConvertCurrencyIndex / 0.087;
        }
        if (inputCountrySelected.equals("India") && outputCountrySelected.equals("Philippines")) {
            Result = toConvertCurrencyIndex * 0.71;
        }
        if (inputCountrySelected.equals("Philippines") && outputCountrySelected.equals("India")) {
            Result = toConvertCurrencyIndex / 0.071;
        }
        if (inputCountrySelected.equals("India") && outputCountrySelected.equals("Spain")) {
            Result = toConvertCurrencyIndex * 0.011;
        }
        if (inputCountrySelected.equals("Spain") && outputCountrySelected.equals("India")) {
            Result = toConvertCurrencyIndex / 0.011;
        }
        if (inputCountrySelected.equals("India") && outputCountrySelected.equals("Australia")) {
            Result = toConvertCurrencyIndex * 0.018;
        }
        if (inputCountrySelected.equals("Australia") && outputCountrySelected.equals("India")) {
            Result = toConvertCurrencyIndex / 0.018;
        }
        if (inputCountrySelected.equals("Australia") && outputCountrySelected.equals("Philippines")) {
            Result = toConvertCurrencyIndex * 39.09;
        }
        if (inputCountrySelected.equals("Philippines") && outputCountrySelected.equals("Australia")) {
            Result = toConvertCurrencyIndex / 39.09;
        }
        if (inputCountrySelected.equals("Australia") && outputCountrySelected.equals("China")) {
            Result = toConvertCurrencyIndex * 4.81;
        }
        if (inputCountrySelected.equals("China") && outputCountrySelected.equals("Australia")) {
            Result = toConvertCurrencyIndex / 4.81;
        }

        if (inputCountrySelected.equals("Australia") && outputCountrySelected.equals("USA")) {
            Result = toConvertCurrencyIndex * 0.66;
        }
        if (inputCountrySelected.equals("USA") && outputCountrySelected.equals("Australia")) {
            Result = toConvertCurrencyIndex / 0.66;
        }

        if (inputCountrySelected.equals("Australia") && outputCountrySelected.equals("Spain")) {
            Result = toConvertCurrencyIndex / 0.61;
        }
        if (inputCountrySelected.equals("Spain") && outputCountrySelected.equals("Australia")) {
            Result = toConvertCurrencyIndex * 0.61;
        }

        if (inputCountrySelected.equals("Spain") && outputCountrySelected.equals("USA")) {
            Result = toConvertCurrencyIndex * 1.09;
        }
        if (inputCountrySelected.equals("USA") && outputCountrySelected.equals("Spain")) {
            Result = toConvertCurrencyIndex / 1.09;
        }
        if (inputCountrySelected.equals("Spain") && outputCountrySelected.equals("Philippines")) {
            Result = toConvertCurrencyIndex * 63.91;
        }
        if (inputCountrySelected.equals("Spain") && outputCountrySelected.equals("China")) {
            Result = toConvertCurrencyIndex * 7.87;
        }

        if (inputCountrySelected.equals("China") && outputCountrySelected.equals("Spain")) {
            Result = toConvertCurrencyIndex / 7.87;
        }
        
        if (inputCountrySelected.equals("Philippines") && outputCountrySelected.equals("Spain")) {
            Result = toConvertCurrencyIndex / 63.91;
        }
        if (inputCountrySelected.equals("USA") && outputCountrySelected.equals("Philippines")) {
            Result = toConvertCurrencyIndex * 58.82;
        }
        if (inputCountrySelected.equals("Philippines") && outputCountrySelected.equals("USA")) {
            Result = toConvertCurrencyIndex / 58.82;
        }
        if (inputCountrySelected.equals("China") && outputCountrySelected.equals("USA")) {
            Result = toConvertCurrencyIndex / 7.24;
        }
        if (inputCountrySelected.equals("USA") && outputCountrySelected.equals("China")) {
            Result = toConvertCurrencyIndex * 7.24;
        }
        if (inputCountrySelected.equals("China") && outputCountrySelected.equals("Philippines")) {
            Result = toConvertCurrencyIndex / 0.12;
        }
        if (inputCountrySelected.equals("Philippines") && outputCountrySelected.equals("China")) {
            Result = toConvertCurrencyIndex * 0.12;
        }
        if (inputCountrySelected.equals(outputCountrySelected)) {
            Result = toConvertCurrencyIndex * 1;
        }
        convertToCurrency.setText(String.format("%.3f",Result));
    }
    




    public static void main(String[] args) {
        new CurrencyConverter();
    }
}