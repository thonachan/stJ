/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class tables {
    public static void main(String[] args){
    try{
        String user_login = "create table user(id int AUTO_INCREMENT primary key, username varchar(200), password varchar(200))";
        DbOperations.setDataorDelete(user_login, "User Login table created successfully");
        String stureg = "create table stureg(id int AUTO_INCREMENT primary key, Name varchar(200), Surname varchar(200), Phone int(10), FathersPhone int(10), Form varchar(200), RollNumber int(200), Address varchar(200))";
        DbOperations.setDataorDelete(stureg, "stureg table created successfully");
        String addteacher = "create table addteacher(id int AUTO_INCREMENT primary key, Name varchar(200), Specialization varchar(200), Subject varchar(200))";
        DbOperations.setDataorDelete(addteacher, "addteacher table created successfully");
        String fee = "create table fee(id int AUTO_INCREMENT primary key, StudentName varchar(200), Month varchar(200), AnnualFee int(200), LibraryFee int(200), SportsFee int(200), MonthlyFee int(200), Status varchar(200))";
        DbOperations.setDataorDelete(fee, "Fee Submission table created successfully");
        String  report = "create table  report(id int AUTO_INCREMENT primary key, RollNumber int(200), Name varchar(200), Form int(200), English int(200), Kiswahili int(200), Math int(200), Physics int(200), Biology int(200),CRE int(200),Geograpy int(200),History int(200),Business int(200), Grade varchar(200))";
        DbOperations.setDataorDelete( report, " reportcard table created successfully");
       
        
        
        
         }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
            
            
            }
    
    
     }
    
}
