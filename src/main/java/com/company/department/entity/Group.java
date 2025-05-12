package com.company.department.entity;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;


public enum Group implements EnumClass<String> {

    ;

    private final String id;

    Group(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Group fromId(String id) {
        for (Group at : Group.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}