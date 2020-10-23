package com.example.myfinalproject;

import java.io.Serializable;

public class athkar  implements Serializable {
    private String name ;
    private String dowaa ;

    public athkar(String name, String dowaa) {
        this.name = name;
        this.dowaa = dowaa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDowaa() {
        return dowaa;
    }

    public void setDowaa(String dowaa) {
        this.dowaa = dowaa;
    }
}
