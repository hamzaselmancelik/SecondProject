package SecondProject;
import junit.framework.TestCase;


import org.junit.Assert;
import org.junit.Test;
import org.joda.time.DateTime;

//import classes from assignment1 project
import assignment1.Student;
import assignment1.Module;
import assignment1.CourseProgramme;
public class MainTest{
    @Test
    public void finalTest()
    {
        //students
        Student s1 = new Student();
        s1.setName("Hamza");
        s1.setAge(21);
        Student s2 = new Student();

        s2.setName("Mark");
        s2.setAge(42);
        s2.setUsername();

        Student s3 = new Student();
        s3.setName("Dilara");
        s3.setAge(23);
        s3.setUsername();

        Student s4 = new Student();
        s4.setName("Emily");
        s4.setAge(19);
        s4.setUsername();

        Student[] CSITStudents = new Student[2];
        CSITStudents[0] = s1;
        CSITStudents[1] = s2;

        Student[] ECEStudents = new Student[2];
        ECEStudents[0] = s3;
        ECEStudents[1] = s4;

        //course programmes
        CourseProgramme CSIT = new CourseProgramme();
        CSIT.setlistOfStudents(CSITStudents);

        CourseProgramme ECE = new CourseProgramme();
        ECE.setlistOfStudents(ECEStudents);

        CourseProgramme[] CT417Courses = new CourseProgramme[1];
        CT417Courses[0] = CSIT;

        Module CT417 = new Module();
        CT417.setcoursesAssociated(CT417Courses);

        CourseProgramme[] ECE312Courses = new CourseProgramme[1];
        ECE312Courses[0] = ECE;

        Module ECE312 = new Module();
        ECE312.setcoursesAssociated(ECE312Courses);


        Assert.assertEquals("Hamza21",CT417.getcoursesAssociated()[0].getlistOfStudents()[0].getUsername());
        Assert.assertEquals("Emily19",ECE312.getcoursesAssociated()[0].getlistOfStudents()[1].getUsername());
    }

}