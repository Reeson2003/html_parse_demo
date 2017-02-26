package ru.reeson2003.html_parse.parser;

import ru.reeson2003.html_parse.entity.MonsterEntity;

import java.util.Scanner;

/**
 * Created by reeson on 26.02.17.
 */
class MonsterParser {
    public static MonsterEntity parse(String name, String info, String combat, String basic, String elements) {
        MonsterEntity result = new MonsterEntity();
        result.setName(name);
        setInfo(result, info);
        setCombat(result, combat);
        setBasic(result, basic);
        setElements(result, elements);
        return result;
    }

    private static void setInfo(MonsterEntity monster, String info) {
        Scanner scanner = new Scanner(info);
        scanner.skip("NPC Info Type:");
        scanner.next();
        scanner.next();
        monster.setID(scanner.nextInt());
        scanner.next();
        monster.setLevel(scanner.nextInt());
        scanner.next();
        monster.setRace(scanner.next());
        scanner.next();
        monster.setGender(scanner.next());
        scanner.next();
        scanner.next();
        monster.setCollisionRadius(Double.parseDouble(scanner.next()));
        scanner.next();
        scanner.next();
        monster.setCollisionHeight(Double.parseDouble(scanner.next()));
        scanner.next();
        monster.setHp(scanner.nextInt());
        scanner.next();
        monster.setMp(scanner.nextInt());
        scanner.next();
        scanner.next();
        monster.setHpRegen(Double.parseDouble(scanner.next()));
        scanner.next();
        scanner.next();
        monster.setMpRegen(Double.parseDouble(scanner.next()));
        scanner.next();
        monster.setExp(scanner.nextInt());
        scanner.next();
        monster.setSp(scanner.nextInt());
    }

    private static void setCombat(MonsterEntity monster, String combat) {
        Scanner scanner = new Scanner(combat);
        scanner.next();
        scanner.next();
        scanner.next();
        monster.setPhysicalAttack(scanner.nextInt());
        scanner.next();
        scanner.next();
        monster.setMagicalAttack(scanner.nextInt());
        scanner.next();
        scanner.next();
        monster.setPhysicalDefence(scanner.nextInt());
        scanner.next();
        scanner.next();
        monster.setMagicalDefence(scanner.nextInt());
        scanner.next();
        monster.setCritical(scanner.nextInt());
        scanner.next();
        scanner.next();
        scanner.next();
        scanner.next();
        monster.setSpeedWalk(scanner.nextInt());
        scanner.next();
        monster.setSpeedRun(scanner.nextInt());
        scanner.next();
        scanner.next();
        monster.setAttackSpeed(scanner.nextInt());
        scanner.next();
        scanner.next();
        monster.setCastSpeed(scanner.nextInt());
        scanner.next();
        scanner.next();
        monster.setAttackType(scanner.next());
        scanner.next();
        scanner.next();
        monster.setAttackRange(scanner.nextInt());
    }

    private static void setBasic(MonsterEntity monster, String basic) {
        Scanner scanner = new Scanner(basic);
        scanner.next();
        scanner.next();
        scanner.next();
        monster.setSTR(scanner.nextInt());
        scanner.next();
        monster.setDEX(scanner.nextInt());
        scanner.next();
        monster.setCON(scanner.nextInt());
        scanner.next();
        monster.setINT(scanner.nextInt());
        scanner.next();
        monster.setWIT(scanner.nextInt());
        scanner.next();
        monster.setMEN(scanner.nextInt());
    }

    private static void setElements(MonsterEntity monster, String elements) {
        Scanner scanner = new Scanner(elements);
        scanner.next();
        scanner.next();
        scanner.next();
        monster.setElementsAttackType(scanner.next());
        scanner.next();
        try {
            int power = Integer.parseInt(scanner.next());
            monster.setElementsAttackPower(power);
        } catch (NumberFormatException e) {
            monster.setElementsAttackPower(0);
        }
        scanner.next();
        scanner.next();
        monster.setDefenceFire(scanner.nextInt());
        scanner.next();
        scanner.next();
        monster.setDefenceWater(scanner.nextInt());
        scanner.next();
        scanner.next();
        monster.setDefenceWind(scanner.nextInt());
        scanner.next();
        scanner.next();
        monster.setDefenceEarth(scanner.nextInt());
        scanner.next();
        scanner.next();
        monster.setDefenceHoly(scanner.nextInt());
        scanner.next();
        scanner.next();
        monster.setDefenceDark(scanner.nextInt());
    }
}
