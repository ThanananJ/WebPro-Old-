
import java.util.List;
import java.util.Scanner;
import quinn.controller.QuizController;
import quinn.model.Answer;
import quinn.model.Item;
import quinn.model.Quiz;
import quinn.model.Score;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mark
 */
public class Test {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Quiz Name");
        String name = sc.nextLine();
        //Enter quiz name
        
        QuizController qc = new QuizController();
        List<Quiz> ql = qc.findByDesc(name);
        Quiz q = ql.get(0);
        //find quiz
        
        System.out.println("Check the result [Y/N]");
        System.out.println(q.getQuiz_id() + q.getDescription() + q.getSubject() + q.getType());
        String a1 = sc.nextLine();
        //check quiz
        
        if (a1.equals("Y")) {
            int score = 0;
            List<Item> il = qc.findQuizItem(q.getQuiz_id());
            //find item
            
            for (int i = 0; i < il.size(); i++) {
                System.out.println(il.get(i).toString());
                List<Answer> al = qc.findItemAnswer(il.get(i).getItem_id());
                //find answer
                
                for (int j = 0; j < al.size(); j++) {
                    int no = j + 1;
                    System.out.println(no + ". " + al.get(j).getDescription());
                }
                System.out.println("Enter Answer");
                String answer = sc.nextLine();
                //print choice
                
                Answer an = null;
                for (int k = 0; k < 4; k++) {
                    if (k >= al.size()) {
                        an = al.get(0);
                    } else {
                        if (al.get(k).getDescription().equals(answer)) {
                            an = al.get(k);
                            
                        } else {
                        }
                    }
                }
                //get answer
                
                if(an.isIsCorrect()){
                    score = score+1;
                    Score s = new Score("00001", q.getQuiz_id(), score);
                }
                //chack answer
                
                System.out.println(score);
            }

        } else {

        }
    }
}
