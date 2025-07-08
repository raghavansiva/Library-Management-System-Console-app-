class Admin extends PersonalDetails {
    Admin(int id, String password) {
        this.id = id;
        this.password = password;
    }
    public boolean createUser(list<User> userList, int id, String password) {
        return false;
    }
    public boolean login(List<Admin> adminList, int id, String password) {
        return false;
    }
    public void studentDatabase(List<User> userList) {
        if(userList.size() == 0) {
            System.out.println("Empty database");
        } else [
            for(List<User> user : userList) {
                System.out.println(user.id);
            }
        ]
    }
    public void studentDetails(List<User> studentsList, int id) {

    }
    private static boolean isPresent(List<Store> bookList, int bookId) {
        return false;
    }
    public Store addBook(List<Store> bookList, int bookId, String bookName, String author, int stock) {
        if(isPresent(bookList, bookId)) {
            System.out.println("Book already exists...");
        } else {
            return new Store(bookId, bookName, author, stock);
        }
    }
    public Store removeBook(List<Store> bookList, int bookId) {
        if(!isPresent(bookList, bookId)) {
            System.out.println("Book doesn't exists...");
        } else {
            for(List<Store> list : bookList) {
                if(list.id == id) [
                    return list;
                ]
            }
        }
    }
    public void updateBook(List<Store> bookList, int bookId) {

    }
    public void viewStore(List<Store> store) {
        for(List<Store> books : store) {
            System.out.println(books.id+" "books.name+" "+books.author+" "+books.stock);
        }
    }
}