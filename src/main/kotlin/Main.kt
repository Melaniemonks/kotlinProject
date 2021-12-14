fun main(args: Array<String>) {
    println("Hello! welcome to my project. This first section deals with variable, conditional Expressions")

    //Create Variable

    print("Please enter name: ")
    val name =readLine().toString()

    print("Please Enter Age: ")
    var age = readLine()?.toInt()

    //operator

    if (age != null) {
        if (age < 18) {
            println("$name, you are a minor")
        } else if (age in 19..59){
            println("$name, you are an Adult")
        }
        else if (age > 60 ){
            println("$name, you are a senior")
        }
    }

    //List

    var locations = ArrayList<String>()

    print("alright $name, What are 1 place you love to visit? ")
    var places = readLine().toString()

    locations.add(places)

    //loops
    for (i in locations.indices) {
        println("I am sure " + locations[i] + " is beautiful")
    }

    println()

    //Functions
    println("lets play a mad lib game. fill in the following:")
    game()
}

fun game(){
    print("Animal: ")
    var animal = readLine().toString()
    print("Country: ")
    var country = readLine().toString()
    print("Screen Device: ")
    var sd = readLine().toString()
    print("Plural Noun: ")
    var pluralNoun = readLine().toString()
    print("Food: ")
    var food = readLine().toString()
    print("verb ")
    var verb = readLine().toString()
    print("Adjective: ")
    var adjective = readLine().toString()

    println("The majestic $animal has roamed the forest of $country for thousands of years. Today she is in " )
    println("search of $pluralNoun. while hunting for $food she found a $sd. She has never seen anything like")
    println("it before. What will she do? With the device in her teeth she tries to $verb but nothing happened")
    println("Soon the device starts to $adjective, and the family decides to put it back where they found it")

    println()

}








