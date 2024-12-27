package match;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class MouseClicker {

    private static volatile boolean running = true;

    public static void main(String[] args) {
        try {
            final Robot robot = new Robot();

            // 设置点击间隔（毫秒）
            final int interval = 1000; // 每100毫秒点击一次

            // 创建一个 JFrame 来监听键盘事件
            JFrame frame = new JFrame("Mouse Clicker");
            frame.setSize(300, 100);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // 使用 Key Bindings 监听 F 键
            frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_F, 0), "toggleRunning");
            frame.getRootPane().getActionMap().put("toggleRunning", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    running = !running;
                    System.out.println(running ? "继续点击..." : "已暂停。");
                }
            });

            frame.setVisible(true);

            // 在新线程中执行点击逻辑
            new Thread(() -> {
                try {
                    while (true) { // 无限循环，直到程序被关闭
                        if (running) {
                            // 移除了移动鼠标到当前位置的操作
                            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        }
                        Thread.sleep(interval);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();

            System.out.println("按 'F' 键暂停或继续点击。");
            System.out.println("开始点击...");

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}