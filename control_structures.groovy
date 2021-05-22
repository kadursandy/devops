int courseCount = 14
Boolean isProgrammer = true
String[] singers = ["Bob", "George", "Jeff"]

if (isProgrammer) {
    println "Yes he is a programmer"
}
else {
    println "Not a programmer"
}

for (i=0; i < courseCount; i++) {
    println "Count number: " + (i+1)
}

int i = 0
while (i < courseCount) {
    println "Coure number= " + (i + 1)
    i++
}

for (String singer : singers) {
    println singer
}

singers.each{x -> println(x)}
singers.each{println(it)}