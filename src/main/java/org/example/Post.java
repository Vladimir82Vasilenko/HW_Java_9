package org.example;

public class Post {

    public String name;
    public String patronymic;
    public String surname;
    public String passport; // использован тип "String" так как в значении паспорта может встречаться
                            // символ "№", либо цифро-буквенные сочетания
    public String phone; // по этой же логике здесь тип "String"
    public Boolean subscription;
    public FormDate birthday;

}
