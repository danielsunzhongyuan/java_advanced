package com.zsun.java.corejava9.enums;

/**
 * @author : zsun
 * @date : 2019/11/12 10:28
 */
public enum StandardType {
    /**
     * 部标、企标、全部
     */
    ALL("all", "全部"), MINISTRY("ministry", "部标"), ENTERPRISE("enterprise", "企标");

    private String label;
    private String value;

    private StandardType(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return label + "(" + value + ")";
    }


}
