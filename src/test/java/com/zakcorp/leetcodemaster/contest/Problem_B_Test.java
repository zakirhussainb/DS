package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_B_Test {
    Problem_B.Solver p = new Problem_B.Solver();
    @Test
    public void test1() {
        assertEquals("Alice", p.solve1(new String[]{"Hello userTwooo","Hi userThree","Wonderful day Alice","Nice day userThree"},
                new String[]{"Alice","userTwo","userThree","Alice"}));
    }
    @Test
    public void test2() {
        assertEquals("Charlie", p.solve1(new String[]{"How is leetcode for everyone","Leetcode is useful for practice"},
                new String[]{"Bob","Charlie"}));
    }
    @Test
    public void test3() {
        assertEquals("o", p.solve1(new String[]{"p mmV","Lb WE u H x f YT","Rey","q","Y R","Ng","mP lo oA l jd y","CP y r N wHA","Bt l","Y S xv MNS","WG vz","S pl l Dz fX D TpI","zGq","z S D"},
                new String[]{"QMnVn","QMnVn","nkq","o","EEM","QMnVn","o","nkq","Gd","Gd","nkq","o","EEM","EEM"}));
    }
    @Test
    public void test4() {
        assertEquals("FnZd", p.solve1(new String[]{"tP x M VC h lmD","D X XF w V","sh m Pgl","pN pa","C SL m G Pn v","K z UL B W ee","Yf yo n V U Za f np","j J sk f qr e v t","L Q cJ c J Z jp E","Be a aO","nI c Gb k Y C QS N","Yi Bts","gp No g s VR","py A S sNf","ZS H Bi De dj dsh","ep MA KI Q Ou"},
                new String[]{"OXlq","IFGaW","XQPeWJRszU","Gb","HArIr","Gb","FnZd","FnZd","HArIr","OXlq","IFGaW","XQPeWJRszU","EMoUs","Gb","EMoUs","EMoUs"}));
    }
    @Test
    public void test5() {
        assertEquals("a", p.solve1(new String[]{"a"},
                new String[]{"a"}));
    }
    @Test
    public void test6() {
        assertEquals("zADZhwSwFj", p.solve1(new String[]{"l","E","e","L","U","B","H","H","l","I","E","c","s","t","s","u","r","F","Q","v","K","x","M","r","o","k","o","E","x","f"},
                new String[]{"TYproPIptp","ZinKBnptgb","MabHvYDOvr","KJsXlcnoLX","IMjvhaCNQU","qWTfyhzuge","CBCPpuHdKb","HpDxmDTUwp","SgOTFxFYpl","PctQGYkMuz","KqAEViZnnc","DVTKOJLZPc","InJQqHsICO",
                        "bNhncDzkLu","IvbKSkMTWM","nOjJjZjQTa","ekqBBwyCYb","zADZhwSwFj","LswFXzVDyF","bhIcpZBHWb","mesrFSlmqJ","OZZKylOPUj","OVDIlCRBro","IIhwLrjgHo","HrXZYYiXnT","pmHsmhKLoB","ppIkHHnBqQ",
                        "gNGHfhhxEL","VSZuisvhuQ","qaPorTEGcL"}));
    }
}
