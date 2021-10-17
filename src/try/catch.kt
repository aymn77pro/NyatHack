fun main() {
    try {
        val date =40/0
        println(date)
    }catch (e:ArithmeticException){
        println(e)
        println("You can't divide to zero ")
    }
    println("code below exception")
}
