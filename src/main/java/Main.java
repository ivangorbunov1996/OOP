public class Main {
    public static void main(String[] args) {
        FormDate date = new FormDate();
        date.day = 25;
        date.month = 11;
        date.year = 1996;

        Post post = new Post();
        post.surname = "Gorbunov";
        post.name = "Ivan";
        post.patronymic = "Aleksandrovich";
        post.birthday = date;
        post.subscription =true;
        post.passport = "1111 111111";
        post.phone = "+7-(915)-981-42-35";
    }
}
