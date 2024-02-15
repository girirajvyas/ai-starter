package io.github.girirajvyas.ai.model;

import org.apache.commons.lang3.StringUtils;

public enum OperationtsEnum {
    SUMMARIZE("Summarize the following text:"),
    SENTIMENT("Provide sentiment of the above attach text:");

    private String query;

    private String getQuery() {
        return query;
    }

    OperationtsEnum(String s) {
        this.query = s;
    }

    public static String getSearchText(String name) {
        String searchingParameter = null;
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (OperationtsEnum serachEnum : values()) {
            if (serachEnum.name().equalsIgnoreCase(name)) {
                searchingParameter = serachEnum.getQuery();
            }
        }
        return searchingParameter;
    }
}


