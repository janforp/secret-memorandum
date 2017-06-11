package com.janita.secret.common.enums;

/**
 * Created by Janita on 2017/6/11- 15:16
 * 该类是:
 */
public enum  DeleteOrNotEnum {

    DELETE("删除", 1),

    NOT_DELETE("未删除", 0);

    private String deleteOrNot;

    private int status;

    private DeleteOrNotEnum(String deleteOrNot, int status) {
        this.deleteOrNot = deleteOrNot;
        this.status = status;
    }

    public String getDeleteOrNot() {
        return deleteOrNot;
    }

    public void setDeleteOrNot(String deleteOrNot) {
        this.deleteOrNot = deleteOrNot;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
