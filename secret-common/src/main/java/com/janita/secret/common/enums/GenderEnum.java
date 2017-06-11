package com.janita.secret.common.enums;

/**
 * Created by Janita on 2017/6/11- 15:52
 * 该类是:
 */
public enum  GenderEnum {
    MALE("男", 1),

    FEMALE("女", 0);

    private String genderName;

    private int genderCode;

    private GenderEnum(String genderName, int genderCode) {
        this.genderName = genderName;
        this.genderCode = genderCode;
    }

    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }

    public int getGenderCode() {
        return genderCode;
    }

    public void setGenderCode(int genderCode) {
        this.genderCode = genderCode;
    }
}
