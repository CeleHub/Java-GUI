import javax.swing.JOptionPane;

public class GUICLASSWORK {
    public static void main(String[] args) {
        String FirstDept;
        FirstDept = JOptionPane.showInputDialog("Enter Department 1:");
        String SecondDept;
        SecondDept = JOptionPane.showInputDialog("Enter Department 2:");
        String ThirdDept;
        ThirdDept = JOptionPane.showInputDialog("Enter yor Department 3:");
        String FourthDept;
        FourthDept = JOptionPane.showInputDialog("Enter yor Department 4:");

        String Departments;
        Departments = FirstDept + ", " + SecondDept + ", " + ThirdDept + " and " + FourthDept + ".";
        JOptionPane.showMessageDialog(null, "Departments in Computer Science and Mathematics are: " + Departments);


    }
}