public class Course {

    static String yourName;
    static String professor;
    static String courseName;

    static int numAssignmentTypes;
    static double goalGrade;

    static double[][] grades;
    static int[] weights;
    static String[] assignmentTypeNames;

    //create quantity array to store num of assignment in each assignment Type
    static int[] quantity;

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

    public static void initializeAssignmentTypeNames(int i){
        assignmentTypeNames = new String[i];
    }

    public static void setNumGrades(int assignmentType, int numGrades){
        grades[assignmentType] = new double[numGrades];
    }

    public static void initializeGrades(int numAssignmentTypes){
        grades = new double[numAssignmentTypes][];
    }
}
