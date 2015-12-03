/**
 * Created by MattBrown on 10/8/15.
 */
public class Email {
    public String subjectLine; //lulz
    public String body; //
    public String emailDestination;
    public int timeStamp;

    public Email() {
        System.out.println("Creating email...");
        subjectLine = "No Subject";
        body = "";
        emailDestination = "";
        timeStamp = 0;
    }

    public Email(String subjectLine, String body, String emailDestination, int timeStamp){
        this.subjectLine = subjectLine;
        this.body = body;
        this.emailDestination = emailDestination;
        this.timeStamp = timeStamp;
    }

    public void setSubjectLine(String subjectLine){
        this.subjectLine = subjectLine;
    }

    public String getSubjectLine(){
        return subjectLine;
    }

    public static boolean isValidSubjectLine(String subjectLine){
        return subjectLine.length() != 0;
    }
}
