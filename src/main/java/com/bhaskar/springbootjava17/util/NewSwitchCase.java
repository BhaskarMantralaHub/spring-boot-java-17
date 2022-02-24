package com.bhaskar.springbootjava17.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author venkata.mantrala
 */
public class NewSwitchCase {

    public static void main(String[] args) {

        System.out.println(getRelation("Hey"));

    }

    static String getRelation(String relation) {
        return switch (Relation.valueOfRelation(relation)) {
            case SON -> Relation.SON.name();
            case SPOUSE -> Relation.SPOUSE.name();
            default -> "Other relation";
        };
    }

    enum Relation {
        SPOUSE,
        SON,
        DAUGHTER,
        FATHER,
        SISTER,
        BROTHER,
        MOTHER,
        OTHER;

        private static Map<String, Relation> relationMap = new HashMap<>();

        static  {
            for (Relation relation : Relation.values()) {
                relationMap.put(relation.name(), relation);
            }
        }

        static Relation valueOfRelation(String value) {
            return relationMap.getOrDefault(value, Relation.OTHER);
        }
    }
}
