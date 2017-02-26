package ru.reeson2003.html_parse.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import ru.reeson2003.html_parse.entity.MonsterEntity;

/**
 * Created by reeson on 26.02.17.
 */
public class HtmlParser {
    public MonsterEntity getMonster(int number) {
        Document doc = null;
        MonsterEntity result = new MonsterEntity();
        try {
            doc = Jsoup.connect("https://ru.l2db.info/high-five/npcs/" + number).get();
        Elements header = doc.getElementsByClass("page-header");
        Elements tables = doc.getElementsByClass("table table-middle table-hover table-condensed table-bordered");
        String name = name(header);
        String info = tables.get(0).text();
        String combat = tables.get(1).text();
        String basic = tables.get(2).text();
        String elements = tables.get(3).text();
        MonsterEntity monster = MonsterParser.parse(name, info, combat, basic, elements);
        return monster;
        } catch (Exception e) {
            result.setID(number);
            result.setName("ERROR");
        }
        throw new IllegalArgumentException();
    }

    private String name(Elements header) {
        String name = header.text();
        name = name.replace(" High Five", "");
        return name.replace("НПЦ - ", "");
    }
}
