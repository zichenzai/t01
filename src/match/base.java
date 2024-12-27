package match;
import java.awt.*;
import java.awt.event.KeyEvent;

public class base {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            
            // 指定启动延迟（单位：毫秒）
            int startDelay = 5000; // 5秒
            System.out.println("程序将在 " + (startDelay / 1000) + " 秒后开始...");
            Thread.sleep(startDelay); // 启动延迟

            int count = 0; // 记录输入次数
            
            while (true) {
                // 模拟按下数字5
                robot.keyPress(KeyEvent.VK_5);
                robot.keyRelease(KeyEvent.VK_5);
                Thread.sleep(1000);
                // 模拟按下数字1
                robot.keyPress(KeyEvent.VK_1);
                robot.keyRelease(KeyEvent.VK_1);
                
                // 增加计数
                count++;
                
                // 输出当前点击的数字和次数
                System.out.println("Clicked: 5 and 1, Total Clicks: " + count);

                // 生成2到8秒的随机等待时间
                int waitTime = 5000 + (int)(Math.random() * 13000); // 2000ms到8000ms之间
                Thread.sleep(waitTime);
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}