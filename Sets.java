package com.company;
import java.util.*;
/** operation on sets implementation */
public class Sets {
    /**
     * @param a set of T
     * @param b set of T
     * @return a U b
     */
    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<T>(a);
        result.addAll(b);
        return result;
    }


    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<T>(a);
        result.retainAll(b);
        return result;
    }

    public static <T> Set<T> difference(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<T>(a);
        result.removeAll(b);
        return  result;
    }
    /**
     * @param a set of T
     * @param b set of T
     * @return (a\b) U (b\a)
     */
    public static <T> Set<T> symmetricDifference(Set<T> a, Set<T> b) {
        Set<T> result1 = new HashSet<T>(a);
        result1.removeAll(b);
        Set<T> result2 = new HashSet<T>(b);
        result2.removeAll(a);
        Set<T> result = new HashSet<T>(result1);
        result.addAll(result2);
        return result;
    }

}
