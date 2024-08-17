fun main() {
    println("Is it going to rain?")
    val probability = 26
    when {
         probability < 40 -> {
        println("Unlikely")
         }
         probability <= 80 -> {
        println("Likely")
        }
         probability < 100 -> {
        println("Yes")
         }
        else -> {
        println("What?")
         }
         }

    val number = 5 // or 2, 3, 4, 5, 6
     when (number) {
         1 -> {
        println("Missed hit")
         }
         2, 3, 4, 5 -> {
        println("Hit with value $number")
         }
         6 -> {
        println("$number Critical hit")
         }
         else -> {
             println("$number it over")
         }

     }

    val numbers =5 // or 2, 3, 4, 5, 6
    val text = when (numbers) {
             1 -> "Missed hit"
             in 2..5 -> "Hit with value $numbers"
             6 -> "Critical hit"
             else -> "Unsupported value"
             }
    println(text)

    val something: Any = "sanjay" // or 123, 0.1, true
     when (something) {
         is String -> println("king name")
         is Int -> println("king date of birth")
         is Double -> println("This is Double")
         is Boolean -> println("This is Boolean")
         }
    println(something)

    val value = 0

    when {
        value > 0 -> println("Positive")
        value < 0 -> println("Negative")
        else -> println("Other")
    }

    val dogType = "Border Collie"

    val expectedWeight =
        when (dogType) {
            "Labrador Retriever" -> "25 - 36"
            "Fox Terrier" -> "7 - 8"
            "Border Collie" -> "12 - 20"
            "Foxhound" -> "31 - 32"
            else -> "(unknown)"
        }

    println("The weight of $dogType should be $expectedWeight kg")



    val weekday = "Sunday"

    println("On $weekday, the opening hours are:")


    when {
        weekday == "Monday" -> println("8 AM to 12 PM")
        weekday == "Tuesday" -> println("8 AM to 6 PM")
        weekday == "Wednesday" -> println("8 AM to 6 PM")
        weekday == "Thursday" -> println("8 AM to 6 PM")
        weekday == "Friday" -> println("8 AM to 9 PM")
        weekday == "Sunday" -> println("9 AM to 4 PM")
        weekday == "Saturday" -> println("8 AM to 4 PM")
            }

    val hour = 20

    val isOpen = when (weekday) {
        "Monday" -> hour >= 8 && hour <= 12
        "Tuesday", "Wednesday", "Thursday" -> hour >= 8 && hour <= 18
        "Friday" -> hour >= 8 && hour == 20
        "Saturday" -> hour >= 9 && hour <= 16
        "Sunday" -> hour >= 8 && hour >= 16
        else -> false
    }
    if (isOpen) {
        println("Little Lemon is open now")
    } else {
        println("Little Lemon is closed now")
    }


}