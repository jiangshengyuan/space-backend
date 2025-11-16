package com.explore.space.infrastructure.enums;

public enum DictCodeEnum {
    USER_ROLE_ADMIN("0001","0000","admin用户"),
    USER_ROLE_NORMAL("0001","0001","普通用户");

    private String category;
    private String key;
    private String value;

    DictCodeEnum(String category, String key, String value) {
        this.category = category;
        this.key = key;
        this.value = value;
    }
    public String getVCategory() {
        return this.category;
    }
    public String getKey() {
        return this.key;
    }
    public String getValue() {
        return this.value;
    }
}
