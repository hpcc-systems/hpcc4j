package org.hpccsystems.commons.errors;

/**
 * The severity of an error.
 * <p>This is used to define "did anything go wrong or can I keep going..."</p>
 */
public enum HpccErrorLevel {
    FATAL,
    ERROR,
    WARNING,
    INFO;
    
    public static HpccErrorLevel getErrorLevel(String eclenum) {
        if (eclenum==null) {
            return null;
        } else if ("1".equals(eclenum) || "2".equals(eclenum)) {
            return HpccErrorLevel.WARNING;
        } else if ("3".equals(eclenum) || "4".equals(eclenum)) {
            return HpccErrorLevel.ERROR;
        } else if ("5".equals(eclenum)) {
            return HpccErrorLevel.FATAL;
        } else if ("6".equals(eclenum)) {
            return HpccErrorLevel.INFO;
        } else {
            return null;
        }
    }
}
