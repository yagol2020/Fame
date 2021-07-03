```java


//给定一个字符串，请将字符串里的字符按照出现的频率降序排列。 
//
// 示例 1: 
//
// 
//输入:
//"tree"
//
//输出:
//"eert"
//
//解释:
//'e'出现两次，'r'和't'都只出现一次。
//因此'e'必须出现在'r'和't'之前。此外，"eetr"也是一个有效的答案。
// 
//
// 示例 2: 
//
// 
//输入:
//"cccaaa"
//
//输出:
//"cccaaa"
//
//解释:
//'c'和'a'都出现三次。此外，"aaaccc"也是有效的答案。
//注意"cacaca"是不正确的，因为相同的字母必须放在一起。
// 
//
// 示例 3: 
//
// 
//输入:
//"Aabb"
//
//输出:
//"bbAa"
//
//解释:
//此外，"bbaA"也是一个有效的答案，但"Aabb"是不正确的。
//注意'A'和'a'被认为是两种不同的字符。
// 
// Related Topics 哈希表 字符串 桶排序 计数 排序 堆（优先队列） 
// 👍 278 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class TwoTuple {
    char ch;

    public TwoTuple(char ch, int count) {
        this.ch = ch;
        this.count = count;
    }

    int count;
}

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> count = new HashMap<>(26);
        ArrayList<TwoTuple> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int temp = count.getOrDefault(ch, 0) + 1;
            count.put(ch, temp);
        }
        count.forEach((character, integer) -> {
            list.add(new TwoTuple(character, integer));
        });
        list.sort((o1, o2) -> o2.count - o1.count);
        StringBuilder result = new StringBuilder();
        for (TwoTuple twoTuple : list) {
            for (int j = 0; j < twoTuple.count; j++) {
                result.append(twoTuple.ch);
            }
        }
        return result.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

```