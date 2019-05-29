package com33;

import java.util.ResourceBundle;

import org.junit.Test;

public class MyTest4
{
    public static void main(String[] args) {
        System.out.println(getInt());
    }

    public static int getInt() {
        int a = 10;
        try {
            System.out.println(a / 0);
            a = 20;
        }
        catch (ArithmeticException e) {
            a = 30;
            return a;
            /*
             * return a 在程序执行到这一步的时候，这里不是return a 而是 return 30；这个返回路径就形成了
             * 但是呢，它发现后面还有finally，所以继续执行finally的内容，a=40
             * 再次回到以前的路径,继续走return 30，形成返回路径之后，这里的a就不是a变量了，而是常量30
             */
        }
        finally {
            a = 40;
        }
        //return a;

        return a;
    }

    @Test
    public void mxTest18时10分() {
        int a = 12;
        boolean b = true;
        boolean c = true;
        switch (a) {
            case 1:

                break;

            default:
                break;
        }
    }

    @Test
    public void mxTest22时13分() throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {

                System.out.println(Thread.currentThread().getName());
                System.out.println("try");
                Thread.sleep(1000);
                System.exit(1); //异常关闭虚拟机
            }
            catch (Exception e) {
                System.exit(1); //异常关闭虚拟机
            }
            finally {
                System.out.println("finally");
            }
        });
        thread.setName("aaa");
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(1000);
        System.out.println("end");

    }

    @Test
    public void mxTest11时03分() {
        new Thread(new Runnable()
        {
            final int a = 1;

            public void run() {
                System.out.println(a);
            }
        }).start();
    }

    @Test
    public void mxTest14时35分() {
        test(1);
    }

    public void test(int b) {
        int a = 10;
        new Thread()
        {
            public void run() {
                System.out.println(a);
                System.out.println(b);
            };
        }.start();
    }

    @Test
    public void mxTest15时08分() {
        System.out.println(returnCatch());
    }

    int returnCatch() {
        int a = 0;
        try {
            a = 1 / 0;
            //return a = 1;
        }
        catch (Exception e) {
            System.out.println("catch");
            return a = 2;
        }
        finally {
            System.out.println("finally");
            a = 3;
            //return a = 3;
        }
        return a = 4;

    }

    @Test
    public void mxTest16时08分() {
        System.out.println(getConfigValue("com33.bb", "1"));

    }

    public static String getConfigValue(String fileName, String configname) {
        String result = null;

        try {
            ResourceBundle resBundle = ResourceBundle.getBundle(fileName);
            if (resBundle.containsKey(configname)) {
                result = resBundle.getString(configname);
                if (result != null && result.length() > 0) {
                    result = result.trim();
                    System.out.println(new String(result.getBytes("ISO-8859-1"), "UTF-8"));
                }
            }
        }
        catch (Exception arg3) {
            System.out.println(arg3.toString());
        }

        return result;
    }

}
