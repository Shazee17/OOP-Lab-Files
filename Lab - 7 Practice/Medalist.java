class Medalist extends Student{
    String position;
    void disply(){
        System.out.printf("Name:%10sCNIC: %10s\nAge:%5d\nCMS:%10s\nPosition:%s", name, cnic, age, CMS, position);
    }
}