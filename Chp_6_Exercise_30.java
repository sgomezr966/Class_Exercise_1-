import java.util.Random;
import javax.swing.*;

public class Chp_6_Exercise_30 {

    public static void main(String[] args) {
		int turns = 0;
		do{ turns++;
			int roll1 = rollDie();
			int roll2 = rollDie();
			JOptionPane.showMessageDialog(null, "You rolled " + roll1 + " + " + roll2 + " = " + (roll1 + roll2),"Craps Game", JOptionPane.INFORMATION_MESSAGE);
			String answer = getStats(roll1 +roll2);
			JOptionPane.showMessageDialog(null, answer, "Craps Game", JOptionPane.INFORMATION_MESSAGE);
			if(answer.equals("You win.")||answer.equals("You lose.") ){
				break;}
			System.out.println(getStats(roll1 + roll2));
    }while(turns>-1);
	}

    public static String getStats(int n) {

        if (n == 7 || n == 11) return "You win.";
        if (n == 2 || n == 3 || n == 12) return "You lose.";

        return "Point is " + n;

    }

    public static int rollDie() {

        return (int) (Math.random() * 6 + 1);
    }
}