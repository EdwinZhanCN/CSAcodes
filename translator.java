import javax.swing.*;
import org.jsoup.Jsoup;

import java.io.IOException;

public class translator {
    public static void main(String[] args) throws IOException {
        String a = JOptionPane.showInputDialog("请输入词汇：");
        String b = "https://www.youdao.com/w/" + a + "/#keyfrom=dict2.top";
        String c = Jsoup.connect(b).get().select("div[class=trans-container]").get(0).text();
        JOptionPane.showInternalMessageDialog(null,c);
    }
}
