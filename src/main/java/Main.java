public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.date = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.phone = "89992006054";
        post.passport = "4444 № 44444444";
        post.subscription = true;
    }
}
