import static javax.swing.JOptionPane.*;
public class Test03 {
    public static void main(String[] args) {
        showMessageDialog(null, "Hello!"); /* mindestens 2 werte sind zu übergeben */
        showMessageDialog(null, "Hello again", "Achtung", WARNING_MESSAGE);
        showMessageDialog(null, "Hello try again", null , WARNING_MESSAGE);
        showMessageDialog(null, "Hello number four", "Achtung again" , PLAIN_MESSAGE);
    }
}