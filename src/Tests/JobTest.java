package Tests;

import org.junit.Before;
import org.junit.Test;


import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.PositionType;
import org.launchcode.techjobs_oo.CoreCompetency;

import static org.junit.Assert.*;


public class JobTest {
    //TODO: add emptyTest so we can configure our runtime environment
    Job testJob1;
    Job testJob2;


    // Create new test objects before each test
    @Before
    public void createNewTestObject() {
         testJob1 = new Job();
         testJob2 = new Job();
    }
    // Each Job object should contain a unique ID number, and these should also be sequential integers.
    @Test
    public void testSettingJobId() {
        assertTrue(testJob1.getId() != testJob2.getId() && testJob2.getId()-testJob1.getId() == 1);
    }
    // Each Job object should contain six fields—id, name, employer, location, positionType, and coreCompetency. The data types for these fields are int, String, Employer, Location, PositionType, and CoreCompetency, respectively.
    @Test
    public void testJobConstructorSetsAllFields() {
       testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(testJob1.getName(), "Product tester");
        assertTrue(testJob1 instanceof Job);
        assertTrue(testJob1.getEmployer().getValue()== "ACME");
        assertTrue(testJob1.getEmployer() instanceof Employer);
        assertTrue(testJob1.getLocation().getValue()== "Desert");
        assertTrue(testJob1.getLocation() instanceof Location);
        assertTrue(testJob1.getPositionType().getValue()== "Quality control");
        assertTrue(testJob1.getPositionType() instanceof PositionType);
        assertTrue(testJob1.getCoreCompetency() instanceof CoreCompetency);

    }
    //Test that the two objects are NOT equal if their id values differ, even if all the other fields are identical.
    @Test
    public void testJobsForEquality () {
        testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testJob1.equals(testJob2));
    }

    //Test that toString return a string that contains a blank line before and after the job information when passed a Job object
        @Test
    public void testToStringNewLines () {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob1.toString().startsWith("\n"));
        assertTrue(testJob1.toString().endsWith("\n"));
    }

    //Test that toString return a string that contains labels
    @Test
    public void testToStringLabels () {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob.toString().contains("ID:"));
        assertTrue(testJob.toString().contains("Name:"));
        assertTrue(testJob.toString().contains("Employer:"));
        assertTrue(testJob.toString().contains("Location:"));
        assertTrue(testJob.toString().contains("Position Type:"));
        assertTrue(testJob.toString().contains("Core Competency:"));
    }


    //Test that toString return a string that contains "Data not available" if values are ""
    @Test
    public void testToStringEmptyValues () {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        if (testJob.getName() ==""){
            assertTrue(testJob.toString().contains("Data not available"));}
        if (testJob.getEmployer().getValue() ==""){
            assertTrue(testJob.toString().contains("Data not available"));}
        if (testJob.getLocation().getValue() ==""){
            assertTrue(testJob.toString().contains("Data not available"));}
        if (testJob.getPositionType().getValue() ==""){
            assertTrue(testJob.toString().contains("Data not available"));}
        if (testJob.getCoreCompetency().getValue() ==""){
            assertTrue(testJob.toString().contains("Data not available"));}
    }
}