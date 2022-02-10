package Tests;

import org.junit.Before;
import org.junit.Test;

import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.PositionType;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.Main;

import static org.junit.Assert.*;


public class JobTest {
    //TODO: add emptyTest so we can configure our runtime environment
    Job testJob1;
    Job testJob2;

    @Before
    public void createNewTestObject() {
         testJob1 = new Job();
         testJob2 = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertTrue(testJob1.getId() != testJob2.getId() && testJob2.getId()-testJob1.getId() == 1);
    }
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

    @Test
    public void testJobsForEquality () {
        testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }
}