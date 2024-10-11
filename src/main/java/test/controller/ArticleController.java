package test.controller;

import java.util.Scanner;

/**
 * 该类用于通过用户获取信息来对文章进行相关操作
 */
public class ArticleController {
    public static void main(String[] args) {
        System.out.println("欢迎来到文章管理系统");
        System.out.println("请输入操作编号");
        System.out.println("1:保存文章");
        System.out.println("2:删除文章");
        System.out.println("3:查询指定文章");
        System.out.println("4:查询所有文章");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        switch (number){
            case "1":
                System.out.println("保存文章操作");
                break;
            case "2":
                System.out.println("删除文章操作");
                break;
            case "3":
                System.out.println("查看指定文章操作");
                break;
            case "4":
                System.out.println("查看所有文章操作");
                break;
            default:
                System.out.println("编号输入有误");
        }

    }
    public static void writeArticle(){

    }
}
