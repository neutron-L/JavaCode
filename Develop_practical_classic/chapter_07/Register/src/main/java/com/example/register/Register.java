package com.example.register;

import java.util.HashMap;
import java.util.Map;

public class Register {
    private String name;
    private String age;
    private String email;
    private Map<String, String> errors = null;

    public Register() {
        this.name = "";
        this.age = "";
        this.email = "";
        this.errors = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isValidate() {
        boolean flag = true;

        if (!this.name.matches("\\w{6,15}")) {
            flag = false;
            this.name = "";
            errors.put("errname", "user name is number of characters between 6 to 15");
        }

        if (!this.age.matches("\\d+")) {
            flag = false;
            this.age= "";
            errors.put("errage", "age must be number");
        }

        if (!this.email.matches("\\w+@\\w+\\.?\\w*")) {
            flag = false;
            this.email = "";
            errors.put("erremail", "email is invalid");
        }

        return flag;
    }

    public String getErrorMsg(String key) {
        String value = this.errors.get(key);
        return value == null ? "" : value;
    }
}
