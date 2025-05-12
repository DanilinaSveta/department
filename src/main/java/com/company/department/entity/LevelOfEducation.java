package com.company.department.entity;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;


public enum LevelOfEducation implements EnumClass<String> {

    ;

    private final String id;

    LevelOfEducation(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static LevelOfEducation fromId(String id) {
        for (LevelOfEducation at : LevelOfEducation.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}