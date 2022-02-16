package Lab04B;

/** lecturer instructor, many mail misshaps */
public class Lecturer extends Instructor {

    /**
     * constructs lecturer instructor using super classes constructor
     * @param age  age of the lecturer instructor
     * @param unreadMail Number of unread mails at the beginning of career
     * @param eccentricities score of eccentricity started with
     */
    public Lecturer(int age, int unreadMail, int eccentricities) {

        super(age, unreadMail, eccentricities);
    }

    /** to cope, makes 60% of email disappear into the void */
    @Override
    public void cope() {
        reduceMail((int)(0.6 * getUnreadMails()));
    }

}

