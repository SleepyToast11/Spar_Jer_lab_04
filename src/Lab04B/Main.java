package Lab04B;

import java.util.ArrayList;

/**
 * Name: Jerome Sparnaay
 * Date: February 15th, 2022
 * Description: Class and abstract class and method practice
 * */
public class Main {
    /**
     * test program for classes
     * @param args command line arguments
     * */
    public static void main(String[] args) {
        ArrayList<Instructor> instructorArrayList = new ArrayList<>();
        instructorArrayList.add(new Faculty(50, 0, 0));
        instructorArrayList.add(new Grad(65, 0,0));
        instructorArrayList.add(new Lecturer(65, 0, 0));

        for (int days = 0; days < 10; days++){ // for 10 days sent (days * 10) + 50 mails and see how many are left after each day

            for (Instructor ins : instructorArrayList){
                ins.getMail((days * 10) + 50);

            System.out.println("instructor has: " + ins.getUnreadMails()+" unread mails");
            }

            System.out.println("");
        }
    }
}
