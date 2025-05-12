package com.company.department.entity;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;


public enum Directed implements EnumClass<String> {

    ;

    private final String id;

    Directed(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Directed fromId(String id) {
        for (Directed at : Directed.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}