//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println(123 + 456 * 789)
    println(1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * 9)
    println((1 + 2) * 3 + 4 * 5 + 6 * (7 + 8) * 9)
        println(13530.0 / 1.23)
        val scoreLevel1 = 79
        val scoreLevel2 = 92
        val scoreLevel3 = 86
            val totalScore = scoreLevel1 + scoreLevel2 + scoreLevel3
            val averageScore = totalScore / 3
            println(totalScore)
            println(averageScore)
                val boostMultiplier= 4
                val scoreBoost= totalScore * boostMultiplier
                val finalBoostedScore = totalScore+scoreBoost
                println(scoreBoost)
                println(finalBoostedScore)
    println(5+3*8)


    var s1 = "My "
    val s2 = s1 // s1 and s2 now point at the same string - "Hello"
    s1 += "world" // append "world" to s1
    println(s1) // prints "Hello world"
    println(s2)

    val myString = "Hello"
    val startsWithHel = myString.startsWith("Hel")
    println(startsWithHel)
    val lastChar = myString.last()
    println(lastChar)
    val equalsHello = myString.equals("Hello")
    println(equalsHello)
    val myUpperString = myString.uppercase()
    println(myUpperString)
    val myString2 = myString.substring(4)
    println(myString2)



    val num = 10
    println("Result is $num + 20")
}
