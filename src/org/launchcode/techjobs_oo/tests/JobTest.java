package org.launchcode.techjobs_oo.tests;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.launchcode.techjobs_oo.*;


public class JobTest {

Job test_job1;
Job test_job2;

    @Before
    public void createJobObjects() {
        test_job1 = new Job();
        test_job2 = new Job();
    }


 @Test
    public void testSettingJobId() {
        assertEquals(test_job1.id, (test_job2.id -1));
    }

@Test
    public void testJobConstructorSetsAllFields() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(test_job.name instanceof String);
    assertTrue(test_job.employer instanceof Employer);
    assertTrue(test_job.location instanceof Location);
    assertTrue(test_job.positionType instanceof PositionType);
    assertTrue(test_job.coreCompetency instanceof CoreCompetency);
}

@Test
    public void testJobsForEquality() {
    Job test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job test_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    assertFalse(test_job1.equals(test_job2));

}

    @Test
    public void testForBlankLine() {
        Job test_job = new Job();
        String testString = test_job.toString();
        assertEquals(testString.indexOf("\n"), 0);
        assertEquals(testString.lastIndexOf("\n") + 1, testString.length());
    }

    @Test
    public void testForField() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String testString = test_job.toString();
        assertEquals(testString, "\n" +
                "ID: 3" +
                "\nName: Product tester" +
                "\nEmployer: ACME" +
                "\nLocation: Desert" +
                "\nPosition Type: Quality control" +
                "\nCore Competency: Persistence" +
                "\n");
    }

@Test
public void testForEmptyField() {
    Job test_job = new Job();
    String testString = test_job.toString();
    assertTrue(testString.contains("Location: Data not available"));
}

}