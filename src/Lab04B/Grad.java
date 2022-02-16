package Lab04B;

/** young ambitious instructor, often more stressed than others */
public class Grad extends Instructor {

    /**
     * constructs grad instructor using super classes constructor
     * @param age  age of the grad instructor
     * @param unreadMail Number of unread mails at the beginning of career
     * @param eccentricities score of eccentricity started with
     */
    public Grad(int age, int unreadMail, int eccentricities) {
        super(age, unreadMail, eccentricities);
    }

    /** reads all mails in one go, always add or removes eccentricities */
    @Override
    public void cope() {

        reduceMail(getUnreadMails());

        if (Math.random() < 0.5){
            addToEccentricities(3);}

        else
            addToEccentricities(-3);
    }

    /** grad student receives 1.5 times more stress, for a maximum of 1500 */
    @Override
    public int stress(){
        if (getUnreadMails() > 1000)
            return 1500;    //1.5 * 1000

        else
            return ((int)(getUnreadMails() * 1.5));
        }
    }
