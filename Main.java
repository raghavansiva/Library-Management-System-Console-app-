import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User user = new User();
        Admin admin = new Admin();
        Store store = new Store();

        List<User> userList = new ArrayList<>();
        List<Admin> adminList = new ArrayList<>();
        List<Store> bookList = new ArrayList<>();

        adminList.add(new Admin(3001, "ADMIN"));

        userList.add(new User(2202001, "stu1"));
        userList.add(new User(2202002, "stu2"));
        userList.add(new User(220003, "stu3"));

        int id;
        String password;

        int bookId = 1001;
        String bookName;
        String author;
        int stock = 1;

        int option;
        int currentUser;

        do {
            System.out.println("1.User login\n 2.Admin login");
            switch (option) {
                case 1 :
                    System.out.print("ID   : ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("PASS : ");
                    password = sc.next();
                    if(user.login(userList, id, password)) {
                        currentUser = id;
                    } else {
                        System.out.println("Entered id or password is incorrect");
                    }
                    break;
                case 2 :
                    System.out.print("ID   : ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("PASS : ");
                    if(admin.login(adminList, id, password)) {
                        System.out.println("1.Create new user\n2.Student Dashboard\n3.Add book\n4.Remove book\n5.Update book\n6.View Store");
                        int choice = sc.nextInt();
                        sc.nextLine();
                        switch(choice) {
                            case 1:
                                System.out.print("ID   : ");
                                id = sc.nextInt();
                                sc.nextLine();
                                System.out.print("PASS : ");
                                if(admin.createUser(userList, id, password)) {

                                } else {
                                    System.out.println("User id already exist");
                                }
                                break;
                            case 2:
                                System.out.println("1.Student database\n2.Particular student");
                                choice = sc.nextInt();
                                sc.nextLine();
                                if(choice == 1) {
                                    admin.studentDatabase(userList);
                                } else if (choice == 2) {
                                    System.out.print("ID : ");
                                    id = sc.nextInt();
                                    sc.nextLine();
                                    System.out.println();
                                    admin.studentDetails(userList, id);
                                }
                                break;
                            case 3:
                                id = sc.nextInt();
                                sc.nextLine();
                                name = sc.nextLine();
                                author = sc.nextLine();
                                stock = sc.nextInt();
                                sc.nextLine();
                                try {
                                    bookList.add(admin.addBook(bookList, id, name, author, stock));
                                } catch (Exception e) {}
                                break;
                            case 4:
                                id = sc.nextInt();
                                sc.nextLine();
                                bookList.removeFirst(admin.removeBook(bookList, id));
                                break;
                            case 5:
                                admin.updateBook();
                                break;
                            case 6:
                                admin.viewStore();
                                break;
                            default:
                                System.out.println("Invalid option");
                        }
                    } else {
                        System.out.println("Entered id or password is incorrect");
                    }
                    break;
                default:
                    System.out.println("Invalid login option");
                    break;
            }
        } while(option < 3);
    }
}