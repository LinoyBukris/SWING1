package org.example;


//ממשקים גרפיים.
//יוניטי - איזשהו מנוע פיזיקלי (אנחנו לא נשתמש ביוניטי).
//ספריות (library) - אוסף של מחלקות.
//יש 2 ספריות גרפיות עיקריות (מחלקות שעוזרות לצייר דברים גרפיים):
//1. java FX 2. swing (אנחנו נשתמש בסווינג)
//swing - library for creating user interfaces.
//אנחנו נכתוב אפליקציות עבור desktop.
//JFram - window מחלקה המייצגת חלון.
//JButton - button מחלקה המייצגת כפתור
//JPanel - panel מחלקה המייצגת פאנל

import javax.swing.*;
import java.awt.*;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame(); // יצירת אוביקט שמייצר חלון
        window.setVisible(true); //כברירת מחדל שדה זה הוא false
                                // לכן בשביל שיראו את החלון נשנה את הערך ל true
        window.setSize(600,800); // משנה את גודל החלון
        window.setLocationRelativeTo(null); //גורם לחלון להיפתח במרכז
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // מאפשר לכך שברגע סגירת
                                                                        // החלון התוכנית עצמה גם נסגרת
        window.setResizable(false); //האם ניתן לשנות את גודל החלון ?
        window.setLayout(null); //על layout נרחיב בהמשך, הכנסנו null בשביל שלא נשתמש בתבנית
                                // של layout אלא שנוכל להגדיר בעצמנו איפה כל עצם נמצאת
        // עד כאן זה הגדרות קונפיבורציות ראשוניות לחלון

        JButton click1 = new JButton(); //יצירת אוביקט שמייצר כפתור
        //אומנם יצרנו כפתור אך כשנפעיל את התוכנית לא נראה את הכפתור,
        // הדבר הזה בגלל שלא יצרנו קשר בין הכפתור לחלון. לכן
        window.add(click1);
        click1.setBounds(180,50, 250,75); //מגדיר גבולות
        click1.setText("don't pressure me!"); //מכניס טקטס לכפתור
        // ניתן להכניס טקסט גם ישירות בבנאי, JButton click = new JButton("click here")
        Font font1 = new Font("Calibri", 1, 22); //יצירת אוביקט של פונט
        click1.setFont(font1);                                  //שי לא לימד, נרחיב בהמשך

        click1.addActionListener((event) ->{                     //מאזין על רכיבים שנמצאים על החלון (נרחיב בהמשך)
            if(click1.getText().equals("don't pressure me!"))   //אנו השתמשנו במתודה שהעברנו עליה פונקציה,
                click1.setText("don't press!!");               //ניתן לראות כאן את הסינטקס
            else
                click1.setText("don't pressure me!");
        });

        JButton click2 = new JButton("press me XD");
        window.add(click2);
        click2.setBounds(click1.getX(),
                click1.getY()+ click1.getHeight() + 10,
                click1.getWidth(),
                click1.getHeight());
        click2.addActionListener((event) ->{
            click1.setVisible(!click1.isVisible());
        });

        click2.addMouseListener(new MyMouseListener(click2)); //מאזין לאירועים עם העכבר





    }
}