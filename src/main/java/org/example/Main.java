package org.example;


public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Иван";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        post.passport = "4444 № 44444444";
        post.phone = "+7 (999)-999-99-99";
        post.subscription = true;

        post.birthday = new FormDate();

        post.birthday.date = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;

        System.out.println(post.name);
        System.out.println(post.patronymic);
        System.out.println(post.surname);
        System.out.println(post.passport);
        System.out.println(post.phone);
        System.out.println(post.subscription);
        System.out.println(post.birthday.date);
        System.out.println(post.birthday.month);
        System.out.println(post.birthday.year);

        }

    }
