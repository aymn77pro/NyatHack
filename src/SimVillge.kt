import kotlin.random.Random
import kotlin.random.nextInt

fun main(){
   // println({
   //  val greetingFunction:()->String={
   // val greetingFunctione:(String)->String={
   // val greetingFunctione:(String,Int)->String={playerName,numBuilding->
   // val greetingFunctione={playerName:String,numBuilding:Int->
    // runSimlation("Guyal"){palyerName,numBuilding->
      // runSimlation("Guyal",::printConstructionCost){palyerName,numBuilding->
        //val currentYear=2018
        //"welcome to your vaillg ,  mayor! $palyerName (copyright $currentYear)"
runSimlation()
}
    //println(greetingFunction())
    //println( greetingFunctione("Guyal"))
   // println( greetingFunctione("Guyal",2))
 //   println(runSimlation("Guyal",greetingFunctione))

//inline fun runSimlation(playerName:String,costPrinter:(Int)->Unit ,greetingFunctione:(String,Int)->String){

  //  val numBuilding= Random.nextInt(1..3)
    //costPrinter(numBuilding)
    //println(greetingFunctione(playerName,numBuilding))}
  fun runSimlation(){
      val greetingFunction = configureGreetingFunction()
      println(greetingFunction("Guyal"))

  }
fun configureGreetingFunction():(String)->String{
    val structuretype = "hospitals"
    var numBuildings=5
    return {playerName:String->
        val currentYear = 2018
        numBuildings += 1
        println("Adding $numBuildings $structuretype")
        "welcome to your Village, $playerName! (copyright $currentYear)"

    }
}

fun printConstructionCost(numBuildings: Int) {
    val cost = 500
    println("construction cost: ${cost * numBuildings}")
}