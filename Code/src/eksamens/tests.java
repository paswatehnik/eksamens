package eksamens;

import javax.swing.JOptionPane;

public class tests {
    public static void main(String[] args) {
        int punkti = 0;
        String[] atbildes;
        
        // 1. jautājums
        atbildes = new String[]{"a + b", "a += b", "a = a + b"};
        int atbilde1 = JOptionPane.showOptionDialog(null, 
            "Kuri no šiem operatoriem veic saskaitīšanu?", 
            "1. jautājums", 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            atbildes, 
            atbildes[0]);

        // 2. jautājums
        atbildes = new String[]{"Math.abs(-5)", "Math.max(3, 5)", "Math.sqrt(9)"};
        int atbilde2 = JOptionPane.showOptionDialog(null, 
            "Kuras no šīm funkcijām atgriezīs 5?", 
            "2. jautājums", 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            atbildes, 
            atbildes[0]);

        // 3. jautājums
        atbildes = new String[]{"2", "3", "2.5"};
        int atbilde3 = JOptionPane.showOptionDialog(null, 
            "Kāds būs rezultāts, ja int a = 5 / 2?", 
            "3. jautājums", 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            atbildes, 
            atbildes[0]);

        // 4. jautājums
        atbildes = new String[]{"Math.random()", "new Random().nextInt(10)", "Math.pow(2, 3)"};
        int atbilde4 = JOptionPane.showOptionDialog(null, 
            "Kuras no šīm metodēm ģenerē nejaušus skaitļus?", 
            "4. jautājums", 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            atbildes, 
            atbildes[0]);

        // 5. jautājums
        atbildes = new String[]{"a % b", "a / b", "Math.floorMod(a, b)"};
        int atbilde5 = JOptionPane.showOptionDialog(null, 
            "Kā iegūt dalījuma atlikumu Java?", 
            "5. jautājums", 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            atbildes, 
            atbildes[0]);
        

        // 6. jautājums
        atbildes = new String[]{"8.0", "6", "64.0"};
        int atbilde6 = JOptionPane.showOptionDialog(null, 
            "Kāds ir Math.pow(2, 3) rezultāts?", 
            "6. jautājums", 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            atbildes, 
            atbildes[0]);
        

        // 7. jautājums
        atbildes = new String[]{"4.0", "5.0", "4"};
        int atbilde7 = JOptionPane.showOptionDialog(null, 
            "Kāds ir Math.sqrt(16) rezultāts?", 
            "7. jautājums", 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            atbildes, 
            atbildes[0]);
        

        // 8. jautājums
        atbildes = new String[]{"a++", "++a", "a += 1"};
        int atbilde8 = JOptionPane.showOptionDialog(null, 
            "Kā palielināt mainīgo a par 1?", 
            "8. jautājums", 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            atbildes, 
            atbildes[0]);
        

        // 9. jautājums
        atbildes = new String[]{"3.0", "4.0", "3"};
        int atbilde9 = JOptionPane.showOptionDialog(null, 
            "Kāds ir Math.floor(3.9) rezultāts?", 
            "9. jautājums", 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            atbildes, 
            atbildes[0]);
        

        // 10. jautājums
        atbildes = new String[]{"0.0-1.0", "1-10", "jebkurš vesels skaitlis"};
        int atbilde10 = JOptionPane.showOptionDialog(null, 
            "Kādu diapazonu atgriež Math.random()?", 
            "10. jautājums", 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            atbildes, 
            atbildes[0]);

    }
}