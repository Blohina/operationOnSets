package com.company;
import java.util.*;
import static com.company.Sets.*;
import static com.company.Colors.*;

public class Main {

    public static void main(String[] args) {
	 Set<Colors> set1 = EnumSet.range(YELLOW, BROWN);
	 Set<Colors> set2 = EnumSet.range(BLACK, ORANGE);
        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        System.out.println("difference: " + difference(set1,set2));
        System.out.println("union: " + union(set1,set2));
        System.out.println("intersection: " + intersection(set1,set2));
        System.out.println("symmetricDifference: " + symmetricDifference(set1,set2));

    }
}
