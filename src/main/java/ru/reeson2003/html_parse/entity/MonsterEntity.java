package ru.reeson2003.html_parse.entity;

/**
 * Created by reeson on 26.02.17.
 */
public class MonsterEntity {
    //    INFO
    private String name;
    private int ID;
    private int level;
    private String race;
    private String gender;
    private double collisionRadius;
    private double collisionHeight;
    private int hp;
    private int mp;
    private double hpRegen;
    private double mpRegen;
    private int exp;
    private int sp;
    //    COMBAT
    private int physicalAttack;
    private int magicalAttack;
    private int physicalDefence;
    private int magicalDefence;
    private int critical;
    private int speedWalk;
    private int speedRun;
    private int attackSpeed;
    private int castSpeed;
    private String attackType;
    private int attackRange;
    //    BASIC
    private int STR;
    private int DEX;
    private int CON;
    private int INT;
    private int WIT;
    private int MEN;
    //    ELEMENTS
    private String elementsAttackType;
    private int elementsAttackPower;
    private int defenceFire;
    private int defenceWater;
    private int defenceWind;
    private int defenceEarth;
    private int defenceHoly;
    private int defenceDark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getCollisionRadius() {
        return collisionRadius;
    }

    public void setCollisionRadius(double collisionRadius) {
        this.collisionRadius = collisionRadius;
    }

    public double getCollisionHeight() {
        return collisionHeight;
    }

    public void setCollisionHeight(double collisionHeight) {
        this.collisionHeight = collisionHeight;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public double getHpRegen() {
        return hpRegen;
    }

    public void setHpRegen(double hpRegen) {
        this.hpRegen = hpRegen;
    }

    public double getMpRegen() {
        return mpRegen;
    }

    public void setMpRegen(double mpRegen) {
        this.mpRegen = mpRegen;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getSp() {
        return sp;
    }

    public void setSp(int sp) {
        this.sp = sp;
    }

    public int getPhysicalAttack() {
        return physicalAttack;
    }

    public void setPhysicalAttack(int physicalAttack) {
        this.physicalAttack = physicalAttack;
    }

    public int getMagicalAttack() {
        return magicalAttack;
    }

    public void setMagicalAttack(int magicalAttack) {
        this.magicalAttack = magicalAttack;
    }

    public int getPhysicalDefence() {
        return physicalDefence;
    }

    public void setPhysicalDefence(int physicalDefence) {
        this.physicalDefence = physicalDefence;
    }

    public int getMagicalDefence() {
        return magicalDefence;
    }

    public void setMagicalDefence(int magicalDefence) {
        this.magicalDefence = magicalDefence;
    }

    public int getCritical() {
        return critical;
    }

    public void setCritical(int critical) {
        this.critical = critical;
    }

    public int getSpeedWalk() {
        return speedWalk;
    }

    public void setSpeedWalk(int speedWalk) {
        this.speedWalk = speedWalk;
    }

    public int getSpeedRun() {
        return speedRun;
    }

    public void setSpeedRun(int speedRun) {
        this.speedRun = speedRun;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public int getCastSpeed() {
        return castSpeed;
    }

    public void setCastSpeed(int castSpeed) {
        this.castSpeed = castSpeed;
    }

    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    public int getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }

    public int getSTR() {
        return STR;
    }

    public void setSTR(int STR) {
        this.STR = STR;
    }

    public int getDEX() {
        return DEX;
    }

    public void setDEX(int DEX) {
        this.DEX = DEX;
    }

    public int getCON() {
        return CON;
    }

    public void setCON(int CON) {
        this.CON = CON;
    }

    public int getINT() {
        return INT;
    }

    public void setINT(int INT) {
        this.INT = INT;
    }

    public int getWIT() {
        return WIT;
    }

    public void setWIT(int WIT) {
        this.WIT = WIT;
    }

    public int getMEN() {
        return MEN;
    }

    public void setMEN(int MEN) {
        this.MEN = MEN;
    }

    public String getElementsAttackType() {
        return elementsAttackType;
    }

    public void setElementsAttackType(String elementsAttackType) {
        this.elementsAttackType = elementsAttackType;
    }

    public int getElementsAttackPower() {
        return elementsAttackPower;
    }

    public void setElementsAttackPower(int elementsAttackPower) {
        this.elementsAttackPower = elementsAttackPower;
    }

    public int getDefenceFire() {
        return defenceFire;
    }

    public void setDefenceFire(int defenceFire) {
        this.defenceFire = defenceFire;
    }

    public int getDefenceWater() {
        return defenceWater;
    }

    public void setDefenceWater(int defenceWater) {
        this.defenceWater = defenceWater;
    }

    public int getDefenceWind() {
        return defenceWind;
    }

    public void setDefenceWind(int defenceWind) {
        this.defenceWind = defenceWind;
    }

    public int getDefenceEarth() {
        return defenceEarth;
    }

    public void setDefenceEarth(int defenceEarth) {
        this.defenceEarth = defenceEarth;
    }

    public int getDefenceHoly() {
        return defenceHoly;
    }

    public void setDefenceHoly(int defenceHoly) {
        this.defenceHoly = defenceHoly;
    }

    public int getDefenceDark() {
        return defenceDark;
    }

    public void setDefenceDark(int defenceDark) {
        this.defenceDark = defenceDark;
    }

    @Override
    public String toString() {
        return "MonsterEntity{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", level=" + level +
                ", race='" + race + '\'' +
                ", gender='" + gender + '\'' +
                ", collisionRadius=" + collisionRadius +
                ", collisionHeight=" + collisionHeight +
                ", hp=" + hp +
                ", mp=" + mp +
                ", hpRegen=" + hpRegen +
                ", mpRegen=" + mpRegen +
                ", exp=" + exp +
                ", sp=" + sp +
                ", physicalAttack=" + physicalAttack +
                ", magicalAttack=" + magicalAttack +
                ", physicalDefence=" + physicalDefence +
                ", magicalDefence=" + magicalDefence +
                ", critical=" + critical +
                ", speedWalk=" + speedWalk +
                ", speedRun=" + speedRun +
                ", attackSpeed=" + attackSpeed +
                ", castSpeed=" + castSpeed +
                ", attackType='" + attackType + '\'' +
                ", attackRange=" + attackRange +
                ", STR=" + STR +
                ", DEX=" + DEX +
                ", CON=" + CON +
                ", INT=" + INT +
                ", WIT=" + WIT +
                ", MEN=" + MEN +
                ", elementsAttackType='" + elementsAttackType + '\'' +
                ", elementsAttackPower=" + elementsAttackPower +
                ", defenceFire=" + defenceFire +
                ", defenceWater=" + defenceWater +
                ", defenceWind=" + defenceWind +
                ", defenceEarth=" + defenceEarth +
                ", defenceHoly=" + defenceHoly +
                ", defenceDark=" + defenceDark +
                '}';
    }
}
