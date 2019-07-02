package com.company;

public class Calculate {
    public String delTrash(String str) {
        char[] strToArr = str.toCharArray();
        StringBuilder string = new StringBuilder();
        for (char c : strToArr) {
            if (c == '(' || c == ')' || c == '{' || c == '}' || c == '[' || c == ']'
                    || c == '<' || c == '>') {
                string.append(c);
            }
        }
        return string.toString();
    }

    public boolean checkString(String str) {
        char[] strToArr;
        int j = 0, k = 0;
        for (int i = 0; i < str.length(); i++) {
            strToArr = str.toCharArray();
            if (i < strToArr.length - 1) {
                if (strToArr[i] == '(' && strToArr[i + 1] == ')' ||
                        strToArr[i] == '{' && strToArr[i + 1] == '}' ||
                        strToArr[i] == '[' && strToArr[i + 1] == ']' ||
                        strToArr[i] == '<' && strToArr[i + 1] == '>') {
                    j = i;
                    k = i + 1;
                    str = delElements(j, k, strToArr);
                    i = 0;
                }

            }
            if (strToArr.length == 2){
                if(strToArr[0] == '{' && strToArr[1] == '}' ||
                        strToArr[0] == '(' && strToArr[1] == ')' ||
                        strToArr[0] == '[' && strToArr[1] == ']' ||
                        strToArr[0] == '<' && strToArr[1] == '>')
                return true;
            } else {
                continue;
            }
        }
        return false;
    }

    private String delElements(int j, int k, char[] str) {
        StringBuilder string = new StringBuilder();
        for(int i = 0; i < str.length; i++) {
            if (i != j && i != k) {
                string.append(str[i]);
            } else {
                continue;
            }
        } return string.toString();
    }
}
