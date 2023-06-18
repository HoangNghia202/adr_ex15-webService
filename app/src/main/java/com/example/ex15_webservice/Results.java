package com.example.ex15_webservice;

import com.google.gson.annotations.SerializedName;

import kotlin.jvm.internal.SerializedIr;

public class Results {
@SerializedName("name")
    private String superName;

    public Results(String superName) {
        this.superName = superName;
    }

    public String getSuperName() {
        return superName;
    }

    public void setSuperName(String superName) {
        this.superName = superName;
    }
}
