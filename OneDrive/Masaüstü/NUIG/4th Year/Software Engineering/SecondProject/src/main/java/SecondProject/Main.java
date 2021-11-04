package SecondProject;
import org.joda.time.DateTime;

//import assignment1
import assignment1.CourseProgramme;
import assignment1.Module;
import assignment1.Student;

public class Main {
    public static void main(String[] args) {

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

        //courses
        CourseProgramme CSIT = new CourseProgramme();
        CSIT.setcourseName("CSIT");
        CourseProgramme ECE = new CourseProgramme();
        ECE.setcourseName("ECE");

        //modules
        Module CT417 = new Module();
        CT417.setmoduleName("CT417");
        Module ECE312 = new Module();
        ECE312.setmoduleName("ECE312");
        Module MA123 = new Module();
        MA123.setmoduleName("MA123");
        Module ECE389 = new Module();
        ECE389.setmoduleName("ECE389");

        //course of student 1 is CSIT
        CourseProgramme[] s1Courses =  new CourseProgramme[1];
        s1Courses[0] = CSIT;
        s1.setCoursesRegistered(s1Courses);

        //course of student 2 is CSIT
        CourseProgramme[] s2Courses = new CourseProgramme[1];
        s2Courses[0] = CSIT;
        s2.setCoursesRegistered(s2Courses);

        //course of student 3 is ECE
        CourseProgramme[] s3Courses =  new CourseProgramme[1];
        s3Courses[0] = ECE;
        s3.setCoursesRegistered(s3Courses);

        //course of student 4 is ECE
        CourseProgramme[] s4Courses = new CourseProgramme[1];
        s4Courses[0] = ECE;
        s4.setCoursesRegistered(s4Courses);

        //modules of student 1 are CT417 and MA123
        Module[] s1Modules = new Module[2];
        s1Modules[0] = CT417;
        s1Modules[1] = MA123;
        s1.setModulesRegistered(s1Modules);

        //modules of student 2 are CT417 and MA123
        Module[] s2Modules = new Module[2];
        s2Modules[0] = CT417;
        s2Modules[1] = MA123;
        s2.setModulesRegistered(s2Modules);

        //modules of student 3 are ECE312 and EC389
        Module[] s3Modules = new Module[2];
        s3Modules[0] = ECE312;
        s3Modules[1] = ECE389;
        s3.setModulesRegistered(s3Modules);

        //modules of student 4 are ECE312 and ECE389
        Module[] s4Modules = new Module[2];
        s4Modules[0] = ECE312;
        s4Modules[1] = ECE389;
        s4.setModulesRegistered(s4Modules);

        //CSIT students are student 1 and student 2
        Student[] CSITStudents = new Student[2];
        CSITStudents[0] = s1;
        CSITStudents[1] = s2;
        CSIT.setlistOfStudents(CSITStudents);

        //ECE students are student 3 and student 4
        Student[] ECEStudents = new Student[2];
        ECEStudents[0] = s3;
        ECEStudents[1] = s4;
        ECE.setlistOfStudents(ECEStudents);

        //CT417 module is taken by student 1 and student 2
        Student[] CT417Students = new Student[2];
        CT417Students[0] = s1;
        CT417Students[1] = s2;
        CT417.setlistOfStudents(CT417Students);

        //MA123 module is taken by student 1 and student 2
        Student[] MA123Students = new Student[2];
        MA123Students[0] = s1;
        MA123Students[1] = s2;
        MA123.setlistOfStudents(MA123Students);

        //ECE312 module is taken by student 3 and student 4
        Student[] ECE312Students = new Student[2];
        ECE312Students[0] = s3;
        ECE312Students[1] = s4;
        ECE312.setlistOfStudents(ECE312Students);

        //ECE389 module is taken by student 3 and student 4
        Student[] ECE389Students = new Student[2];
        ECE389Students[0] = s3;
        ECE389Students[1] = s4;
        ECE389.setlistOfStudents(ECE389Students);


        //ECE389 Module is associated with course ECE
        CourseProgramme[] ECE389Courses = new CourseProgramme[1];
        ECE389Courses[0] = ECE;
        ECE389.setcoursesAssociated(ECE389Courses);

        //ECE312 Module is associated with course ECE
        CourseProgramme[] ECE312Courses = new CourseProgramme[1];
        ECE312Courses[0] = ECE;
        ECE312.setcoursesAssociated(ECE312Courses);

        //MA123 Module is associated with course CSIT
        CourseProgramme[] MA123Courses = new CourseProgramme[1];
        MA123Courses[0] = CSIT;
        MA123.setcoursesAssociated(MA123Courses);

        //CT417Courses Module is associated with course CSIT
        CourseProgramme[] CT417Courses = new CourseProgramme[1];
        CT417Courses[0] = CSIT;
        CT417.setcoursesAssociated(CT417Courses);


        //CSIT has CT417 and MA123 modules
        Module[] CSITModules = new Module[2];
        CSITModules[0] = CT417;
        CSITModules[1] = MA123;
        CSIT.setlistOfModules(CSITModules);

        //ECE has ECE312 and ECE389 modules
        Module[] ECEModules = new Module[2];
        ECEModules[0] = ECE312;
        ECEModules[1] = ECE389;
        ECE.setlistOfModules(ECEModules);


        //Print out students

        //Print out student 1
        System.out.println("Student 1");
        System.out.println("Username: " + s1.getUsername());
        System.out.print("Courses: ");
        for(int i = 0; i<s1.getCoursesRegistered().length;i++)
        {
            System.out.print(s1.getCoursesRegistered()[i].getcourseName() + " ");
        }

        System.out.print("\nModules: ");
        for(int i = 0; i<s1.getModulesRegistered().length;i++)
        {
            System.out.print(s1.getModulesRegistered()[i].getmoduleName() + " ");
        }

        System.out.print("\n\n");

        //Print out student 2
        System.out.println("Student 2");
        System.out.println("Username: " + s2.getUsername());
        System.out.print("Courses: ");
        for(int i = 0; i<s2.getCoursesRegistered().length;i++)
        {
            System.out.print(s2.getCoursesRegistered()[i].getcourseName() + " ");
        }

        System.out.print("\nModules: ");
        for(int i = 0; i<s2.getModulesRegistered().length;i++)
        {
            System.out.print(s2.getModulesRegistered()[i].getmoduleName() + " ");
        }
        System.out.print("\n\n");

        //Print out student 3
        System.out.println("Student 3");
        System.out.println("Username: " + s3.getUsername());
        System.out.print("Courses: ");
        for(int i = 0; i<s3.getCoursesRegistered().length;i++)
        {
            System.out.print(s3.getCoursesRegistered()[i].getcourseName() + " ");
        }

        System.out.print("\nModules: ");
        for(int i = 0; i<s3.getModulesRegistered().length;i++)
        {
            System.out.print(s3.getModulesRegistered()[i].getmoduleName() + " ");
        }
        System.out.print("\n\n");

        //Print out student 4
        System.out.println("Student 4");
        System.out.println("Username: " + s4.getUsername());
        System.out.print("Courses: ");
        for(int i = 0; i<s4.getCoursesRegistered().length;i++)
        {
            System.out.print(s4.getCoursesRegistered()[i].getcourseName() + " ");
        }

        System.out.print("\nModules: ");
        for(int i = 0; i<s4.getModulesRegistered().length;i++)
        {
            System.out.print(s4.getModulesRegistered()[i].getmoduleName() + " ");
        }
        System.out.print("\n\n");


        //Print out Modules

        //Print out CT417
        System.out.println("CT417");
        System.out.print("Students: ");
        for(int i = 0; i<CT417.getlistOfStudents().length;i++)
        {
            System.out.print(CT417.getlistOfStudents()[i].getUsername() + " ");
        }

        System.out.print("\nCourses Associated: ");
        for(int i = 0; i<CT417.getcoursesAssociated().length;i++)
        {
            System.out.print(CT417.getcoursesAssociated()[i].getcourseName() + " ");
        }
        System.out.print("\n\n");

        //Print out MA123
        System.out.println("MA123");
        System.out.print("Students: ");
        for(int i = 0; i<MA123.getlistOfStudents().length;i++)
        {
            System.out.print(MA123.getlistOfStudents()[i].getUsername() + " ");
        }

        System.out.print("\nCourses Associated: ");
        for(int i = 0; i<MA123.getcoursesAssociated().length;i++)
        {
            System.out.print(MA123.getcoursesAssociated()[i].getcourseName() + " ");
        }
        System.out.print("\n\n");

        //Print out ECE312
        System.out.println("ECE312");
        System.out.print("Students: ");
        for(int i = 0; i<ECE312.getlistOfStudents().length;i++)
        {
            System.out.print(ECE312.getlistOfStudents()[i].getUsername() + " ");
        }

        System.out.print("\nCourses Associated: ");
        for(int i = 0; i<ECE312.getcoursesAssociated().length;i++)
        {
            System.out.print(ECE312.getcoursesAssociated()[i].getcourseName() + " ");
        }
        System.out.print("\n\n");

        //Print out ECE389
        System.out.println("ECE389");
        System.out.print("Students: ");
        for(int i = 0; i<ECE389.getlistOfStudents().length;i++)
        {
            System.out.print(ECE389.getlistOfStudents()[i].getUsername() + " ");
        }

        System.out.print("\nCourses Associated: ");
        for(int i = 0; i<ECE389.getcoursesAssociated().length;i++)
        {
            System.out.print(ECE389.getcoursesAssociated()[i].getcourseName() + " ");
        }
        System.out.print("\n\n");

        //Print out Courses

        //Print out CSIT
        System.out.println("CSIT");
        System.out.print("Students: ");
        for(int i = 0; i<CSIT.getlistOfStudents().length;i++)
        {
            System.out.print(CSIT.getlistOfStudents()[i].getUsername() + " ");
        }

        System.out.print("\nModules Registered: ");
        for(int i = 0; i<CSIT.getlistOfModules().length;i++)
        {
            System.out.print(CSIT.getlistOfModules()[i].getmoduleName() + " ");
        }
        System.out.print("\n\n");

        //Print out ECE
        System.out.println("ECE");
        System.out.print("Students: ");
        for(int i = 0; i<ECE.getlistOfStudents().length;i++)
        {
            System.out.print(ECE.getlistOfStudents()[i].getUsername() + " ");
        }

        System.out.print("\nModules Registered: ");
        for(int i = 0; i<ECE.getlistOfModules().length;i++)
        {
            System.out.print(ECE.getlistOfModules()[i].getmoduleName() + " ");
        }
        System.out.print("\n\n");

    }
}