fun main() {
    for (i in 1 until 10) {
        println("i = $i")
    }

    for (i in 10 downTo 1)
        println("i =$i")

    for (i in 1..10 step 2)
        println(i)
    var number = 0
    while(number < 10){
        println(number++)
    }
    var num = 0
    do {
        println(num++)
    }
    var num = 0
        while (num < 10){
            num++
            if (num == 7)
                continue
            println(num)
        }
    var num = 0
    while (num < 10){
        num++
        if (num == 7)
            break
        println(num)
    }

     for (i in 1..10){
         if (i in 3..7)
             continue
         println(i)
     }
    for (i in 1..10){
        if (i==7)
            break
        println(i)
    }

 var num=0
    while(num<5){
        num++
        println(num)

        var i=0
        while (i<5){
            i++
        println("****$i")}
    }
}