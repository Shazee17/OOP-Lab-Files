import org.w3c.dom.ls.LSOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    BaseCommEmployee e = new BaseCommEmployee();
    e.setfName("Nimra");
    e.setlName("Mughal");
    e.setCnic("4550487562934785");
    e.setSales(20000);
    e.setRate(0.2);
    e.setBaseSalary(15000);
    String s = e.toStr();
        System.out.println("Hourly Employee Data:  " + s);


    }

}