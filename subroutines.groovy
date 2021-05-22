String getUserName(String firstName, String lastName) {
    /* groovylint-disable-next-line UnnecessarySubstring */
    return firstName.substring(0, 1).toLowerCase() + lastName.toLowerCase()
}

/* groovylint-disable-next-line CompileStatic */
assert getUserName("Chris", "Beherens") == "cbeherens" : "getUserName is not working"

println getUserName("Sandeep", "Gupta")

/* groovylint-disable-next-line MethodParameterTypeRequired, NoDef */
void printName(cred) {
    println("Full Name is ${cred}")
}

/* groovylint-disable-next-line DuplicateStringLiteral */
String[] firstNames = ["Sandeep", "Namitha", 'Adhita']
String[] lastNames = ['Gupta', "M R", "N"]

for (int i=0; i < firstNames.size(); i++) {
    printName(getUserName(firstNames[i], lastNames[i]))
}
