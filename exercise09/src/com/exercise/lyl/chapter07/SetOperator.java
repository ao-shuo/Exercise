package com.exercise.lyl.chapter07;

import java.util.HashSet;

public class SetOperator {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<>();
        hash.add("a");
        hash.add("b");
        hash.add("c");
        hash.add("d");
        hash.add("e");
        hash.add("f");
        hash.add("g");

        HashSet<String> hash01 = new HashSet<>();
        hash01.add("1");
        hash01.add("2");
        hash01.add("c");

        HashSet<String> hashclone01 = (HashSet<String>) hash.clone();
        HashSet<String> hashclone02 = (HashSet<String>) hash.clone();
        HashSet<String> hashclone03 = (HashSet<String>) hash.clone();

        hashclone01.addAll(hash01);
        hashclone02.retainAll(hash01);
        hashclone03.removeAll(hash01);

        System.out.println(hashclone01.toString());
        System.out.println(hashclone02.toString());
        System.out.println(hashclone03.toString());
        System.out.println(hash.size());
    }
}
