/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    
    JTextField panTextField,aadharTextField;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JDateChooser dateChooser;
    JComboBox religion,category,income,education,occupation;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
        
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM  - PAGE 2");
        
        
        
        JLabel additionalDetails = new JLabel("Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD, 30));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD, 20));
        name.setBounds(100,140,100,30);
        add(name);
        
        
        String valReligion[] = {"Hindu", "Muslim","Sikh","Christian","Other"};
        religion  = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway",Font.BOLD, 20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String valCategory[] = {"General", "SC","ST","OBC","Other"};
        category  = new JComboBox(valCategory);
        category.setBackground(Color.WHITE);
        category.setBounds(300,190,400,30);
        add(category);
        
        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway",Font.BOLD, 20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        String incomeCategory[] = {"null", "<1,50,000","<2,50,000","<5,00,000","upto 10,00,000"};
        income  = new JComboBox(incomeCategory);
        income.setBackground(Color.WHITE);
        income.setBounds(300,240,400,30);
        add(income);
        
        JLabel gender = new JLabel("Education");
        gender.setFont(new Font("Raleway",Font.BOLD, 20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        
        
        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway",Font.BOLD, 20));
        email.setBounds(100,315,200,30);
        add(email);
        
        String educationValues[] = {"Non-Graduation", "Graduate","Post-Graduation","Doctrate","Others"};
        education  = new JComboBox(educationValues);
        education.setBackground(Color.WHITE);
        education.setBounds(300,315,400,30);
        add(education);
        
        
        
        JLabel marital = new JLabel("Occupation:");
        marital.setFont(new Font("Raleway",Font.BOLD, 20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        
        String occupationValues[] = {"Salaried", "Self-Employed","Business","Student","Retired","Others"};
        occupation = new JComboBox(occupationValues);
        occupation.setBackground(Color.WHITE);
        occupation.setBounds(300,390,400,30);
        add(occupation);
        
       
        
        
        JLabel pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway",Font.BOLD, 20));
        pan.setBounds(100,440,200,30);
        add(pan);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 20));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);
        
        JLabel aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway",Font.BOLD, 20));
        aadhar.setBounds(100,490,200,30);
        add(aadhar);
        
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 20));
        aadharTextField.setBounds(300,490,400,30);
        add(aadharTextField);
        
        JLabel seniorcitizen = new JLabel("Senior Citizen:");
        seniorcitizen.setFont(new Font("Raleway",Font.BOLD, 20));
        seniorcitizen.setBounds(100,540,200,30);
        add(seniorcitizen);
        
        syes = new JRadioButton("YES");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("NO");
        sno.setBounds(400,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup seniorcitizengroup = new ButtonGroup();
        seniorcitizengroup.add(syes);
        seniorcitizengroup.add(sno);
        
        
 
        
        JLabel existingaccount = new JLabel("Existing Account:");
        existingaccount.setFont(new Font("Raleway",Font.BOLD, 20));
        existingaccount.setBounds(100,590,200,30);
        add(existingaccount);
        
        eyes = new JRadioButton("YES");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("NO");
        eno.setBounds(400,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup existingaccountgroup = new ButtonGroup();
        existingaccountgroup.add(eyes);
        existingaccountgroup.add(eno);
        
        next = new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setVisible(true);
        setLocation(350,10);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
         
         String sreligion = (String) religion.getSelectedItem();
         String scategory = (String) category.getSelectedItem();
         String sincome = (String) income.getSelectedItem();
         String seducation = (String) education.getSelectedItem();
         String soccupation = (String) occupation.getSelectedItem();
         String seniorcitizen  = null;
         if(syes.isSelected()){
             seniorcitizen = "YES";
         }else if(sno.isSelected()){
             seniorcitizen = "No";
         }
         
         String existingaccount = null;
         if(eyes.isSelected()){
             existingaccount = "YES";
         }else if(eno.isSelected()){
             existingaccount = "NO";
         }
         
         String span = panTextField.getText();
         String saadhar = aadharTextField.getText();
        
         try{
             
                 Conn c = new Conn();
                 String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+existingaccount+"')";
                 c.s.executeUpdate(query);
                 
                 setVisible(false);
                 new SignupThree(formno).setVisible(true);
             
             
         }catch(Exception e){
             System.out.println(e);
         }
    }
//    public static void main(String[]args){
//        new SignupTwo("");
//    }
    
}
