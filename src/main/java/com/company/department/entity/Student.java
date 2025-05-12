package com.company.department.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.UUID;

@JmixEntity
@Table(name = "STUDENT", indexes = {
        @Index(name = "IDX_STUDENT_DEPARTMENT", columnList = "DEPARTMENT_ID")
})
@Entity
public class Student {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @JoinColumn(name = "DEPARTMENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Department department;

    @Column(name = "DIRECTED")
    private String directed;

    @Column(name = "GROUP_")
    private String group;

    @Column(name = "FORM_OF_EDUCATION")
    private String formOfEducation;

    @Column(name = "LEVEL_OF_EDUCATION")
    private String levelOfEducation;

    public Group getLevelOfEducation() {
        return levelOfEducation == null ? null : Group.fromId(levelOfEducation);
    }

    public void setLevelOfEducation(Group levelOfEducation) {
        this.levelOfEducation = levelOfEducation == null ? null : levelOfEducation.getId();
    }

    public FormOfEducation getFormOfEducation() {
        return formOfEducation == null ? null : FormOfEducation.fromId(formOfEducation);
    }

    public void setFormOfEducation(FormOfEducation formOfEducation) {
        this.formOfEducation = formOfEducation == null ? null : formOfEducation.getId();
    }

    public Group getGroup() {
        return group == null ? null : Group.fromId(group);
    }

    public void setGroup(Group group) {
        this.group = group == null ? null : group.getId();
    }

    public Directed getDirected() {
        return directed == null ? null : Directed.fromId(directed);
    }

    public void setDirected(Directed directed) {
        this.directed = directed == null ? null : directed.getId();
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}