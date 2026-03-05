package jp.exercise.java;

public class Main {
    public static void main(String[] args) {
        LongPlaying record = new LongPlaying("My First Album", "ks");
        System.out.println(record);

        LongPlaying record2 = new LongPlaying("My First Album", "ks");
        System.out.println("record == record2: " + (record == record2) );
        System.out.println("record.equals(record2): " + (record.equals(record2)) );

        CompactDisc cd1 = new CompactDisc(12);
        CompactDisc cd2 = new CompactDisc(12);
        System.out.println("cd1 == cd2: " + (cd1 == cd2) );
        System.out.println("cd1.equals(cd2): " + (cd1.equals(cd2)) );
    }
}
