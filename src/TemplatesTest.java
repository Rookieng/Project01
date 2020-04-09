import java.util.ArrayList;

/**
 * @author Rookieng
 * @date 2020/4/4 - 12:00
 *
 * IDEA中代码模板所处的位置：setting-editor-Live Templates/Postfix Completion
 * 常用的模板
 */

public class TemplatesTest {
    public static void main(String[] args) {
        //模板一：fori
        String[] arr = new String[]{"Tom", "Jerry", "Lilei"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar;比fori多了一个赋值
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }


        //模板二：list.for
        ArrayList list = new ArrayList();
        list.add(234);
        list.add(345);
        list.add(456);
        for (Object o : list) {
            
        }
        //变形list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形list.forr;逆序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        //模板三：ifn
        if (list == null) {

        }
        //变形inn
        if (list != null) {

        }
        //变形xxx.nn或xxx.null
        if (list != null) {

        }
        if (list == null) {

        }
    }
}
