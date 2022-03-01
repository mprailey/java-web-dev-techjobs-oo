package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

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

    public String toString() {
        String printName;
        String printEmployer;
        String printLocation;
        String printPositionType;
        String printCoreCompetency;
        if (name == "" ) {printName= "Data not available";} else {printName=name;}
        if (employer.getValue()==""){printEmployer="Data not available";}else{printEmployer=employer.getValue();}
        if (location.getValue()==""){printLocation="Data not available";}else{printLocation=location.getValue();}
        if (positionType.getValue()==""){printPositionType="Data not available";}else{printPositionType=positionType.getValue();}
        if (coreCompetency.getValue()==""){printCoreCompetency="Data not available";}else{printCoreCompetency=coreCompetency.getValue();}
        return  "\nID: " + id + "\nName: " + printName +"\nEmployer: " + printEmployer + "\nLocation: " + printLocation +"\nPosition Type: " + printPositionType + "\nCore Competency: " + printCoreCompetency +"\n";
    }
    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
