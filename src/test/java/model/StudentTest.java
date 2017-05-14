package model;

/**
 * Created by Moni on 3/15/2017.
 */

import static org.junit.Assert.assertEquals;
public class StudentTest {

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void testGetRegNumber() throws Exception {
        Student stud1= new Student("fghs5679", "Pop", "Gigel", 342);
        Student stud2= new Student("abcd1234", "Pop", "Viorica", 212);
        assertEquals("fghs5679", stud1.getRegNumber());
        assertEquals("abcd1234", stud2.getRegNumber());
    }

    @org.junit.Test
    public void testSetRegNumber() throws Exception {
        Student stud1= new Student("fghs5679", "Pop", "Gigel", 342);
        stud1.setRegNumber("wers1234");
        assertEquals("wers1234", stud1.getRegNumber());
    }

    @org.junit.Test
    public void testGetName() throws Exception {
        Student stud1= new Student("fghs5679", "Pop", "Gigel", 342);
        Student stud2= new Student("abcd1234", "Ionescu", "Viorica", 212);
        assertEquals("Pop", stud1.getName());
        assertEquals("Ionescu", stud2.getName());
    }

    @org.junit.Test
    public void testSetName() throws Exception {
        Student stud1= new Student("fghs5679", "Pop", "Gigel", 342);
        stud1.setName("Popescu");
        assertEquals("Popescu", stud1.getName());
    }

    @org.junit.Test
    public void testGetGroup() throws Exception {
        Student stud1= new Student("fghs5679", "Pop", "Gigel", 342);
        Student stud2= new Student("abcd1234", "Ionescu", "Viorica", 212);
        assertEquals(342, stud1.getGroup());
        assertEquals(212, stud2.getGroup());

    }

    @org.junit.Test
    public void testSetGroup() throws Exception {
        Student stud1= new Student("fghs5679", "Pop", "Gigel", 342);
        stud1.setGroup(18);
        assertEquals(18, stud1.getGroup());
    }


}