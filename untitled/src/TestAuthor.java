public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Edwin", "ed_zhan@outlook.com",'m');
//        System.out.println(author1);
//        System.out.println(author1.getGender());
//        System.out.println(author1.getName());
//        System.out.println(author1.getEmail());
//        author1.setEmail("2141157449@qq.com");
//        System.out.println(author1.getEmail());

        Book fantasticBook = new Book("fantasticBook", author1, 11.4, 600);

        System.out.println(fantasticBook);
        System.out.println(fantasticBook.getAuthor());
        System.out.println(fantasticBook.getName());
        System.out.println(fantasticBook.getPrice());
        System.out.println(fantasticBook.getQty());
        fantasticBook.setPrice(20.4);
        System.out.println(fantasticBook.getPrice());
        fantasticBook.setQty(500);
        System.out.println(fantasticBook.getQty());

    }


}
