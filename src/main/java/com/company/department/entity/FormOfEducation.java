package com.company.department.entity;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;


public enum FormOfEducation implements EnumClass<String> {

    ;

    private final String id;

    FormOfEducation(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static FormOfEducation fromId(String id) {
        for (FormOfEducation at : FormOfEducation.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}