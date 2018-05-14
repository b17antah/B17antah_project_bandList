package com.example.b17antah.b17antah_project_bandlist;

/**
 * Created by b17antah on 2018-05-14.
 */

public class Bands {
    private String name;
    private String where;
    private String type;
    private int when;

    public Bands(String inName, String inWhere, String inType, int inWhen) {
        name=inName;
        where=inWhere;
        type=inType;
        when=inWhen;
    }

    public String toString() { return name; }

    public String bandInfo() {
        String str=name;
        str+=" was founded year ";
        str+=Integer.toString(when);
        str+=" in ";
        str+=where;
        str+=" and is a ";
        str+=type;
        str+=" band. ";
        return str;
    }

    public void setWhen(int newWhen) { when=newWhen; }
}
