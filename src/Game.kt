fun main(){
 val name = "aymn"
 var healthpoint = 89
 val isBlessed = true
 val IsImmortal = false
 var HP = healthpoint
 // aure is visible or not
 val aureIsVisbl = isBlessed && healthpoint in 50..100 || IsImmortal
    //aure
val aureColer  = if (aureIsVisbl)"green" else "none!"
 val A = aureColer
  //BlessedOrNot
val Blessed = if (isBlessed)"Blessed" else "NOT Blessed"
 val B = Blessed
 //health status
 val heathstatus : String =
  if (healthpoint==100) "$name is in excellent condition!"
 else if (healthpoint in 90..99)"$name have few scratches!"
 else if (healthpoint in 75..89)if (isBlessed)"$name has some minor wounds but is healing quite quickly!"
 else    "$name has some minor wounds"
 else if (healthpoint in 15..74)"$name pretty hurt"
 else    "$name is in awful condition!"
 val H = heathstatus
// challenge 2 (طباعة النتيجه بطريقة اوضج)
 println("your player status")
 println("(HP:$HP)(A:$A} --> ($H)")
 //karma status and color
 val karma = (Math.pow(Math.random(),(110 - healthpoint)/100.0)*20.0).toInt()
 val karmastatus:String = when(karma){
  in 0..5 -> "red"
  in 6..10 -> "orange"
  in 11..15 -> "purple"
  else ->  "green"
 }
 println("your karma color is $karmastatus")

}