package com.example.carson_ho.retrofit_demo;

import java.util.List;

/**
 * Created by Carson_Ho on 16/6/24.
 */
public class Translation {
        public int errorCode;
        public String query;
        public String[] translation;

        public basic basic;
        public static class basic {
            public String phonetic;
            public String[] explains;
        }


        public List<web> web;
        public static class web {
            public String[] value;
            public String key;
        }

    public void show(){
        System.out.println(errorCode);
        System.out.println(query);

        for (int i = 0;i<translation.length;i++)
        {
            System.out.println(translation[i]);}


        System.out.println(basic.phonetic);
        for (int i = 0;i<basic.explains.length;i++){
            System.out.println(basic.explains[i]);
        }

        for (int i = 0;i<web.size();i++){
            for(int j = 0; j<web.get(i).value.length;j++)
            {
                System.out.println(web.get(i).value[j]);
            }
            System.out.println(web.get(i).key);
        }
    }
}






