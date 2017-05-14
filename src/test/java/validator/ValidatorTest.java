package validator;

import model.Laboratory;
import model.Student;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Moni on 3/28/2017.
 */
public class ValidatorTest {

    Validator validator;

    @org.junit.Before
    public void setUp() throws Exception {
        validator= new Validator();
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @Test
    public void testValidateStudent() throws Exception {
        Student student1= new Student("abcd1234", "Balas","Gabriel", 123);
        Student student2= new Student("1234", "Balas","Gabriel", 123);
        Student student3= new Student("abcd1234", "","Gabriel", 123);
        Student student4= new Student("abcd1234", "Balas","Gabriel123", 123);
        Student student5= new Student("abcd1234", "Balas","Gabriel", -1);
        Student student6= new Student("abcd", "Balas","Gabriel123", 123);
        Student student7= new Student("abcd1234", "Balas","", 123);
        Student student8= new Student("abcd1234", "Ba456las","Gabriel", 123);
        Student student9= new Student("abcd1234", "Balas","Gabriel Ioan", 123);
        Student student10= new Student("1234abcd", "Balas","Gabriel", 123);


        assertEquals(validator.validateStudent(student1),true);
        assertEquals(validator.validateStudent(student2),false);
        assertEquals(validator.validateStudent(student3),false);
        assertEquals(validator.validateStudent(student4),false);
        assertEquals(validator.validateStudent(student5),false);
        assertEquals(validator.validateStudent(student6),false);
        assertEquals(validator.validateStudent(student7),false);
        assertEquals(validator.validateStudent(student8),false);
        assertEquals(validator.validateStudent(student9),false);
        assertEquals(validator.validateStudent(student10),false);



    }

    @Test
    public void testValidateLaboratory() throws Exception {
        Laboratory lab1= new Laboratory(2,"22/09/2017",5, (float) 10,"abcd1234");
        //Laboratory lab2= new Laboratory(2,"22.09.2017",5, (float) 10,"1234abcd");
        Laboratory lab3= new Laboratory(2,"22/09/2017",5, (float) 12, "1234abcd");
        Laboratory lab4= new Laboratory(-1,"22/09/2017",5, (float) 12, "1234abcd");
        Laboratory lab5= new Laboratory(2,"22/09/2017",500, (float) 12, "1234abcd");
        Laboratory lab6= new Laboratory(2,"22/09/2017",-5, (float) 12, "1234abcd");

        assertEquals(validator.validateLaboratory(lab1), true);
        //assertEquals(validator.validateLaboratory(lab2), false);
        //assertEquals(validator.validateLaboratory(lab3), false);
        assertEquals(validator.validateLaboratory(lab4), false);
        assertEquals(validator.validateLaboratory(lab5), false);
        assertEquals(validator.validateLaboratory(lab6), false);
    }

    @Test
    public void testValidateGrade() throws Exception {
        Laboratory lab1= new Laboratory(2,"22/09/2017",5, (float) 10,"abcd1234");
        Laboratory lab2= new Laboratory(2,"22/09/2017",5, (float) 0,"abcd1234");
        Laboratory lab3= new Laboratory(2,"22/09/2017",5, (float) -10,"abcd1234");
        Laboratory lab4= new Laboratory(2,"22/09/2017",5, (float) 15,"abcd1234");

        assertEquals(validator.validateGrade(lab1.getGrade()),true);
        assertEquals(validator.validateGrade(lab2.getGrade()),false);
        assertEquals(validator.validateGrade(lab3.getGrade()),false);
        assertEquals(validator.validateGrade(lab4.getGrade()),false);
    }
}