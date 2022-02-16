package Lab04B;
/**
 * Abstract class to be inherited from by personal
 * @author Jerome Sparnaay
 * */
public abstract class Instructor {

    /** age of instructor*/
    private final int age;

    /** number of unread mails in inbox, can be a cause of stress for some
     * can be unlimited, but never negative*/
    private int unreadMails;

    /** score of eccentricity of particular instructor, make some lose respect */
    private int eccentricities;

    /** @return private variable of age of the instructor*/
    public int getAge() {

        return age;
    }

    /** @return private variable of eccentricities of instructor*/
    public int getEccentricities() {

        return eccentricities;
    }

    /** @return number of unread mails in the inbox of instructor*/
    public int getUnreadMails() {

        return unreadMails;
    }

    /**
     * default constructor to be used in child classes
     * @param age  age of the instructor
     * @param unreadMails Number of unread mails at the beginning of career
     * @param eccentricities score of eccentricity started with
     * */
    public Instructor(int age, int unreadMails, int eccentricities){

        this.age = age;
        this.unreadMails = unreadMails;
        this.eccentricities = eccentricities;
    }

    /** coping mechanism to be set for every particular type of instructor */
    abstract public void cope();

    /** @return integer describing stress level of instructor equal to number of unread mails. cannot be higher than 1000 */
    public int stress(){

        if (unreadMails > 1000)
            return 1000;

        else
            return unreadMails;
    }

    /** respect score of particular instructor equal to their age minus their eccentricities
     * cannot be negative
     * @return non-negative level of respect
     * */
    public int respect(){

        if (age < eccentricities)
            return 0;

        else
            return age - eccentricities;
    }

    /** instructor finally decides to read their emails and reduce them, no guarantee they will answer tho
     * @param readMails number of mails read to be discarded
     * */
    public void reduceMail(int readMails){

        if (readMails > unreadMails)
            unreadMails = 0;

        else
            unreadMails -= readMails;
    }

    /** method to modify amount of eccentricities of instructor. modifier can be negative,
     *  but the final eccentricities will always be non-negative
     * @param eccentricities amount of modification of the eccentricities
     *  */
    public void addToEccentricities(int eccentricities){

        if (getEccentricities() + eccentricities <= 0)
            this.eccentricities = 0;

        else
            this.eccentricities += eccentricities;
    }

    /** instructor receives new mail and is added to unread, can sometimes add or
     * remove to eccentricities. If stress is greater than resect, the coping mechanism will engage
     * @param newMail number of received main */
    public void getMail(int newMail){

        unreadMails += newMail;     // 20% of the time getting email,
        if (Math.random() < 0.2) {
            if (Math.random() < 0.5)
                addToEccentricities(2);

            else
                addToEccentricities(-2);
        }
        if (stress() > respect())
            cope();
    }
}

