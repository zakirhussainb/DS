package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_647_Test {
    Problem_647.Solver p = new Problem_647.Solver();
    Problem_647.Solver1 p1 = new Problem_647.Solver1();
    @Test
    public void test1() {
        assertEquals(1087, p.solve1("aecoepvucbaufmjpcehsmtilafkrgymqhhvxchqupoliakbbhwuqx" +
                "iredfwqzkvlgfjyiehcdqoggjxuzuskfrdmrrhkkawnhvmuizzvvsrcxjazitlonzirxqcyvcheiizfzzucatbi" +
                "akrxueizqlxtwvvoitlkoathsrrwxuqisaprbidkozfxaoywtwpwcreupxdfulvxcnkzaaikqrvfnngibqzcvkrutdmyveadm" +
                "uebbgbqnqtqszylfvbclxdsfrfjwrodjqnpsfnomxqlrlqjjgwvtfvacamtfqvlejxpipqiwunrlxurjsfnmbvbmxsbgkzkq" +
                "olvuexlinkqregkenrzugrfdessqbrkkjuglhgsgspjlaqwjxoeyvhfbijlhslmrztxrmpyxlomsrdtqywdqujfithvwncoc" +
                "lbghzezmkbruxzsqcejmufqdouohxurkksmlmfmaginfvhrwuizrskfzpkeacpevbxmzearknywiecxscmhhprbsywibgizkcsewil" +
                "ffzdfigtjiljobhpzufwjxmzzltxnrjpfvmphehaznhksncsjghadcbvgbribsoqtfhjztdwlvflwclqucobqghnoyysmksvfagjwk" +
                "pdcuuuhefaxsxytydqhhvzjrxrzhvpfngzfkbbuujendtnsgkivbnnqovonrxzgxgavnoqopcvnyrddaabaanvkftnnwmmglh" +
                "zqvqexkiocfhrwgkfwakqcjafgqlfdsflfnfmygwrumymjlpfoezlmpdpqhmbrxmdgmwaenrtitesiwfowokdmmolugbxci" +
                "eblcjpnxbykjesvjbbzupemkwvczmskdhpijcfnpncvkfikjdgfycizsggepwbzlsrflayeksmgsxsjlfdfgibvrqadkixvvpbk" +
                "qkjwrhbmuxnsqgynxpylkppmttotbazfyzamazsvtinuyvdppwjkgefhltkvhghbytarbcthcbvi"));
    }
    @Test
    public void test2() {
        assertEquals(3, p.solve1("abc"));
        assertEquals(3, p1.solve1("abc"));
    }
    @Test
    public void test3() {
        assertEquals(6, p.solve1("aaa"));
        assertEquals(6, p1.solve1("aaa"));
    }
}
