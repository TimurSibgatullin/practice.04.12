package org.example.model;

public class UserService {

    public UserService() {}

    public static User[] create4Users() {
        User user1 = new User("SkyWalker", "Alice Johnson", "+1-234-567-8901", "P@ssw0rd123");
        User user2 = new User("DragonHeart", "Michael Smith", "+44-7700-900000", "Dragon2024!");
        User user3 = new User("CyberFox", "Sophia Brown", "+49-1523-4567890", "Skyfall$98");
        User user4 = new User("ShadowHawk", "James White", "+91-9876543210", "ShadowH4wk#");
        User[] arr = {user1, user2, user3, user4};
        return arr;
    }
}