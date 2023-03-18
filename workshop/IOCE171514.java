/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.workshop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class IOCE171514 {

    static Scanner sc = new Scanner(System.in);

    public static int getInteger(String iMsg, String iErr) {
        while (true) {
            try {
                System.out.print(iMsg);
                int a = Integer.parseInt(sc.nextLine());
                return a;
            } catch (Exception e) {
                System.out.println(iErr);
            }
        }
    }

    public static int getInteger(String iMsg, String iErr, int start, int end) {
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        while (true) {
            try {
                System.out.print(iMsg);
                int a = Integer.parseInt(sc.nextLine());
                if (a < start || a > end) {
                    throw new Exception();
                }
                return a;
            } catch (Exception e) {
                System.out.println(iErr);
            }
        }
    }

    public static double getDouble(String iMsg, String iErr) {
        while (true) {
            try {
                System.out.print(iMsg);
                double a = Double.parseDouble(sc.nextLine());
                return a;
            } catch (Exception e) {
                System.out.println(iErr);
            }
        }
    }

    public static double getDouble(String iMsg, String iErr, double start, double end) {
        if (start > end) {
            double temp = start;
            start = end;
            end = temp;
        }
        while (true) {
            try {
                System.out.print(iMsg);
                double a = Double.parseDouble(sc.nextLine());
                if (a < start || a > end) {
                    throw new Exception();
                }
                return a;
            } catch (Exception e) {
                System.out.println(iErr);
            }
        }
    }

    public static String getString(String iMsg, String iErr) {
        while (true) {
            try {
                System.out.print(iMsg);
                String s = sc.nextLine();
                if (s.length() == 0) {
                    throw new Exception();
                }
                return s;
            } catch (Exception e) {
                System.out.println(iErr);
            }
        }
    }

    public static String getString(String iMsg, String iErr, int t) {
        while (true) {
            try {
                System.out.print(iMsg);
                String s = sc.nextLine();
                if (s.length() > t) {
                    throw new Exception();
                }
                return s;
            } catch (Exception e) {
                System.out.println(iErr);
            }
        }
    }
}
