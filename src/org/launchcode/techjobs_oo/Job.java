package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    public int getId() {
        return id;
    }

    public int id;
    private static int nextId = 1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public String name;
    public Employer employer;
    public Location location;
    public PositionType positionType;
    public CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


@Override
public String toString() {
    String jobId = Integer.toString(this.id);
    String jobName = this.name;
    String jobEmployer = "Data not available";
    String jobLocation = "Data not available";
    String jobPosition = "Data not available";
    String jobCompetency = "Data not available";


    if (jobName == null) {
        jobName = "Data not available";
    }
    if (this.employer != null) {
        jobEmployer = this.employer.getValue();
    }
    if (this.location != null) {
        jobLocation = this.location.getValue();
    }
    if (this.positionType != null) {
        jobPosition = this.positionType.getValue();
    }
    if (this.coreCompetency != null) {
        jobCompetency = this.coreCompetency.getValue();
    }

    return "\n" +
            "ID: " + jobId + "\n" +
            "Name: " + jobName + "\n" +
            "Employer: " + jobEmployer + "\n" +
            "Location: " + jobLocation + "\n" +
            "Position Type: " + jobPosition + "\n" +
            "Core Competency: " + jobCompetency + "\n";
}
}