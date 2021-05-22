class User {

    String firstName;
    String lastName;

    public String UserName() {
        return getUserName(this.firstName, this.lastName)
    }

    private String getUserName(String firstName, String lastName) {
        return firstName.substring(0, 1).toLowerCase() + lastName.toLowerCase()
    }

}

/* groovylint-disable-next-line DuplicateStringLiteral */
String[] firstNames = ['Sandeep', 'Namitha', 'Adhita']
String[] lastNames = ['Gupta', 'M R', 'N']

for (int i = 0; i < firstNames.size(); i++) {
    User u = new User(firstName: firstNames[i], lastName: lastNames[i])
    println("UserName is ${u.UserName()}")
}


User[] users = [
    new User(firstName: "Sandeep", lastName: "Gupta"),
    new User(firstName: "Namitha", lastName: "M R"),
    new User(firstName: "Adhita", lastName: "N")
]

users.each{user -> println("UserName is ${user.UserName()}")};