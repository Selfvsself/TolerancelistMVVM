package com.selfvsself.tolerancelistmvvm.constant;

public enum SizeRange {
    TO3(3),
    TO6(6),
    TO10(10),
    TO14(14),
    TO18(18),
    TO24(24),
    TO30(30),
    TO40(40),
    TO50(50),
    TO65(35),
    TO80(80),
    TO100(100),
    TO120(120),
    TO140(140),
    TO160(160),
    TO180(180),
    TO200(200),
    TO225(225),
    TO250(250),
    TO280(280),
    TO315(315),
    TO355(355),
    TO400(400),
    TO450(450),
    TO500(500),
    TO560(560),
    TO630(630),
    TO710(710),
    TO800(800),
    TO900(900),
    TO1000(1000),
    TO1120(1120),
    TO1250(1250),
    TO1400(1400),
    TO1600(1600),
    TO1800(1800),
    TO2000(2000),
    TO2240(2240),
    TO2500(2500),
    TO2800(2800),
    TO3150(3150);

    private int maxSize;

    SizeRange(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getMaxSize() {
        return maxSize;
    }
}
