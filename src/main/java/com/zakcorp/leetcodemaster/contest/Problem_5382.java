package com.zakcorp.leetcodemaster.contest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem_5382 {
    public String entityParser(String text) {
        String temp = text.replace("&quot;", "\"");
        temp = temp.replace("&apos;", "'");
        temp = temp.replace("&amp;", "&");
        temp = temp.replace("&gt;", ">");
        temp = temp.replace("&lt;", "<");
        temp = temp.replace("&frasl;", "/");
        return temp;
    }
}
