/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quinn.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import quinn.db.BuildConnection;
import quinn.model.Quiz;
import quinn.model.Student;
import quinn.model.Teacher;

/**
 *
 * @author nattawanee.sks
 */
public class QuizController {
    
    public static List<Quiz> findByDesc(String find){
        List<Quiz> list = null;
        Quiz q;
        Connection conn = BuildConnection.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement("select * from quizes where description LIKE ?");
            pstm.setString(1, "%"+find+"%");
            ResultSet rs = null;
            rs = pstm.executeQuery();
            while(rs.next()){
                if(list == null){
                    list = new ArrayList(100);
                }
                q = new Quiz(rs.getString("quiz_id"), rs.getString("description"), rs.getString("subject"), rs.getString("q_type"), rs.getString("t_id"), rs.getString("class_id"));
                list.add(q);
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static List<Quiz> findByGrade(String find){
        List<Quiz> list = null;
        Quiz q;
        Connection conn = BuildConnection.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement("select * from quizes where class_id LIKE ?");
            pstm.setString(1, find+"%");
            ResultSet rs = null;
            rs = pstm.executeQuery();
            while(rs.next()){
                if(list == null){
                    list = new ArrayList(100);
                }
                q = new Quiz(rs.getString("quiz_id"), rs.getString("description"), rs.getString("subject"), rs.getString("q_type"), rs.getString("t_id"), rs.getString("class_id"));
                list.add(q);
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static List<Quiz> findBySubject(String find){
        List<Quiz> list = null;
        Quiz q;
        Connection conn = BuildConnection.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement("select * from quizes where subject LIKE ?");
            pstm.setString(1, "%"+find+"%");
            ResultSet rs = null;
            rs = pstm.executeQuery();
            while(rs.next()){
                if(list == null){
                    list = new ArrayList(100);
                }
                q = new Quiz(rs.getString("quiz_id"), rs.getString("description"), rs.getString("subject"), rs.getString("q_type"), rs.getString("t_id"), rs.getString("class_id"));
                list.add(q);
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static void main(String[] args) {
        QuizController qc = new QuizController();
        List<Quiz> q = qc.findByDesc("Eng");
        q = qc.findByGrade("5");
        q = qc.findBySubject("English");
        System.out.println(q.get(0).getDescription());
    }
}
