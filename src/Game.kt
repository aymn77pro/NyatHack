fun main(){
 val name = "aymn"
 var healthpoint = 75
 val isBlessed = true
 val IsImmortal = false
 var HP = healthpoint
 // aure is visible or not and color
 val aureColer = getaureColor(isBlessed, healthpoint, IsImmortal)
 val A = aureColer
  //BlessedOrNot
val Blessed = if (isBlessed)"Blessed" else "NOT Blessed"
 val B = Blessed
 var healthstatus=gethealthstatus(healthpoint,name,isBlessed)
 val H = healthstatus
// challenge 2 (طباعة النتيجه بطريقة اوضج)
 println("your player status")
 println("(Blessed:$B)(aure color:$aureColer)")
 println("(HP:$HP)(A:$A} --> ($H)")
 castFireball(50)
 //karma status and color
 var karmastatus=GetKarmaColor(healthpoint)
 println("your karma color is $karmastatus")
}

fun aureColor(isBlessed: Boolean, healthpoint: Int, IsImmortal: Boolean): String {
 val aureIsVisbl = isBlessed && healthpoint in 50..100 || IsImmortal
 val aureColer = if (aureIsVisbl) "green" else "none!"
 return aureColer
}
private fun castFireball(numFierball:Int=2):String {
 when(numFierball) {
  in 1..50 -> println("you shot a Fire ball x$numFierball")
  0 -> println("you don't shot")
  else -> println("you have reach maximum (you cant shot more than 50)")
 }
 var FuleStatsu = 50-numFierball
 when(FuleStatsu){
  in 0..10 -> println("empty")
  in 11..20-> println("fumes")
  in 21..30 -> println("low")
  in 31..40 -> println("good")
  in 41..50-> println("full")
  else -> println("you dont have Fire ball or you cant save more than 50")
 }
 return (numFierball.toString())
}

