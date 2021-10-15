fun main(){
 val name = "aymn"
 var healthpoint = 89
 val isBlessed = true
 val IsImmortal = false
 val aureIsVisbl = isBlessed && healthpoint >=50 || IsImmortal
    //aure
val aureColer  = if (aureIsVisbl){"green"}else{"none!"}
 println(aureColer)
 val heathstatus : String = if (healthpoint==100){ "$name is in excellent condition!"}
 else if (healthpoint>=90){"$name have few scratches!"}
 else if (healthpoint>=75){ if (isBlessed){"$name has some minor wounds but is healing quite quickly!"} else{ "$name has some minor wounds"}}
 else if (healthpoint>=15){"$name pretty hurt"}
 else{"$name is in awful condition!"}
println(heathstatus)
}