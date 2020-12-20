package edu.nf.ch19.demo1;

/**
 * @author Administrator
 * @date 2020/12/9
 */
public class MySource {
    private String message;

    public MySource(){

    }


    public MySource(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}