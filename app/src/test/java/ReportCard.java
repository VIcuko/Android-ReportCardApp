import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by Vicuko on 21/7/17.
 */

public class ReportCard {

    private Hashtable<String,Integer> allGrades;

    /**
     * This is the constructor which admits one Hashtable variable containing the courses and their corresponding grades.
     * @param grades
     */
    public ReportCard(Hashtable grades){
        Enumeration keys = grades.keys();

        while(keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            allGrades.put(str,Integer.parseInt(grades.get(str).toString()));
        }
    }

    /**
     * This function allows to retrieve one specific grade by introducing the name of the course.
     * @param course
     * @return
     */
    public int getGrade(String course){
        int grade = allGrades.get(course.toString());
        return grade;
    }

    /**
     * This function allows to modify or add new courses and grades.
     * @param course
     * @param grade
     */
    public void setGrade(String course, int grade){
        allGrades.put(course,grade);
    }

    /**
     * This function returns a String with all of the grades introduced.
     * @return
     */
    public String getAllGrades(){
        Enumeration keys = allGrades.keys();
        String report = "";

        while(keys.hasMoreElements()) {
            String course = (String) keys.nextElement();
            String grade = allGrades.get(course).toString();
            report = report + course + ":" + grade + ".\n";
        }
        return report;
    }
}
