package Lab04B;

/** Faculty instructor, don't read mails often */
public class Faculty extends Instructor{

    /**
     * constructs faculty instructor using super classes constructor
     * @param age  age of the faculty instructor
     * @param unreadMail Number of unread mails at the beginning of career
     * @param eccentricities score of eccentricity started with
     */
    public Faculty(int age, int unreadMail, int eccentricities) {
        super(age, unreadMail, eccentricities);
    }

    /** to cope faculty increases eccentricities, everybody has the ability to wait after all */
    @Override
    public void cope() {
        addToEccentricities(30);
    }

    /** faculty instructor gain respect instead of losing it with eccentricities */
    @Override
    public int respect() {
        return (getAge() + getEccentricities());
        }
    }

