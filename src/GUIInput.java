import javax.swing.JOptionPane;

public class GUIInput implements TextInput {

    public String getText() {
        return JOptionPane.showInputDialog("Podaj imie.");
    }
}
