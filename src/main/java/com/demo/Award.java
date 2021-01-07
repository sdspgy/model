package com.demo;

public class Award {

    /*奖品id*/
    private long awardId;
    /*奖品名称*/
    private String awardName;
    /*奖品数量*/
    private int awardNum;

    public Award() {
    }

    public Award(long awardId, String awardName, int awardNum) {
        this.awardId = awardId;
        this.awardName = awardName;
        this.awardNum = awardNum;
    }

    public long getAwardId() {
        return awardId;
    }

    public void setAwardId(long awardId) {
        this.awardId = awardId;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public int getAwardNum() {
        return awardNum;
    }

    public void setAwardNum(int awardNum) {
        this.awardNum = awardNum;
    }

    @Override
    public String toString() {
        return "Award{" +
                "awardId=" + awardId +
                ", awardName='" + awardName + '\'' +
                ", awardNum=" + awardNum +
                '}';
    }
}
