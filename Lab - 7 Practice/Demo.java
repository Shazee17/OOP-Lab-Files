import java.util.Scanner;
class Demo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Medalist md = new Medalist();
        init:
        md.name = sc.nextLine();
        md.age = 56;
        md.CMS = "CN-123";
        md.cnic = "USA-MADE-123";
        md.position = "Gold";
        md.disply();  
        if (sc.nextInt() == 1){
            continue init;
        }
    }
}