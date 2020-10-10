package com.xman.practice.day20201009;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xman
 * @CreateDate: 2020/10/9 11:12
 * @Description: 387. 字符串中的第一个唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * 示例：
 * s = "leetcode"
 * 返回 0
 * <p>
 * s = "loveleetcode"
 * 返回 2
 * <p>
 * 提示：你可以假定该字符串只包含小写字母。
 */
public class UniqueString {

    public int findFirstUniqueLetter(String s) {
        Map<Character, Integer> counter = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (counter.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }


}
