package com.n3tr;

/**
 * Created by n3tr on 1/19/2017 AD.
 */
public class Greeting {

    private final long id;
    private final String content;


    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }


    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
