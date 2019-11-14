public class Course {

    static String yourName;
    static String professor;
    static String courseName;

    static int numAssignmentTypes;
    static double goalGrade;

    static double[][] grades;
    static int[] weights;
    static String courseNames[];

    public Course(){
        yourName = "";
        professor = "";
        courseName = "";
        numAssignmentTypes = 0;
        goalGrade = 0.0;
    }

    public static void initializeWeightsArray(int i){
        weights = new int[i];
    }

    public static void initializeCourseNames(int i){
        courseNames = new String[i];
    }
}
