import java.util.Scanner;
/**
[1]:Smith
[2]:Jodi
[3]:Bernete
[4]:Faith
[2]:Jodi has 5 of 100 in the course math
[4]:Faith has 70 of 100 in the course math
[3]:Bernete has 49 of 100 in the course math
The student [Jodi] percentage is 15.00%
[4]:Faith has the highest 70 grade in math
[2]:Jodi has the lowest 5 grade in math
*/
public class Assignment3{
    /**
     * This function will help you to cast string into int
     */
    static int stringToInt(String number) {
        return Integer.parseInt(number);
    }

    /**
     * Print students name
     */
    static void printAllStudent(int[] ids, String[] studentsName) {

        //@todo start the loop from 0 to ids length
        for (int index =0;  ids.length > index ; index++ ) {
            if (ids[index] == index + 1) {
                //@todo print student id with his name by using index
                  System.out.format( "[%d] %s\n",ids[index], studentsName[index]);
                // [1]:Smith
                // [2]:Jodi
                // [3]:Bernete
                // [4]:Faith
                
            }
        }
    }

    /**
     * Print course by name
     */
    static void courseByName(String course, int[] ids, String[] studentsName, String[] courses, int[] grades) {
        //start the loop from 0 to ids length
        for (int index = 0; index < ids.length; ++index) {
            //if the courses at index equals to the course then print his course and grade
            if (courses[index].equals(course)) {
                System.out.format("[%d]:%s has a grade %d of 100 in the course %s\n", ids[index], studentsName[index], grades[index], course);
            }
        }
    }

    static void calculatePercentage(String name, int[] ids, String[] studentsName, String[] courses, int[] grades) {
        //define totalGrades & totalPercentages variable with floating point datatype & initialize it with zero
        float totalGrades = 0;
        float totalPercentages = 0;
        //start the loop from 0 to ids length
        for (int index = 0; index < ids.length; ++index) {
            //if the studentName at index equals to the name then add his/her grade to the totalGrades
            if (studentsName[index].equals(name)) {
                //@todo add grades at current index to the totalGrades
                 totalGrades  += grades[index ];
                //@todo add 100  to the totalPercentages
                totalPercentages  += 100;
            }
        }
        //print the result
        System.out.format("The student [%s] GPA in percentage is %f%%\n",name,totalGrades/totalPercentages*100f);
    }
      static void maxGrade(String course, int[] ids, String[] studentsName, String[] courses, int[] grades){
          int maxgrade = 5;
          int  $max= 0 ;
           for( int index =0 ; ids.length > index; index++){
               if (courses[index].equals(course)& maxgrade<grades[index] ){
               maxgrade = grades[index];
                $max= index; 
               System.out.format("[%d]:%s has the highest %d grdae in %s\n", ids[$max], studentsName[$max], grades[$max], course);
               
           }
          
          
           }   
          
      }
      
       static void minGrade(String course, int[] ids, String[] studentsName, String[] courses, int[] grades){
           int mingrade = 100;
           int $min = 0 ;
           
           for ( int index =0 ; ids.length > index; index++){
           if ( grades[index]< mingrade & courses[index].equals(course) ){
            mingrade = grades[index];
            $min = index;
             System.out.format("[%d]:%s has the lowest %d grdae in %s\n", ids[$min], studentsName[$min], grades[$min], course);
       }
       }
       }
      
    /**
     * Main function
     */
    public static void main(String[] args) {
        String data = "1 Smith programming 2\n" +
                "2 Jodi programming 33\n" +
                "3 Bernete programming 90\n" +
                "4 Faith programming 31\n" +
                "2 Jodi math 5\n" +
                "4 Faith math 70\n" +
                "3 Bernete math 49\n" +
                "2 Jodi art 7\n" +
                "4 Faith art 35\n" +
                "3 Bernete art 100";

        Scanner scaned = new Scanner(data);

        //define ids array which will consist of 10 elements
        int[] ids = new int[10];
        //@todo define studentName array which will consist of 10 elements
            String[] studentName= new String[10];
        //define course array which will consist of 10 elements
        String[] course = new String[10];
        //@todo define grades array which will consist of 10 elements
             int[] grade = new int[10];

        /**
         * Reading loop line by line
         */
        //
        int arrayIndex = 0;
        //start reading the scanned data
        while (scaned.hasNext()) {
            //read next line from scaned
            String line = scaned.nextLine();

            /**
             * Reading loop char by char
             */
            //temporary string
            String temporary = "";
            //position 0 means id , 1 means name, 2 means the project
            int position = 0;
            for (int index = 0; index < line.length(); ++index) {
                //if the char is not space then add char to the temp string
                if (line.charAt(index) != ' ') {
                    temporary += line.charAt(index);
                } else {
                    /**
                     * check the position and save it to the appropriate array
                     * 0 is a id
                     * 1 is a name
                     * 2 is a project
                     */
                    if (position == 0) {
                        ids[arrayIndex] = stringToInt(temporary);
                    } else if (position == 1) {
                        studentName[arrayIndex] = temporary;
                    } else {
                        course[arrayIndex] = temporary;
                    }
                    temporary = "";
                    ++position;
                }
            }

            //save the temporary after converting it to int to the grade array at current index
            grade[arrayIndex] = stringToInt(temporary);

            //increase arrayIndex by 1
            ++arrayIndex;
        }

        //print all students with their ids
        printAllStudent(ids, studentName);

        //print students who study a course by name
        courseByName("math", ids, studentName, course, grade);

        //print percentage for student
        calculatePercentage("Jodi", ids, studentName, course, grade);
        
        //@todo calculate max grade in a course such as math
         maxGrade("math", ids, studentName, course, grade);
        //@todo calculate min grade in a course such as 
        minGrade("math", ids, studentName, course, grade);
    }
}
