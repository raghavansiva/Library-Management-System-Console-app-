class User extends PersonalDetails {
    List<Store> bookList;
    User(int id, String password) {
        this.id = id;
        this.password = password;
    }
    public boolean login(List<User> userList, int id, String password) {
        if(userList.size() == 0) {
            return false;
        } else {
            for(List<User> user : userList) {
                if(user.id == id && user.password.equals(password)) {
                    return true;
                }
            }
        }
        return false;
    }
}