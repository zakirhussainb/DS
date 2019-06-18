package com.zakcorp.gfg.md.course.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author : Zakir
 * Question: Longest Common Prefix in an Array
 * Result: Correct Answer
 * Execution Time: 0.87
 * TODO:
 *      Step 1: Check if array length is zero. If yes, return -1;
 *      Step 2: Check if array length is one. If yes, return arr[0];
 *      Step 3: Check if return value of longestCommonPrefix().isEmpty(). If yes, then return -1.
 *      Step 4: Sort the array -> Here the array is sorted in lexicographical order
 *      Step 5: Find the minimum length comparing length of first_element and last_element in the sorted array.
 *      Step 6: Initialize result = "";
 *      Iterate the array with the above minimum length
 *          Step 6.1: char ch1 = arr[0].length();
 *          Step 6.2: char ch2 = arr[arr.length()-1].length();
 *          Step 6.3: if(ch1 == ch2) then result = result + ch1; else break;
 *      Step 7: return result
 */
public class MDGFG_Str09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String[] arr = str.split("\\s+");
            if(arr.length == 0) {
                System.out.println("-1");
            } else if(arr.length == 1) {
                System.out.println(arr[0]);
            } else if(longestCommonPrefix(arr, n).isEmpty()){
                System.out.println("-1");
            } else {
                System.out.println(longestCommonPrefix(arr, n));
            }
        }
    }

    private static String longestCommonPrefix(String[] arr, int n) {
        String result = "";
        Arrays.sort(arr);
        int first_str_len = arr[0].length();
        int last_str_len = arr[arr.length-1].length();
        int min_len = Math.min(first_str_len, last_str_len);
        for(int i = 0; i < min_len; i++) {
            char ch1 = arr[0].charAt(i);
            char ch2 = arr[arr.length - 1].charAt(i);
            if(ch1 == ch2) {
                result = result + ch1;
            } else {
                break;
            }
        }
        return result;
    }





    /*This below method fails for the following edge case:-
    1
    49
    neykgrybpitzfunlefmtmbikgpxkqingmmsudqysarrilgtrnhka tmrklbbtojfadcftaxwtqegyxymeioodcfonirhxaozdsfyseulxysvxsjdazsgbzupilyfnmgqflqzsllplfmjzwobvghzibos mzbaftfrkhjxuaibmtakibiqjhamvsbjrcjxwrqgybfsbntpjtatwilfrmsmgtvyxextxpbvqgntwiihbkcyunflbzxku ksbjnyypuqxjjtstcvgevaubmxclhxgtpjcchatdsrpdmhzpefvafpdtpffyenstwuydxrjrkyvxhuonzjpgbsaqa oesgaodytcretccoblkrzjaosdjstjxkprsphvpazj tljjovufwfhkxltpeeoowfhnoedpemwzzhipeeuakdljogzvnpljxuwlzzcfnygogodkvxnhdyqrgpmtfycesb tcsaqsgeaxknsjazmapeghsaoseslfjgibhaupgu qhgajhojzsq lswdyoqexzobiovxwrknbspkaduzymhledqctjisiwtqmqpjkbylunxws vqdcdjhuoadwsntofheuqqwobsdzoysjoynujuoxwtuogpenwjhpbdfdxjelhyuxyjridhfzabqiquvp dehilmgw tdqodpxwzdegegiupapmpwpvdajpifhblarorrmquqw xgvohmayiswouffekphvpzlgsywoquonbjdkxgiiygwuldyysfthghpyfnmvibllmqvmw uwmsszvqxoytxgcnfhctekwrxlisxgarfolxngqnwqiwwkld nzzyvrvgbqfjqyoejmtqegouqkqaxwvlvvlsoibrygaqfrwofsgjaxdrhvrfrnsoidhylipmopevidknvswvpb zzggsvyhfdqdqyseojjksowflqeigfvfgdlzylidoyiewajml ydkwlvnpdvwaaffne amiokquisfwebvjntuiglobkodpusvzshkitafbvmzzowibqfmysaacqftmyoosxydqaitvutukpfmfmaeeagj nefntvgqtljttcppxlansoueoaloguiwypjtkrmdcvxxxonvzpksdeyrfjhndplefvxpojvrg qgidbjundxtcqanxqrpbxwwwnliieoeuuoaxyukduehkgvkwobylxwhkjpvngbkaqmyoiktcqbp wztkcrvzqelzwinc zcalcqvnjydkpcgqwqspnrfuefqnuuxvwzibpdoadtl wtksmcjzvrtaylpufopenxfecte orakllexnoyjfulffaznoordnwhprnvffysqjwnyklhrfuwnuvakltnyr oiklpplhfue tqhckpzgc eegpxtqqseacrptfzyzfuuvbzfsyowtsazjzvzpnfrrzhkeikfneakhbsczgyuazujarlseqjxpshvarbpxdaggsifahba xlkoycuporggaejtfyqkyzqshxsqyuawilkgphvdyemzivsptlzumpmvo mmbokjzxqrenuctgdbdy xlrtxihswoglqxvbwstnwjkbcsggw yvrqoqyvlxmtieqdfpwbcskovmhcsfitaajqsjndgzxodnulcqmhkwxgkgkflsy ujdnstsbuppyfjljbxsovqwhwgokaoxxxdkswetqwiqbub xaflxvhftptdqkbnhgzzcdsubdnezqryrwkottvmjrqbbtoizpkduezwjoakfrjypvoiomxzdpcekqolhyocd aogaznukljfbuvntxqizwuslfzjvdokdfqeedaoqjvufqhypaipwchhjgtekjppohtunvi hfzmyjnnjxchcjrl kqevhtkopebkphruigurviasmkwybiqnywifruvgzztqimm uhiprkkdugbxqtmqrxx rvrsukiczvuteclvpvaldejwxxmrumamhrebepfd zwqehlteleippgpnughgivnzcqfrvidxftboeutradhqjyfdgokokzpmqvfndikkdnzhj akvjcghjjpxvdhxvvpqacvipglchuozvywecconndkljsienxwqbtyqzmvgijhdjfknjaaxfkkoes urqkukknlwkuhtdkejwtsytrefb mvpiohsjrewfdgbkbeuhntait zxcbsoyjwnqqwkvupycqiduemkzmsthtsjukattygmpewkylkcbufxyrjafbtovlzryz tyufpybbymlap hpfayfhcyvzmvskwfdwzjlakoazzdqgmfmpgrwissjepbqngtkiexkrmmqnriueqgtwz gtlpzaspozlajpxtgjhyxzjtdzbyvcrdwduvfm tlyvwntrwezwdyfwde dbaugyzavfniaygwxwrouvnqbnyxqexvizqozppuwcdxcltzjmodhdwitwilahhiizxhqobnqgksufudrkjanflgbv dcbokantqbudrdplxwhanrjqhqbptyjxaknmmafdbbi
    Its output should be -1.
    private static String findLongestCommonPrefix(String[] arr, int n) {
        String smallestStr = getSmallestStringInArray(arr, n);
        if(smallestStr != null) {
            return getCommonPrefix(arr, n, smallestStr);
        }
        return "-1";
    }

    private static String getCommonPrefix(String[] arr, int n, String smallestStr) {
        int counter = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i].contains(smallestStr)) {
                counter++;
            }
        }
        if(counter == n) {
            return smallestStr;
        } else {
            return getCommonPrefix(arr, n, smallestStr.substring(0, smallestStr.length() - 1));
        }
    }

    private static String getSmallestStringInArray(String[] arr, int n) {
        Map<String, Integer> map = new HashMap<>();
        int min_len = arr[0].length();
        for(int i = 0; i < n; i++) {
            if(arr[i].length() <= min_len) {
                min_len = arr[i].length();
                map.put(arr[i], min_len);
            }
        }
        if(!map.isEmpty()) {
            return Collections.min(map.keySet());
        }
        return null;
    }*/

}
