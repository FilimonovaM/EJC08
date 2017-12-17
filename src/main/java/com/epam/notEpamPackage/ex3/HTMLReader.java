package com.epam.notEpamPackage.ex3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HTMLReader {
    public void read(String path) {
        boolean b = false;
        String string;
        String[] stringLines = null;
        File file = new File(path);
        StringBuffer sb = new StringBuffer();
        Validator validator = new Validator();
        List<String> list = new ArrayList<>();
        byte[] bytes = new byte[10];
        if (file.exists() && file.isFile()) {
            try (FileInputStream bf= new FileInputStream(file)) {
                int n = 0;
                while (n!=-1){
                    n = bf.read(bytes);
                    System.out.println((char) n);

//                        System.out.println(bytes.toString());
//                        sb.append(new String(s.getBytes("ISO-8859-1"),
//                                "UTF-8")+"\n");

                }

//                list.forEach(l -> {
//                            l = (l.startsWith("<div>")) ? l.substring(5) :
//                                    (l.startsWith("<p>")) ? l.substring(3) : l;
//                            l = (l.endsWith("</div>")) ? l.substring(0, l.length() - 6) :
//                                    (l.endsWith("</p>")) ? l.substring(0, l.length() - 4) : l;
//                        });

//                    string = s.toString();
//                    System.out.println(string);
//                    if(validator.validate(string, "[а-яА-Я]")){
//

//                        sb.append(string);
//                    }
//                }
//                System.out.println(sb);
////                findTheNumbers(sb.toString());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void findTheNumbers(String s) {
        int count = 0;
        int newCount;
        boolean isSequence = true;
        String[] strings = s.split("[.!?]");
        Validator validator = new Validator();
        for (int i = 1; i < strings.length; i++) {
            if(validator.validate(strings[i],"[0-9]")){
                System.out.println(strings[i]);

            }
        }
        System.out.println((isSequence)?"The author sequentially referring to pictures":
                "The author`s referring to pictures is not sequentially");
    }
}

//                System.out.println(strings[i - 1] + strings[i]);
//                        if(isSequence&&strings[i].length()>2){
//                        for(int j = 0; j<strings[i].length()-1; i++){
//        if(strings[i].length()>=1 && Character.isDigit(strings[i].charAt(j))){
//        newCount = (strings[i].length()<2)? strings[i].charAt(j):
//        (Character.isDigit(strings[i].charAt(j+1)))?
//        Integer.parseInt(strings[i].substring(j, j+2)):strings[i].charAt(j);
//        if(count>newCount){
//        isSequence = false;
//        break;
//        }
//        }
//        }
//        }
