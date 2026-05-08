package main.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StudentCard {
    // 1. 成员变量：存储学生信息和当前时间
    private String studentId;
    private String name;
    private double score;
    private LocalDate currentDate;

    // 2. 构造方法：初始化数据
    public StudentCard(String studentId, String name, double score) {
        this.studentId = studentId;
        this.name = name;
        this.score = score;
        this.currentDate = LocalDate.now(); // 获取当前电脑日期
    }

    // 3. 新增：计算本学期第几周
    // 👇 这里一定要改成你们学校的真实开学日期！👇
    public int getWeekOfSemester() {
        // 示例：2026年2月24日开学（如果不是这天，请修改这里）
        LocalDate startDate = LocalDate.of(2026, 3, 2); 
        long days = java.time.temporal.ChronoUnit.DAYS.between(startDate, currentDate);
        return (int) (days / 7) + 1;
    }

    // 4. 修改你的 displayInfo 方法：打印带时间和周数的卡片
    public void displayInfo() {
        // 格式化日期
        String dateStr = currentDate.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日"));
        int week = getWeekOfSemester();

        System.out.println("╔══════════════════════╗");
        System.out.println("║     学生信息卡片     ║");
        System.out.println("╠══════════════════════╣");
        System.out.println("║ 学号：" + studentId);
        System.out.println("║ 姓名：" + name);
        System.out.println("║ 成绩：" + score);
        System.out.println("║ 日期：" + dateStr);
        System.out.println("║ 学期：第" + week + "周");
        System.out.println("╚══════════════════════╝");
    }

    // 5. 修改 main 方法：支持输入姓名学号
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 交互输入
        System.out.print("请输入学号：");
        String id = scanner.nextLine();
        System.out.print("请输入姓名：");
        String name = scanner.nextLine();
        System.out.print("请输入成绩：");
        double score = scanner.nextDouble();

        // 创建对象并展示
        StudentCard card = new StudentCard(id, name, score);
        System.out.println("\n=== 正在生成信息卡片 ===");
        card.displayInfo();
        
        scanner.close();
    }
}