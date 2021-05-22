abstract class User {

    String firstName;
    String lastName;

    public String UserName() {
        return getUserName(this.firstName, this.lastName)
    }

    private String getUserName(String firstName, String lastName) {
        return firstName.substring(0, 1).toLowerCase() + lastName.toLowerCase()
    }

}

class Artist extends User {
    public String[] Songs;
}
class Producer extends User {
    public void Produce(){
        println("Album completed")
    };
}

User[] users = [new Artist(firstName: "Sandeep", lastName: "Gupta", Songs: ["Its a new day"]),
                new Producer(firstName: "Namitha", lastName: "M R"),
                new Artist(firstName: "Adhita", lastName: "N")];

users.each{user ->
    if (user instanceof Artist){
        println("UserName is ${user.UserName()}"));
        user.Songs.each {
            println("${it}");
        }
    } else {
        user.Produce();
    }
};