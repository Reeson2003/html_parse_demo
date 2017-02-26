package ru.reeson2003.html_parse.main;

import ru.reeson2003.html_parse.parser.HtmlParser;

import java.io.*;

/**
 * Created by reeson on 26.02.17.
 */
public class MainProgramm {
    private static int INDEX_FROM = 20000;
    private static int INDEX_TO = 20100;
    public static void main(String[] args) {
        HtmlParser parser = new HtmlParser();
        Writer writer = null;
        try {
            writer = new FileWriter("monsters.txt");
        } catch (IOException e) {
            System.err.println("File read error");
        }
        for (int i = INDEX_FROM; i < INDEX_TO; i++) {
            try {
                String monster = parser.getMonster(i).toString();
                writer.write(monster);
                writer.write("\n");
            } catch (IllegalArgumentException e) {
                System.err.println("MonsterEntity parse error " + i);
            } catch (IOException e) {
                System.err.println("Can't write monster into file");
            }
        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
