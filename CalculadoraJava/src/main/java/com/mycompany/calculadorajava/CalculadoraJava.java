/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadorajava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Victor 2ºAMS/DS - 2026
 */


public class CalculadoraJava extends JFrame {
    JLabel tituloPrincipal, rotulo1, rotulo2, rotuloRes;
    JTextField texto1, texto2;
    JButton Soma, Sub, Mult, Div, Limpar, Raiz;

    public CalculadoraJava() {
        super("Calculadora prof Carlos");
        Container tela = getContentPane();
        setLayout(null);

        tituloPrincipal = new JLabel("Calculadora java");
        rotulo1 = new JLabel("Primeiro número:");
        rotulo2 = new JLabel("Segundo número:");
        rotuloRes = new JLabel("Resultado: ");

        tituloPrincipal.setFont(new Font("Arial", Font.BOLD, 18));
        tituloPrincipal.setForeground(Color.BLACK);

        texto1 = new JTextField();
        texto2 = new JTextField();

        Soma = new JButton("+");
        Sub = new JButton("-");
        Mult = new JButton("*");
        Div = new JButton("/");
        Raiz = new JButton("√");
        Limpar = new JButton("Apagar");

        tituloPrincipal.setBounds(70, 5, 200, 25);
        rotulo1.setBounds(20, 40, 150, 20);
        texto1.setBounds(150, 40, 100, 20);
        rotulo2.setBounds(20, 70, 150, 20);
        texto2.setBounds(150, 70, 100, 20);
        rotuloRes.setBounds(20, 200, 250, 20);

        Soma.setBounds(20, 110, 50, 30);
        Sub.setBounds(80, 110, 50, 30);
        Mult.setBounds(140, 110, 50, 30);
        Div.setBounds(200, 110, 50, 30);
        Raiz.setBounds(20, 150, 50, 30);
        Limpar.setBounds(80, 150, 170, 30);

        Soma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(texto1.getText());
                double n2 = Double.parseDouble(texto2.getText());
                rotuloRes.setText("Resultado: " + (n1 + n2));
            }
        });

        Sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(texto1.getText());
                double n2 = Double.parseDouble(texto2.getText());
                rotuloRes.setText("Resultado: " + (n1 - n2));
            }
        });

        Mult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(texto1.getText());
                double n2 = Double.parseDouble(texto2.getText());
                rotuloRes.setText("Resultado: " + (n1 * n2));
            }
        });

        Div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(texto1.getText());
                double n2 = Double.parseDouble(texto2.getText());
                if (n2 != 0) rotuloRes.setText("Resultado: " + (n1 / n2));
                else rotuloRes.setText("Erro: Divisão por zero");
            }
        });

        Raiz.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(texto1.getText());
                rotuloRes.setText("Resultado (n1): " + Math.sqrt(n1));
            }
        });

        Limpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto1.setText("");
                texto2.setText("");
                rotuloRes.setText("Resultado: ");
                texto1.requestFocus();
            }
        });

        tela.add(tituloPrincipal);
        tela.add(rotulo1);
        tela.add(texto1);
        tela.add(rotulo2);
        tela.add(texto2);
        tela.add(Soma);
        tela.add(Sub);
        tela.add(Mult);
        tela.add(Div);
        tela.add(Raiz);
        tela.add(Limpar);
        tela.add(rotuloRes);

        setSize(300, 280);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        CalculadoraJava app = new CalculadoraJava();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
