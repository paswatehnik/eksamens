package eksamens;

import javax.swing.JOptionPane;

public class tests {
    public static void main(String[] args) {
    	
    	// Sākuma logs
        String[] opcijas = {"Sākt testu", "Iziet"};
        int sakumaIzvele = JOptionPane.showOptionDialog(
            null,
            "Laipni lūdzam Java matemātisko funkciju testā!\nVai vēlaties sākt testu?",
            "Sveiciens",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            opcijas,
            opcijas[0]
        );

        if (sakumaIzvele != 0) {
            JOptionPane.showMessageDialog(null, "Tests tika atcelts. Uz redzēšanos!");
            System.exit(0);
        }
    	
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
        
        if(atbilde1 == 0 || atbilde1 == 2) punkti++;

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
        
        if(atbilde2 == 0 || atbilde2 == 2) punkti++;

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
        
        if(atbilde3 == 0 || atbilde3 == 1) punkti++;

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
        
        if(atbilde4 == 0 || atbilde4 == 1) punkti++;

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
        
        if(atbilde5 == 0 || atbilde5 == 2) punkti++;

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
        
        if(atbilde6 == 0 || atbilde6 == 1) punkti++;

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
        
        if(atbilde7 == 0 || atbilde7 == 2) punkti++;

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
        
        if(atbilde8 == 0 || atbilde8 == 1 || atbilde8 == 2) punkti++;

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
        
        if(atbilde9 == 0 || atbilde9 == 2) punkti++;

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
        
        if(atbilde10 == 0 || atbilde10 == 1) punkti++;

        // Rezultātu izvade
        JOptionPane.showMessageDialog(null, 
            "Tests pabeigts!\nJūsu rezultāts: " + punkti + " no 10 iespējamajiem punktiem", 
            "Rezultāti", 
            JOptionPane.INFORMATION_MESSAGE);
    }
}