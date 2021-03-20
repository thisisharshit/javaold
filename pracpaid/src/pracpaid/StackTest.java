package pracpaid;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class StackTest {
	 public static void main(String[] args) {
         // TODO code application logic here
         String askNum1, askNum2, answerSum, answerPro;
         int num1, num2, repeat;

         do 
         { 
             askNum1 = JOptionPane.showInputDialog ("Enter your first integer:");
             num1 = Integer.parseInt(askNum1);

             askNum2 = JOptionPane.showInputDialog("Enter your second integer:");
             num2 = Integer.parseInt(askNum2);

             answerSum = "The sum is: " + ((num1 + num2));
             answerPro = " The product is: " + ((num1 * num2));

             JFrame frame = new JFrame("TestFrame");
             JOptionPane.showMessageDialog(null, answerSum + answerPro);

             repeat = JOptionPane.showConfirmDialog(null, "Would you like to test another set of numbers?");           
         }
         while (repeat == JOptionPane.YES_OPTION);

     }

}
